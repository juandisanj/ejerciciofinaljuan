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
 * Provides a wrapper for {@link FichajeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FichajeLocalService
 * @generated
 */
@ProviderType
public class FichajeLocalServiceWrapper implements FichajeLocalService,
	ServiceWrapper<FichajeLocalService> {
	public FichajeLocalServiceWrapper(FichajeLocalService fichajeLocalService) {
		_fichajeLocalService = fichajeLocalService;
	}

	/**
	* Adds the fichaje to the database. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was added
	*/
	@Override
	public es.vass.fichaje.model.Fichaje addFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return _fichajeLocalService.addFichaje(fichaje);
	}

	@Override
	public void addFichaje(long companyId, long userId, String userName) {
		_fichajeLocalService.addFichaje(companyId, userId, userName);
	}

	/**
	* Creates a new fichaje with the primary key. Does not add the fichaje to the database.
	*
	* @param fichajeId the primary key for the new fichaje
	* @return the new fichaje
	*/
	@Override
	public es.vass.fichaje.model.Fichaje createFichaje(long fichajeId) {
		return _fichajeLocalService.createFichaje(fichajeId);
	}

	/**
	* Deletes the fichaje from the database. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was removed
	*/
	@Override
	public es.vass.fichaje.model.Fichaje deleteFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return _fichajeLocalService.deleteFichaje(fichaje);
	}

	/**
	* Deletes the fichaje with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje that was removed
	* @throws PortalException if a fichaje with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.Fichaje deleteFichaje(long fichajeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.deleteFichaje(fichajeId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fichajeLocalService.dynamicQuery();
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
		return _fichajeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fichajeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fichajeLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _fichajeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fichajeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.vass.fichaje.model.Fichaje fetchFichaje(long fichajeId) {
		return _fichajeLocalService.fetchFichaje(fichajeId);
	}

	/**
	* Returns the fichaje with the matching UUID and company.
	*
	* @param uuid the fichaje's UUID
	* @param companyId the primary key of the company
	* @return the matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	@Override
	public es.vass.fichaje.model.Fichaje fetchFichajeByUuidAndCompanyId(
		String uuid, long companyId) {
		return _fichajeLocalService.fetchFichajeByUuidAndCompanyId(uuid,
			companyId);
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> findAll() {
		return _fichajeLocalService.findAll();
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> findByDate(
		java.util.Date date) {
		return _fichajeLocalService.findByDate(date);
	}

	@Override
	public es.vass.fichaje.model.Fichaje findById(long idFichaje)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.findById(idFichaje);
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> findByUserId(
		long userId) {
		return _fichajeLocalService.findByUserId(userId);
	}

	@Override
	public es.vass.fichaje.model.Fichaje findByUserId_Last(long userId) {
		return _fichajeLocalService.findByUserId_Last(userId);
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> findByUserIdDate(
		long userId, java.util.Date initDay, java.util.Date endDay) {
		return _fichajeLocalService.findByUserIdDate(userId, initDay, endDay);
	}

	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> findByUsernameDate(
		String userName, java.util.Date initDay, java.util.Date endDay) {
		return _fichajeLocalService.findByUsernameDate(userName, initDay, endDay);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _fichajeLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the fichaje with the primary key.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje
	* @throws PortalException if a fichaje with the primary key could not be found
	*/
	@Override
	public es.vass.fichaje.model.Fichaje getFichaje(long fichajeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.getFichaje(fichajeId);
	}

	/**
	* Returns the fichaje with the matching UUID and company.
	*
	* @param uuid the fichaje's UUID
	* @param companyId the primary key of the company
	* @return the matching fichaje
	* @throws PortalException if a matching fichaje could not be found
	*/
	@Override
	public es.vass.fichaje.model.Fichaje getFichajeByUuidAndCompanyId(
		String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.getFichajeByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the fichajes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @return the range of fichajes
	*/
	@Override
	public java.util.List<es.vass.fichaje.model.Fichaje> getFichajes(
		int start, int end) {
		return _fichajeLocalService.getFichajes(start, end);
	}

	/**
	* Returns the number of fichajes.
	*
	* @return the number of fichajes
	*/
	@Override
	public int getFichajesCount() {
		return _fichajeLocalService.getFichajesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _fichajeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _fichajeLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean updateEndFichaje(long fichajeId, java.util.Date horaSalida,
		double horas)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _fichajeLocalService.updateEndFichaje(fichajeId, horaSalida,
			horas);
	}

	/**
	* Updates the fichaje in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was updated
	*/
	@Override
	public es.vass.fichaje.model.Fichaje updateFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return _fichajeLocalService.updateFichaje(fichaje);
	}

	@Override
	public void updateHorasFichaje(long fichajeId, double horas)
		throws com.liferay.portal.kernel.exception.PortalException {
		_fichajeLocalService.updateHorasFichaje(fichajeId, horas);
	}

	@Override
	public FichajeLocalService getWrappedService() {
		return _fichajeLocalService;
	}

	@Override
	public void setWrappedService(FichajeLocalService fichajeLocalService) {
		_fichajeLocalService = fichajeLocalService;
	}

	private FichajeLocalService _fichajeLocalService;
}