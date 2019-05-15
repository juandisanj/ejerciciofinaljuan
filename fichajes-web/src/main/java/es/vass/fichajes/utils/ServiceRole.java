package es.vass.fichajes.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.ArrayList;
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
	
	public static List<User> getUsersPortlet(){
		List<User> listUsers = new ArrayList<>();
		
		List<User> listUserLiferay = UserLocalServiceUtil.getUsers(0, Integer.MAX_VALUE);
		for(User user : listUserLiferay) {
			
		}
		
		return listUsers;
	}
}
