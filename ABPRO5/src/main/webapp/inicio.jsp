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
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<link rel="stylesheet" href="Assets/style.css">
 <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Anton&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300&display=swap" rel="stylesheet">
</head>
<body>
	<c:if test="${sessionScope.userName == null}">
		<c:redirect url="/" />
	</c:if>
	<jsp:include page="nav.jsp"></jsp:include>

	<h1 class="text-center" id="titulo1">Bitte Dans Les Yeux</h1>
	<section style="text-align: center;" class="extract">

		<div>
			<p class="text-center">Empresa de asesorías en prevención de
				riesgos</p>
		</div>

		<div class="container-fluid">
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">
					<div id="carouselExampleAutoplaying" class="carousel slide"
						data-bs-ride="carousel">
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img src="Assets/prev7.jpg" class="d-block w-85 h-50  img-fluid"
									alt="...">
							</div>
							<div class="carousel-item">
								<img src="Assets/prev4.jpeg"
									class="d-block w-85 h-50  img-fluid" alt="...">
							</div>
							<div class="carousel-item">
								<img src="Assets/prev2.webp"
									class="d-block w-85 h-50  img-fluid" alt="...">
							</div>
						</div>
						<button class="carousel-control-prev" type="button"
							data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
							<span class="carousel-control-prev-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Previous</span>
						</button>
						<button class="carousel-control-next" type="button"
							data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Next</span>
						</button>
					</div>
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<br> <br> <br> <br> <b>
				<br>
					<h1 class="subtitulo1">Servicios</h1>
				</b>
				<div>
					<p>Esta es una empresa de asesorías en prevención de riesgos
						que ofrece los siguientes servicios:</p>
					<br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Realiza formularios de contacto para realizar consultas. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					A partir de los formularios crea una capacitacion en el sistema. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Lista las capacitaciones registradas ademas de los usuarios
					existentes en plataforma. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Crea y modifica datos de un usuario tipo cliente, tipo
					administrativo y tipo profesional. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Lista de todas las visitas realizadas a cada uno de los clientes y
					sus chequeos. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Lista de todos los pagos realizados por los clientes y agrega pagos
					al sistema. <br>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-check-all" viewBox="0 0 16 16">
                <path
							d="M8.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L2.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093L8.95 4.992a.252.252 0 0 1 .02-.022zm-.92 5.14.92.92a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 1 0-1.091-1.028L9.477 9.417l-.485-.486-.943 1.179z" />
              </svg>
					Lista las asesorias realizadas y muestra reportes. <br>



				</div>
			</div>
			<div class="row">
				<br> <br> <br> <b>
					<h1 class="subtitulo2">Quienes somos</h1>
				</b>

				<div class="card-group">
					<div class="card">
						<img src="Assets/prev8.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<p class="card-text">Somos una empresa de asesorías en
								prevención de riesgos que cuenta con un sistema de información
								que permite administrar los principales procesos que se llevan a
								cabo en el día a día.</p>

						</div>
					</div>
					<div class="card">
						<img src="Assets/prev11.jpg" class="card-img-top" alt="...">
						<div class="card-body">
							<p class="card-text">Somos una entidad con gran dinamismo y
								que se encuentran continuamente en cambio</p>

						</div>
					</div>
					<div class="card">
						<img src="Assets/prev13.webp" class="card-img-top" alt="...">
						<div class="card-body">
							<p class="card-text">Podemos afirmar que una de las mejores
								herramientas disponibles para minimizar este tipo de riesgos es
								la implementación de un Sistema de Gestión de Seguridad y Salud
								en el Trabajo y en BDLY es posible.</p>

						</div>
					</div>
				</div>
			</div>
		</div>





		<div class="pt-5 container-fluid">
			<div class="card text-center">
				<div class="card-body">
					<b>
						<h5 class="card-title">BDLY 2023</h5>
					</b>
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-envelope" viewBox="0 0 16 16">
                        <path
							d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z" /> 
                    </svg>

					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-whatsapp" viewBox="0 0 16 16">
                            <path
							d="M13.601 2.326A7.854 7.854 0 0 0 7.994 0C3.627 0 .068 3.558.064 7.926c0 1.399.366 2.76 1.057 3.965L0 16l4.204-1.102a7.933 7.933 0 0 0 3.79.965h.004c4.368 0 7.926-3.558 7.93-7.93A7.898 7.898 0 0 0 13.6 2.326zM7.994 14.521a6.573 6.573 0 0 1-3.356-.92l-.24-.144-2.494.654.666-2.433-.156-.251a6.56 6.56 0 0 1-1.007-3.505c0-3.626 2.957-6.584 6.591-6.584a6.56 6.56 0 0 1 4.66 1.931 6.557 6.557 0 0 1 1.928 4.66c-.004 3.639-2.961 6.592-6.592 6.592zm3.615-4.934c-.197-.099-1.17-.578-1.353-.646-.182-.065-.315-.099-.445.099-.133.197-.513.646-.627.775-.114.133-.232.148-.43.05-.197-.1-.836-.308-1.592-.985-.59-.525-.985-1.175-1.103-1.372-.114-.198-.011-.304.088-.403.087-.088.197-.232.296-.346.1-.114.133-.198.198-.33.065-.134.034-.248-.015-.347-.05-.099-.445-1.076-.612-1.47-.16-.389-.323-.335-.445-.34-.114-.007-.247-.007-.38-.007a.729.729 0 0 0-.529.247c-.182.198-.691.677-.691 1.654 0 .977.71 1.916.81 2.049.098.133 1.394 2.132 3.383 2.992.47.205.84.326 1.129.418.475.152.904.129 1.246.08.38-.058 1.171-.48 1.338-.943.164-.464.164-.86.114-.943-.049-.084-.182-.133-.38-.232z" />
                        </svg>
					bdly@gmail.com - +56986554232
					<p class="card-text">©2023 BDLY. Todos los derechos reservados.</p>
					<a href="contacto.jsp" class="btn btn-primary">Contactanos</a>
				</div>
			</div>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
			crossorigin="anonymous"></script>
</body>
</html>