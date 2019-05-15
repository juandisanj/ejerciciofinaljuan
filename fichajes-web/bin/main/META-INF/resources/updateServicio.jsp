<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ include file="/init.jsp"%>

<%@ include file="/general/navbar.jsp"%>

<p>
	<b><liferay-ui:message key="fichajesweb.updateServicio" /></b>
</p>

<portlet:actionURL name="updateServicio" var="updateServicioUrl" />


<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Usuario</th>
			<th scope="col">Hora Inicio</th>
			<th scope="col">Hora de Fin</th>
			<th scope="col">Duración</th>
			<th scope="col">Tipo Servicio</th>
			<th scope="col">Longitud</th>
			<th scope="col">Latitud</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td class="card-text">${fichaje.userName}</td>
			<td class="card-text"><fmt:formatDate type="both"
					value="${servicio.horaInicio}" pattern="dd-HH-yyyy HH:mm:ss" /></td>
			<td class="card-text"><fmt:formatDate type="both"
					value="${servicio.horaFin}" pattern="dd-HH-yyyy HH:mm:ss" /></td>
			<td class="card-text">${servicio.duracion}</td>
			<td class="card-text">${servicio.idTipoServicio}</td>
			<td class="card-text">${servicio.longitud}</td>
			<td class="card-text">${servicio.latitud}</td>
		</tr>
	</tbody>
</table>

<c:if test="${errorUpdate.equals('errorOrden')}">
	<div class="alert alert-danger" role="alert">La fecha de inicio debe ser anterior a la de fin</div>
</c:if>
<c:if test="${errorUpdate.equals('errorDia')}">
	<div class="alert alert-danger" role="alert">El día seleccionado debe ser el mismo que el inicial</div>
</c:if>

<aui:form action="${updateServicioUrl}">
	<div class="form-row align-items-center">
		<div class="col-auto">
			<aui:input name="horaInicio" type="datetime-local"
				id="inputdatetime1" label="Hora de inicio del servicio " />
		</div>
		<div class="col-auto">
			<aui:input name="horaFin" type="datetime-local" id="inputdatetime2"
				label="Hora de final del servicio " />
		</div>
		<div class="col-auto">
			<aui:select name="tipoServicio">
				<c:forEach var="tipo" items="${listTiposServicio}">
					<aui:option value="${tipo.idTipoServicio}"
						label="${tipo.nombre}" />
				</c:forEach>
			</aui:select>
		</div>

		<aui:input name="idServicio" type="hidden" value="${servicio.idServicio}" />

		<aui:button name="updateServicioButton" type="submit"
			value="Modificar Servicio" />
	</div>
</aui:form>