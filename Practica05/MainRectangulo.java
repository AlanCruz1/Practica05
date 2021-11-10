//NOMBRE: Cruz Cruz Alan Josue
//No.CUENTA: 319327133
import java.util.Scanner;
/*
 * Clase ejecutable de la clase rectángulo
 * que imprime los datos del rectángulo
 *
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * 
 * */ 
public class MainRectangulo{
	/*
	 * Métodos principal que imprime los datos del rectángulo 
	 * (base,altura,área y perímetro)
	 * @param args Los argumentos
	 * */
	public static void main(String[] args){
		//Base del rectángulo 
		double base=0;
		//Altura del rectángulo
		double altura=0;
		//Área y perímetro del rectángulo
		double area=0, perimetro=0;
		//Usamos un scanner para capturar los datos ingresados por
		//el usuario
		Scanner sc = new Scanner(System.in);
		//Creamos un objeto de la clase rectángulo el cuál tendrá 
		//los datos que ya definimos 
		Rectangulo rectangulo1 = new Rectangulo();
		//Le pedimos al usuario que ingrese el valor de la base 
		System.out.println("INGRESA LA BASE:");
		//Escaneamos el valor
		base = sc.nextDouble();
		//Le pedimos que ingrese el valor de la altura
		System.out.println("INGRESA LA ALTURA:");
		//Escaneamos el valor
		altura = sc.nextDouble();
		//Creamos otro objeto que es el que tendrá los valores 
		//ingresados por el usuario
  		Rectangulo rectangulo2 = new Rectangulo(base,altura);

		System.out.println("DATOS PREDETERMINADOS");
		//Modificamos la base 
		rectangulo1.setBase(3);
		//Imprimimos el valor de la base	
		System.out.println("base: "+rectangulo1.getBase());
		//Llamamos al valor prederteminado de la altura y la imprimimos
		System.out.println("altura: " +rectangulo1.getAltura());
		//Lo mismo pero con la altura y el perímetro
		System.out.println("area: " +rectangulo1.getArea());
		System.out.println("perimetro: "+rectangulo1.getPerimetro());
		System.out.println("TUS DATOS");
		//Usamos el método toString que imprime los datos del
		//rectángulo ingrados por el usuario, base y altura
		System.out.println(rectangulo2.toString());

	}
}
