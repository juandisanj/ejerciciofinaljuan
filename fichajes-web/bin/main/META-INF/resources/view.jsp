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

<script type="text/javascript">
console.log("script de view");
function showPosition(position) {
    console.log("Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude)
}
function showError(error) {
    switch (error.code) {
        case error.PERMISSION_DENIED:
            x.innerHTML = "User denied the request for Geolocation.";
            break;
        case error.POSITION_UNAVAILABLE:
            x.innerHTML = "Location information is unavailable.";
            break;
        case error.TIMEOUT:
            x.innerHTML = "The request to get user location timed out.";
            break;
        case error.UNKNOWN_ERR:
            x.innerHTML = "An unknown error occurred.";
            break;
    }
}
if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition)
} else {
    console.log("Geolocation API doesn't supported.")
}
</script>