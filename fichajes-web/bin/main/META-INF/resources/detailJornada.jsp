<%@ include file="/init.jsp"%>

<%@ include file="/general/navbar.jsp"%>

<p>
	<b><liferay-ui:message key="fichajesweb.detailJornada" /></b>
</p>

<portlet:actionURL name="updateJornada" var="updateJornadaUrl" />

<aui:form action="${updateJornadaUrl}">
	<aui:input name="username" type="text" label="Nombre del usuario: ">
		<aui:validator name="required" />
		<aui:validator name="minLength" >3</aui:validator>
	</aui:input>
	
	<aui:button name="addUsuarioButton" type="submit" value="Modificar jornada" />
</aui:form>