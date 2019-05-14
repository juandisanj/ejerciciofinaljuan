package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceDate;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ FichajesWebPortletKeys.FichajesWeb,
			"mvc.command.name=filtroFechaUsuario"
		},
		service = MVCActionCommand.class
	)
public class FichajesWebActionFilter implements MVCActionCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebActionFilter.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		_log.info("Method FichajesWebActionFilter.processAction: Action del filtro de Fichajes");
		
		String initDateString = actionRequest.getParameter("initDate");
		Date initDate = ServiceDate.stringToDate("yyyy-MM-dd", initDateString);
		String endDateString = actionRequest.getParameter("endDate");
		Date endDate = ServiceDate.stringToDate("yyyy-MM-dd", endDateString);
		String userName = actionRequest.getParameter("userName");
		
		List<Fichaje> listaFichajesFiltro = FichajeLocalServiceUtil.findByUsernameDate(userName, initDate, endDate);
		
		actionRequest.setAttribute("listaFichajesFiltro", listaFichajesFiltro);
		
		System.out.println("Fechas recibidas: " + endDate);
		
		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}
	
	

}
