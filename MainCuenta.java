//NOMBRE: Cruz Cruz Alan Josue 
//No.CUENTA: 319327133
import java.util.Scanner;
/*
 * Clase ejecutable de la clase cuenta
 * que imprime los datos de la cuenta del usuario
 *
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * 
 * */ 

public class MainCuenta{
	/*
	 * Métodos principal que ejecuta la acción de imprimir 
	 * los datos del usuario y los datos predeterminados
	 * @param args Los argumentos
	 * */

	public static void main(String[] args){
		//Nombre del usuario, o sea, titular
		String titular;
		//Su cantidad de dinero disponible
		double dineroDisponible=0;
		//Usamos un Scanner para guardar los datos ingresados por el
		//usuario
		Scanner sc = new Scanner(System.in);
		//Creamos un objeto de la clase cuenta, esta tiene los datos
		//predeterminados 
		Cuenta cuenta1 = new Cuenta();
		
		//Le pedimos al usuario que ingrese su nombre
		System.out.println("INGRESE SU NOMBRE: ");
		//Lo escaneamos
        	titular= sc.nextLine();
		/*
		 * Creamos otro objeto de la misma clase, esta cuenta 
		 * tendrá los datos ingresados por el usuario
		 * */
		Cuenta cuenta2 = new Cuenta(titular, dineroDisponible);
		//Imprimimos el titular predeterminado
		System.out.println(cuenta1.getTitular());
		//Teníamos que usar al menos una vez el método set así que 
		//use para modificar el dinero
		cuenta1.setDineroDisponible(10.00);
		//Imprimimos el dinero disponible 
		System.out.println(cuenta1.getDineroDisponible());
		//Usamos el método toString para imprimir los datos ingresados
		//por el usuario
		System.out.println(cuenta2.toString());

	}
}
