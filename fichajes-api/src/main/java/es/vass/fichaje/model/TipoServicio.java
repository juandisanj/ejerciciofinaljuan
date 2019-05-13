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
 * The extended model interface for the TipoServicio service. Represents a row in the &quot;FIchaje_TipoServicio&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicioModel
 * @see es.vass.fichaje.model.impl.TipoServicioImpl
 * @see es.vass.fichaje.model.impl.TipoServicioModelImpl
 * @generated
 */
@ImplementationClassName("es.vass.fichaje.model.impl.TipoServicioImpl")
@ProviderType
public interface TipoServicio extends TipoServicioModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link es.vass.fichaje.model.impl.TipoServicioImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TipoServicio, Long> ID_TIPO_SERVICIO_ACCESSOR = new Accessor<TipoServicio, Long>() {
			@Override
			public Long get(TipoServicio tipoServicio) {
				return tipoServicio.getIdTipoServicio();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TipoServicio> getTypeClass() {
				return TipoServicio.class;
			}
		};
}