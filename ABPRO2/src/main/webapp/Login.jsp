<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>

<body>

		<div class="container-fluid">
        <div class="row text-center">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
              <body class="text-center" cz-shortcut-listen="true">

                <main class="form-signin w-100 m-auto">
                <form action="/LoginServlet" method="post">
                  <img class="mb-4" src="https://i.ibb.co/Dw4XcyJ/PDLY-of.png" alt="PDLY-of" width="100" height="90 ">
                  <h1 class="h3 mb-3 fw-normal">Favor de hacer Log-in</h1>
          
                  <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput"
                      placeholder="nombre de usuario"> <label for="floatingInput">User Name
                      </label>
                  </div>
                  <div class="form-floating">
                    <input type="password" class="form-control" id="floatingPassword"
                      placeholder="Password"> <label for="floatingPassword">Password</label>
                  </div>
          			<td><input type="hidden" name="parametro" value="sesion"></td>
                  <div class="checkbox mb-3">
                    <label> <input type="checkbox" value="remember-me">
                      Recuerdame
                    </label>
                  </div>
                  <button class="w-100 btn btn-lg btn-primary" type="submit" value="Iniciar Sesión">Ingresar</button>
                  <p class="mt-5 mb-3 text-muted">©PDLY 2023</p>
                </form>
                </main>
            <div class="col-sm-4"></div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>