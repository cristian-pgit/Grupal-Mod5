
	<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4 text-center">
				<br>
				<h1 class="h3 mb-3 fw-normal text-center">Crear Cliente</h1>

				<form action="CrearUsuario" method="post">
					<div class="form-group">
						<label class="text-center" for="rutCliente">RUT Cliente: </label> <input
							type="number" class="form-control" id="rutCliente" required
							name="rutCliente">
					</div>
					<div class="form-group">
						<label class="text-center" for="nombres">Nombres: </label> 
						<input type="text" class="form-control" id="nombres"
							required name="nombres">
					</div>
					<div class="form-group">
						<label class="text-center" for="apellidos">Apellidos: </label> 
						<input type="text" class="form-control" id="apellidos"
							required name="apellidos">
					</div>
					<div class="form-group">
						<label class="text-center" for="telefono">Telefono: </label> 
						<input type="number" class="form-control" id="telefono" required name="telefono">
					</div>
					<div class="form-group">
						<label for="afp">AFP:</label> <select class="form-control"
							id="afp" name="afp">
							<option value="novalue" disabled selected hidden>Selecciona una AFP</option>
							<option value="CUPRUM">AFP CUPRUM</option>
							<option value="Habitat">AFP Habitat</option>
							<option value="PlanVital">AFP PlanVital</option>
							<option value="ProVida">ProVida AFP</option>
							<option value="Capital">AFP Capital</option>
							<option value="Modelo">AFP Modelo</option>
							<option value="UNO">AFP Uno</option>
						</select>
					</div>
					<div class="form-group">
						<label for="publicPrivado">Sistema de Salud:</label> <select
							class="form-control" id="publicPrivado" name="publicPrivado">
							<option value="novalue" disabled selected hidden>Selecciona Sistema</option>
							<option value="cli">Fonasa</option>
							<option value="pro">Isapre</option>
						</select>
					</div>
					<div class="form-group">
						<label class="text-center" for="password">sdsdsd: </label> <input
							type="text" class="form-control" id="password" required
							name="password">
					</div>
					<div class="form-group">
						<label for="fechaNac">Fecha de Nacimiento:</label>
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" id="fechaNac"
								name="fechaNac" required>
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-th"></span>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="text-center" for="run">RUN (Rol Unico Nacional):</label> 
						<input type="number" class="form-control" id="run" required name="run">
					</div>
					<br>
					<button type="submit" class="btn btn-primary" id="save">Guardar</button>
				</form>
			</div>
			<div class="col-4"></div>
		</div>

	</div>
