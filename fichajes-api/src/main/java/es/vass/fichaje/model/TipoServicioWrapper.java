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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TipoServicio}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicio
 * @generated
 */
@ProviderType
public class TipoServicioWrapper implements TipoServicio,
	ModelWrapper<TipoServicio> {
	public TipoServicioWrapper(TipoServicio tipoServicio) {
		_tipoServicio = tipoServicio;
	}

	@Override
	public Class<?> getModelClass() {
		return TipoServicio.class;
	}

	@Override
	public String getModelClassName() {
		return TipoServicio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idTipoServicio", getIdTipoServicio());
		attributes.put("nombre", getNombre());
		attributes.put("computa", isComputa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idTipoServicio = (Long)attributes.get("idTipoServicio");

		if (idTipoServicio != null) {
			setIdTipoServicio(idTipoServicio);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Boolean computa = (Boolean)attributes.get("computa");

		if (computa != null) {
			setComputa(computa);
		}
	}

	@Override
	public Object clone() {
		return new TipoServicioWrapper((TipoServicio)_tipoServicio.clone());
	}

	@Override
	public int compareTo(TipoServicio tipoServicio) {
		return _tipoServicio.compareTo(tipoServicio);
	}

	/**
	* Returns the computa of this tipo servicio.
	*
	* @return the computa of this tipo servicio
	*/
	@Override
	public boolean getComputa() {
		return _tipoServicio.getComputa();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipoServicio.getExpandoBridge();
	}

	/**
	* Returns the id tipo servicio of this tipo servicio.
	*
	* @return the id tipo servicio of this tipo servicio
	*/
	@Override
	public long getIdTipoServicio() {
		return _tipoServicio.getIdTipoServicio();
	}

	/**
	* Returns the nombre of this tipo servicio.
	*
	* @return the nombre of this tipo servicio
	*/
	@Override
	public String getNombre() {
		return _tipoServicio.getNombre();
	}

	/**
	* Returns the primary key of this tipo servicio.
	*
	* @return the primary key of this tipo servicio
	*/
	@Override
	public long getPrimaryKey() {
		return _tipoServicio.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipoServicio.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _tipoServicio.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _tipoServicio.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this tipo servicio is computa.
	*
	* @return <code>true</code> if this tipo servicio is computa; <code>false</code> otherwise
	*/
	@Override
	public boolean isComputa() {
		return _tipoServicio.isComputa();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipoServicio.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipoServicio.isNew();
	}

	@Override
	public void persist() {
		_tipoServicio.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipoServicio.setCachedModel(cachedModel);
	}

	/**
	* Sets whether this tipo servicio is computa.
	*
	* @param computa the computa of this tipo servicio
	*/
	@Override
	public void setComputa(boolean computa) {
		_tipoServicio.setComputa(computa);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipoServicio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipoServicio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipoServicio.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id tipo servicio of this tipo servicio.
	*
	* @param idTipoServicio the id tipo servicio of this tipo servicio
	*/
	@Override
	public void setIdTipoServicio(long idTipoServicio) {
		_tipoServicio.setIdTipoServicio(idTipoServicio);
	}

	@Override
	public void setNew(boolean n) {
		_tipoServicio.setNew(n);
	}

	/**
	* Sets the nombre of this tipo servicio.
	*
	* @param nombre the nombre of this tipo servicio
	*/
	@Override
	public void setNombre(String nombre) {
		_tipoServicio.setNombre(nombre);
	}

	/**
	* Sets the primary key of this tipo servicio.
	*
	* @param primaryKey the primary key of this tipo servicio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipoServicio.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipoServicio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TipoServicio> toCacheModel() {
		return _tipoServicio.toCacheModel();
	}

	@Override
	public TipoServicio toEscapedModel() {
		return new TipoServicioWrapper(_tipoServicio.toEscapedModel());
	}

	@Override
	public String toString() {
		return _tipoServicio.toString();
	}

	@Override
	public TipoServicio toUnescapedModel() {
		return new TipoServicioWrapper(_tipoServicio.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _tipoServicio.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipoServicioWrapper)) {
			return false;
		}

		TipoServicioWrapper tipoServicioWrapper = (TipoServicioWrapper)obj;

		if (Objects.equals(_tipoServicio, tipoServicioWrapper._tipoServicio)) {
			return true;
		}

		return false;
	}

	@Override
	public TipoServicio getWrappedModel() {
		return _tipoServicio;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipoServicio.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipoServicio.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipoServicio.resetOriginalValues();
	}

	private final TipoServicio _tipoServicio;
}