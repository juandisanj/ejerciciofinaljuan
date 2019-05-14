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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Fichaje. This utility wraps
 * {@link es.vass.fichaje.service.impl.FichajeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FichajeLocalService
 * @see es.vass.fichaje.service.base.FichajeLocalServiceBaseImpl
 * @see es.vass.fichaje.service.impl.FichajeLocalServiceImpl
 * @generated
 */
@ProviderType
public class FichajeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.vass.fichaje.service.impl.FichajeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the fichaje to the database. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was added
	*/
	public static es.vass.fichaje.model.Fichaje addFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return getService().addFichaje(fichaje);
	}

	public static void addFichaje(long companyId, long userId,
		java.util.Date horaEntrada) {
		getService().addFichaje(companyId, userId, horaEntrada);
	}

	/**
	* Creates a new fichaje with the primary key. Does not add the fichaje to the database.
	*
	* @param fichajeId the primary key for the new fichaje
	* @return the new fichaje
	*/
	public static es.vass.fichaje.model.Fichaje createFichaje(long fichajeId) {
		return getService().createFichaje(fichajeId);
	}

	/**
	* Deletes the fichaje from the database. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was removed
	*/
	public static es.vass.fichaje.model.Fichaje deleteFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return getService().deleteFichaje(fichaje);
	}

	/**
	* Deletes the fichaje with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje that was removed
	* @throws PortalException if a fichaje with the primary key could not be found
	*/
	public static es.vass.fichaje.model.Fichaje deleteFichaje(long fichajeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFichaje(fichajeId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.vass.fichaje.model.Fichaje fetchFichaje(long fichajeId) {
		return getService().fetchFichaje(fichajeId);
	}

	/**
	* Returns the fichaje with the matching UUID and company.
	*
	* @param uuid the fichaje's UUID
	* @param companyId the primary key of the company
	* @return the matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public static es.vass.fichaje.model.Fichaje fetchFichajeByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().fetchFichajeByUuidAndCompanyId(uuid, companyId);
	}

	public static java.util.List<es.vass.fichaje.model.Fichaje> findByDate(
		java.util.Date date) {
		return getService().findByDate(date);
	}

	public static es.vass.fichaje.model.Fichaje findById(long idFichaje)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().findById(idFichaje);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the fichaje with the primary key.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje
	* @throws PortalException if a fichaje with the primary key could not be found
	*/
	public static es.vass.fichaje.model.Fichaje getFichaje(long fichajeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFichaje(fichajeId);
	}

	/**
	* Returns the fichaje with the matching UUID and company.
	*
	* @param uuid the fichaje's UUID
	* @param companyId the primary key of the company
	* @return the matching fichaje
	* @throws PortalException if a matching fichaje could not be found
	*/
	public static es.vass.fichaje.model.Fichaje getFichajeByUuidAndCompanyId(
		String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFichajeByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<es.vass.fichaje.model.Fichaje> getFichajes(
		int start, int end) {
		return getService().getFichajes(start, end);
	}

	/**
	* Returns the number of fichajes.
	*
	* @return the number of fichajes
	*/
	public static int getFichajesCount() {
		return getService().getFichajesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the fichaje in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fichaje the fichaje
	* @return the fichaje that was updated
	*/
	public static es.vass.fichaje.model.Fichaje updateFichaje(
		es.vass.fichaje.model.Fichaje fichaje) {
		return getService().updateFichaje(fichaje);
	}

	public static FichajeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FichajeLocalService, FichajeLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FichajeLocalService.class);

		ServiceTracker<FichajeLocalService, FichajeLocalService> serviceTracker = new ServiceTracker<FichajeLocalService, FichajeLocalService>(bundle.getBundleContext(),
				FichajeLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}