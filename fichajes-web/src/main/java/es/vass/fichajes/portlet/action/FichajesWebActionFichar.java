package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.exception.NoSuchTipoServicioException;
import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichaje.service.TipoServicioLocalServiceUtil;
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
		
		Fichaje lastFichaje = null;
		try {
			lastFichaje = FichajeLocalServiceUtil.findByUserId_Last(td.getUserId());
		}catch(Exception e) {
			e.getMessage();
		}
		
		String estado = actionRequest.getParameter("process");
		
		
		// Si se pulsa el botón iniciar
		if("start".equals(estado)) {
			
			long idTipoServicio = Long.parseLong(actionRequest.getParameter("tipoServicio"));
			String servicioActual = "";
			try {
				servicioActual = TipoServicioLocalServiceUtil.findByIdTipoServicio(idTipoServicio).getNombre();
			} catch (NoSuchTipoServicioException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if("Fin jornada".equals(servicioActual)) {
				
				try {
					double horasDia = ServiceDate.calculaHorasFichaje(lastFichaje.getFichajeId());
					FichajeLocalServiceUtil.updateEndFichaje(lastFichaje.getFichajeId(), new Date(), horasDia);
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				actionRequest.setAttribute("activo", false);
			}else {
				// Recuperar la fecha actual para comprobar si el usuario ya ha fichado
				Date now = new Date();
				
				List<Fichaje> fichaje = new ArrayList<>();
				try {
					fichaje = checkFichaje(td.getUserId(), now);	// Devolverá el fichaje de hoy, si existe
				}catch(Exception e) {
					e.getMessage();
				}
				
				if(fichaje.size() == 0) {	// El usuario no ha fichado hoy
					FichajeLocalServiceUtil.addFichaje(td.getCompanyId(), td.getUserId(), td.getUser().getFirstName());
					
					Fichaje lastFichajeCreado = null;
					try {
						lastFichajeCreado = FichajeLocalServiceUtil.findByUserId_Last(td.getUserId());
					}catch(Exception e) {
						_log.error("Method FichajesWebActionFichar.processAction: Error al recuperar el fichaje del usuario recién creado");
					}
					
					// Crear el servicio
					ServicioLocalServiceUtil.addServicio(now, idTipoServicio, 0.0, 0.0, lastFichajeCreado.getFichajeId());
					
					actionRequest.setAttribute("activo", true);
				}else {	// El usuario ya había fichado hoy
					// Añade un nuevo servicio
					ServicioLocalServiceUtil.addServicio(now, idTipoServicio, 0.0, 0.0, lastFichaje.getFichajeId());
					
					actionRequest.setAttribute("activo", true);
				}
			}
			
			
		}else {	// Si se pulsa el botón finalizar
			// Finalizar el servicio activo
			actionRequest.setAttribute("activo", false);
			
			Servicio servicio = null;
			try {
				servicio = ServicioLocalServiceUtil.findByFichajeId_Last(lastFichaje.getFichajeId());
			}catch(Exception e) {
				e.getMessage();
				_log.error("Method FichajesWebActionFichar.processAction: Error al tratar de recuperar el último fichaje");
			}
			
			try {
				Date now = new Date();
				double duracion = (now.getTime() - servicio.getHoraInicio().getTime())/3600000;
				ServicioLocalServiceUtil.updateEndService(servicio.getIdServicio(), new Date(), duracion);
				actionRequest.setAttribute("activo", false);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				_log.info("Method FichajesWebActionFichar.processAction: Error al finalizar el Servicio activo");
			}
		}
		
		// Incluir un if/else, en función del cual se redirija al render adecuado
		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}
	
	private List<Fichaje> checkFichaje(long userId, Date date) {
		List<Fichaje> listFichaje = new ArrayList<>();
		
		Date initDay = ServiceDate.toMomentOfDay("init", date);
		Date endDay = ServiceDate.toMomentOfDay("end", date);
		
		listFichaje = FichajeLocalServiceUtil.findByUserIdDate(userId, initDay, endDay);
		
		return listFichaje;
	}

}
