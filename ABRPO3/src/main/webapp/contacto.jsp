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
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>

	<div class="container">
		<br>
		<div class="container-fluid mx-auto">
        <div class="row text-center">
          <div class="col-sm-3"></div>
          <div class="col-sm-6">
            <div class="well well-sm">
              <form class="form-horizontal" method="post">
                <fieldset>
                  <legend class="text-center header">Contactanos</legend>
      
                  <div class="form-group justify-content-center">
                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                    <div class="col-md-8">
                      <input id="fname" name="name" type="text" placeholder="Nombres" class="form-control">
                    </div>
                  </div>
      
                  <div class="form-group justify-content-center">
                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                    <div class="col-md-8">
                      <input id="lname" name="name" type="text" placeholder="Apellidos" class="form-control">
                    </div>
                  </div>
      
                  <div class="form-group justify-content-center">
                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                    <div class="col-md-8">
                      <input id="email" name="email" type="text" placeholder="Email" class="form-control">
                    </div>
                  </div>
      
                  <div class="form-group justify-content-center">
                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                    <div class="col-md-8">
                      <input id="phone" name="phone" type="text" placeholder="Numero Telefonico" class="form-control">
                    </div>
                  </div>
      
                  <div class="form-group justify-content-center">
                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-pencil-square-o bigicon"></i></span>
                    <div class="col-md-8">
                      <textarea class="form-control" id="message" name="message" placeholder="Ingresa tu mensaje. Te responderemos a la brevedad." rows="7"></textarea>
                    </div>
                  </div>
      
                  <div class="form-group">
                    <div class="col-md-12 text-center">
                      <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                    </div>
                  </div>
                </fieldset>
              </form>
            </div>
          </div>
          <div class="col-sm-3"></div>
        </div>
      </div>
		



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
</body>
</html>