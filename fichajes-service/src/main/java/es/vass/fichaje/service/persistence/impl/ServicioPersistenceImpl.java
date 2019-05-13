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

import es.vass.fichaje.exception.NoSuchServicioException;
import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.impl.ServicioImpl;
import es.vass.fichaje.model.impl.ServicioModelImpl;
import es.vass.fichaje.service.persistence.ServicioPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the servicio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicioPersistence
 * @see es.vass.fichaje.service.persistence.ServicioUtil
 * @generated
 */
@ProviderType
public class ServicioPersistenceImpl extends BasePersistenceImpl<Servicio>
	implements ServicioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServicioUtil} to access the servicio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServicioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, ServicioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ServicioPersistenceImpl() {
		setModelClass(Servicio.class);
	}

	/**
	 * Caches the servicio in the entity cache if it is enabled.
	 *
	 * @param servicio the servicio
	 */
	@Override
	public void cacheResult(Servicio servicio) {
		entityCache.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey(), servicio);

		servicio.resetOriginalValues();
	}

	/**
	 * Caches the servicios in the entity cache if it is enabled.
	 *
	 * @param servicios the servicios
	 */
	@Override
	public void cacheResult(List<Servicio> servicios) {
		for (Servicio servicio : servicios) {
			if (entityCache.getResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
						ServicioImpl.class, servicio.getPrimaryKey()) == null) {
				cacheResult(servicio);
			}
			else {
				servicio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all servicios.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ServicioImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the servicio.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Servicio servicio) {
		entityCache.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Servicio> servicios) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Servicio servicio : servicios) {
			entityCache.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
				ServicioImpl.class, servicio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new servicio with the primary key. Does not add the servicio to the database.
	 *
	 * @param idServicio the primary key for the new servicio
	 * @return the new servicio
	 */
	@Override
	public Servicio create(long idServicio) {
		Servicio servicio = new ServicioImpl();

		servicio.setNew(true);
		servicio.setPrimaryKey(idServicio);

		return servicio;
	}

	/**
	 * Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio that was removed
	 * @throws NoSuchServicioException if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio remove(long idServicio) throws NoSuchServicioException {
		return remove((Serializable)idServicio);
	}

	/**
	 * Removes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio that was removed
	 * @throws NoSuchServicioException if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio remove(Serializable primaryKey)
		throws NoSuchServicioException {
		Session session = null;

		try {
			session = openSession();

			Servicio servicio = (Servicio)session.get(ServicioImpl.class,
					primaryKey);

			if (servicio == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(servicio);
		}
		catch (NoSuchServicioException nsee) {
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
	protected Servicio removeImpl(Servicio servicio) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(servicio)) {
				servicio = (Servicio)session.get(ServicioImpl.class,
						servicio.getPrimaryKeyObj());
			}

			if (servicio != null) {
				session.delete(servicio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (servicio != null) {
			clearCache(servicio);
		}

		return servicio;
	}

	@Override
	public Servicio updateImpl(Servicio servicio) {
		boolean isNew = servicio.isNew();

		Session session = null;

		try {
			session = openSession();

			if (servicio.isNew()) {
				session.save(servicio);

				servicio.setNew(false);
			}
			else {
				servicio = (Servicio)session.merge(servicio);
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

		entityCache.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
			ServicioImpl.class, servicio.getPrimaryKey(), servicio, false);

		servicio.resetOriginalValues();

		return servicio;
	}

	/**
	 * Returns the servicio with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio
	 * @throws NoSuchServicioException if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServicioException {
		Servicio servicio = fetchByPrimaryKey(primaryKey);

		if (servicio == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServicioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return servicio;
	}

	/**
	 * Returns the servicio with the primary key or throws a {@link NoSuchServicioException} if it could not be found.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio
	 * @throws NoSuchServicioException if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio findByPrimaryKey(long idServicio)
		throws NoSuchServicioException {
		return findByPrimaryKey((Serializable)idServicio);
	}

	/**
	 * Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the servicio
	 * @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
				ServicioImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Servicio servicio = (Servicio)serializable;

		if (servicio == null) {
			Session session = null;

			try {
				session = openSession();

				servicio = (Servicio)session.get(ServicioImpl.class, primaryKey);

				if (servicio != null) {
					cacheResult(servicio);
				}
				else {
					entityCache.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
						ServicioImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
					ServicioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return servicio;
	}

	/**
	 * Returns the servicio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio, or <code>null</code> if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio fetchByPrimaryKey(long idServicio) {
		return fetchByPrimaryKey((Serializable)idServicio);
	}

	@Override
	public Map<Serializable, Servicio> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Servicio> map = new HashMap<Serializable, Servicio>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Servicio servicio = fetchByPrimaryKey(primaryKey);

			if (servicio != null) {
				map.put(primaryKey, servicio);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
					ServicioImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Servicio)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SERVICIO_WHERE_PKS_IN);

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

			for (Servicio servicio : (List<Servicio>)q.list()) {
				map.put(servicio.getPrimaryKeyObj(), servicio);

				cacheResult(servicio);

				uncachedPrimaryKeys.remove(servicio.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ServicioModelImpl.ENTITY_CACHE_ENABLED,
					ServicioImpl.class, primaryKey, nullModel);
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
	 * Returns all the servicios.
	 *
	 * @return the servicios
	 */
	@Override
	public List<Servicio> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Servicio> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Servicio> findAll(int start, int end,
		OrderByComparator<Servicio> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Servicio> findAll(int start, int end,
		OrderByComparator<Servicio> orderByComparator, boolean retrieveFromCache) {
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

		List<Servicio> list = null;

		if (retrieveFromCache) {
			list = (List<Servicio>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SERVICIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICIO;

				if (pagination) {
					sql = sql.concat(ServicioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Servicio>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the servicios from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Servicio servicio : findAll()) {
			remove(servicio);
		}
	}

	/**
	 * Returns the number of servicios.
	 *
	 * @return the number of servicios
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICIO);

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
		return ServicioModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the servicio persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ServicioImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SERVICIO = "SELECT servicio FROM Servicio servicio";
	private static final String _SQL_SELECT_SERVICIO_WHERE_PKS_IN = "SELECT servicio FROM Servicio servicio WHERE idServicio IN (";
	private static final String _SQL_COUNT_SERVICIO = "SELECT COUNT(servicio) FROM Servicio servicio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "servicio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Servicio exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ServicioPersistenceImpl.class);
}