$(document).ready(function() {
	$('#enviar').click(function(e) {
		
		e.preventDefault();

		// Validar que el nombre de usuario no este vacio
		let fname = $('#fname').val();
		if (fname === '') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El nombre del remitente no puede estar vacio',
				footer: 'Intente de nuevo.\nSe le aconseja ingresar un nombre de usuario'
			});
			return false;
		}

		// Validar que se escriban los apellidos
		let lname = $('#lname').val();
		if (lname == null || lname == '') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'La casilla no puede estar vacio, por favor ingrese un apellido.',
			})
			return false;
		}

		// Validar que se escriba un correo electronico
		let email = $('#email').val();
		if (email == null || email == '') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'La casilla no puede quedar vacio, por favor ingrese un correo electronico valido.',
			})
			return false;
		}


		// Validar que se ha ingresado un numero telefonico
		let phone = $('#phone').val();
		console.log(phone);
		if (phone === '' || phone.length !=8) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe ingresar un numero de telefono valido (8 digitos y sin guion)',
			});

			return false;
		}
		

		// Validar que la casilla mensaje no este vacio
		let message = $('#message').val();
		if (message === '') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El mensaje no puede estar vacio',
				footer: 'Intente de nuevo.'
			});
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
					'El Usuario ha sido generado.',
					'success'
				)
				Swal.fire({
					position: 'top-end',
					icon: 'success',
					title: 'Usuario enviado',
					showConfirmButton: false,
					timer: 1500
				})
				$('form').submit();
				
			} else if (result.isDenied) {
				Swal.fire('Los datos no han sido enviados', '', 'info')
				$('form').submit.preventDefault();
			}
		});
    });
    
    })