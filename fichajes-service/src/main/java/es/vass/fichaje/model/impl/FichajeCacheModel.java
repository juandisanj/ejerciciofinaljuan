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

import es.vass.fichaje.model.Fichaje;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Fichaje in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Fichaje
 * @generated
 */
@ProviderType
public class FichajeCacheModel implements CacheModel<Fichaje>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FichajeCacheModel)) {
			return false;
		}

		FichajeCacheModel fichajeCacheModel = (FichajeCacheModel)obj;

		if (fichajeId == fichajeCacheModel.fichajeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fichajeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fichajeId=");
		sb.append(fichajeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", horaEntrada=");
		sb.append(horaEntrada);
		sb.append(", horaSalida=");
		sb.append(horaSalida);
		sb.append(", horas=");
		sb.append(horas);
		sb.append(", horasExtra=");
		sb.append(horasExtra);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Fichaje toEntityModel() {
		FichajeImpl fichajeImpl = new FichajeImpl();

		if (uuid == null) {
			fichajeImpl.setUuid("");
		}
		else {
			fichajeImpl.setUuid(uuid);
		}

		fichajeImpl.setFichajeId(fichajeId);
		fichajeImpl.setCompanyId(companyId);
		fichajeImpl.setUserId(userId);

		if (userName == null) {
			fichajeImpl.setUserName("");
		}
		else {
			fichajeImpl.setUserName(userName);
		}

		if (horaEntrada == Long.MIN_VALUE) {
			fichajeImpl.setHoraEntrada(null);
		}
		else {
			fichajeImpl.setHoraEntrada(new Date(horaEntrada));
		}

		if (horaSalida == Long.MIN_VALUE) {
			fichajeImpl.setHoraSalida(null);
		}
		else {
			fichajeImpl.setHoraSalida(new Date(horaSalida));
		}

		fichajeImpl.setHoras(horas);
		fichajeImpl.setHorasExtra(horasExtra);

		fichajeImpl.resetOriginalValues();

		return fichajeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fichajeId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		horaEntrada = objectInput.readLong();
		horaSalida = objectInput.readLong();

		horas = objectInput.readDouble();

		horasExtra = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fichajeId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(horaEntrada);
		objectOutput.writeLong(horaSalida);

		objectOutput.writeDouble(horas);

		objectOutput.writeDouble(horasExtra);
	}

	public String uuid;
	public long fichajeId;
	public long companyId;
	public long userId;
	public String userName;
	public long horaEntrada;
	public long horaSalida;
	public double horas;
	public double horasExtra;
}