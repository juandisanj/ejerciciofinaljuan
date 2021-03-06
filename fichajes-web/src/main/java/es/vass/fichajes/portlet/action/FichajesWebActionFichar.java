package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceDate;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ FichajesWebPortletKeys.FichajesWeb,
			"mvc.command.name=fichajeServicio"
		},
		service = MVCActionCommand.class
	)
public class FichajesWebActionFichar implements MVCActionCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebActionFichar.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		_log.info("Method FichajesWebActionFichar.processAction: Action del Fichaje de un empleado");
		
		ThemeDisplay td = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String estado = actionRequest.getParameter("process");
		System.out.println("Estado recibido " + estado);
		
		// Si se pulsa el bot�n iniciar
		if("start".equals(estado)) {
			
			// Recuperar la fecha actual para comprobar si el usuario ya ha fichado
			Date now = new Date();
			Date initDay = ServiceDate.toMomentOfDay("init", now);
			Date endDay = ServiceDate.toMomentOfDay("end", now);
			
			System.out.println("Fechas enviadas al guardar: " + initDay + ", " + endDay);
			long userId = td.getUserId();
			
			List<Fichaje> fichaje = null;	// Devolver� el fichaje de hoy, si existe
			try {
				fichaje = FichajeLocalServiceUtil.findByUserIdDate(userId, initDay, endDay);
			}catch(Exception e) {
				_log.error("Method FichajesWebActionFichar.processAction: Error al recuperar el fichaje del d�a del usuario");
			}
			
			
			int idTipoServicio = Integer.parseInt(actionRequest.getParameter("tipoServicio"));
			if(fichaje.size() == 0) {	// El usuario no ha fichado hoy
				FichajeLocalServiceUtil.addFichaje(td.getCompanyId(), td.getUserId(), td.getUser().getFirstName());
				
				Fichaje lastFichaje = null;
				try {
					lastFichaje = FichajeLocalServiceUtil.findByUserId_Last(userId);
				}catch(Exception e) {
					_log.error("Method FichajesWebActionFichar.processAction: Error al recuperar el fichaje del usuario reci�n creado");
				}
				
				// Crear el servicio
				ServicioLocalServiceUtil.addServicio(now, idTipoServicio, 0.0, 0.0, lastFichaje.getFichajeId());
				
				actionRequest.setAttribute("activo", true);
			}else {	// El usuario ya hab�a fichado hoy
				Fichaje lastFichaje = null;
				try {
					lastFichaje = FichajeLocalServiceUtil.findByUserId_Last(userId);
				}catch(Exception e) {
					e.printStackTrace();
					_log.info("Method FichajesWebActionFichar.processAction: Error al tratar de recuperar el �ltimo fichaje del usuario activo");
				}
				
				// A�ade un nuevo servicio
				ServicioLocalServiceUtil.addServicio(now, idTipoServicio, 0.0, 0.0, lastFichaje.getFichajeId());
				
				actionRequest.setAttribute("activo", true);
				
			}
		}else {	// Si se pulsa el bot�n finalizar
			// Finalizar el servicio activo
			Fichaje lastFichaje = null;
			try {
				lastFichaje = FichajeLocalServiceUtil.findByUserId_Last(td.getUserId());
				System.out.println("Id de usuario: " + td.getUserId());
			}catch(Exception e) {
				e.getMessage();
				_log.error("Method FichajesWebActionFichar.processAction: Error al tratar de recuperar el �ltimo fichaje del usuario activo");
			}
			
			actionRequest.setAttribute("activo", false);
			
			Servicio servicio = null;
			try {
				servicio = ServicioLocalServiceUtil.findByFichajeId_Last(lastFichaje.getFichajeId());
			}catch(Exception e) {
				e.getMessage();
				_log.error("Method FichajesWebActionFichar.processAction: Error al tratar de recuperar el �ltimo fichaje");
			}
			
			try {
				ServicioLocalServiceUtil.updateEndService(servicio.getIdServicio(), new Date());
				actionRequest.setAttribute("activo", false);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				_log.info("Method FichajesWebActionFichar.processAction: Error al finalizar el Servicio activo");
			}
		}
		
		// Incluir un if/else, en funci�n del cual se redirija al render adecuado
		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}

}
