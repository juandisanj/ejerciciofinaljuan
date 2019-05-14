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
			<td>${fichaje.horaEntrada}</td>
			<td>${fichaje.horaSalida}</td>
			<td>${fichaje.horas}</td>

			<c:forEach items="${listaServicios}" var="servicio">
				<td class="card-text">${servicio.username}</td>
				
			</c:forEach>
		</tr>
	</tbody>
</table>

<br/>

<table class="table table-hover">
	<thead>
		<tr>
			<th scope="col">Hora Inicio</th>
			<th scope="col">Hora de Fin</th>
			<th scope="col">Longitud</th>
			<th scope="col">Latitud</th>
			<th scope="col">Tipo Servicio</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<c:forEach items="${listaServicios}" var="servicio">
				<td class="card-text">${servicio.horaInicio}</td>
				<td class="card-text">${servicio.horaFin}</td>
				<td class="card-text">${servicio.longitud}</td>
				<td class="card-text">${servicio.latitud}</td>
				<td class="card-text">${servicio.idTipoServicio}</td>
			</c:forEach>
		</tr>
	</tbody>
</table>