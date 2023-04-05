<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listar clientes</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
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
		<h1 class="text-center py-3">Listado de Clientes</h1>
		<br>
		<table>
			<thead>
				<tr>
					<th>ID de Usuario</th>
					<th>Nombre de Usuario</th>
					<th>Fecha de Nacimiento</th>
					<th>RUN</th>
					<th>Nombres</th>
					<th>Apellidos</th>
					<th>Telefono</th>
					<th>Afp</th>
					<th>Sistema de Salud</th>
					<th>Direccion</th>
					<th>Comuna</th>
					<th>Edad</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="cli" items="${requestScope.clientes">
					<tr>
						<td><c:out value="${cli.idUsuario}" /></td>
						<td><c:out value="${cli.userName}" /></td>
						<td><c:out value="${cli.fNacimiento}" /></td>
						<!-- parte cliente -->
						<td><c:out value="${cli.rutCliente}" /></td>
						<td><c:out value="${cli.nombres}" /></td>
						<td><c:out value="${cli.apellidos}" /></td>
						<td><c:out value="${cli.telefono}" /></td>
						<td><c:out value="${cli.sds}" /></td>
						<td><c:out value="${cli.direccion}" /></td>
						<td><c:out value="${cli.comuna}" /></td>
						<td><c:out value="${cli.edad}" /></td>

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