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
 * Provides a wrapper for {@link ServicioLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ServicioLocalService
 * @generated
 */
@ProviderType
public class ServicioLocalServiceWrapper implements ServicioLocalService,
	ServiceWrapper<ServicioLocalService> {
	public ServicioLocalServiceWrapper(
		ServicioLocalService servicioLocalService) {
		_servicioLocalService = servicioLocalService;
	}

	@Override
	public void addServicio(java.util.Date horaInicio, long tipoServicio,
		double longitud, double latitud, long fichajeId) {
		_servicioLocalService.addServicio(horaInicio, tipoServicio, longitud,
			latitud, fichajeId);
	}

	/**
	* Adds the servicio to the database. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was added
	*/
	@Override
	public es.vass.fichaje.model.Servicio addServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return _servicioLocalService.addServicio(servicio);
	}

	/**
	* Creates a new servicio with the primary key. Does not add the servicio to the database.
	*
	* @param idServicio the primary key for the new servicio
	* @return the new servicio
	*/
	@Override
	public es.vass.fichaje.model.Servicio createServicio(long idServicio) {
		return _servicioLocalService.createServicio(idServicio);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicioLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio that was removed
	* @throws PortalException if a servicio with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.Servicio deleteServicio(long idServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicioLocalService.deleteServicio(idServicio);
	}

	/**
	* Deletes the servicio from the database. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was removed
	*/
	@Override
	public es.vass.fichaje.model.Servicio deleteServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return _servicioLocalService.deleteServicio(servicio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _servicioLocalService.dynamicQuery();
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
		return _servicioLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _servicioLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _servicioLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _servicioLocalService.dynamicQueryCount(dynamicQuery);
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
		return _servicioLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.vass.fichaje.model.Servicio fetchServicio(long idServicio) {
		return _servicioLocalService.fetchServicio(idServicio);
	}

	@Override
	public es.vass.fichaje.model.Servicio findByFichajeId_Last(long fichajeId) {
		return _servicioLocalService.findByFichajeId_Last(fichajeId);
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Servicio> findByIdFichaje(
		long idFichaje) {
		return _servicioLocalService.findByIdFichaje(idFichaje);
	}

	@Override
	public es.vass.fichaje.model.Servicio findByIdServicio(long idServicio)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return _servicioLocalService.findByIdServicio(idServicio);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _servicioLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _servicioLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _servicioLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicioLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the servicio with the primary key.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio
	* @throws PortalException if a servicio with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.Servicio getServicio(long idServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicioLocalService.getServicio(idServicio);
	}

	/**
	* Returns a range of all the servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @return the range of servicios
	*/
	@Override
	public java.util.List<es.vass.fichaje.model.Servicio> getServicios(
		int start, int end) {
		return _servicioLocalService.getServicios(start, end);
	}

	/**
	* Returns the number of servicios.
	*
	* @return the number of servicios
	*/
	@Override
	public int getServiciosCount() {
		return _servicioLocalService.getServiciosCount();
	}

	@Override
	public boolean updateEndService(long idServicio, java.util.Date horaFin)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicioLocalService.updateEndService(idServicio, horaFin);
	}

	/**
	* Updates the servicio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was updated
	*/
	@Override
	public es.vass.fichaje.model.Servicio updateServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return _servicioLocalService.updateServicio(servicio);
	}

	@Override
	public ServicioLocalService getWrappedService() {
		return _servicioLocalService;
	}

	@Override
	public void setWrappedService(ServicioLocalService servicioLocalService) {
		_servicioLocalService = servicioLocalService;
	}

	private ServicioLocalService _servicioLocalService;
}