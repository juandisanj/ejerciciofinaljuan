package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichaje.model.Servicio;
import es.vass.fichajes.constants.FichajesWebPortletKeys;
import es.vass.fichajes.utils.ServiceDate;

@Component(immediate = true, property = { "javax.portlet.name=" + FichajesWebPortletKeys.FichajesWeb,
		"mvc.command.name=filtroServicio" }, service = MVCActionCommand.class)
public class FiltroWebActionFiltServ implements MVCActionCommand {

	private static final Log _log = new LogFactoryUtil().getLog(FiltroWebActionFiltServ.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		_log.info("Method FiltroWebActionFiltServ.processAction: Action del filtro de Servicios");

		String initDateString = actionRequest.getParameter("initDate");
		Date initDate = ServiceDate.stringToDate("yyyy-MM-dd", initDateString);
		String endDateString = actionRequest.getParameter("endDate");
		Date endDate = ServiceDate.stringToDate("yyyy-MM-dd", endDateString);
		long fichajeId = Long.parseLong(actionRequest.getParameter("fichajeId"));

		List<Servicio> listaServiciosFiltro = new ArrayList<>();
		
		// Crear servicio para búsqueda por idFichaje y fecha inicio y fin

//		actionRequest.setAttribute("listaFichajesFiltro", listaServiciosFiltro);
//
//		actionResponse.setRenderParameter("mvcRenderCommandName", "/detailFichaje");

		return true;
	}

}
