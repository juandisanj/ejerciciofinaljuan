package es.vass.fichajes.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceRole;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + FichajesWebPortletKeys.FichajesWeb,
				"mvc.command.name=/listFichajes" },
		service = MVCRenderCommand.class)
public class FichajesWebRenderList implements MVCRenderCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebRenderList.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		_log.info("Method FichajesWebRenderList.render: Renderizado del listado de fichajes");
		
		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
//		User user = td.getUser().getlas
		
		List<User> listUsers = new ArrayList<>();
		try {
			listUsers = ServiceRole.getUsersPortlet(td);
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		renderRequest.setAttribute("listUsers", listUsers);
		
		List<Fichaje> listaFichajes = new ArrayList<>();
		try {
			listaFichajes = (List<Fichaje>) renderRequest.getAttribute("listaFichajesFiltro");
			if(listaFichajes != null && listaFichajes.size() == 0) {
				renderRequest.setAttribute("error", "No Coincidencias");
			}
		}catch(Exception e) {
			e.printStackTrace();
			_log.warn("Method FichajesWebRenderList.render: No se recupera listado filtrado de fichajes");
		}
		
		if(listaFichajes == null || listaFichajes.size() == 0) {
			
			List<String> roles = new ArrayList<>();
			roles.add("Administrator");
			roles.add("RRHH");
			if(ServiceRole.checkRoles(td.getUser(), roles)) {
				listaFichajes = FichajeLocalServiceUtil.findAll();
			}else {
				listaFichajes = FichajeLocalServiceUtil.findByUserId(td.getUserId());
			}
			
			renderRequest.setAttribute("listaFichajes", listaFichajes);
		}else {
			renderRequest.setAttribute("error", "Existen datos");
			renderRequest.setAttribute("listaFichajes", listaFichajes);
		}
		
		return "/listFichajes.jsp";
	}

	
}
