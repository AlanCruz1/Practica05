//NOMBRE: Cruz Cruz Alan Josue
//NO.CUENTA:319327133
/*
 * Clase CicloFor que imprime los números primos del 1 al 1000
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * */ 

public class CicloFor{
	/*
	 * Métodos principal que ejecuta los ciclos for que imprimirán los 
	 * números primos del 1 al 1000 
	 * @param args Los argumentos
	 * */
	public static void main(String[] args){
		/* Iterador, el número que usaremos en el seguno for
		 * y el contador
		 * */
		int i,numero,contador;
		//Inicializamos el contador en 0
		contador = 0;
		/* El primer for en el que el iterador inicia en 1 y mientras
		 * éste sea menor o igual a 0, el iterador aumentará
		 * */
		for(i = 1; i <= 1000; i++){
		/*Es importante que el iterador vuelva a ser 0 en este for
		 * porque cada vez que se repita el ciclo el contador tendrá el
		 * valor del anterior ciclo
		 * */  
			contador = 0;
		/* En el segundo for, igual, número inicia en 1 pero éste tiene
		 * que ser menor o igual a i, si se cumple, numero aumenta
		 * */
			for(numero = 1; numero <= i; numero++){
		/* Lo que hacemos aquí es dividir a i entre todos los números 
		 * anteriores a él, y también se divide entre sí mismo
		 *
		 * Usamos un if cuya condición es que el residuo de la división
		 * entre i y numero sea 0
		 * */ 
				if(i % numero == 0){
		/* Si el residuo de la división es 0 entonces el contador 
		 * aumentará en 1.
		 * */
					contador = contador + 1;
				}			
			}
		/* Un número es primo sólo si es divisible en entre 1 y sí mismo
		 * o sea, en esas divisiones tendrá de residuo 0, aspi que si 
		 * el contador es igual a 2 nos imprimirá el valor de i.
		 * */

			if(contador == 2){
				System.out.println( +i );
			}
		}
	}
}
