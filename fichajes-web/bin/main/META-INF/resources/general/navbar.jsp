<portlet:renderURL var="jspFichar">
	<portlet:param name="mvcRenderCommandName" value="/" />
</portlet:renderURL>
<portlet:renderURL var="jspVerFichajes">
	<portlet:param name="mvcRenderCommandName" value="/verFichajes" />
</portlet:renderURL>
<portlet:renderURL var="jspGestionaFichajes">
	<portlet:param name="mvcRenderCommandName" value="/gestionaFichajes" />
</portlet:renderURL>
<portlet:renderURL var="jspGestionaJornada">
	<portlet:param name="mvcRenderCommandName" value="/gestionaJornada" />
</portlet:renderURL>

<ul class="nav nav-tabs">
	<li class="nav-item">
    <a class="nav-link" href="${jspFichar}">Fichar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="${jspVerFichajes}">VerFichajes</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="${jspGestionaFichajes}">Gestionar Fichajes</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="${jspGestionaJornada}">Gestionar Jornada</a>
  </li>
</ul>

<br/>