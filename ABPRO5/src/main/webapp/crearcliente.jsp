				<h1 class="h3 mb-3 fw-normal text-center">Especifico Cliente</h1>

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
							<option value="1">Fonasa</option>
							<option value="2">Isapre</option>
						</select>
					</div>
					<div class="form-group">
						<label class="text-center" for="direccion">Direccion: </label> <input
							type="text" class="form-control" id="direccion" required
							name="direccion">
					</div>
					<div class="form-group">
						<label class="text-center" for="comuna">Comuna: </label> <input
							type="text" class="form-control" id="comuna" required
							name="comuna">
					</div>
					<div class="form-group">
						<label class="text-center" for="edad">Edad:</label> 
						<input type="number" class="form-control" id="edad" required name="edad">
					</div>
					<br>
