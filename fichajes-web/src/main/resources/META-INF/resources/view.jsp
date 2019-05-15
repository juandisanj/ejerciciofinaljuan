<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/init.jsp" %>

<%@ include file="/general/navbar.jsp" %>

<portlet:actionURL name="fichajeServicio" var="gestionaServicioUrl" />

<aui:form action="${gestionaServicioUrl}" >
	
	<c:choose>
		<c:when test="${activo == false}">
			<aui:select name="tipoServicio">
				<c:forEach items="${listaTipoServicios}" var="tipoServicio">
					<aui:option value="${tipoServicio.idTipoServicio}" label="${tipoServicio.nombre}" />
				</c:forEach>
			</aui:select>
			<aui:input name="process" type="hidden" value="start" />
			<aui:input name="latitude" type="hidden" id="latitude" />
			<aui:input name="longitude" type="hidden" id="longitude" />
		
			<aui:button name="iniciaServicioButton" type="submit" value="Iniciar" />
		</c:when>
		<c:otherwise>
			<aui:input name="process" type="hidden" value="end" />
		
			<aui:button name="paraServicioButton" type="submit" value="Parar" />
		</c:otherwise>
	</c:choose>
</aui:form>

<aui:script>

// AUI().use({
	
// });

function showPosition(position) {
    console.log("Latitude: " + position.coords.latitude + ", Longitude: " + position.coords.longitude)
    var latitude = position.coords.latitude.toString(2);
    var longitude = position.coords.longitude.toString(2);
    document.getElementById("latitude").innerHTML = latitude;
    document.getElementById("longitude").innerHTML = longitude;
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
</aui:script>