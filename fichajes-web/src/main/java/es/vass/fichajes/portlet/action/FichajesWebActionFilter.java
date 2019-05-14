package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
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
		
		ThemeDisplay td = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Role> userRoles = RoleLocalServiceUtil.getUserRoles(td.getUserId());
		
		String initDateString = actionRequest.getParameter("initDate");
		Date initDate = ServiceDate.stringToDate("yyyy-MM-dd", initDateString);
		String endDateString = actionRequest.getParameter("endDate");
		Date endDate = ServiceDate.stringToDate("yyyy-MM-dd", endDateString);
		String userName = actionRequest.getParameter("userName");
		
		List<Fichaje> listaFichajesFiltro = new ArrayList<>();
		if(userRoles.contains("Administrator") || userRoles.contains("RRHH")) {
			listaFichajesFiltro = FichajeLocalServiceUtil.findByUsernameDate(userName, initDate, endDate);
		}else {
			listaFichajesFiltro = FichajeLocalServiceUtil.findByUserIdDate(td.getUserId(), initDate, endDate);
		}
		
		System.out.println("Tamaño de la lista: " + listaFichajesFiltro.size());
		
		actionRequest.setAttribute("listaFichajesFiltro", listaFichajesFiltro);
		
		System.out.println("Fechas recibidas para realizar el filtro2: " + endDate);
		
		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}
	
	

}
