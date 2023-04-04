<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BDLY - Log-In</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4">
				<main class="form-signin w-100 m-auto">
					<form action="Login" method="post">
						<img class="mx-auto d-block mt-4" src="https://i.ibb.co/FzxxWTL/BDLY-ico.png" alt="your-image-alt" width="72" height="57">
						<h1 class="h3 mb-3 fw-normal text-center">Sitio de Ingreso al Sistema</h1>

						<div class="form-floating">
							<input type="text" class="form-control" id="userName" name="userName" placeholder="nombre de usuario"> 
							<label for="userName">Nombre de Usuario: </label>
						</div>
						<div class="form-floating">
							<input type="password" class="form-control" id="floatingPassword" name="floatingPassword" placeholder="Password"> 
							<label for="floatingPassword">Password</label>
						</div>

						<div class="checkbox mb-3">
							<label> <input type="checkbox" value="remember-me">
								Recuerdame
							</label>
						</div>
						<button class="w-100 btn btn-lg btn-primary" type="submit">Ingresar</button>
						<p class="mt-5 mb-3 text-body-secondary">© PDLY 2023</p>
					</form>
				</main>
			</div>
			<div class="col-4"></div>
		</div>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>