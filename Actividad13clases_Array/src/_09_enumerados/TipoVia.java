package _09_enumerados;

//los enumerados son un tipo especial de clase en la cual todos 
//sus obejetos estan predefinido al arrancar el programa
//Es la unica manera oficial en java de hacer los objetos
//NOMINATIVOs, es decir, los objetos tendran un nombre
//No se puede crear mas objetos que lows predefinamos,
//es decir, no podemos hacer NEW
//ES decir, no podemos hacer new en tiempo de ejecucion

//los objetos se define justo dentro de la clase 
//y se debe usar la notacion UPPER_SNAKE_CASE, los objetos
//iran separados por ','

//Esto objetos estan numerados dentro de un array
public enum TipoVia {
	CALLE,AVENIDA,PLAZA,CAÑADA_REAL,PASEO
	//calle sera la posicion 0 de array
	//avenida sera la posicion 1 del array
	//...
}
