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

package es.vass.fichaje.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.service.ServicioLocalService;
import es.vass.fichaje.service.persistence.FichajePersistence;
import es.vass.fichaje.service.persistence.ServicioPersistence;
import es.vass.fichaje.service.persistence.TipoServicioPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the servicio local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link es.vass.fichaje.service.impl.ServicioLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see es.vass.fichaje.service.impl.ServicioLocalServiceImpl
 * @see es.vass.fichaje.service.ServicioLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class ServicioLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements ServicioLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link es.vass.fichaje.service.ServicioLocalServiceUtil} to access the servicio local service.
	 */

	/**
	 * Adds the servicio to the database. Also notifies the appropriate model listeners.
	 *
	 * @param servicio the servicio
	 * @return the servicio that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Servicio addServicio(Servicio servicio) {
		servicio.setNew(true);

		return servicioPersistence.update(servicio);
	}

	/**
	 * Creates a new servicio with the primary key. Does not add the servicio to the database.
	 *
	 * @param idServicio the primary key for the new servicio
	 * @return the new servicio
	 */
	@Override
	@Transactional(enabled = false)
	public Servicio createServicio(long idServicio) {
		return servicioPersistence.create(idServicio);
	}

	/**
	 * Deletes the servicio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio that was removed
	 * @throws PortalException if a servicio with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Servicio deleteServicio(long idServicio) throws PortalException {
		return servicioPersistence.remove(idServicio);
	}

	/**
	 * Deletes the servicio from the database. Also notifies the appropriate model listeners.
	 *
	 * @param servicio the servicio
	 * @return the servicio that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Servicio deleteServicio(Servicio servicio) {
		return servicioPersistence.remove(servicio);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Servicio.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return servicioPersistence.findWithDynamicQuery(dynamicQuery);
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
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return servicioPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return servicioPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return servicioPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return servicioPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public Servicio fetchServicio(long idServicio) {
		return servicioPersistence.fetchByPrimaryKey(idServicio);
	}

	/**
	 * Returns the servicio with the primary key.
	 *
	 * @param idServicio the primary key of the servicio
	 * @return the servicio
	 * @throws PortalException if a servicio with the primary key could not be found
	 */
	@Override
	public Servicio getServicio(long idServicio) throws PortalException {
		return servicioPersistence.findByPrimaryKey(idServicio);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(servicioLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Servicio.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idServicio");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(servicioLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Servicio.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("idServicio");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(servicioLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Servicio.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idServicio");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return servicioLocalService.deleteServicio((Servicio)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return servicioPersistence.findByPrimaryKey(primaryKeyObj);
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
	@Override
	public List<Servicio> getServicios(int start, int end) {
		return servicioPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of servicios.
	 *
	 * @return the number of servicios
	 */
	@Override
	public int getServiciosCount() {
		return servicioPersistence.countAll();
	}

	/**
	 * Updates the servicio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param servicio the servicio
	 * @return the servicio that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Servicio updateServicio(Servicio servicio) {
		return servicioPersistence.update(servicio);
	}

	/**
	 * Returns the fichaje local service.
	 *
	 * @return the fichaje local service
	 */
	public es.vass.fichaje.service.FichajeLocalService getFichajeLocalService() {
		return fichajeLocalService;
	}

	/**
	 * Sets the fichaje local service.
	 *
	 * @param fichajeLocalService the fichaje local service
	 */
	public void setFichajeLocalService(
		es.vass.fichaje.service.FichajeLocalService fichajeLocalService) {
		this.fichajeLocalService = fichajeLocalService;
	}

	/**
	 * Returns the fichaje persistence.
	 *
	 * @return the fichaje persistence
	 */
	public FichajePersistence getFichajePersistence() {
		return fichajePersistence;
	}

	/**
	 * Sets the fichaje persistence.
	 *
	 * @param fichajePersistence the fichaje persistence
	 */
	public void setFichajePersistence(FichajePersistence fichajePersistence) {
		this.fichajePersistence = fichajePersistence;
	}

	/**
	 * Returns the servicio local service.
	 *
	 * @return the servicio local service
	 */
	public ServicioLocalService getServicioLocalService() {
		return servicioLocalService;
	}

	/**
	 * Sets the servicio local service.
	 *
	 * @param servicioLocalService the servicio local service
	 */
	public void setServicioLocalService(
		ServicioLocalService servicioLocalService) {
		this.servicioLocalService = servicioLocalService;
	}

	/**
	 * Returns the servicio persistence.
	 *
	 * @return the servicio persistence
	 */
	public ServicioPersistence getServicioPersistence() {
		return servicioPersistence;
	}

	/**
	 * Sets the servicio persistence.
	 *
	 * @param servicioPersistence the servicio persistence
	 */
	public void setServicioPersistence(ServicioPersistence servicioPersistence) {
		this.servicioPersistence = servicioPersistence;
	}

	/**
	 * Returns the tipo servicio local service.
	 *
	 * @return the tipo servicio local service
	 */
	public es.vass.fichaje.service.TipoServicioLocalService getTipoServicioLocalService() {
		return tipoServicioLocalService;
	}

	/**
	 * Sets the tipo servicio local service.
	 *
	 * @param tipoServicioLocalService the tipo servicio local service
	 */
	public void setTipoServicioLocalService(
		es.vass.fichaje.service.TipoServicioLocalService tipoServicioLocalService) {
		this.tipoServicioLocalService = tipoServicioLocalService;
	}

	/**
	 * Returns the tipo servicio persistence.
	 *
	 * @return the tipo servicio persistence
	 */
	public TipoServicioPersistence getTipoServicioPersistence() {
		return tipoServicioPersistence;
	}

	/**
	 * Sets the tipo servicio persistence.
	 *
	 * @param tipoServicioPersistence the tipo servicio persistence
	 */
	public void setTipoServicioPersistence(
		TipoServicioPersistence tipoServicioPersistence) {
		this.tipoServicioPersistence = tipoServicioPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("es.vass.fichaje.model.Servicio",
			servicioLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"es.vass.fichaje.model.Servicio");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ServicioLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Servicio.class;
	}

	protected String getModelClassName() {
		return Servicio.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = servicioPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = es.vass.fichaje.service.FichajeLocalService.class)
	protected es.vass.fichaje.service.FichajeLocalService fichajeLocalService;
	@BeanReference(type = FichajePersistence.class)
	protected FichajePersistence fichajePersistence;
	@BeanReference(type = ServicioLocalService.class)
	protected ServicioLocalService servicioLocalService;
	@BeanReference(type = ServicioPersistence.class)
	protected ServicioPersistence servicioPersistence;
	@BeanReference(type = es.vass.fichaje.service.TipoServicioLocalService.class)
	protected es.vass.fichaje.service.TipoServicioLocalService tipoServicioLocalService;
	@BeanReference(type = TipoServicioPersistence.class)
	protected TipoServicioPersistence tipoServicioPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}