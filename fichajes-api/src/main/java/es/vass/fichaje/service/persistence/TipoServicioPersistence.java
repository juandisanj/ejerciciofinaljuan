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

import es.vass.fichaje.exception.NoSuchTipoServicioException;
import es.vass.fichaje.model.TipoServicio;

/**
 * The persistence interface for the tipo servicio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.vass.fichaje.service.persistence.impl.TipoServicioPersistenceImpl
 * @see TipoServicioUtil
 * @generated
 */
@ProviderType
public interface TipoServicioPersistence extends BasePersistence<TipoServicio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TipoServicioUtil} to access the tipo servicio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the tipo servicio in the entity cache if it is enabled.
	*
	* @param tipoServicio the tipo servicio
	*/
	public void cacheResult(TipoServicio tipoServicio);

	/**
	* Caches the tipo servicios in the entity cache if it is enabled.
	*
	* @param tipoServicios the tipo servicios
	*/
	public void cacheResult(java.util.List<TipoServicio> tipoServicios);

	/**
	* Creates a new tipo servicio with the primary key. Does not add the tipo servicio to the database.
	*
	* @param idTipoServicio the primary key for the new tipo servicio
	* @return the new tipo servicio
	*/
	public TipoServicio create(long idTipoServicio);

	/**
	* Removes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio that was removed
	* @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	*/
	public TipoServicio remove(long idTipoServicio)
		throws NoSuchTipoServicioException;

	public TipoServicio updateImpl(TipoServicio tipoServicio);

	/**
	* Returns the tipo servicio with the primary key or throws a {@link NoSuchTipoServicioException} if it could not be found.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio
	* @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	*/
	public TipoServicio findByPrimaryKey(long idTipoServicio)
		throws NoSuchTipoServicioException;

	/**
	* Returns the tipo servicio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idTipoServicio the primary key of the tipo servicio
	* @return the tipo servicio, or <code>null</code> if a tipo servicio with the primary key could not be found
	*/
	public TipoServicio fetchByPrimaryKey(long idTipoServicio);

	@Override
	public java.util.Map<java.io.Serializable, TipoServicio> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipo servicios.
	*
	* @return the tipo servicios
	*/
	public java.util.List<TipoServicio> findAll();

	/**
	* Returns a range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @return the range of tipo servicios
	*/
	public java.util.List<TipoServicio> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipo servicios
	*/
	public java.util.List<TipoServicio> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipoServicio> orderByComparator);

	/**
	* Returns an ordered range of all the tipo servicios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoServicioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipo servicios
	* @param end the upper bound of the range of tipo servicios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipo servicios
	*/
	public java.util.List<TipoServicio> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TipoServicio> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipo servicios from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipo servicios.
	*
	* @return the number of tipo servicios
	*/
	public int countAll();
}