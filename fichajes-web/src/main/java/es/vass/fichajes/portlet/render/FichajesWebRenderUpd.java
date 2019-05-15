package es.vass.fichajes.portlet.render;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.exception.NoSuchServicioException;
import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichaje.service.TipoServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + FichajesWebPortletKeys.FichajesWeb,
				"mvc.command.name=/updateServicio" },
		service = MVCRenderCommand.class)
public class FichajesWebRenderUpd implements MVCRenderCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebRenderUpd.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

		_log.info("Method FichajesWebRenderUpd.render: Renderizado del formulario de modificación de un Servicio");
		
		long idServicio = Long.parseLong(renderRequest.getParameter("idServicio"));
		Servicio currentServicio = null;
		try {
			currentServicio = ServicioLocalServiceUtil.findByIdServicio(idServicio);
		} catch (NoSuchServicioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Fichaje currentFichaje = null;
		try {
			currentFichaje = FichajeLocalServiceUtil.findById(currentServicio.getFichajeId());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<TipoServicio> listTiposServicio = TipoServicioLocalServiceUtil.findAll();
		
		renderRequest.setAttribute("fichaje", currentFichaje);
		renderRequest.setAttribute("servicio", currentServicio);
		renderRequest.setAttribute("listTiposServicio", listTiposServicio);
		
		return "/updateServicio.jsp";
	}

}
