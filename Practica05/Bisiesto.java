//NOMBRE: Cruz Cruz Alan Josue
//NO.CUENTA: 319327133

/*
 * Clase Bisiesto que determina si un año es bisiesto o no
 *
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * 
 * */ 

import java.util.Scanner;
public class Bisiesto {
	/*
	 * Métodos principal que ejecuta el programa que 
	 * decide si un año es bisiesto o no
	 * @param args Los argumentos
	 * */

	public static void main(String[] args){
	/*
	 * Utilizamos un Scanner para obtener el año ingresado
	 * */
	Scanner sc = new Scanner(System.in);
		int año;
	//Le pedimos al usuario que ingrese un año para determinar si es 
	//bisiesto o no
	System.out.println("Ingresa un año para saber si es bisiesto o no: ");
	año = sc.nextInt();
	/*Usamos un condicional if que imprimirá dos respuestas dependiendo
	 * de si el año es bisiesto o no
	 *
	 * Para ser bisiesto tiene que cumplir dos condiciones principales
	 * que el residuo del año entre 4 sea 0 y que el residuo de la  división
	 * del año entre 400 sea 0 ó que el residuo de la división 
	 * entre el año y 100 sea diferente de 0. 
	 * */ 
	if((año%4 == 0)&&(año%400 == 0 || año%100 != 0)){
		//Al cumplirse las condiciones se imprimirá que el año es bisiesto
		System.out.println("EL año "+ año +" es bisiesto");
	}	
	else{
		//De forma contraria, nos imprimirá que no es bisiesto
	System.out.println("EL año "+ año +" no  es bisiesto");
	}

	}
}
