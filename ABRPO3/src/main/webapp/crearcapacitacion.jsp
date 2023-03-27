<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bitte Dans Les Youx</title>
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
<jsp:include page="nav.jsp"></jsp:include>

	<div class="container">
		<br>
		<h1>Crear capacitación</h1>
		<form action="guardar-capacitacion.jsp" method="post">
			<div class="mb-3">
				<label for="nombre" class="form-label">Nombre</label> <input
					type="text" class="form-control" id="nombre" name="nombre" required>
			</div>
			<div class="mb-3">
				<label for="descripcion" class="form-label">Descripción</label>
				<textarea class="form-control" id="descripcion" name="descripcion"
					rows="3"></textarea>
			</div>
			<div class="mb-3">
				<label for="fecha" class="form-label">Fecha</label> <input
					type="date" class="form-control" id="fecha" name="fecha" required>
			</div>
			<div class="mb-3">
				<label for="duracion" class="form-label">Duración (horas)</label> <input
					type="number" class="form-control" id="duracion" name="duracion"
					required>
			</div>
			<div class="mb-3">
				<label for="lugar" class="form-label">Lugar</label> <input
					type="text" class="form-control" id="lugar" name="lugar" required>
			</div>
			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>