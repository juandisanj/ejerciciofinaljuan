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

package es.vass.fichaje.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import es.vass.fichaje.exception.NoSuchTipoServicioException;
import es.vass.fichaje.model.TipoServicio;
import es.vass.fichaje.model.impl.TipoServicioImpl;
import es.vass.fichaje.model.impl.TipoServicioModelImpl;
import es.vass.fichaje.service.persistence.TipoServicioPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the tipo servicio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipoServicioPersistence
 * @see es.vass.fichaje.service.persistence.TipoServicioUtil
 * @generated
 */
@ProviderType
public class TipoServicioPersistenceImpl extends BasePersistenceImpl<TipoServicio>
	implements TipoServicioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TipoServicioUtil} to access the tipo servicio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TipoServicioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioModelImpl.FINDER_CACHE_ENABLED, TipoServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioModelImpl.FINDER_CACHE_ENABLED, TipoServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TipoServicioPersistenceImpl() {
		setModelClass(TipoServicio.class);
	}

	/**
	 * Caches the tipo servicio in the entity cache if it is enabled.
	 *
	 * @param tipoServicio the tipo servicio
	 */
	@Override
	public void cacheResult(TipoServicio tipoServicio) {
		entityCache.putResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioImpl.class, tipoServicio.getPrimaryKey(), tipoServicio);

		tipoServicio.resetOriginalValues();
	}

	/**
	 * Caches the tipo servicios in the entity cache if it is enabled.
	 *
	 * @param tipoServicios the tipo servicios
	 */
	@Override
	public void cacheResult(List<TipoServicio> tipoServicios) {
		for (TipoServicio tipoServicio : tipoServicios) {
			if (entityCache.getResult(
						TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
						TipoServicioImpl.class, tipoServicio.getPrimaryKey()) == null) {
				cacheResult(tipoServicio);
			}
			else {
				tipoServicio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all tipo servicios.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TipoServicioImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the tipo servicio.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TipoServicio tipoServicio) {
		entityCache.removeResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioImpl.class, tipoServicio.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TipoServicio> tipoServicios) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TipoServicio tipoServicio : tipoServicios) {
			entityCache.removeResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
				TipoServicioImpl.class, tipoServicio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new tipo servicio with the primary key. Does not add the tipo servicio to the database.
	 *
	 * @param idTipoServicio the primary key for the new tipo servicio
	 * @return the new tipo servicio
	 */
	@Override
	public TipoServicio create(long idTipoServicio) {
		TipoServicio tipoServicio = new TipoServicioImpl();

		tipoServicio.setNew(true);
		tipoServicio.setPrimaryKey(idTipoServicio);

		return tipoServicio;
	}

	/**
	 * Removes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idTipoServicio the primary key of the tipo servicio
	 * @return the tipo servicio that was removed
	 * @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio remove(long idTipoServicio)
		throws NoSuchTipoServicioException {
		return remove((Serializable)idTipoServicio);
	}

	/**
	 * Removes the tipo servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tipo servicio
	 * @return the tipo servicio that was removed
	 * @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio remove(Serializable primaryKey)
		throws NoSuchTipoServicioException {
		Session session = null;

		try {
			session = openSession();

			TipoServicio tipoServicio = (TipoServicio)session.get(TipoServicioImpl.class,
					primaryKey);

			if (tipoServicio == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTipoServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(tipoServicio);
		}
		catch (NoSuchTipoServicioException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TipoServicio removeImpl(TipoServicio tipoServicio) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tipoServicio)) {
				tipoServicio = (TipoServicio)session.get(TipoServicioImpl.class,
						tipoServicio.getPrimaryKeyObj());
			}

			if (tipoServicio != null) {
				session.delete(tipoServicio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (tipoServicio != null) {
			clearCache(tipoServicio);
		}

		return tipoServicio;
	}

	@Override
	public TipoServicio updateImpl(TipoServicio tipoServicio) {
		boolean isNew = tipoServicio.isNew();

		Session session = null;

		try {
			session = openSession();

			if (tipoServicio.isNew()) {
				session.save(tipoServicio);

				tipoServicio.setNew(false);
			}
			else {
				tipoServicio = (TipoServicio)session.merge(tipoServicio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
			TipoServicioImpl.class, tipoServicio.getPrimaryKey(), tipoServicio,
			false);

		tipoServicio.resetOriginalValues();

		return tipoServicio;
	}

	/**
	 * Returns the tipo servicio with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo servicio
	 * @return the tipo servicio
	 * @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTipoServicioException {
		TipoServicio tipoServicio = fetchByPrimaryKey(primaryKey);

		if (tipoServicio == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTipoServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return tipoServicio;
	}

	/**
	 * Returns the tipo servicio with the primary key or throws a {@link NoSuchTipoServicioException} if it could not be found.
	 *
	 * @param idTipoServicio the primary key of the tipo servicio
	 * @return the tipo servicio
	 * @throws NoSuchTipoServicioException if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio findByPrimaryKey(long idTipoServicio)
		throws NoSuchTipoServicioException {
		return findByPrimaryKey((Serializable)idTipoServicio);
	}

	/**
	 * Returns the tipo servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tipo servicio
	 * @return the tipo servicio, or <code>null</code> if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
				TipoServicioImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TipoServicio tipoServicio = (TipoServicio)serializable;

		if (tipoServicio == null) {
			Session session = null;

			try {
				session = openSession();

				tipoServicio = (TipoServicio)session.get(TipoServicioImpl.class,
						primaryKey);

				if (tipoServicio != null) {
					cacheResult(tipoServicio);
				}
				else {
					entityCache.putResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
						TipoServicioImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
					TipoServicioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return tipoServicio;
	}

	/**
	 * Returns the tipo servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idTipoServicio the primary key of the tipo servicio
	 * @return the tipo servicio, or <code>null</code> if a tipo servicio with the primary key could not be found
	 */
	@Override
	public TipoServicio fetchByPrimaryKey(long idTipoServicio) {
		return fetchByPrimaryKey((Serializable)idTipoServicio);
	}

	@Override
	public Map<Serializable, TipoServicio> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TipoServicio> map = new HashMap<Serializable, TipoServicio>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TipoServicio tipoServicio = fetchByPrimaryKey(primaryKey);

			if (tipoServicio != null) {
				map.put(primaryKey, tipoServicio);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
					TipoServicioImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TipoServicio)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TIPOSERVICIO_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TipoServicio tipoServicio : (List<TipoServicio>)q.list()) {
				map.put(tipoServicio.getPrimaryKeyObj(), tipoServicio);

				cacheResult(tipoServicio);

				uncachedPrimaryKeys.remove(tipoServicio.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TipoServicioModelImpl.ENTITY_CACHE_ENABLED,
					TipoServicioImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the tipo servicios.
	 *
	 * @return the tipo servicios
	 */
	@Override
	public List<TipoServicio> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<TipoServicio> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<TipoServicio> findAll(int start, int end,
		OrderByComparator<TipoServicio> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<TipoServicio> findAll(int start, int end,
		OrderByComparator<TipoServicio> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<TipoServicio> list = null;

		if (retrieveFromCache) {
			list = (List<TipoServicio>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TIPOSERVICIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TIPOSERVICIO;

				if (pagination) {
					sql = sql.concat(TipoServicioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TipoServicio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TipoServicio>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tipo servicios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TipoServicio tipoServicio : findAll()) {
			remove(tipoServicio);
		}
	}

	/**
	 * Returns the number of tipo servicios.
	 *
	 * @return the number of tipo servicios
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TIPOSERVICIO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TipoServicioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tipo servicio persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TipoServicioImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TIPOSERVICIO = "SELECT tipoServicio FROM TipoServicio tipoServicio";
	private static final String _SQL_SELECT_TIPOSERVICIO_WHERE_PKS_IN = "SELECT tipoServicio FROM TipoServicio tipoServicio WHERE idTipoServicio IN (";
	private static final String _SQL_COUNT_TIPOSERVICIO = "SELECT COUNT(tipoServicio) FROM TipoServicio tipoServicio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tipoServicio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TipoServicio exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(TipoServicioPersistenceImpl.class);
}