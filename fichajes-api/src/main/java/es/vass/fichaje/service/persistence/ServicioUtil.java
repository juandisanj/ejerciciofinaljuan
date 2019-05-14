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

package es.vass.fichaje.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import es.vass.fichaje.model.Servicio;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the servicio service. This utility wraps {@link es.vass.fichaje.service.persistence.impl.ServicioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicioPersistence
 * @see es.vass.fichaje.service.persistence.impl.ServicioPersistenceImpl
 * @generated
 */
@ProviderType
public class ServicioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Servicio servicio) {
		getPersistence().clearCache(servicio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Servicio> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Servicio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Servicio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Servicio> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Servicio update(Servicio servicio) {
		return getPersistence().update(servicio);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Servicio update(Servicio servicio,
		ServiceContext serviceContext) {
		return getPersistence().update(servicio, serviceContext);
	}

	/**
	* Returns all the servicios where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @return the matching servicios
	*/
	public static List<Servicio> findByIdFichaje(long fichajeId) {
		return getPersistence().findByIdFichaje(fichajeId);
	}

	/**
	* Returns a range of all the servicios where fichajeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fichajeId the fichaje ID
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @return the range of matching servicios
	*/
	public static List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end) {
		return getPersistence().findByIdFichaje(fichajeId, start, end);
	}

	/**
	* Returns an ordered range of all the servicios where fichajeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fichajeId the fichaje ID
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching servicios
	*/
	public static List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end, OrderByComparator<Servicio> orderByComparator) {
		return getPersistence()
				   .findByIdFichaje(fichajeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the servicios where fichajeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fichajeId the fichaje ID
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching servicios
	*/
	public static List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end, OrderByComparator<Servicio> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByIdFichaje(fichajeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servicio
	* @throws NoSuchServicioException if a matching servicio could not be found
	*/
	public static Servicio findByIdFichaje_First(long fichajeId,
		OrderByComparator<Servicio> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getPersistence()
				   .findByIdFichaje_First(fichajeId, orderByComparator);
	}

	/**
	* Returns the first servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servicio, or <code>null</code> if a matching servicio could not be found
	*/
	public static Servicio fetchByIdFichaje_First(long fichajeId,
		OrderByComparator<Servicio> orderByComparator) {
		return getPersistence()
				   .fetchByIdFichaje_First(fichajeId, orderByComparator);
	}

	/**
	* Returns the last servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servicio
	* @throws NoSuchServicioException if a matching servicio could not be found
	*/
	public static Servicio findByIdFichaje_Last(long fichajeId,
		OrderByComparator<Servicio> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getPersistence()
				   .findByIdFichaje_Last(fichajeId, orderByComparator);
	}

	/**
	* Returns the last servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servicio, or <code>null</code> if a matching servicio could not be found
	*/
	public static Servicio fetchByIdFichaje_Last(long fichajeId,
		OrderByComparator<Servicio> orderByComparator) {
		return getPersistence()
				   .fetchByIdFichaje_Last(fichajeId, orderByComparator);
	}

	/**
	* Returns the servicios before and after the current servicio in the ordered set where fichajeId = &#63;.
	*
	* @param idServicio the primary key of the current servicio
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servicio
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public static Servicio[] findByIdFichaje_PrevAndNext(long idServicio,
		long fichajeId, OrderByComparator<Servicio> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getPersistence()
				   .findByIdFichaje_PrevAndNext(idServicio, fichajeId,
			orderByComparator);
	}

	/**
	* Removes all the servicios where fichajeId = &#63; from the database.
	*
	* @param fichajeId the fichaje ID
	*/
	public static void removeByIdFichaje(long fichajeId) {
		getPersistence().removeByIdFichaje(fichajeId);
	}

	/**
	* Returns the number of servicios where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @return the number of matching servicios
	*/
	public static int countByIdFichaje(long fichajeId) {
		return getPersistence().countByIdFichaje(fichajeId);
	}

	/**
	* Caches the servicio in the entity cache if it is enabled.
	*
	* @param servicio the servicio
	*/
	public static void cacheResult(Servicio servicio) {
		getPersistence().cacheResult(servicio);
	}

	/**
	* Caches the servicios in the entity cache if it is enabled.
	*
	* @param servicios the servicios
	*/
	public static void cacheResult(List<Servicio> servicios) {
		getPersistence().cacheResult(servicios);
	}

	/**
	* Creates a new servicio with the primary key. Does not add the servicio to the database.
	*
	* @param idServicio the primary key for the new servicio
	* @return the new servicio
	*/
	public static Servicio create(long idServicio) {
		return getPersistence().create(idServicio);
	}

	/**
	* Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio that was removed
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public static Servicio remove(long idServicio)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getPersistence().remove(idServicio);
	}

	public static Servicio updateImpl(Servicio servicio) {
		return getPersistence().updateImpl(servicio);
	}

	/**
	* Returns the servicio with the primary key or throws a {@link NoSuchServicioException} if it could not be found.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public static Servicio findByPrimaryKey(long idServicio)
		throws es.vass.fichaje.exception.NoSuchServicioException {
		return getPersistence().findByPrimaryKey(idServicio);
	}

	/**
	* Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	*/
	public static Servicio fetchByPrimaryKey(long idServicio) {
		return getPersistence().fetchByPrimaryKey(idServicio);
	}

	public static java.util.Map<java.io.Serializable, Servicio> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the servicios.
	*
	* @return the servicios
	*/
	public static List<Servicio> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @return the range of servicios
	*/
	public static List<Servicio> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of servicios
	*/
	public static List<Servicio> findAll(int start, int end,
		OrderByComparator<Servicio> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of servicios
	* @param end the upper bound of the range of servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of servicios
	*/
	public static List<Servicio> findAll(int start, int end,
		OrderByComparator<Servicio> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the servicios from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of servicios.
	*
	* @return the number of servicios
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ServicioPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ServicioPersistence, ServicioPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ServicioPersistence.class);

		ServiceTracker<ServicioPersistence, ServicioPersistence> serviceTracker = new ServiceTracker<ServicioPersistence, ServicioPersistence>(bundle.getBundleContext(),
				ServicioPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}