$(document).ready(function() {
	$('#save').click(function(e) {

		e.preventDefault();

		// Validar que el ID de Capacitación sea un número positivo
		let idCapacitacion = $('#idCapacitacion').val();
		if (idCapacitacion === '' || idCapacitacion <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El ID de Capacitación debe ser un número positivo.',
				footer: 'Intente de nuevo.\nSe le aconseja ver el numero de la ultima capacitacion'
			});
			return false;
		}

		// Validar que el RUT de Cliente sea un número positivo
		let rutCliente = $('#rutCliente').val();
		if (rutCliente === '' || rutCliente <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El RUT de Cliente no puede estar vacio',
				footer: 'Intente de nuevo.'
			});
			return false;
		}

		if (rutCliente.length != 8) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El RUT de Cliente debe contener 8 digitos',
				footer: 'Intente de nuevo.\nEl Rut Cliente debiera tener solo 8 digitos'
			});
			return false;
		}



		// Validar que se ha seleccionado un día
		let dia = $('#dia').val();
		console.log(dia);
		if (dia == null || dia === '' || dia === 'null') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe seleccionar un dia',
			});

			return false;
		}

		// Validar que se ha seleccionado hora
		let hora = $('#hora').val();
		console.log(hora);
		if (hora == null || hora === '' || hora === 'null') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe indicar una hora',
			});

			return false;
		}


		// Validar que la duración sea un número positivo
		let lugar = $('#lugar').val();
		if (lugar === '' || lugar <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe ingresar el lugar donde se impartira la capacitacion.',
			})
			return false;
		}


		// Validar que la duración sea un número positivo
		let duracion = $('#duracion').val();
		if (duracion === '' || duracion <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'La Duracion debe ser un valor positivo. \nPensemos de 5 min hacia arriba',
			})
			return false;
		}

		// Validar que la cantidad de asistentes sea un número positivo
		let cantAsist = $('#cantAsist').val();
		if (cantAsist === '' || cantAsist <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'La Cantidad de Asistentes debe ser un valor positivo. \nPensemos de 1 hacia arriba, o seria triste',
			})
			return false;
		}

		Swal.fire({
			title: 'Estas seguro?',
			text: "No seras capas de modificar despues",
			icon: 'warning',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			confirmButtonText: 'Yes, salvalo'
		}).then((result) => {
			if (result.isConfirmed) {
				Swal.fire(
					'Salvado!',
					'Tu Capacitacion ha sido generada.',
					'success'
				)
				Swal.fire({
					position: 'top-end',
					icon: 'success',
					title: 'La Capacitacion ha sido enviada',
					showConfirmButton: false,
					timer: 1500
				})
				$('form').submit();

			} else if (result.isDenied) {
				Swal.fire('Changes are not saved', '', 'info')
				$('form').submit.preventDefault();
			}
		});
	});

	})
