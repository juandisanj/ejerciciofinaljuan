package es.vass.fichajes.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;

import java.util.List;

public class ServiceRole {
	
	private static final Log _log = new LogFactoryUtil().getLog(ServiceRole.class);

	public static boolean checkRoles(User user, List<String> checkRoles) {
		
		_log.info("Method ServiceRole.checkRoles: Comprueba la existencia de roles en un array");
		
		boolean haveRole = false;
		List<Role> listRoles = user.getRoles();
		
		for(Role r : listRoles) {
			if(checkRoles.contains(r.getName())) {
				haveRole = true;
				break;
			}
		}
	
		return haveRole;
	}
}
