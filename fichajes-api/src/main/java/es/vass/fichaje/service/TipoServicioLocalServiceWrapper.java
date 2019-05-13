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

package es.vass.fichaje.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TipoServicioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicioLocalService
 * @generated
 */
@ProviderType
public class TipoServicioLocalServiceWrapper implements TipoServicioLocalService,
	ServiceWrapper<TipoServicioLocalService> {
	public TipoServicioLocalServiceWrapper(
		TipoServicioLocalService tipoServicioLocalService) {
		_tipoServicioLocalService = tipoServicioLocalService;
	}

	/**
	* Adds the tipo servicio to the database. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was added
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio addTipoServicio(
		es.vass.fichaje.model.TipoServicio tipoServicio) {
		return _tipoServicioLocalService.addTipoServicio(tipoServicio);
	}

	/**
	* Creates a new tipo servicio with the primary key. Does not add the tipo servicio to the database.
	*
	* @param idTipoServicio the primary key for the new tipo servicio
	* @return the new tipo servicio
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio createTipoServicio(
		long idTipoServicio) {
		return _tipoServicioLocalService.createTipoServicio(idTipoServicio);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipoServicioLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio that was removed
	* @throws PortalException if a tipo servicio with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio deleteTipoServicio(
		long idTipoServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipoServicioLocalService.deleteTipoServicio(idTipoServicio);
	}

	/**
	* Deletes the tipo servicio from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was removed
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio deleteTipoServicio(
		es.vass.fichaje.model.TipoServicio tipoServicio) {
		return _tipoServicioLocalService.deleteTipoServicio(tipoServicio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tipoServicioLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tipoServicioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _tipoServicioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _tipoServicioLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tipoServicioLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _tipoServicioLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.vass.fichaje.model.TipoServicio fetchTipoServicio(
		long idTipoServicio) {
		return _tipoServicioLocalService.fetchTipoServicio(idTipoServicio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tipoServicioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tipoServicioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _tipoServicioLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipoServicioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the tipo servicio with the primary key.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio
	* @throws PortalException if a tipo servicio with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio getTipoServicio(
		long idTipoServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tipoServicioLocalService.getTipoServicio(idTipoServicio);
	}

	/**
	* Returns a range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @return the range of tipo servicios
	*/
	@Override
	public java.util.List<es.vass.fichaje.model.TipoServicio> getTipoServicios(
		int start, int end) {
		return _tipoServicioLocalService.getTipoServicios(start, end);
	}

	/**
	* Returns the number of tipo servicios.
	*
	* @return the number of tipo servicios
	*/
	@Override
	public int getTipoServiciosCount() {
		return _tipoServicioLocalService.getTipoServiciosCount();
	}

	/**
	* Updates the tipo servicio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipoServicio the tipo servicio
	* @return the tipo servicio that was updated
	*/
	@Override
	public es.vass.fichaje.model.TipoServicio updateTipoServicio(
		es.vass.fichaje.model.TipoServicio tipoServicio) {
		return _tipoServicioLocalService.updateTipoServicio(tipoServicio);
	}

	@Override
	public TipoServicioLocalService getWrappedService() {
		return _tipoServicioLocalService;
	}

	@Override
	public void setWrappedService(
		TipoServicioLocalService tipoServicioLocalService) {
		_tipoServicioLocalService = tipoServicioLocalService;
	}

	private TipoServicioLocalService _tipoServicioLocalService;
}