<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<p>
	<b><liferay-ui:message key="fichajesweb.caption"/></b>
</p>

<aui:form action="${gestionaServicioUrl}">
	<aui:select name="servicio">
		<c:forEach items="${listaTipoServicios}" var="tipoServicio">
			<aui:option value="${tipoServicio.idTipoServicio}" label="${tipoServicio.nombre}" />
		</c:forEach>
	</aui:select>
	
<%-- 	<c:choose> --%>
<%-- 		<c:when test="${}"> --%>
<!-- 			<aui:button name="iniciaServicioButton" type="submit" value="Iniciar" /> -->
<!-- 			<aui:button name="paraServicioButton" type="submit" value="Parar" /> -->
<%-- 		</c:when> --%>
<%-- 		<c:otherwise> --%>
<!-- 			<aui:button name="iniciaServicioButton" type="submit" value="Iniciar" /> -->
<!-- 			<aui:button name="paraServicioButton" type="submit" value="Parar" /> -->
<%-- 		</c:otherwise> --%>
<%-- 	</c:choose> --%>
</aui:form>