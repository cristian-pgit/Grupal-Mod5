// Get a reference to the select element and the form container
const tipoSelect = document.getElementById('tipo');
const formContainer = document.getElementById('form-container');

// Listen for changes to the select element
tipoSelect.addEventListener('change', () => {
  // Get the value of the selected option
  const tipo = tipoSelect.value;

  // Send an AJAX request to get the appropriate form
  const xhr = new XMLHttpRequest();
  xhr.open('GET', `loadform.jsp?tipo=${tipo}`);
  xhr.onload = () => {
    // Hide all other forms
    const forms = document.querySelectorAll('.formulario');
    forms.forEach(form => {
      if (form.classList.contains(`formulario-${tipo}`)) {
        form.classList.add('formulario-activo');
      } else {
        form.classList.remove('formulario-activo');
      }
    });

    // Replace the content of the form container with the loaded form
    formContainer.innerHTML = xhr.response;
  };
  xhr.send();
});