//NOMBRE: Cruz Cruz Alan Josue
//NO.CUENTA: 319327133

/*
 * Clase Bisiesto que determina si un año es bisiesto o no
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * */ 
import java.util.Scanner;
public class Condicionales {
	/*
	 * Métodos principal que ejecuta la condicional 
	 * @param args Los argumentos
	 * */
	public static void main(String[] args){
	/* Usamos un Scanner para capturar los valores que ingrese el 
	 * usuario 
	 * */
	Scanner sc = new Scanner(System.in);
	//Los dos valores que vamos a comparar
	int valor1 , valor2;
	//Imprimimos el nombre del programa	
	System.out.println("CONDICIONALES");
	//Imprimimos la indicación de ingresar un valor 1
	System.out.println("Dame el valor 1:" );
	//Escanea el valor ingresado
	valor1 = sc.nextInt();
	//Imprimimos la indicación de ingresar un valor 2
	System.out.println("Dame el valor 2:");
	//Escanea el valor ingresado 
	valor2 = sc.nextInt();

	/*Usamos un if cuya condición es que el primer valor
	 * sea mayor que el segundo valor
	 * */
	if(valor1 > valor2){
	//Si se cumple nos imprimira que el valor 1 es mayor
		System.out.println("El valor mayor es: "+valor1);
	}
	else{
	//Si se cumple nos imprimira que el valor 2 es mayor
		System.out.println("EL valor mayor es: " +valor2);
	}

	}
}
