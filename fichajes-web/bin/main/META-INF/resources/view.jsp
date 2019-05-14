<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<p>
	<b><liferay-ui:message key="fichajesweb.caption"/></b>
</p>

<portlet:actionURL name="fichajeServicio" var="gestionaServicioUrl" />

<aui:form action="${gestionaServicioUrl}">
	
	<c:choose>
		<c:when test="${activo == false}">
			<aui:select name="tipoServicio">
				<c:forEach items="${listaTipoServicios}" var="tipoServicio">
					<aui:option value="${tipoServicio.idTipoServicio}" label="${tipoServicio.nombre}" />
				</c:forEach>
			</aui:select>
			<aui:input name="process" type="hidden" value="start" />
		
			<aui:button name="iniciaServicioButton" type="submit" value="Iniciar" />
		</c:when>
		<c:otherwise>
			<aui:input name="process" type="hidden" value="end" />
		
			<aui:button name="paraServicioButton" type="submit" value="Parar" />
		</c:otherwise>
	</c:choose>
</aui:form>