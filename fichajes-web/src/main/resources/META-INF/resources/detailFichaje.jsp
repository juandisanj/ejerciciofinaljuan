<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<p>
	<b><liferay-ui:message key="fichajesweb.detailFichaje"/></b>
</p>

<table class="table table-hover table-dark">
  <thead>
    <tr>
      <th scope="col">Hora Inicio</th>
      <th scope="col">Hora Fin</th>
      <th scope="col">Longitud</th>
      <th scope="col">Latitud</th>
      <th scope="col">Estado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">${usuario.username}</th>
      <td>${usuario.email}</td>
      <td>${usuario.telefono}</td>
      <td>${usuario.fechaAlta}</td>
      <td>${usuario.fechaCancelacion}</td>
      <td>
      	<c:if test="${usuario.activo == true}">
      		Activo
      	</c:if>
      	<c:if test="${usuario.activo == false}">
      		Inactivo
      	</c:if>
      </td>
    </tr>
  </tbody>
</table>