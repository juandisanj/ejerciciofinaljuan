package es.vass.fichajes.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;

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
		
		// Recuperar los roles del usuario en sesión, (Administrator, RRHH, User
		// Si el usuario es rrhh o administrador, enviar el listado completo de fichajes, 
		// en caso de que sea un empleado normal, enviar el listado de sus fichajes
		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String userName = td.getUser().getFirstName();
		List<Role> userRoles = RoleLocalServiceUtil.getUserRoles(td.getUserId());
		
		List<Fichaje> listaFichajes = null;
		try {
			listaFichajes = (List<Fichaje>) renderRequest.getAttribute("listaFichajesFiltro");
		}catch(Exception e) {
			e.printStackTrace();
			_log.warn("Method FichajesWebRenderList.render: No se recupera listado filtrado de fichajes");
		}
		
		if(listaFichajes == null || listaFichajes.size() == 0) {
			listaFichajes = FichajeLocalServiceUtil.findAll();
			renderRequest.setAttribute("listaFichajes", listaFichajes);
		}
		// Añadir if para que indique cuando el filtro no ha devuelto resultados
		
		
		System.out.println("Roles del usuario ");
		for (Role r : userRoles) {
			try {
				System.out.println("Rol Class name " + r.getClassName() + ", rol " + r.getDescriptiveName() + ", title " + r.getTitle());
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return "/listFichajes.jsp";
	}

	
}
