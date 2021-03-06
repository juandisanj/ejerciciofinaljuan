package es.vass.fichajes.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichaje.service.TipoServicioLocalServiceUtil;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceDate;

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
		
		_log.info("Method FichajesWebPortlet.render: Renderizado de la p�gina de Fichajes");
		
		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		boolean activo = false;
		try {
			activo = (boolean) renderRequest.getAttribute("activo");
		}catch(Exception e) {
			e.getMessage();
			_log.error("Method FichajesWebPortlet.render: Error al recuperar el atributo activo");
		}

		
		try {
			
			// Buscar el fichaje de hoy
			Date initDay = ServiceDate.toMomentOfDay("init", new Date());
			Date endDay = ServiceDate.toMomentOfDay("end", new Date());
			
			System.out.println("Fechas enviadas al buscar: " + initDay + ", " + endDay);
			
			List<Fichaje> fichaje = null;
			try {
				fichaje = FichajeLocalServiceUtil.findByUserIdDate(td.getUserId(), initDay, endDay);
			}catch(Exception e) {
				e.getMessage();
				_log.error("Method FichajesWebPortlet.render: Error al tratar de recuperar el fichaje del d�a actual");
			}
			
			if(fichaje.size() == 0) {
				activo = false;
			}
			
			// Recuperar el id del Fichaje para comprobar su el �ltimo servicio est� activo
			long idFichaje = 0;
			
			System.out.println("Tama�o de la lista: " + fichaje.size());
			// Buscar el �ltimo de servicio del fichaje de hoy
			for(Fichaje f : fichaje) {
				idFichaje = f.getFichajeId();
			}
			
			Servicio servicio = ServicioLocalServiceUtil.findByFichajeId_Last(idFichaje);
			if(servicio.getActivo() == true) {
				activo = true;
			}
			
			System.out.println("Activo: " + servicio.getActivo());
			
		}catch(Exception e) {	// Si no tiene fichaje, activo continua en true
			e.getMessage();
			_log.error("Method FichajesWebPortlet.render: Error al tratar de recuperar el estado del Servicio actual");
		}
		
		List<TipoServicio> listaTipoServicios = TipoServicioLocalServiceUtil.findAll();
		
		// Recuperar el estado del �ltimo servicio para indicar qu� bot�n debe estar activo
		
		System.out.println("Listado de tipos de servicios recuperado: " + listaTipoServicios.size());
		
		renderRequest.setAttribute("listaTipoServicios", listaTipoServicios);
		renderRequest.setAttribute("activo", activo);
		
		super.render(renderRequest, renderResponse);
	}
}