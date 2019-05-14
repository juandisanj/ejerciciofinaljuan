<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="/init.jsp"%>

<%@ include file="/general/navbar.jsp"%>

<p>
	<b><liferay-ui:message key="fichajesweb.detailFichaje" /></b>
</p>

<table class="table table-hover">
	<thead>
		<tr>
			<th scope="col">Usuario</th>
			<th scope="col">Hora Inicio</th>
			<th scope="col">Hora Fin</th>
			<th scope="col">Horas totales</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">${fichaje.userName}</th>
			<td>
				<fmt:formatDate type="both" value="${fichaje.horaEntrada}" pattern="dd-HH-yyyy HH:mm:ss" />
			</td>
			<td>
				<fmt:formatDate type="both" value="${fichaje.horaSalida}" pattern="dd-HH-yyyy HH:mm:ss" />
			</td>
			<td>${fichaje.horas}</td>
		</tr>
	</tbody>
</table>

<br />

<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Hora Inicio</th>
			<th scope="col">Hora de Fin</th>
			<th scope="col">Duración</th>
			<th scope="col">Tipo Servicio</th>
			<th scope="col">Longitud</th>
			<th scope="col">Latitud</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaServicios}" var="servicio">
			<tr>
				<td class="card-text"><fmt:formatDate type="both" value="${servicio.horaInicio}" pattern="dd-HH-yyyy HH:mm:ss" /></td>
				<td class="card-text"><fmt:formatDate type="both" value="${servicio.horaFin}" pattern="dd-HH-yyyy HH:mm:ss" /></td>
				<td class="card-text">${servicio.duracion}</td>
				<td class="card-text">${servicio.idTipoServicio}</td>
				<td class="card-text">${servicio.longitud}</td>
				<td class="card-text">${servicio.latitud}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

