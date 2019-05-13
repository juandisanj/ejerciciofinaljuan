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

import es.vass.fichaje.model.Servicio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Servicio in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Servicio
 * @generated
 */
@ProviderType
public class ServicioCacheModel implements CacheModel<Servicio>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicioCacheModel)) {
			return false;
		}

		ServicioCacheModel servicioCacheModel = (ServicioCacheModel)obj;

		if (idServicio == servicioCacheModel.idServicio) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idServicio);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idServicio=");
		sb.append(idServicio);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", horaInicio=");
		sb.append(horaInicio);
		sb.append(", horaFin=");
		sb.append(horaFin);
		sb.append(", longitud=");
		sb.append(longitud);
		sb.append(", latitud=");
		sb.append(latitud);
		sb.append(", idTipoServicio=");
		sb.append(idTipoServicio);
		sb.append(", fichajeId=");
		sb.append(fichajeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Servicio toEntityModel() {
		ServicioImpl servicioImpl = new ServicioImpl();

		servicioImpl.setIdServicio(idServicio);
		servicioImpl.setActivo(activo);

		if (horaInicio == Long.MIN_VALUE) {
			servicioImpl.setHoraInicio(null);
		}
		else {
			servicioImpl.setHoraInicio(new Date(horaInicio));
		}

		if (horaFin == Long.MIN_VALUE) {
			servicioImpl.setHoraFin(null);
		}
		else {
			servicioImpl.setHoraFin(new Date(horaFin));
		}

		servicioImpl.setLongitud(longitud);
		servicioImpl.setLatitud(latitud);
		servicioImpl.setIdTipoServicio(idTipoServicio);
		servicioImpl.setFichajeId(fichajeId);

		servicioImpl.resetOriginalValues();

		return servicioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idServicio = objectInput.readLong();

		activo = objectInput.readBoolean();
		horaInicio = objectInput.readLong();
		horaFin = objectInput.readLong();

		longitud = objectInput.readDouble();

		latitud = objectInput.readDouble();

		idTipoServicio = objectInput.readLong();

		fichajeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idServicio);

		objectOutput.writeBoolean(activo);
		objectOutput.writeLong(horaInicio);
		objectOutput.writeLong(horaFin);

		objectOutput.writeDouble(longitud);

		objectOutput.writeDouble(latitud);

		objectOutput.writeLong(idTipoServicio);

		objectOutput.writeLong(fichajeId);
	}

	public long idServicio;
	public boolean activo;
	public long horaInicio;
	public long horaFin;
	public double longitud;
	public double latitud;
	public long idTipoServicio;
	public long fichajeId;
}