//NOMBRE: Cruz Cruz Alan Josue
//No.CUENTA: 319327133

/*
 * Clase CicloDoWhile que imprime los números primos del 1 al 1000 
 * utilizando el ciclo Do While
 * @autor Cruz Cruz Alan Josue 
 * @version 11.0.11
 * */
public class CicloDoWhile{
/*
 * Métodos principal que ejecuta los ciclos do while para imprimir 
 * los números primos
 * @param args Los argumentos
 *  */
	public static void main(String[] args){
	/* Iterador
	 * numero que ocuparemos en el segundo do while y que dividirá a i
	 * */
	int i, numero;
	/* Definimos una variable tipo booleana que usaremos en el 
	  * segundo do while 
	  * */
	boolean primo = true;
	/*Inicializamos el iterador y el numeroe n 2 porque es el 
	  * primer número primo
	  * */
	i=2;
	numero=2;
	/* El primer do while contiene al segundo do while
	 * en este ciclo es dónde i aumenta su valor
	 * */
	do{
		/* El segundo do while es el que realiza las divisiones entre
		 * el iterador y el numero, cuyo valor aumenta mientras sea 
		 * menor a i.
		 * */
	 	do{
		/* Si la división tiene como residuo a cero entonces no será
		 * primo porque se dividirá entre 2 (a excepción del dos mismo)
		 * */
	 		if(i%numero==0){
				primo = false;
		/*Rompemos el ciclo para seguir con el programa
		 * */
				break;
			}
		//Numero aumenta
		numero++;	
		 }while(numero<i);
	       //Si primo es true imprime i	
		if(primo){
		System.out.println( +i);
		}
		//i aumenta
		i++;
		//le asignamos el valor de 1 a numero
		numero=2;
		//Volvemos a iniciar el valor de primo en true 
		primo= true;
	}while(i<=1000);
   }
}
