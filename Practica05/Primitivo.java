/*
 * Clase Primitivo que imprime ñacantidad de memoria de cada variable de tipo
 * primitivo
 * @autor Cruz Cruz Alan Josue 
 * @version 11.0.11
 * */
public class Primitivo{
 /*
 * Métodos principal que imprime y ejecuta los valores primitivos junto con su
 * tamaño en bytes a través de estos
 * 
* @param args Los argumentos
*  */

	public static void main(String[] args) {
	 /*Usamos variables del tipo byte y les asignamos un valor que 
	  * representa el tamaño de los distintos tipos de datos primitivos
	  */
	byte byte_ = 1;
	byte short_ = 2;
	byte int_ = 4;
	byte long_ = 8;
        byte float_ = 4;
	byte double_ = 64;
	byte boolean_ = 1;
	byte char_ = 16;	
	
	//Imprimimos cada variable con su cantidad respectiva de bytes
		System.out.println("**Tipos primitivos**");
		System.out.println("byte: "+ byte_ +" byte");
	       	System.out.println("short: "+ short_ +" bytes");
		System.out.println("int: "+ int_ +" bytes");
		System.out.println("long: "+ long_ +" bytes");
		System.out.println("float: "+ float_ +" bytes");
		System.out.println("double: "+ double_ +" bytes");
		System.out.println("boolean: "+ boolean_ +" bit");
		System.out.println("char: "+ char_ +" bits");
}
}	
