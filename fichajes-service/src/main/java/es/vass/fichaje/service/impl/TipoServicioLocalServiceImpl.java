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

import java.util.List;

import es.vass.fichaje.exception.NoSuchTipoServicioException;
import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.service.base.TipoServicioLocalServiceBaseImpl;
import es.vass.fichaje.service.persistence.TipoServicioUtil;

/**
 * The implementation of the tipo servicio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.vass.fichaje.service.TipoServicioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicioLocalServiceBaseImpl
 * @see es.vass.fichaje.service.TipoServicioLocalServiceUtil
 */
public class TipoServicioLocalServiceImpl
	extends TipoServicioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link es.vass.fichaje.service.TipoServicioLocalServiceUtil} to access the tipo servicio local service.
	 */
	
	public List<TipoServicio> findAll(){
		List<TipoServicio> listaTipoServicios = TipoServicioUtil.findAll();
		return listaTipoServicios;
	}
	
	public TipoServicio findByIdTipoServicio(long idTipoServicio) throws NoSuchTipoServicioException {
		TipoServicio tipoServicio = TipoServicioUtil.findByPrimaryKey(idTipoServicio);
		return tipoServicio;
	}
}