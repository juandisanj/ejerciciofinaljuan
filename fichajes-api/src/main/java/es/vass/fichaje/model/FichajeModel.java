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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Fichaje service. Represents a row in the &quot;Fichaje_Fichaje&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.vass.fichaje.model.impl.FichajeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.vass.fichaje.model.impl.FichajeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Fichaje
 * @see es.vass.fichaje.model.impl.FichajeImpl
 * @see es.vass.fichaje.model.impl.FichajeModelImpl
 * @generated
 */
@ProviderType
public interface FichajeModel extends BaseModel<Fichaje>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fichaje model instance should use the {@link Fichaje} interface instead.
	 */

	/**
	 * Returns the primary key of this fichaje.
	 *
	 * @return the primary key of this fichaje
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fichaje.
	 *
	 * @param primaryKey the primary key of this fichaje
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this fichaje.
	 *
	 * @return the uuid of this fichaje
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this fichaje.
	 *
	 * @param uuid the uuid of this fichaje
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the fichaje ID of this fichaje.
	 *
	 * @return the fichaje ID of this fichaje
	 */
	public long getFichajeId();

	/**
	 * Sets the fichaje ID of this fichaje.
	 *
	 * @param fichajeId the fichaje ID of this fichaje
	 */
	public void setFichajeId(long fichajeId);

	/**
	 * Returns the company ID of this fichaje.
	 *
	 * @return the company ID of this fichaje
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fichaje.
	 *
	 * @param companyId the company ID of this fichaje
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fichaje.
	 *
	 * @return the user ID of this fichaje
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this fichaje.
	 *
	 * @param userId the user ID of this fichaje
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fichaje.
	 *
	 * @return the user uuid of this fichaje
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this fichaje.
	 *
	 * @param userUuid the user uuid of this fichaje
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fichaje.
	 *
	 * @return the user name of this fichaje
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this fichaje.
	 *
	 * @param userName the user name of this fichaje
	 */
	public void setUserName(String userName);

	/**
	 * Returns the hora entrada of this fichaje.
	 *
	 * @return the hora entrada of this fichaje
	 */
	public Date getHoraEntrada();

	/**
	 * Sets the hora entrada of this fichaje.
	 *
	 * @param horaEntrada the hora entrada of this fichaje
	 */
	public void setHoraEntrada(Date horaEntrada);

	/**
	 * Returns the hora salida of this fichaje.
	 *
	 * @return the hora salida of this fichaje
	 */
	public Date getHoraSalida();

	/**
	 * Sets the hora salida of this fichaje.
	 *
	 * @param horaSalida the hora salida of this fichaje
	 */
	public void setHoraSalida(Date horaSalida);

	/**
	 * Returns the horas of this fichaje.
	 *
	 * @return the horas of this fichaje
	 */
	public double getHoras();

	/**
	 * Sets the horas of this fichaje.
	 *
	 * @param horas the horas of this fichaje
	 */
	public void setHoras(double horas);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Fichaje fichaje);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Fichaje> toCacheModel();

	@Override
	public Fichaje toEscapedModel();

	@Override
	public Fichaje toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}