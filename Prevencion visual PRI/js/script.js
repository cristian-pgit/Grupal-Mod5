let contenedor = document.getElementById('contenedor')
const semana = ["Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"];

const dia = new Date();
let dias = semana[dia.getDay()]

const diaNum = new Date()
let diasNum = diaNum.getDay()

const meses = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

const month = new Date()
let months = meses[month.getMonth()]

const hora = new Date()
let horaAhora = hora.toLocaleTimeString('es-CL')


const annio = new Date();
let annios = annio.getFullYear()
contenedor.innerHTML = 'El dia es ' + dias + '  ' +diasNum + " del mes de " +months+ " año " +annios + ' y la hora es ' +horaAhora