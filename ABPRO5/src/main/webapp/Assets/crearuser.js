$(document).ready(function() {
	$('#save').click(function(e) {
		
		e.preventDefault();

		// Validar que el ID de Usuario sea un número positivo
		let idUser = $('#idUser').val();
		if (idUser === '' || idUser <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El ID de Ususario debe ser un número positivo.',
				footer: 'Intente de nuevo.\nSe le aconseja ver el numero del ultimo usuario'
			});
			return false;
		}

		// Validar que se escriba un nombre de usuario
		let userName = $('#userName').val();
		if (userName == null || userName == '' || userName.length < 10) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe ingresar un nombre de usuario con 10 caracteres.',
			})
			return false;
		}

		// Validar que se escriba un nombre de usuario
		let password = $('#password').val();
		if (password == null || password == '' || !password.match(/^(?=.*[!@#$%^&*()_+\-=[\]{};':"\\|,.<>\/?])(?=.*[0-9]).{8,}$/)) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El password debe contener al mentos 8 digitos, y debe contener al menos un numero y un simbolo.',
			})
			return false;
		}


		// Validar que se ha selecionado una fecha de nacimiento
		let fechaNac = $('#fechaNac').val();
		console.log(fechaNac);
		if (fechaNac === '' || fechaNac === 'null') {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'Debe seleccionar un fecha de nacimiento',
			});

			return false;
		}

		// Validar que el RUT de Cliente sea un número positivo
		let run = $('#run').val();
		if (run === '' || run <= 0) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El RUN de Usuario no puede estar vacio',
				footer: 'Intente de nuevo.'
			});
			return false;
		}

		if (run.length != 8) {
			Swal.fire({
				icon: 'error',
				title: 'Oops...',
				text: 'El RUN de Usuario debe contener 8 digitos',
				footer: 'Intente de nuevo.\nEl RUN debiera tener solo 8 digitos'
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