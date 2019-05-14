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

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + FichajesWebPortletKeys.FichajesWeb,
				"mvc.command.name=/detailFichaje" },
		service = MVCRenderCommand.class)
public class FichajesWebRenderDet implements MVCRenderCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebRenderDet.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		_log.info("Method FichajesWebRenderDet.render: Renderizado del detalle de fichajes");
		
		long idFichaje = Long.parseLong(renderRequest.getParameter("fichajeId"));
		
		Fichaje fichaje = null;
		try {
			fichaje = FichajeLocalServiceUtil.findById(idFichaje);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Servicio> listaServicios = ServicioLocalServiceUtil.findByIdFichaje(fichaje.getFichajeId());
		
		renderRequest.setAttribute("fichaje", fichaje);
		renderRequest.setAttribute("listaServicios", listaServicios);
		
		return "/detailFichaje.jsp";
	}

}
