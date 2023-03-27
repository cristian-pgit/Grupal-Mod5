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
	<jsp:include page="nav.jsp"></jsp:include>
	<br>
	<h1 class="text-center py-3">Listado de Capacitaciones</h1>
            
<div class="container">
        <br>
	    <h1 class="text-center py-3">Listado de Capacitaciones</h1>
        <br>
        <table class="table table-sm table-hover" id="size">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nombre de la Capacitación</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Lugar</th>
                    <th>Duración (horas)</th>
                    <th>Cantidad de Asistentes</th>
                </tr>
            </thead>

            <tbody>
                <tr>
                    <th>1</th>
                    <td>Capacitación en Ventas</td>
                    <td>20-04-2023</td>
                    <td>10:00 - 12:00</td>
                    <td>Sala de Conferencias A</td>
                    <td>2</td>
                    <td>30</td>
                </tr>

                <tr>
                    <th>2</th>
                    <td>Capacitación en Liderazgo</td>
                    <td>23-05-2023</td>
                    <td>14:00 - 16:00</td>
                    <td>Sala de Conferencias B</td>
                    <td>2</td>
                    <td>20</td>
                </tr>

                <tr>
                    <th>3</th>
                    <td>Capacitación en Comunicación</td>
                    <td>10-06-2023</td>
                    <td>09:00 - 13:00</td>
                    <td>Sala de Reuniones C</td>
                    <td>4</td>
                    <td>15</td>
                </tr>
            </tbody>
        </table>
    </div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>