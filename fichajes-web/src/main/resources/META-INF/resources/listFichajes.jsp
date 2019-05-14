<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<p>
	<b><liferay-ui:message key="fichajesweb.listafichajes"/></b>
</p>

<portlet:actionURL name="filtroFechaUsuario" var="filtroFechaUsuarioUrl" />

<aui:form class="form-inline" action="${filtroFechaUsuarioUrl}">
	<aui:input name="initDate" type="date" label="Día" />
	<aui:input name="endDate" type="date" label="Hasta" />
	<aui:input name="userName" type="text" label="Empleado" />
	<aui:button name="fitraFichajeButton" type="submit" value="Buscar" />
</aui:form>



<liferay-ui:search-container emptyResultsMessage="No existen usuarios">
	<liferay-ui:search-container-results results="${listaFichajes}" />

	<liferay-ui:search-container-row className="es.vass.netflix.model.Usuario" keyProperty="userId"	modelVar="currentUsuario">

		<liferay-ui:search-container-column-text name="Nombre" property="username" />
		<liferay-ui:search-container-column-text name="Email" property="email" />
		<liferay-ui:search-container-column-text name="Telefono" property="telefono" />
		<liferay-ui:search-container-column-text name="Tipo de Contrato" property="tipoContrato" />
		<liferay-ui:search-container-column-text name="Fecha de alta" property="fechaAlta" />
		<liferay-ui:search-container-column-text name="Fecha de cancelación" property="fechaCancelacion" />

		<liferay-portlet:renderURL varImpl="rowURL">
			<!-- 			<portlet:param name="backURL" value="" /> -->
			<portlet:param name="mvcRenderCommandName" value="/detailUsuario" />
			<portlet:param name="usuarioId" value="${currentUsuario.userId}" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container-column-text name="Detail" href="${rowURL}" value="Ver detalle" />
		
		
		<!-- Borrador para incluir un icono con las opciones de Detalle - Modificar - Eliminar -->	
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>