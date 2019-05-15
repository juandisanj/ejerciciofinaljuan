<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
			<td><fmt:formatDate type="both" value="${fichaje.horaEntrada}"
					pattern="dd-HH-yyyy HH:mm:ss" /></td>
			<td><fmt:formatDate type="both" value="${fichaje.horaSalida}"
					pattern="dd-HH-yyyy HH:mm:ss" /></td>
			<td>${fichaje.horas}</td>
		</tr>
	</tbody>
</table>

<br />

<portlet:actionURL name="filtroServicio" var="filtroServicioUrl" />

<aui:form class="form-inline" action="${filtroServicioUrl}">
	<div class="form-row align-items-center">
		<div class="col-auto">
			<aui:input name="initDate" type="date" label="Desde" />
		</div>
		<div class="col-auto">
			<aui:input name="endDate" type="date" label="Hasta" />
		</div>
		
		<aui:input name="fichajeId" type="hidden" value="${servicio.fichajeId}" />
		<aui:button name="fitraServicioButton" type="submit" value="Buscar" />
	</div>
</aui:form>

<c:if test="${errorFichaje == 'No Coincidencias'}">
	<div class="alert alert-danger" role="alert">No se han encontrado resultados que se ajusten a la búsqueda</div>
</c:if>

<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Hora Inicio</th>
			<th scope="col">Hora de Fin</th>
			<th scope="col">Duración</th>
			<th scope="col">Tipo Servicio</th>
			<th scope="col">Longitud</th>
			<th scope="col">Latitud</th>
			<th scope="col">Modificar</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listaServicios}" var="servicio">
			<tr>
				<td class="card-text"><fmt:formatDate type="both"
						value="${servicio.horaInicio}" pattern="dd-MM-yyyy HH:mm:ss" /></td>
				<td class="card-text"><fmt:formatDate type="both"
						value="${servicio.horaFin}" pattern="dd-MM-yyyy HH:mm:ss" /></td>
				<td class="card-text">${servicio.duracion}</td>
				<td class="card-text">${servicio.idTipoServicio}</td>
				<td class="card-text">${servicio.longitud}</td>
				<td class="card-text">${servicio.latitud}</td>
				<portlet:renderURL var="jspUpdateFichaje">
					<portlet:param name="mvcRenderCommandName" value="/updateServicio" />
					<portlet:param name="idServicio" value="${servicio.idServicio}" />
				</portlet:renderURL>
				<td class="card-text"><a href="${jspUpdateFichaje}" role="button">Modificar</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

