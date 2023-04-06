
<c:set var="value" value="${param.tipo}" />
<form action="CrearAdm" method="post">
<h1 class="h3 mb-3 fw-normal text-center">Especifico Administrativo</h1>
	<!-- <div class="form-group">
						<label class="text-center" for="idadm">Id Administrativo: </label> <input
							type="number" class="form-control" id=""idadm"" required
							name=""idadm"">
					</div> -->
	<div class="form-group">
		<label class="text-center" for="area">Area: </label> <input
			type="text" class="form-control" id="area" required name="area">
	</div>
	<div class="form-group">
		<label class="text-center" for="exppre">Años de Experiencia
			Previa: </label> <input type="number" class="form-control" id="exppre"
			required name="exppre">
	</div>
	<button type="submit" class="btn btn-primary" id="saveadm">Guardar</button>
</form>