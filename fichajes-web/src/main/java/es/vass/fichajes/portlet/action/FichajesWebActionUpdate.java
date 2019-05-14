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
			"mvc.command.name=updateUsuario"
		},
		service = MVCActionCommand.class
	)
public class FichajesWebActionUpdate implements MVCActionCommand  {
	
	private static final Log _log = new LogFactoryUtil().getLog(FichajesWebActionUpdate.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		_log.info("Method FichajesWebActionUpdate.processAction: Action del modificado de usuarios");
		
//		actionRequest
		
		return true;
	}

}
