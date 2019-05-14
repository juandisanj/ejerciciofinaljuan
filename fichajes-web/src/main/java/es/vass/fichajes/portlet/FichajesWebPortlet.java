package es.vass.fichajes.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.service.TipoServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;

/**
 * @author juand
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FichajesWebPortletKeys.FichajesWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FichajesWebPortlet extends MVCPortlet {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebPortlet.class);
	
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		
		_log.info("Method FichajesWebPortlet.render: Renderizado de la página de Fichajes");
		
		List<TipoServicio> listaTipoServicios = TipoServicioLocalServiceUtil.findAll();
		
		System.out.println("Listado de tipos de servicios recuperado: " + listaTipoServicios.size());
		
		renderRequest.setAttribute("listaTipoServicios", listaTipoServicios);
		
		super.render(renderRequest, renderResponse);
	}
}