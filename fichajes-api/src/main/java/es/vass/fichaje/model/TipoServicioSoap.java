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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class TipoServicioSoap implements Serializable {
	public static TipoServicioSoap toSoapModel(TipoServicio model) {
		TipoServicioSoap soapModel = new TipoServicioSoap();

		soapModel.setIdTipoServicio(model.getIdTipoServicio());
		soapModel.setNombre(model.getNombre());
		soapModel.setComputa(model.isComputa());

		return soapModel;
	}

	public static TipoServicioSoap[] toSoapModels(TipoServicio[] models) {
		TipoServicioSoap[] soapModels = new TipoServicioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TipoServicioSoap[][] toSoapModels(TipoServicio[][] models) {
		TipoServicioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TipoServicioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TipoServicioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TipoServicioSoap[] toSoapModels(List<TipoServicio> models) {
		List<TipoServicioSoap> soapModels = new ArrayList<TipoServicioSoap>(models.size());

		for (TipoServicio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TipoServicioSoap[soapModels.size()]);
	}

	public TipoServicioSoap() {
	}

	public long getPrimaryKey() {
		return _idTipoServicio;
	}

	public void setPrimaryKey(long pk) {
		setIdTipoServicio(pk);
	}

	public long getIdTipoServicio() {
		return _idTipoServicio;
	}

	public void setIdTipoServicio(long idTipoServicio) {
		_idTipoServicio = idTipoServicio;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public boolean getComputa() {
		return _computa;
	}

	public boolean isComputa() {
		return _computa;
	}

	public void setComputa(boolean computa) {
		_computa = computa;
	}

	private long _idTipoServicio;
	private String _nombre;
	private boolean _computa;
}