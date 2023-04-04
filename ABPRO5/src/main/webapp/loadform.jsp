<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>

<c:set var="tipo" value="${param.tipo}" />

<c:choose>
  <c:when test="${tipo eq 'cli'}">
    <div class="formulario formulario-cli">
      <jsp:include page="crearcliente.jsp" />
    </div>
    <div class="formulario formulario-pro d-none" style="display: none;">
      <jsp:include page="crearprofesional.jsp" />
    </div>
    <div class="formulario formulario-adm d-none" style="display: none;">
      <jsp:include page="crearadministrativo.jsp" />
    </div>
  </c:when>
  <c:when test="${tipo eq 'pro'}">
    <div class="formulario formulario-cli d-none" style="display: none;">
      <jsp:include page="crearcliente.jsp" />
    </div>
    <div class="formulario formulario-pro">
      <jsp:include page="crearprofesional.jsp" />
    </div>
    <div class="formulario formulario-adm d-none" style="display: none;">
      <jsp:include page="crearadministrativo.jsp" />
    </div>
  </c:when>
  <c:when test="${tipo eq 'adm'}">
    <div class="formulario formulario-cli d-none" style="display: none;">
      <jsp:include page="crearcliente.jsp" />
    </div>
    <div class="formulario formulario-pro d-none" style="display: none;">
      <jsp:include page="crearprofesional.jsp" />
    </div>
    <div class="formulario formulario-adm">
      <jsp:include page="crearadministrativo.jsp" />
    </div>
  </c:when>
  <c:otherwise>
    <p>Please select a form.</p>
  </c:otherwise>
</c:choose>
