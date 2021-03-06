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

package es.vass.fichaje.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.model.ServicioModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Servicio service. Represents a row in the &quot;Fichaje_Servicio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ServicioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServicioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicioImpl
 * @see Servicio
 * @see ServicioModel
 * @generated
 */
@ProviderType
public class ServicioModelImpl extends BaseModelImpl<Servicio>
	implements ServicioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a servicio model instance should use the {@link Servicio} interface instead.
	 */
	public static final String TABLE_NAME = "Fichaje_Servicio";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idServicio", Types.BIGINT },
			{ "activo", Types.BOOLEAN },
			{ "horaInicio", Types.TIMESTAMP },
			{ "horaFin", Types.TIMESTAMP },
			{ "longitud", Types.DOUBLE },
			{ "latitud", Types.DOUBLE },
			{ "idTipoServicio", Types.BIGINT },
			{ "fichajeId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("idServicio", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("activo", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("horaInicio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("horaFin", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("longitud", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("latitud", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("idTipoServicio", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fichajeId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table Fichaje_Servicio (idServicio LONG not null primary key,activo BOOLEAN,horaInicio DATE null,horaFin DATE null,longitud DOUBLE,latitud DOUBLE,idTipoServicio LONG,fichajeId LONG)";
	public static final String TABLE_SQL_DROP = "drop table Fichaje_Servicio";
	public static final String ORDER_BY_JPQL = " ORDER BY servicio.idServicio ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Fichaje_Servicio.idServicio ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(es.vass.fichaje.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.es.vass.fichaje.model.Servicio"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(es.vass.fichaje.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.es.vass.fichaje.model.Servicio"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(es.vass.fichaje.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.vass.fichaje.model.Servicio"),
			true);
	public static final long FICHAJEID_COLUMN_BITMASK = 1L;
	public static final long IDSERVICIO_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(es.vass.fichaje.service.util.ServiceProps.get(
				"lock.expiration.time.es.vass.fichaje.model.Servicio"));

	public ServicioModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idServicio;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdServicio(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idServicio;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Servicio.class;
	}

	@Override
	public String getModelClassName() {
		return Servicio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idServicio", getIdServicio());
		attributes.put("activo", isActivo());
		attributes.put("horaInicio", getHoraInicio());
		attributes.put("horaFin", getHoraFin());
		attributes.put("longitud", getLongitud());
		attributes.put("latitud", getLatitud());
		attributes.put("idTipoServicio", getIdTipoServicio());
		attributes.put("fichajeId", getFichajeId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idServicio = (Long)attributes.get("idServicio");

		if (idServicio != null) {
			setIdServicio(idServicio);
		}

		Boolean activo = (Boolean)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		Date horaInicio = (Date)attributes.get("horaInicio");

		if (horaInicio != null) {
			setHoraInicio(horaInicio);
		}

		Date horaFin = (Date)attributes.get("horaFin");

		if (horaFin != null) {
			setHoraFin(horaFin);
		}

		Double longitud = (Double)attributes.get("longitud");

		if (longitud != null) {
			setLongitud(longitud);
		}

		Double latitud = (Double)attributes.get("latitud");

		if (latitud != null) {
			setLatitud(latitud);
		}

		Long idTipoServicio = (Long)attributes.get("idTipoServicio");

		if (idTipoServicio != null) {
			setIdTipoServicio(idTipoServicio);
		}

		Long fichajeId = (Long)attributes.get("fichajeId");

		if (fichajeId != null) {
			setFichajeId(fichajeId);
		}
	}

	@Override
	public long getIdServicio() {
		return _idServicio;
	}

	@Override
	public void setIdServicio(long idServicio) {
		_idServicio = idServicio;
	}

	@Override
	public boolean getActivo() {
		return _activo;
	}

	@Override
	public boolean isActivo() {
		return _activo;
	}

	@Override
	public void setActivo(boolean activo) {
		_activo = activo;
	}

	@Override
	public Date getHoraInicio() {
		return _horaInicio;
	}

	@Override
	public void setHoraInicio(Date horaInicio) {
		_horaInicio = horaInicio;
	}

	@Override
	public Date getHoraFin() {
		return _horaFin;
	}

	@Override
	public void setHoraFin(Date horaFin) {
		_horaFin = horaFin;
	}

	@Override
	public double getLongitud() {
		return _longitud;
	}

	@Override
	public void setLongitud(double longitud) {
		_longitud = longitud;
	}

	@Override
	public double getLatitud() {
		return _latitud;
	}

	@Override
	public void setLatitud(double latitud) {
		_latitud = latitud;
	}

	@Override
	public long getIdTipoServicio() {
		return _idTipoServicio;
	}

	@Override
	public void setIdTipoServicio(long idTipoServicio) {
		_idTipoServicio = idTipoServicio;
	}

	@Override
	public long getFichajeId() {
		return _fichajeId;
	}

	@Override
	public void setFichajeId(long fichajeId) {
		_columnBitmask |= FICHAJEID_COLUMN_BITMASK;

		if (!_setOriginalFichajeId) {
			_setOriginalFichajeId = true;

			_originalFichajeId = _fichajeId;
		}

		_fichajeId = fichajeId;
	}

	public long getOriginalFichajeId() {
		return _originalFichajeId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Servicio.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Servicio toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Servicio)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ServicioImpl servicioImpl = new ServicioImpl();

		servicioImpl.setIdServicio(getIdServicio());
		servicioImpl.setActivo(isActivo());
		servicioImpl.setHoraInicio(getHoraInicio());
		servicioImpl.setHoraFin(getHoraFin());
		servicioImpl.setLongitud(getLongitud());
		servicioImpl.setLatitud(getLatitud());
		servicioImpl.setIdTipoServicio(getIdTipoServicio());
		servicioImpl.setFichajeId(getFichajeId());

		servicioImpl.resetOriginalValues();

		return servicioImpl;
	}

	@Override
	public int compareTo(Servicio servicio) {
		long primaryKey = servicio.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Servicio)) {
			return false;
		}

		Servicio servicio = (Servicio)obj;

		long primaryKey = servicio.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ServicioModelImpl servicioModelImpl = this;

		servicioModelImpl._originalFichajeId = servicioModelImpl._fichajeId;

		servicioModelImpl._setOriginalFichajeId = false;

		servicioModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Servicio> toCacheModel() {
		ServicioCacheModel servicioCacheModel = new ServicioCacheModel();

		servicioCacheModel.idServicio = getIdServicio();

		servicioCacheModel.activo = isActivo();

		Date horaInicio = getHoraInicio();

		if (horaInicio != null) {
			servicioCacheModel.horaInicio = horaInicio.getTime();
		}
		else {
			servicioCacheModel.horaInicio = Long.MIN_VALUE;
		}

		Date horaFin = getHoraFin();

		if (horaFin != null) {
			servicioCacheModel.horaFin = horaFin.getTime();
		}
		else {
			servicioCacheModel.horaFin = Long.MIN_VALUE;
		}

		servicioCacheModel.longitud = getLongitud();

		servicioCacheModel.latitud = getLatitud();

		servicioCacheModel.idTipoServicio = getIdTipoServicio();

		servicioCacheModel.fichajeId = getFichajeId();

		return servicioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idServicio=");
		sb.append(getIdServicio());
		sb.append(", activo=");
		sb.append(isActivo());
		sb.append(", horaInicio=");
		sb.append(getHoraInicio());
		sb.append(", horaFin=");
		sb.append(getHoraFin());
		sb.append(", longitud=");
		sb.append(getLongitud());
		sb.append(", latitud=");
		sb.append(getLatitud());
		sb.append(", idTipoServicio=");
		sb.append(getIdTipoServicio());
		sb.append(", fichajeId=");
		sb.append(getFichajeId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("es.vass.fichaje.model.Servicio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idServicio</column-name><column-value><![CDATA[");
		sb.append(getIdServicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activo</column-name><column-value><![CDATA[");
		sb.append(isActivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>horaInicio</column-name><column-value><![CDATA[");
		sb.append(getHoraInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>horaFin</column-name><column-value><![CDATA[");
		sb.append(getHoraFin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>longitud</column-name><column-value><![CDATA[");
		sb.append(getLongitud());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>latitud</column-name><column-value><![CDATA[");
		sb.append(getLatitud());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idTipoServicio</column-name><column-value><![CDATA[");
		sb.append(getIdTipoServicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fichajeId</column-name><column-value><![CDATA[");
		sb.append(getFichajeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Servicio.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Servicio.class, ModelWrapper.class
		};
	private long _idServicio;
	private boolean _activo;
	private Date _horaInicio;
	private Date _horaFin;
	private double _longitud;
	private double _latitud;
	private long _idTipoServicio;
	private long _fichajeId;
	private long _originalFichajeId;
	private boolean _setOriginalFichajeId;
	private long _columnBitmask;
	private Servicio _escapedModel;
}