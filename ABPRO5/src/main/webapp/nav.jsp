<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
     <a class="navbar-brand" href="#">
      <img src="https://i.ibb.co/xYzqC8n/BDLY-logo.png" alt="PDLY" width="30" height="24">
     </a>
	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="inicio.jsp">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contacto.jsp">Contacto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Crear
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="crearcapacitacion.jsp">Crear Capacitacion</a></li>
            <li><a class="dropdown-item" href="crearusuario.jsp">Crear Usuario</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item d-none" href="#">Crear Cliente</a></li>
            <li><a class="dropdown-item d-none" href="#">Crear Profesional</a></li>
            <li><a class="dropdown-item d-none" href="#">Crear Administrativo</a></li>
          </ul>
        </li>
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Listar
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="ListarCapacitaciones">Listar Capacitaciones</a></li>
            <li><a class="dropdown-item" href="ListarUsuarios">Listar Usuarios</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="ListarCliente">Listar Clientes</a></li>
            <li><a class="dropdown-item d-none" href="ListarProfesional">Listar Profesional</a></li>
            <li><a class="dropdown-item d-none" href="ListarAdministrativo">Listar Administrativo</a></li>
          </ul>
        </li>
      </ul>
      <form class="d-flex" role="logout">
      <p id="tu">Usuario: &nbsp;</p> <p id="user"><c:out value="${sessionScope.userName}"/>&nbsp; </p>
        <a class="btn btn-outline-secondary" id="btnlo" href="Logout">Logout</a>
      </form>
    </div>
  </div>
</nav>