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
 * Provides the local service utility for Servicio. This utility wraps
 * {@link es.vass.fichaje.service.impl.ServicioLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ServicioLocalService
 * @see es.vass.fichaje.service.base.ServicioLocalServiceBaseImpl
 * @see es.vass.fichaje.service.impl.ServicioLocalServiceImpl
 * @generated
 */
@ProviderType
public class ServicioLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.vass.fichaje.service.impl.ServicioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static void addServicio(java.util.Date horaInicio,
		long tipoServicio, double longitud, double latitud, long fichajeId) {
		getService()
			.addServicio(horaInicio, tipoServicio, longitud, latitud, fichajeId);
	}

	/**
	* Adds the servicio to the database. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was added
	*/
	public static es.vass.fichaje.model.Servicio addServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return getService().addServicio(servicio);
	}

	/**
	* Creates a new servicio with the primary key. Does not add the servicio to the database.
	*
	* @param idServicio the primary key for the new servicio
	* @return the new servicio
	*/
	public static es.vass.fichaje.model.Servicio createServicio(long idServicio) {
		return getService().createServicio(idServicio);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio that was removed
	* @throws PortalException if a servicio with the primary key could not be found
	*/
	public static es.vass.fichaje.model.Servicio deleteServicio(long idServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteServicio(idServicio);
	}

	/**
	* Deletes the servicio from the database. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was removed
	*/
	public static es.vass.fichaje.model.Servicio deleteServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return getService().deleteServicio(servicio);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.vass.fichaje.model.impl.ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static es.vass.fichaje.model.Servicio fetchServicio(long idServicio) {
		return getService().fetchServicio(idServicio);
	}

	public static es.vass.fichaje.model.Servicio findByFichajeId_Last(
		long fichajeId) {
		return getService().findByFichajeId_Last(fichajeId);
	}

	public static java.util.List<es.vass.fichaje.model.Servicio> findByIdFichaje(
		long idFichaje) {
		return getService().findByIdFichaje(idFichaje);
	}

	public static es.vass.fichaje.model.Servicio findByIdServicio(
		long idServicio)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getService().findByIdServicio(idServicio);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
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
	* Returns the servicio with the primary key.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio
	* @throws PortalException if a servicio with the primary key could not be found
	*/
	public static es.vass.fichaje.model.Servicio getServicio(long idServicio)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getServicio(idServicio);
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
	public static java.util.List<es.vass.fichaje.model.Servicio> getServicios(
		int start, int end) {
		return getService().getServicios(start, end);
	}

	/**
	* Returns the number of servicios.
	*
	* @return the number of servicios
	*/
	public static int getServiciosCount() {
		return getService().getServiciosCount();
	}

	public static boolean updateEndService(long idServicio,
		java.util.Date horaFin)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateEndService(idServicio, horaFin);
	}

	/**
	* Updates the servicio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servicio the servicio
	* @return the servicio that was updated
	*/
	public static es.vass.fichaje.model.Servicio updateServicio(
		es.vass.fichaje.model.Servicio servicio) {
		return getService().updateServicio(servicio);
	}

	public static ServicioLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ServicioLocalService, ServicioLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ServicioLocalService.class);

		ServiceTracker<ServicioLocalService, ServicioLocalService> serviceTracker =
			new ServiceTracker<ServicioLocalService, ServicioLocalService>(bundle.getBundleContext(),
				ServicioLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}