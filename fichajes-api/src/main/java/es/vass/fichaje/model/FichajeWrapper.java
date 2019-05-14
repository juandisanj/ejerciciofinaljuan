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
 * This class is a wrapper for {@link Fichaje}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Fichaje
 * @generated
 */
@ProviderType
public class FichajeWrapper implements Fichaje, ModelWrapper<Fichaje> {
	public FichajeWrapper(Fichaje fichaje) {
		_fichaje = fichaje;
	}

	@Override
	public Class<?> getModelClass() {
		return Fichaje.class;
	}

	@Override
	public String getModelClassName() {
		return Fichaje.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fichajeId", getFichajeId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("horaEntrada", getHoraEntrada());
		attributes.put("horaSalida", getHoraSalida());
		attributes.put("horas", getHoras());
		attributes.put("horasExtra", getHorasExtra());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fichajeId = (Long)attributes.get("fichajeId");

		if (fichajeId != null) {
			setFichajeId(fichajeId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date horaEntrada = (Date)attributes.get("horaEntrada");

		if (horaEntrada != null) {
			setHoraEntrada(horaEntrada);
		}

		Date horaSalida = (Date)attributes.get("horaSalida");

		if (horaSalida != null) {
			setHoraSalida(horaSalida);
		}

		Double horas = (Double)attributes.get("horas");

		if (horas != null) {
			setHoras(horas);
		}

		Double horasExtra = (Double)attributes.get("horasExtra");

		if (horasExtra != null) {
			setHorasExtra(horasExtra);
		}
	}

	@Override
	public Object clone() {
		return new FichajeWrapper((Fichaje)_fichaje.clone());
	}

	@Override
	public int compareTo(Fichaje fichaje) {
		return _fichaje.compareTo(fichaje);
	}

	/**
	* Returns the company ID of this fichaje.
	*
	* @return the company ID of this fichaje
	*/
	@Override
	public long getCompanyId() {
		return _fichaje.getCompanyId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _fichaje.getExpandoBridge();
	}

	/**
	* Returns the fichaje ID of this fichaje.
	*
	* @return the fichaje ID of this fichaje
	*/
	@Override
	public long getFichajeId() {
		return _fichaje.getFichajeId();
	}

	/**
	* Returns the hora entrada of this fichaje.
	*
	* @return the hora entrada of this fichaje
	*/
	@Override
	public Date getHoraEntrada() {
		return _fichaje.getHoraEntrada();
	}

	/**
	* Returns the horas of this fichaje.
	*
	* @return the horas of this fichaje
	*/
	@Override
	public double getHoras() {
		return _fichaje.getHoras();
	}

	/**
	* Returns the hora salida of this fichaje.
	*
	* @return the hora salida of this fichaje
	*/
	@Override
	public Date getHoraSalida() {
		return _fichaje.getHoraSalida();
	}

	/**
	* Returns the horas extra of this fichaje.
	*
	* @return the horas extra of this fichaje
	*/
	@Override
	public double getHorasExtra() {
		return _fichaje.getHorasExtra();
	}

	/**
	* Returns the primary key of this fichaje.
	*
	* @return the primary key of this fichaje
	*/
	@Override
	public long getPrimaryKey() {
		return _fichaje.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fichaje.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this fichaje.
	*
	* @return the user ID of this fichaje
	*/
	@Override
	public long getUserId() {
		return _fichaje.getUserId();
	}

	/**
	* Returns the user name of this fichaje.
	*
	* @return the user name of this fichaje
	*/
	@Override
	public String getUserName() {
		return _fichaje.getUserName();
	}

	/**
	* Returns the user uuid of this fichaje.
	*
	* @return the user uuid of this fichaje
	*/
	@Override
	public String getUserUuid() {
		return _fichaje.getUserUuid();
	}

	/**
	* Returns the uuid of this fichaje.
	*
	* @return the uuid of this fichaje
	*/
	@Override
	public String getUuid() {
		return _fichaje.getUuid();
	}

	@Override
	public int hashCode() {
		return _fichaje.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _fichaje.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _fichaje.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _fichaje.isNew();
	}

	@Override
	public void persist() {
		_fichaje.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fichaje.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this fichaje.
	*
	* @param companyId the company ID of this fichaje
	*/
	@Override
	public void setCompanyId(long companyId) {
		_fichaje.setCompanyId(companyId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_fichaje.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_fichaje.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_fichaje.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fichaje ID of this fichaje.
	*
	* @param fichajeId the fichaje ID of this fichaje
	*/
	@Override
	public void setFichajeId(long fichajeId) {
		_fichaje.setFichajeId(fichajeId);
	}

	/**
	* Sets the hora entrada of this fichaje.
	*
	* @param horaEntrada the hora entrada of this fichaje
	*/
	@Override
	public void setHoraEntrada(Date horaEntrada) {
		_fichaje.setHoraEntrada(horaEntrada);
	}

	/**
	* Sets the horas of this fichaje.
	*
	* @param horas the horas of this fichaje
	*/
	@Override
	public void setHoras(double horas) {
		_fichaje.setHoras(horas);
	}

	/**
	* Sets the hora salida of this fichaje.
	*
	* @param horaSalida the hora salida of this fichaje
	*/
	@Override
	public void setHoraSalida(Date horaSalida) {
		_fichaje.setHoraSalida(horaSalida);
	}

	/**
	* Sets the horas extra of this fichaje.
	*
	* @param horasExtra the horas extra of this fichaje
	*/
	@Override
	public void setHorasExtra(double horasExtra) {
		_fichaje.setHorasExtra(horasExtra);
	}

	@Override
	public void setNew(boolean n) {
		_fichaje.setNew(n);
	}

	/**
	* Sets the primary key of this fichaje.
	*
	* @param primaryKey the primary key of this fichaje
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fichaje.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_fichaje.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this fichaje.
	*
	* @param userId the user ID of this fichaje
	*/
	@Override
	public void setUserId(long userId) {
		_fichaje.setUserId(userId);
	}

	/**
	* Sets the user name of this fichaje.
	*
	* @param userName the user name of this fichaje
	*/
	@Override
	public void setUserName(String userName) {
		_fichaje.setUserName(userName);
	}

	/**
	* Sets the user uuid of this fichaje.
	*
	* @param userUuid the user uuid of this fichaje
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_fichaje.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this fichaje.
	*
	* @param uuid the uuid of this fichaje
	*/
	@Override
	public void setUuid(String uuid) {
		_fichaje.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Fichaje> toCacheModel() {
		return _fichaje.toCacheModel();
	}

	@Override
	public Fichaje toEscapedModel() {
		return new FichajeWrapper(_fichaje.toEscapedModel());
	}

	@Override
	public String toString() {
		return _fichaje.toString();
	}

	@Override
	public Fichaje toUnescapedModel() {
		return new FichajeWrapper(_fichaje.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _fichaje.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FichajeWrapper)) {
			return false;
		}

		FichajeWrapper fichajeWrapper = (FichajeWrapper)obj;

		if (Objects.equals(_fichaje, fichajeWrapper._fichaje)) {
			return true;
		}

		return false;
	}

	@Override
	public Fichaje getWrappedModel() {
		return _fichaje;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _fichaje.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _fichaje.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_fichaje.resetOriginalValues();
	}

	private final Fichaje _fichaje;
}