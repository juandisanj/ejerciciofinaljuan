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

package es.vass.fichaje.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import es.vass.fichaje.model.TipoServicio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TipoServicio in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicio
 * @generated
 */
@ProviderType
public class TipoServicioCacheModel implements CacheModel<TipoServicio>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipoServicioCacheModel)) {
			return false;
		}

		TipoServicioCacheModel tipoServicioCacheModel = (TipoServicioCacheModel)obj;

		if (idTipoServicio == tipoServicioCacheModel.idTipoServicio) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idTipoServicio);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{idTipoServicio=");
		sb.append(idTipoServicio);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", computa=");
		sb.append(computa);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TipoServicio toEntityModel() {
		TipoServicioImpl tipoServicioImpl = new TipoServicioImpl();

		tipoServicioImpl.setIdTipoServicio(idTipoServicio);

		if (nombre == null) {
			tipoServicioImpl.setNombre("");
		}
		else {
			tipoServicioImpl.setNombre(nombre);
		}

		tipoServicioImpl.setComputa(computa);

		tipoServicioImpl.resetOriginalValues();

		return tipoServicioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idTipoServicio = objectInput.readLong();
		nombre = objectInput.readUTF();

		computa = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idTipoServicio);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		objectOutput.writeBoolean(computa);
	}

	public long idTipoServicio;
	public String nombre;
	public boolean computa;
}