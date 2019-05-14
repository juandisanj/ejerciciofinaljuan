<portlet:renderURL var="jspFichar">
	<portlet:param name="mvcRenderCommandName" value="/" />
</portlet:renderURL>
<portlet:renderURL var="jspVerFichajes">
	<portlet:param name="mvcRenderCommandName" value="/listFichajes" />
</portlet:renderURL>
<portlet:renderURL var="jspVerJornada">
	<portlet:param name="mvcRenderCommandName" value="/verJornada" />
</portlet:renderURL>

<ul class="nav nav-tabs">
	<li class="nav-item">
    <a class="nav-link" href="${jspFichar}">Fichar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="${jspVerFichajes}">Ver Fichajes</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="${jspVerJornada}">Gestionar Jornada</a>
  </li>
</ul>

<br/>