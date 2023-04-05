function displayFormFields() {
    var selectedOption = document.getElementById("tipo").value;
    if (selectedOption == "cli") {
        document.getElementById("formulario-cli").classList.remove("d-none");
        document.getElementById("formulario-pro").classList.add("d-none");
        document.getElementById("formulario-adm").classList.add("d-none");
    } else if (selectedOption == "pro") {
        document.getElementById("formulario-cli").classList.add("d-none");
        document.getElementById("formulario-pro").classList.remove("d-none");
        document.getElementById("formulario-adm").classList.add("d-none");
    } else if (selectedOption == "adm") {
        document.getElementById("formulario-cli").classList.add("d-none");
        document.getElementById("formulario-pro").classList.add("d-none");
        document.getElementById("formulario-adm").classList.remove("d-none");
    }
}
