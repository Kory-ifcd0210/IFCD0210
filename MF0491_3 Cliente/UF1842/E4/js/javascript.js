/*factorial de un numero con funcion que se llama a sí misma*/

function factorial(n) {
  return (n != 1) ? n * factorial(n - 1) : 1;
}

alert( factorial(num) );