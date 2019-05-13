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
public class ServicioSoap implements Serializable {
	public static ServicioSoap toSoapModel(Servicio model) {
		ServicioSoap soapModel = new ServicioSoap();

		soapModel.setIdServicio(model.getIdServicio());
		soapModel.setActivo(model.isActivo());
		soapModel.setHoraInicio(model.getHoraInicio());
		soapModel.setHoraFin(model.getHoraFin());
		soapModel.setLongitud(model.getLongitud());
		soapModel.setLatitud(model.getLatitud());
		soapModel.setIdTipoServicio(model.getIdTipoServicio());
		soapModel.setFichajeId(model.getFichajeId());

		return soapModel;
	}

	public static ServicioSoap[] toSoapModels(Servicio[] models) {
		ServicioSoap[] soapModels = new ServicioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServicioSoap[][] toSoapModels(Servicio[][] models) {
		ServicioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServicioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServicioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServicioSoap[] toSoapModels(List<Servicio> models) {
		List<ServicioSoap> soapModels = new ArrayList<ServicioSoap>(models.size());

		for (Servicio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServicioSoap[soapModels.size()]);
	}

	public ServicioSoap() {
	}

	public long getPrimaryKey() {
		return _idServicio;
	}

	public void setPrimaryKey(long pk) {
		setIdServicio(pk);
	}

	public long getIdServicio() {
		return _idServicio;
	}

	public void setIdServicio(long idServicio) {
		_idServicio = idServicio;
	}

	public boolean getActivo() {
		return _activo;
	}

	public boolean isActivo() {
		return _activo;
	}

	public void setActivo(boolean activo) {
		_activo = activo;
	}

	public Date getHoraInicio() {
		return _horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		_horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return _horaFin;
	}

	public void setHoraFin(Date horaFin) {
		_horaFin = horaFin;
	}

	public double getLongitud() {
		return _longitud;
	}

	public void setLongitud(double longitud) {
		_longitud = longitud;
	}

	public double getLatitud() {
		return _latitud;
	}

	public void setLatitud(double latitud) {
		_latitud = latitud;
	}

	public long getIdTipoServicio() {
		return _idTipoServicio;
	}

	public void setIdTipoServicio(long idTipoServicio) {
		_idTipoServicio = idTipoServicio;
	}

	public long getFichajeId() {
		return _fichajeId;
	}

	public void setFichajeId(long fichajeId) {
		_fichajeId = fichajeId;
	}

	private long _idServicio;
	private boolean _activo;
	private Date _horaInicio;
	private Date _horaFin;
	private double _longitud;
	private double _latitud;
	private long _idTipoServicio;
	private long _fichajeId;
}