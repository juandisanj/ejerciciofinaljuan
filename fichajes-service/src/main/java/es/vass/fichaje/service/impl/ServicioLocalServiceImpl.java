/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.vass.fichaje.service.impl;

import java.util.Date;

import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.impl.ServicioImpl;
import es.vass.fichaje.service.base.ServicioLocalServiceBaseImpl;

/**
 * The implementation of the servicio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.vass.fichaje.service.ServicioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicioLocalServiceBaseImpl
 * @see es.vass.fichaje.service.ServicioLocalServiceUtil
 */
public class ServicioLocalServiceImpl extends ServicioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link es.vass.fichaje.service.ServicioLocalServiceUtil} to access the servicio local service.
	 */
	
	public void addServicio(Date horaInicio, long tipoServicio, double longitud, double latitud) {
		Servicio servicio = new ServicioImpl();
		servicio.setIdServicio(counterLocalService.increment());
		servicio.setHoraInicio(horaInicio);
		servicio.setLatitud(latitud);
		servicio.setLongitud(longitud);
		
		addServicio(servicio);
	}
}