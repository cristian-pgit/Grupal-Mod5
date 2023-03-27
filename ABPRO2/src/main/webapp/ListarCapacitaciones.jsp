<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Capacitaciones</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img src="" alt="Bootstrap"
				width="30" height="24">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Inicio.jsp">Inicio</a></li>
					<li class="nav-item"><a class="nav-link" href="Contacto.jsp">Contacto</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Crear </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="/CrearCapacitacion.jsp">Crear
									Capacitacion</a></li>
							<li><a class="dropdown-item" href="/ListarCapacitaciones.jsp">Listar
									Capacitaciones</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Crear Cliente</a></li>
							<li><a class="dropdown-item" href="#">Crear Profesional</a></li>
							<li><a class="dropdown-item" href="#">Crear
									Administrativo</a></li>
						</ul></li>
				</ul>
			
			</div>
		</div>
	</nav>
	<h1 class="text-center py-3">Listado de Capacitaciones</h1>
            
<table class="table table-sm table-hover">
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
	




</body>
</html>