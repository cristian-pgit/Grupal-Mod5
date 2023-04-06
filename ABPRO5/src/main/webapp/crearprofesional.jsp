<form action="CrearProfesional" method="post" >
<h1 class="h3 mb-3 fw-normal text-center">Especifico Profesional</h1>
	<!--<label class="text-center" for="idpro">Id Profesional: </label>
<input type="number" class="form-control" id="idpro" required name="idpro">
</div>
-->
	<div class="form-group">
		<label class="text-center" for="titulo">Titulo Profesional: </label> <input
			type="text" class="form-control" id="titulo" required name="titulo">
	</div>
	<div class="form-group">
		<label for="fechaIng">Fecha de Ingreso:</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="fechaIng" name="fechaIng"
				required>
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<button type="submit" class="btn btn-primary" id="savepro">Guardar</button>
</form>