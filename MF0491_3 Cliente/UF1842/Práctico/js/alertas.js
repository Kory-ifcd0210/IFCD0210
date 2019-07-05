//Para ingresar, guardar y mostrar tu nombre en "Bienvenido"
var nombre;
nombre=prompt("Ingresa tu nombre");
//document.write(nombre);
var text = document.createTextNode(nombre); 
document.getElementById("bv").appendChild(text);
alert("Bienvenido al mágico mundo STEAMPUNK " + nombre);