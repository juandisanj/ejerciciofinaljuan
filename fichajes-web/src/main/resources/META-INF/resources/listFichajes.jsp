<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<p>
	<b><liferay-ui:message key="fichajesweb.listafichajes"/></b>
</p>

<portlet:actionURL name="filtroFechaUsuario" var="filtroFechaUsuarioUrl" />

<aui:form class="form-inline" action="${filtroFechaUsuarioUrl}">
	<aui:input name="initDate" type="date" label="D�a" />
	<aui:input name="endDate" type="date" label="Hasta" />
	<aui:input name="userName" type="text" label="Empleado" />
	<aui:button name="fitraFichajeButton" type="submit" value="Buscar" />
</aui:form>



<liferay-ui:search-container emptyResultsMessage="No existen usuarios">
	<liferay-ui:search-container-results results="${listaFichajes}" />

	<liferay-ui:search-container-row className="es.vass.fichaje.model.Fichaje" keyProperty="fichajeId"	modelVar="currentFichaje">

		<liferay-ui:search-container-column-text name="Usuario" property="userName" />
		<liferay-ui:search-container-column-text name="Hora de Entrada" property="horaEntrada" />
		<liferay-ui:search-container-column-text name="Hora de Salida" property="horaSalida" />
		<liferay-ui:search-container-column-text name="Horas totales" property="horas" />

		<liferay-portlet:renderURL varImpl="rowURL">
			<!-- 			<portlet:param name="backURL" value="" /> -->
			<portlet:param name="mvcRenderCommandName" value="/detailFichaje" />
			<portlet:param name="fichajeId" value="${currentFichaje.fichajeId}" />
		</liferay-portlet:renderURL>
		<liferay-ui:search-container-column-text name="Detail" href="${rowURL}" value="Ver detalle" />
		
		
		<!-- Borrador para incluir un icono con las opciones de Detalle - Modificar - Eliminar -->	
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>