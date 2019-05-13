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

import es.vass.fichaje.exception.NoSuchServicioException;
import es.vass.fichaje.model.Servicio;

/**
 * The persistence interface for the servicio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.vass.fichaje.service.persistence.impl.ServicioPersistenceImpl
 * @see ServicioUtil
 * @generated
 */
@ProviderType
public interface ServicioPersistence extends BasePersistence<Servicio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServicioUtil} to access the servicio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the servicios where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @return the matching servicios
	*/
	public java.util.List<Servicio> findByIdFichaje(long fichajeId);

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
	public java.util.List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end);

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
	public java.util.List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator);

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
	public java.util.List<Servicio> findByIdFichaje(long fichajeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servicio
	* @throws NoSuchServicioException if a matching servicio could not be found
	*/
	public Servicio findByIdFichaje_First(long fichajeId,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator)
		throws NoSuchServicioException;

	/**
	* Returns the first servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching servicio, or <code>null</code> if a matching servicio could not be found
	*/
	public Servicio fetchByIdFichaje_First(long fichajeId,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator);

	/**
	* Returns the last servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servicio
	* @throws NoSuchServicioException if a matching servicio could not be found
	*/
	public Servicio findByIdFichaje_Last(long fichajeId,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator)
		throws NoSuchServicioException;

	/**
	* Returns the last servicio in the ordered set where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching servicio, or <code>null</code> if a matching servicio could not be found
	*/
	public Servicio fetchByIdFichaje_Last(long fichajeId,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator);

	/**
	* Returns the servicios before and after the current servicio in the ordered set where fichajeId = &#63;.
	*
	* @param idServicio the primary key of the current servicio
	* @param fichajeId the fichaje ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next servicio
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public Servicio[] findByIdFichaje_PrevAndNext(long idServicio,
		long fichajeId,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator)
		throws NoSuchServicioException;

	/**
	* Removes all the servicios where fichajeId = &#63; from the database.
	*
	* @param fichajeId the fichaje ID
	*/
	public void removeByIdFichaje(long fichajeId);

	/**
	* Returns the number of servicios where fichajeId = &#63;.
	*
	* @param fichajeId the fichaje ID
	* @return the number of matching servicios
	*/
	public int countByIdFichaje(long fichajeId);

	/**
	* Caches the servicio in the entity cache if it is enabled.
	*
	* @param servicio the servicio
	*/
	public void cacheResult(Servicio servicio);

	/**
	* Caches the servicios in the entity cache if it is enabled.
	*
	* @param servicios the servicios
	*/
	public void cacheResult(java.util.List<Servicio> servicios);

	/**
	* Creates a new servicio with the primary key. Does not add the servicio to the database.
	*
	* @param idServicio the primary key for the new servicio
	* @return the new servicio
	*/
	public Servicio create(long idServicio);

	/**
	* Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio that was removed
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public Servicio remove(long idServicio) throws NoSuchServicioException;

	public Servicio updateImpl(Servicio servicio);

	/**
	* Returns the servicio with the primary key or throws a {@link NoSuchServicioException} if it could not be found.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio
	* @throws NoSuchServicioException if a servicio with the primary key could not be found
	*/
	public Servicio findByPrimaryKey(long idServicio)
		throws NoSuchServicioException;

	/**
	* Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idServicio the primary key of the servicio
	* @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	*/
	public Servicio fetchByPrimaryKey(long idServicio);

	@Override
	public java.util.Map<java.io.Serializable, Servicio> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the servicios.
	*
	* @return the servicios
	*/
	public java.util.List<Servicio> findAll();

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
	public java.util.List<Servicio> findAll(int start, int end);

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
	public java.util.List<Servicio> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator);

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
	public java.util.List<Servicio> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Servicio> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the servicios from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of servicios.
	*
	* @return the number of servicios
	*/
	public int countAll();
}