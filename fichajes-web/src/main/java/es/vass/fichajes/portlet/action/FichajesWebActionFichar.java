package es.vass.fichajes.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.vass.fichajes.constants.FichajesWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ FichajesWebPortletKeys.FichajesWeb,
			"mvc.command.name=fichajeServicio"
		},
		service = MVCActionCommand.class
	)
public class FichajesWebActionFichar implements MVCActionCommand {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebActionFichar.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		_log.info("Method FichajesWebActionFichar.processAction: Action del Fichaje de un empleado");
		
		// Recibe la acción disponible (Iniciar / Parar) y, si la acción es Iniciar, el tipo de Servicio seleccionado
		
		/*
		 *  1. Si la acción es Iniciar, recuperar:
		 *  - 
		 */
		
		// Incluir un if/else, en función del cual se redirija al render adecuado
//		actionResponse.setRenderParameter("mvcRenderCommandName", "/listFichajes");
		
		return true;
	}

}
