// S = Sintaxis | V = Variables | C = Console | D = Document
// O = Operadores | Ç = Condicioens | F = Funciones | R = Random
// B = Objetos

// S | En consola "" se pintan, pero '' no se pintan
// S | No es lo mismo que `` o ´´

// C | 1 | Print de JS en terminal
console.log("------ Consolas ------");
console.log("Hola mundo !");
// C | 2 | Print de una ARRAY de JS en terminal
console.log([1,2,3,4] , [5,6,7,8]);
console.log([1,2,3,4] + [5,6,7,8]);
console.log({'username' : 'ryan', 'score' : 7.45});
// C | 3 | Print de error de JS en terminal
console.error("Error de JS");

// V | 1 | Creacion de variables
console.log("------ Variables ------");
let a = 12+1; // let crea una variable sin especificar tipo
var uve = 'Var'; // var crea una varaible String - Varchar (el nombre de la variable tiene que empezar con una letra)
const PI =  3.14159;  // const crea una variable constante - no se pude modificar 
// V | 2 | Creacion de una variables propias
nombreusuario = 'Jhonas'; // or // var nombreusuario = 'Jhonas';
console.log(nombreusuario);

// O | Operaciones con transformacion de las variables
console.log("------ Operaciones ------");
// O | 1
let n1 = 10;
let n2 = 7;
console.log(n1 + n2);
// O | 2
n1 = 'Tortilla d';
n2 = 'e Patatas con Cebolla';
console.log(n1 + n2);
// O | 3
n1 = 'Daniel ';
n2 = 'Verjano ';
var apellido2 = 'Ruiz';
console.log(n1 + n2 + apellido2);
// O | 4
n1 = 100;
n2 = 200;
let r = n1 > n2;
console.log(r);
// O | 5
n2 = 90;
r = n1 > n2; // vuelvo a declarar valor de r para que se actualize
console.log(r);

// Ç | 1 | Verificar si coinciden los datos - Ejemplo de password
console.log("------ Condiciones ------");
n1 = 'Patata123';
n2 = 'Patata123';
r = n1 == n2;
if (r == true) {
    console.log('Login successful | ' + r + ' | ' + (n1 + ' - ' +n2));
}
else if (r == false) { // (r != true)
    console.log('Login error | ' + r + ' | ' + (n1 + ' - ' + n2));
}
// Ç | 2
let count = 10;
while (count > 0) {
    console.log(count);
    count = count - 1;
}
// Ç | 3
let names = ['Juan', 'Pedro', 'Sara', 'Lara'];
for (let i = 0; i < names.length; i++) {
    console.log(names[i]);
}
console.log(names[6]); // undefined
// console.log(names[0]);
// console.log(names[3]);
//console.log(names.length);

// F | 1
console.log("------ Funciones ------");
function greetings(name){ console.log('Bienvenido ' + name +'!');}
let name = 'Dani';
greetings(name);

// R | 1 | Delcaraciones multiples
console.log("------ Rnadom ------");
let a1 = 2, a2 = 'a', a3 = 'a' + 3;
// R | 2 | Alerta en pagina html
let alerta = 'Cuidado';
alert(alerta);
// R | 2.1 | Alerta con introduccion de datos en pagina html
alerta = prompt('Pon tu nombre');
alert('Hola ' + alerta + ' !');
// R | 2.2 | Anterior con problema
const Compra = (n) => {
    let din = prompt('Dinero de ${n}');
    //if (din >= 0.50 && din <= 0.75) return ('${n}: Helado de Chuche');
    if (din >= 0.50 && din <= 0.75) return alert('${n}: Helado de Chuche') && alert('Y te sobran ' + (din - 0.50));
    if (din >= 0.75 && din <= 0.90) return alert('${n}: Helado de Vainilla') && alert('Y te sobran ' + (din - 0.75)); 
    if (din >= 0.90 && din <= 1.50) return alert('${n}: Helado de Chocolate') && alert('Y te sobran ' + (din - 0.90)); 
    if (din >= 1.50) return alert('${n}: Helado de Jamon de pata negra') && alert('Y te sobran ' + (din - 1.50));     
    else return alert('${n}: No tienes suficiente dinero');
}
console.log(Compra('Dani'));
console.log(Compra('Pedro'));

// B | 1 | Objectos con constructores
let pc1 = {
    nombre: 'Intel Pro Gaming Z',
    procesador: 'Intel Proces PGZ',
    ram: '8GB',
    rom: '800GB'
};
let pc2 = ['AMD Pro Gamming X','AMD Proces PGX','8GB','850GB'];

console.log(pc1);
console.log(pc1['procesador']);
console.log(pc2);
console.log(pc2['procesador']);
document.write(pc1);
document.write(pc1['rom']);
document.write(pc2);
document.write(pc2['rom']);
let nombrePC1 = pc1['nombre'];
let procesadorPC1 = pc1['procesador'];
let ramPC1 = pc1['ram'];
let romPC1 = pc1['rom'];
console.log(nombrePC1);
document.write(nombrePC1);
let frasePC1 = `El PC1 con nombre: <b>${nombrePC1}</b> <br>
                Cuenta con el procesador: <b>${procesadorPC1}</b> <br>
                Una memoria RAM de: <b>${ramPC1}</b> <br>
                Y una memoria ROM de: <b>${romPC1}</b>`;
console.log(frasePC1);
document.write(frasePC1);

// D | 1 | Print en un documento (en este caso en el index.html)
console.log("------ Documento ------");
document.write("Adios mundo" + "<h3> (carita triste) </h3>");