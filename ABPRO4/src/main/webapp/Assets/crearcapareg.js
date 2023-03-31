$(document).ready(function() {
  $('#save').click(function() {
    // Validar que el ID de Capacitación sea un número positivo
    let idCapacitacion = $('#idCapacitacion').val();
    if (idCapacitacion === '' || idCapacitacion <= 0) {
      alert('El ID de Capacitación debe ser un número positivo.');
      return false;
    }
    
    // Validar que el RUT de Cliente sea un número positivo
    let rutCliente = $('#rutCliente').val();
    if (rutCliente === '' || rutCliente <= 0) {
      alert('El RUT de Cliente debe ser un número positivo.');
      return false;
    }
    
    // Validar que se ha seleccionado un día
    let dia = $('#dia').val();
    if (dia === '') {
      alert('Debes seleccionar un día.');
      return false;
    }
    
    // Validar que la duración sea un número positivo
    let duracion = $('#duracion').val();
    if (duracion === '' || duracion <= 0) {
      alert('La duración debe ser un número positivo.');
      return false;
    }
    
    // Validar que la cantidad de asistentes sea un número positivo
    let cantAsist = $('#cantAsist').val();
    if (cantAsist === '' || cantAsist <= 0) {
      alert('La cantidad de asistentes debe ser un número positivo.');
      return false;
    }
  });
});