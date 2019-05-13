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

package es.vass.fichaje.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Servicio service. Represents a row in the &quot;FIchaje_Servicio&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ServicioModel
 * @see es.vass.fichaje.model.impl.ServicioImpl
 * @see es.vass.fichaje.model.impl.ServicioModelImpl
 * @generated
 */
@ImplementationClassName("es.vass.fichaje.model.impl.ServicioImpl")
@ProviderType
public interface Servicio extends ServicioModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link es.vass.fichaje.model.impl.ServicioImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Servicio, Long> ID_SERVICIO_ACCESSOR = new Accessor<Servicio, Long>() {
			@Override
			public Long get(Servicio servicio) {
				return servicio.getIdServicio();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Servicio> getTypeClass() {
				return Servicio.class;
			}
		};
}