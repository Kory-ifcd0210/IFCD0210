//Para ingresar, guardar y mostrar tu nombre en "Bienvenido"
$(document).ready(function() {
var nombre;
nombre=prompt("Ingresa tu nombre");
var text = document.createTextNode(nombre); 
document.getElementById("bv").appendChild(text);
alert("Bienvenido al mágico mundo STEAMPUNK " + nombre);
};