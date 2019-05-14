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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Servicio}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Servicio
 * @generated
 */
@ProviderType
public class ServicioWrapper implements Servicio, ModelWrapper<Servicio> {
	public ServicioWrapper(Servicio servicio) {
		_servicio = servicio;
	}

	@Override
	public Class<?> getModelClass() {
		return Servicio.class;
	}

	@Override
	public String getModelClassName() {
		return Servicio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idServicio", getIdServicio());
		attributes.put("activo", isActivo());
		attributes.put("horaInicio", getHoraInicio());
		attributes.put("horaFin", getHoraFin());
		attributes.put("duracion", getDuracion());
		attributes.put("longitud", getLongitud());
		attributes.put("latitud", getLatitud());
		attributes.put("idTipoServicio", getIdTipoServicio());
		attributes.put("fichajeId", getFichajeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idServicio = (Long)attributes.get("idServicio");

		if (idServicio != null) {
			setIdServicio(idServicio);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Date horaInicio = (Date)attributes.get("horaInicio");

		if (horaInicio != null) {
			setHoraInicio(horaInicio);
		}

		Date horaFin = (Date)attributes.get("horaFin");

		if (horaFin != null) {
			setHoraFin(horaFin);
		}

		Double duracion = (Double)attributes.get("duracion");

		if (duracion != null) {
			setDuracion(duracion);
		}

		Double longitud = (Double)attributes.get("longitud");

		if (longitud != null) {
			setLongitud(longitud);
		}

		Double latitud = (Double)attributes.get("latitud");

		if (latitud != null) {
			setLatitud(latitud);
		}

		Long idTipoServicio = (Long)attributes.get("idTipoServicio");

		if (idTipoServicio != null) {
			setIdTipoServicio(idTipoServicio);
		}

		Long fichajeId = (Long)attributes.get("fichajeId");

		if (fichajeId != null) {
			setFichajeId(fichajeId);
		}
	}

	@Override
	public Object clone() {
		return new ServicioWrapper((Servicio)_servicio.clone());
	}

	@Override
	public int compareTo(Servicio servicio) {
		return _servicio.compareTo(servicio);
	}

	/**
	* Returns the activo of this servicio.
	*
	* @return the activo of this servicio
	*/
	@Override
	public boolean getActivo() {
		return _servicio.getActivo();
	}

	/**
	* Returns the duracion of this servicio.
	*
	* @return the duracion of this servicio
	*/
	@Override
	public double getDuracion() {
		return _servicio.getDuracion();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _servicio.getExpandoBridge();
	}

	/**
	* Returns the fichaje ID of this servicio.
	*
	* @return the fichaje ID of this servicio
	*/
	@Override
	public long getFichajeId() {
		return _servicio.getFichajeId();
	}

	/**
	* Returns the hora fin of this servicio.
	*
	* @return the hora fin of this servicio
	*/
	@Override
	public Date getHoraFin() {
		return _servicio.getHoraFin();
	}

	/**
	* Returns the hora inicio of this servicio.
	*
	* @return the hora inicio of this servicio
	*/
	@Override
	public Date getHoraInicio() {
		return _servicio.getHoraInicio();
	}

	/**
	* Returns the id servicio of this servicio.
	*
	* @return the id servicio of this servicio
	*/
	@Override
	public long getIdServicio() {
		return _servicio.getIdServicio();
	}

	/**
	* Returns the id tipo servicio of this servicio.
	*
	* @return the id tipo servicio of this servicio
	*/
	@Override
	public long getIdTipoServicio() {
		return _servicio.getIdTipoServicio();
	}

	/**
	* Returns the latitud of this servicio.
	*
	* @return the latitud of this servicio
	*/
	@Override
	public double getLatitud() {
		return _servicio.getLatitud();
	}

	/**
	* Returns the longitud of this servicio.
	*
	* @return the longitud of this servicio
	*/
	@Override
	public double getLongitud() {
		return _servicio.getLongitud();
	}

	/**
	* Returns the primary key of this servicio.
	*
	* @return the primary key of this servicio
	*/
	@Override
	public long getPrimaryKey() {
		return _servicio.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _servicio.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _servicio.hashCode();
	}

	/**
	* Returns <code>true</code> if this servicio is activo.
	*
	* @return <code>true</code> if this servicio is activo; <code>false</code> otherwise
	*/
	@Override
	public boolean isActivo() {
		return _servicio.isActivo();
	}

	@Override
	public boolean isCachedModel() {
		return _servicio.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _servicio.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _servicio.isNew();
	}

	@Override
	public void persist() {
		_servicio.persist();
	}

	/**
	* Sets whether this servicio is activo.
	*
	* @param activo the activo of this servicio
	*/
	@Override
	public void setActivo(boolean activo) {
		_servicio.setActivo(activo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_servicio.setCachedModel(cachedModel);
	}

	/**
	* Sets the duracion of this servicio.
	*
	* @param duracion the duracion of this servicio
	*/
	@Override
	public void setDuracion(double duracion) {
		_servicio.setDuracion(duracion);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_servicio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_servicio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_servicio.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fichaje ID of this servicio.
	*
	* @param fichajeId the fichaje ID of this servicio
	*/
	@Override
	public void setFichajeId(long fichajeId) {
		_servicio.setFichajeId(fichajeId);
	}

	/**
	* Sets the hora fin of this servicio.
	*
	* @param horaFin the hora fin of this servicio
	*/
	@Override
	public void setHoraFin(Date horaFin) {
		_servicio.setHoraFin(horaFin);
	}

	/**
	* Sets the hora inicio of this servicio.
	*
	* @param horaInicio the hora inicio of this servicio
	*/
	@Override
	public void setHoraInicio(Date horaInicio) {
		_servicio.setHoraInicio(horaInicio);
	}

	/**
	* Sets the id servicio of this servicio.
	*
	* @param idServicio the id servicio of this servicio
	*/
	@Override
	public void setIdServicio(long idServicio) {
		_servicio.setIdServicio(idServicio);
	}

	/**
	* Sets the id tipo servicio of this servicio.
	*
	* @param idTipoServicio the id tipo servicio of this servicio
	*/
	@Override
	public void setIdTipoServicio(long idTipoServicio) {
		_servicio.setIdTipoServicio(idTipoServicio);
	}

	/**
	* Sets the latitud of this servicio.
	*
	* @param latitud the latitud of this servicio
	*/
	@Override
	public void setLatitud(double latitud) {
		_servicio.setLatitud(latitud);
	}

	/**
	* Sets the longitud of this servicio.
	*
	* @param longitud the longitud of this servicio
	*/
	@Override
	public void setLongitud(double longitud) {
		_servicio.setLongitud(longitud);
	}

	@Override
	public void setNew(boolean n) {
		_servicio.setNew(n);
	}

	/**
	* Sets the primary key of this servicio.
	*
	* @param primaryKey the primary key of this servicio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_servicio.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_servicio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Servicio> toCacheModel() {
		return _servicio.toCacheModel();
	}

	@Override
	public Servicio toEscapedModel() {
		return new ServicioWrapper(_servicio.toEscapedModel());
	}

	@Override
	public String toString() {
		return _servicio.toString();
	}

	@Override
	public Servicio toUnescapedModel() {
		return new ServicioWrapper(_servicio.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _servicio.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicioWrapper)) {
			return false;
		}

		ServicioWrapper servicioWrapper = (ServicioWrapper)obj;

		if (Objects.equals(_servicio, servicioWrapper._servicio)) {
			return true;
		}

		return false;
	}

	@Override
	public Servicio getWrappedModel() {
		return _servicio;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _servicio.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _servicio.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_servicio.resetOriginalValues();
	}

	private final Servicio _servicio;
}