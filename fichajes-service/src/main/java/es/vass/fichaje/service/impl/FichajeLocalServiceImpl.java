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

package es.vass.fichaje.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.Date;
import java.util.List;

import es.vass.fichaje.exception.NoSuchFichajeException;
import es.vass.fichaje.model.Fichaje;
import es.vass.fichaje.model.impl.FichajeImpl;
import es.vass.fichaje.service.FichajeLocalServiceUtil;
import es.vass.fichaje.service.base.FichajeLocalServiceBaseImpl;
import es.vass.fichaje.service.persistence.FichajeUtil;

/**
 * The implementation of the fichaje local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link es.vass.fichaje.service.FichajeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FichajeLocalServiceBaseImpl
 * @see es.vass.fichaje.service.FichajeLocalServiceUtil
 */
public class FichajeLocalServiceImpl extends FichajeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link es.vass.fichaje.service.FichajeLocalServiceUtil} to access the fichaje local service.
	 */
	
	public void addFichaje(long companyId, long userId, String userName) {
		Fichaje fichaje = new FichajeImpl();
		fichaje.setFichajeId(counterLocalService.increment());
		fichaje.setCompanyId(companyId);
		fichaje.setUserId(userId);
		fichaje.setUserName(userName);
		fichaje.setHoraEntrada(new Date());
		
		addFichaje(fichaje);
	}
	
	public List<Fichaje> findAll(){
		List<Fichaje> listaFichajes = FichajeUtil.findAll();
		return listaFichajes;
	}
	
	public List<Fichaje> findByUserId(long userId) {
		List<Fichaje> listaFichajes = FichajeUtil.findByUserId(userId);
		return listaFichajes;
	}
	
	public List<Fichaje> findByDate(Date date){
		List<Fichaje> listaFichajes = FichajeUtil.findByFecha(date);
		return listaFichajes;
	}
	
	public List<Fichaje> findByUsernameDate(String userName, Date initDay, Date endDay){
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Fichaje.class, FichajeImpl.class.getClassLoader());
		query.add(PropertyFactoryUtil.forName("userName").like("%"+userName+"%"));
		query.add(RestrictionsFactoryUtil.between("horaEntrada", initDay, endDay));
		List<Fichaje> listFichajes = FichajeLocalServiceUtil.dynamicQuery(query);
		return listFichajes;
	}
	
	public List<Fichaje> findByUserIdDate(long userId, Date initDay, Date endDay){
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Fichaje.class, FichajeImpl.class.getClassLoader());
		query.add(PropertyFactoryUtil.forName("userId").eq(userId));
		query.add(RestrictionsFactoryUtil.between("horaEntrada", initDay, endDay));
		List<Fichaje> listFichajes = FichajeLocalServiceUtil.dynamicQuery(query);
		return listFichajes;
	}
	
	public Fichaje findById(long idFichaje) throws PortalException {
		Fichaje fichaje = FichajeUtil.findByPrimaryKey(idFichaje);
		return fichaje;
	}
	
	public Fichaje findByUserId_Last(long userId) {
		Fichaje fichaje = null;
		try {
			fichaje = FichajeUtil.findByUserId_Last(userId, null);
		} catch (NoSuchFichajeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fichaje;
	}
	
	public boolean updateEndFichaje(long fichajeId, Date horaSalida, double horas) throws PortalException {
		
		boolean done = false;
		
		Fichaje fichaje = getFichaje(fichajeId);
		fichaje.setHoraSalida(horaSalida);
		fichaje.setHoras(horas);
		
		try {
			updateFichaje(fichaje);
			done = true;
		}catch(Exception e) {
			e.getMessage();
		}
		
		return done;
	}
	
	public void updateHorasFichaje(long fichajeId, double horas) throws PortalException {
		Fichaje fichaje = getFichaje(fichajeId);
		fichaje.setHoras(horas);
		
		updateFichaje(fichaje);
	}
	
}