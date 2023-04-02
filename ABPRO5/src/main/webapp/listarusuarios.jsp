<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bitee Dans Les Youx</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png" type="image/x-icon">
<link rel="stylesheet" href="Assets/style.css">
</head>
<body>
<c:if test="${sessionScope.userName == null}">
    <c:redirect url="/" />
</c:if>
	<jsp:include page="nav.jsp"></jsp:include>
	<br>

            
<div class="container">
        <br>
	    <h1 class="text-center py-3">Listado de Usuarios</h1>
        <br>
       <table>
  <thead>
    <tr>
      <th>ID de Usuario</th>
      <th>Nombre de Usuario</th>
      <th>Fecha de Nacimiento</th>
      <th>RUN</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="user" items="${requestScope.usuarios}">
      <tr>
        <td><c:out value="${user.idUsuario}"/></td>
        <td><c:out value="${user.userName}"/></td>
        <td><c:out value="${user.fNacimiento}"/></td>
        <td><c:out value="${user.run}"/></td>
      </tr>
    </c:forEach>
  </tbody>
</table>
    </div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>