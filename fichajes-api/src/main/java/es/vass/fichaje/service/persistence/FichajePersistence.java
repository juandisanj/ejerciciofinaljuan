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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import es.vass.fichaje.exception.NoSuchFichajeException;
import es.vass.fichaje.model.Fichaje;

/**
 * The persistence interface for the fichaje service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.vass.fichaje.service.persistence.impl.FichajePersistenceImpl
 * @see FichajeUtil
 * @generated
 */
@ProviderType
public interface FichajePersistence extends BasePersistence<Fichaje> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FichajeUtil} to access the fichaje persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the fichajes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching fichajes
	*/
	public java.util.List<Fichaje> findByUuid(String uuid);

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
	public java.util.List<Fichaje> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Fichaje> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

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
	public java.util.List<Fichaje> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public Fichaje findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public Fichaje fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public Fichaje findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public Fichaje fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

	/**
	* Returns the fichajes before and after the current fichaje in the ordered set where uuid = &#63;.
	*
	* @param fichajeId the primary key of the current fichaje
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fichaje
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public Fichaje[] findByUuid_PrevAndNext(long fichajeId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Removes all the fichajes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of fichajes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching fichajes
	*/
	public int countByUuid(String uuid);

	/**
	* Returns all the fichajes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching fichajes
	*/
	public java.util.List<Fichaje> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

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
	public java.util.List<Fichaje> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public Fichaje findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Returns the first fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public Fichaje fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje
	* @throws NoSuchFichajeException if a matching fichaje could not be found
	*/
	public Fichaje findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Returns the last fichaje in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fichaje, or <code>null</code> if a matching fichaje could not be found
	*/
	public Fichaje fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

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
	public Fichaje[] findByUuid_C_PrevAndNext(long fichajeId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator)
		throws NoSuchFichajeException;

	/**
	* Removes all the fichajes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of fichajes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching fichajes
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Caches the fichaje in the entity cache if it is enabled.
	*
	* @param fichaje the fichaje
	*/
	public void cacheResult(Fichaje fichaje);

	/**
	* Caches the fichajes in the entity cache if it is enabled.
	*
	* @param fichajes the fichajes
	*/
	public void cacheResult(java.util.List<Fichaje> fichajes);

	/**
	* Creates a new fichaje with the primary key. Does not add the fichaje to the database.
	*
	* @param fichajeId the primary key for the new fichaje
	* @return the new fichaje
	*/
	public Fichaje create(long fichajeId);

	/**
	* Removes the fichaje with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje that was removed
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public Fichaje remove(long fichajeId) throws NoSuchFichajeException;

	public Fichaje updateImpl(Fichaje fichaje);

	/**
	* Returns the fichaje with the primary key or throws a {@link NoSuchFichajeException} if it could not be found.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje
	* @throws NoSuchFichajeException if a fichaje with the primary key could not be found
	*/
	public Fichaje findByPrimaryKey(long fichajeId)
		throws NoSuchFichajeException;

	/**
	* Returns the fichaje with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fichajeId the primary key of the fichaje
	* @return the fichaje, or <code>null</code> if a fichaje with the primary key could not be found
	*/
	public Fichaje fetchByPrimaryKey(long fichajeId);

	@Override
	public java.util.Map<java.io.Serializable, Fichaje> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the fichajes.
	*
	* @return the fichajes
	*/
	public java.util.List<Fichaje> findAll();

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
	public java.util.List<Fichaje> findAll(int start, int end);

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
	public java.util.List<Fichaje> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator);

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
	public java.util.List<Fichaje> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Fichaje> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the fichajes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of fichajes.
	*
	* @return the number of fichajes
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}