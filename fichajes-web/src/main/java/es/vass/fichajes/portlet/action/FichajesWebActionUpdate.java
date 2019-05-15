package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.exception.NoSuchServicioException;
import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichaje.service.TipoServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceDate;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ FichajesWebPortletKeys.FichajesWeb,
			"mvc.command.name=updateServicio"
		},
		service = MVCActionCommand.class
	)
public class FichajesWebActionUpdate implements MVCActionCommand  {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebActionUpdate.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		_log.info("Method FichajesWebActionUpdate.processAction: Action del modificado de usuarios");
		
		
		long idServicio = Long.parseLong(ParamUtil.getString(actionRequest, "idServicio"));
		Servicio currentServicio = null;
		try {
			currentServicio = ServicioLocalServiceUtil.findByIdServicio(idServicio);
		} catch (NoSuchServicioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String initDateString = ParamUtil.getString(actionRequest, "horaInicio");
		Date initDate = ServiceDate.stringToDate("yyyy-MM-dd'T'HH:mm", initDateString);
		String endDateString = ParamUtil.getString(actionRequest, "horaFin");
		Date endDate =ServiceDate.stringToDate("yyyy-MM-dd'T'HH:mm", endDateString);
		long idTipoServicio = Long.parseLong(ParamUtil.getString(actionRequest, "tipoServicio"));

		List<TipoServicio> listTiposServicio = TipoServicioLocalServiceUtil.findAll();
		
		if((endDate.getTime() - initDate.getTime()) < 0) {
			actionRequest.setAttribute("errorUpdate", "errorOrden");
			actionResponse.setRenderParameter("jspPage", "/updateServicio.jsp");
			actionRequest.setAttribute("listTiposServicio", listTiposServicio);
		}else if((endDate.getDate() != currentServicio.getHoraFin().getDate()) || initDate.getDate() != currentServicio.getHoraInicio().getDate()){
			actionRequest.setAttribute("errorUpdate", "errorDia");
			actionResponse.setRenderParameter("jspPage", "/updateServicio.jsp");
			actionRequest.setAttribute("listTiposServicio", listTiposServicio);
		}else {
//			actionRequest.setAttribute("errorUpdate", "");
			// Actualizar servicio
			// Actualizar fichaje
			double duracion = ((double) (endDate.getTime() - initDate.getTime()))/3600000;
			try {
				ServicioLocalServiceUtil.updateInitEndTypeServicio(idServicio, initDate, endDate, duracion, idTipoServicio);
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Fichaje currentFichaje = null;
			try {
				currentFichaje = FichajeLocalServiceUtil.findById(currentServicio.getFichajeId());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double horasFichaje = ServiceDate.calculaHorasFichaje(currentFichaje.getFichajeId());
			try {
				FichajeLocalServiceUtil.updateHorasFichaje(currentFichaje.getFichajeId(), horasFichaje);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			actionResponse.setRenderParameter("mvcRenderCommandName", "/updateServicio");
			
		}
		
		return true;
	}

}
