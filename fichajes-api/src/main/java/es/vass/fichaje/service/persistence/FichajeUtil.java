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

import es.vass.fichaje.model.Fichaje;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the fichaje service. This utility wraps {@link es.vass.fichaje.service.persistence.impl.FichajePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FichajePersistence
 * @see es.vass.fichaje.service.persistence.impl.FichajePersistenceImpl
 * @generated
 */
@ProviderType
public class FichajeUtil {
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
	public static void clearCache(Fichaje fichaje) {
		getPersistence().clearCache(fichaje);
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
	public static List<Fichaje> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Fichaje> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Fichaje> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Fichaje update(Fichaje fichaje) {
		return getPersistence().update(fichaje);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Fichaje update(Fichaje fichaje, ServiceContext serviceContext) {
		return getPersistence().update(fichaje, serviceContext);
	}

	/**
	* Returns all the fichajes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching fichajes
	*/
	public static List<Fichaje> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the fichajes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @return the range of matching fichajes
	*/
	public static List<Fichaje> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the fichajes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fichajes
	*/
	public static List<Fichaje> findByUuid(String uuid, int start, int end,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the fichajes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching fichajes
	*/
	public static List<Fichaje> findByUuid(String uuid, int start, int end,
		OrderByComparator<Fichaje> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public static Fichaje findByUuid_First(String uuid,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public static Fichaje fetchByUuid_First(String uuid,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public static Fichaje findByUuid_Last(String uuid,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public static Fichaje fetchByUuid_Last(String uuid,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the fichajes before and after the current fichaje in the ordered set where uuid = &#63;.
	*
	* @param fichajeId the primary key of the current fichaje
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fichaje
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public static Fichaje[] findByUuid_PrevAndNext(long fichajeId, String uuid,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence()
				   .findByUuid_PrevAndNext(fichajeId, uuid, orderByComparator);
	}

	/**
	* Removes all the fichajes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of fichajes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching fichajes
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the fichajes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching fichajes
	*/
	public static List<Fichaje> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the fichajes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @return the range of matching fichajes
	*/
	public static List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the fichajes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fichajes
	*/
	public static List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the fichajes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching fichajes
	*/
	public static List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Fichaje> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public static Fichaje findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public static Fichaje fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public static Fichaje findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public static Fichaje fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the fichajes before and after the current fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fichajeId the primary key of the current fichaje
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fichaje
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public static Fichaje[] findByUuid_C_PrevAndNext(long fichajeId,
		String uuid, long companyId,
		OrderByComparator<Fichaje> orderByComparator)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(fichajeId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the fichajes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of fichajes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching fichajes
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the fichaje in the entity cache if it is enabled.
	*
	* @param fichaje the fichaje
	*/
	public static void cacheResult(Fichaje fichaje) {
		getPersistence().cacheResult(fichaje);
	}

	/**
	* Caches the fichajes in the entity cache if it is enabled.
	*
	* @param fichajes the fichajes
	*/
	public static void cacheResult(List<Fichaje> fichajes) {
		getPersistence().cacheResult(fichajes);
	}

	/**
	* Creates a new fichaje with the primary key. Does not add the fichaje to the database.
	*
	* @param fichajeId the primary key for the new fichaje
	* @return the new fichaje
	*/
	public static Fichaje create(long fichajeId) {
		return getPersistence().create(fichajeId);
	}

	/**
	* Removes the fichaje with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje that was removed
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public static Fichaje remove(long fichajeId)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence().remove(fichajeId);
	}

	public static Fichaje updateImpl(Fichaje fichaje) {
		return getPersistence().updateImpl(fichaje);
	}

	/**
	* Returns the fichaje with the primary key or throws a {@link NoSuchFichajeException} if it could not be found.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public static Fichaje findByPrimaryKey(long fichajeId)
		throws es.vass.fichaje.exception.NoSuchFichajeException {
		return getPersistence().findByPrimaryKey(fichajeId);
	}

	/**
	* Returns the fichaje with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje, or <code>null</code> if a fichaje with the primary key could not be found
	*/
	public static Fichaje fetchByPrimaryKey(long fichajeId) {
		return getPersistence().fetchByPrimaryKey(fichajeId);
	}

	public static java.util.Map<java.io.Serializable, Fichaje> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the fichajes.
	*
	* @return the fichajes
	*/
	public static List<Fichaje> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the fichajes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @return the range of fichajes
	*/
	public static List<Fichaje> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the fichajes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fichajes
	*/
	public static List<Fichaje> findAll(int start, int end,
		OrderByComparator<Fichaje> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the fichajes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FichajeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fichajes
	* @param end the upper bound of the range of fichajes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of fichajes
	*/
	public static List<Fichaje> findAll(int start, int end,
		OrderByComparator<Fichaje> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the fichajes from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fichajes.
	*
	* @return the number of fichajes
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FichajePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FichajePersistence, FichajePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FichajePersistence.class);

		ServiceTracker<FichajePersistence, FichajePersistence> serviceTracker = new ServiceTracker<FichajePersistence, FichajePersistence>(bundle.getBundleContext(),
				FichajePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}