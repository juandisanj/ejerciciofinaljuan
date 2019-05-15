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
import es.vass.fichajes.utils.ServiceRole;

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
		
		String initDateString = actionRequest.getParameter("initDate");
		Date initDate = ServiceDate.stringToDate("yyyy-MM-dd", initDateString);
		String endDateString = actionRequest.getParameter("endDate");
		Date endDate = ServiceDate.stringToDate("yyyy-MM-dd", endDateString);
		long userId = Long.parseLong(actionRequest.getParameter("userId"));
		
		List<Fichaje> listaFichajesFiltro = new ArrayList<>();
		List<String> roles = new ArrayList<>();
		roles.add("Administrator");
		roles.add("RRHH");
		
		if(ServiceRole.checkRoles(td.getUser(), roles)) {
			listaFichajesFiltro = FichajeLocalServiceUtil.findByUserIdDate(userId, initDate, endDate);
		}else {
			listaFichajesFiltro = FichajeLocalServiceUtil.findByUserIdDate(td.getUserId(), initDate, endDate);
		}
		
		actionRequest.setAttribute("listaFichajesFiltro", listaFichajesFiltro);
		
		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}
	
	

}
