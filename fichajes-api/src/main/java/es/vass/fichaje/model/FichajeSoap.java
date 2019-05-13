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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class FichajeSoap implements Serializable {
	public static FichajeSoap toSoapModel(Fichaje model) {
		FichajeSoap soapModel = new FichajeSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFichajeId(model.getFichajeId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setHoraEntrada(model.getHoraEntrada());
		soapModel.setHoraSalida(model.getHoraSalida());
		soapModel.setHoras(model.getHoras());

		return soapModel;
	}

	public static FichajeSoap[] toSoapModels(Fichaje[] models) {
		FichajeSoap[] soapModels = new FichajeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FichajeSoap[][] toSoapModels(Fichaje[][] models) {
		FichajeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FichajeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FichajeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FichajeSoap[] toSoapModels(List<Fichaje> models) {
		List<FichajeSoap> soapModels = new ArrayList<FichajeSoap>(models.size());

		for (Fichaje model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FichajeSoap[soapModels.size()]);
	}

	public FichajeSoap() {
	}

	public long getPrimaryKey() {
		return _fichajeId;
	}

	public void setPrimaryKey(long pk) {
		setFichajeId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFichajeId() {
		return _fichajeId;
	}

	public void setFichajeId(long fichajeId) {
		_fichajeId = fichajeId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getHoraEntrada() {
		return _horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		_horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return _horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		_horaSalida = horaSalida;
	}

	public double getHoras() {
		return _horas;
	}

	public void setHoras(double horas) {
		_horas = horas;
	}

	private String _uuid;
	private long _fichajeId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _horaEntrada;
	private Date _horaSalida;
	private double _horas;
}