//NOMBRE: Cruz Cruz Alan Josue
//No.CUENTA: 319327133

/*
 * Clase CicloWhile que imprime los números primos del 1 al 1000 
 * utilizando el ciclo While
 * @autor Cruz Cruz Alan Josue 
 * @version 11.0.11
 * */
public class CicloWhile{
/*
 * Métodos principal que ejecuta los ciclos while para imprimir 
 * los números primos
 * @param args Los argumentos
 *  */
 public static void main(String[] args){
 	/* Iterador
	 * numero que ocuparemos en el segundo while y que dividirá a i
	 * */
	 int i,numero;
	 /* Definimos una variable tipo booleana que usaremos en el 
	  * segundo while 
	  * */
	 boolean primo = true;
	 /*Inicializamos el iterador y el numero en 2 porque es el 
	  * primer número primo*/
	 i=2; 
  	numero = 2;
	/* Iniciamos nuestro ciclo while el cuál se ejecutará siempre
	 * que el iterador sea menor o igual a 1000
	 * */
	 while( i <= 1000){
	/*Como en el ejercicio del ciclo for, usamos un segundo ciclo 
	 * dentro del primero que hará división de i entre todos los 
	 * números anteriores(numero) 
	 * */
	    while(numero<i){
	/* Si la división tiene como residuo a cero entonces no será
	 * primo porque se dividirá entre 2 (a excepción del dos mismo)
	 * */
		if(i%numero ==0){
		primo = false;
	/*Rompemos el ciclo para seguir con el programa
	 * */
		break;
		}
		//Número aumentará 
		numero++;	
	    }
	    //Si primo resulta true entonces nos imprimirá el valor de i
	    if(primo){
	    System.out.println( + i );
	    }
	    // i aumenta en 1
	    i++;
	    // Volvemos a inicializar el valor de numero a 2 
	    // para repetir el proceso con el sucesor de i
	    numero=2;
	    // Volvemos a inicializar el valor de primo a true
	    // para el sucesor de i
	    primo=true;
	 }
 }
}
