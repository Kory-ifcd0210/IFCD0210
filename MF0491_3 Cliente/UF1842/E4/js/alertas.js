//boton click aqui
window.onload = function() {
    document.getElementById('lanzar_alerta').onclick = function () {
    alert('holiiiiis :3');
    }
}
/* ALERT inicio página que funciona pero ya no voy a usar
alert("holis! :3")
*/

//Para ingresar, guardar y mostrar tu nombre en "Bienvenido"
var nombre;
nombre=prompt("Ingresa tu nombre");
//document.write(nombre);
var text = document.createTextNode(nombre); 
document.getElementById("bv").appendChild(text);
alert("Que disfrutes de tu paseo por las estrellas " + nombre);

/*agregartxt1();

function agregartxt1(){                
var text = document.createTextNode(nombre);                                    
document.getElementById("bv").appendChild(text); 
*/
