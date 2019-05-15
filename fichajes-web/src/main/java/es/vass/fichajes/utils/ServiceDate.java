package es.vass.fichajes.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import es.vass.fichaje.model.Servicio;
import es.vass.fichaje.service.ServicioLocalServiceUtil;
import es.vass.fichajes.exceptions.ChangeDateException;

public class ServiceDate {
	
	private static final Log _log = new LogFactoryUtil().getLog(ServiceDate.class);

	
	public static Date dateWithFormat(String format, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String dateString = sdf.format(date);
		Date dateFormat = null;
		try {
			date = sdf.parse(dateString);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			_log.error("Method ServiceDate.stringToDate: Error en el parseado de fecha");
		}
		
		return dateFormat;
	}
	
	public static Date stringToDate(String format, String fecha) {
		
		_log.info("Method ServiceDate.stringToDate: Conversión de string a date");
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = sdf.parse(fecha);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			_log.error("Method ServiceDate.stringToDate: Error en el parseado de fecha");
		}
		
		return date;
	}

	public static Date toMomentOfDay(String moment, Date date) {
		
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date convertDate = null;
		
		if("init".equals(moment)) {
			LocalDateTime initLTimeDay = LocalDateTime.of(localDate, LocalTime.MIDNIGHT);
			convertDate = Date.from(initLTimeDay.atZone(ZoneId.systemDefault()).toInstant());
		}else if("end".equals(moment)) {
			LocalDateTime endLTimeDay = LocalDateTime.of(localDate, LocalTime.MAX);
			convertDate = Date.from(endLTimeDay.atZone(ZoneId.systemDefault()).toInstant());
		}
		
		return convertDate;
	}
	
	public static Date modifyDate(Date date, String unitTime, int quantity) throws ChangeDateException {
		
		_log.info("Method ServiceDate.modifyDate: Añade periodo de tiempo a fecha dada");
		
		Date modifyDate = null;
		
		LocalDateTime ldtInicial = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		if("year".equals(unitTime)) {
			ldtInicial.plusYears(quantity);
		}else if("month".equals(unitTime)) {
			ldtInicial.plusMonths(quantity);
			System.out.println(ldtInicial);
		}else if("day".equals(unitTime)) {
			ldtInicial.plusDays(quantity);
		}else {
			throw new ChangeDateException("ChangeDateException: Unidad de tiempo seleccionada incorrecta");
		}
		
		modifyDate = Timestamp.valueOf(ldtInicial);
		
		return modifyDate;
	}
	
	public static double calculaHorasFichaje(long idFichaje) {
		double horasTotales = 0.0;
		
		long suma = 0;
		
		List<Servicio> listaServicios = ServicioLocalServiceUtil.findByIdFichaje(idFichaje);
		
		for(Servicio s : listaServicios) {
			long tiempoServicio = s.getHoraFin().getTime() - s.getHoraInicio().getTime();
			suma += tiempoServicio;
		}
		
		horasTotales = ((double) suma)/3600000;
		
		return horasTotales;
	}
	
}
