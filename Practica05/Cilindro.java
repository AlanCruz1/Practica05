/*
 * Clase Cilindro que calcula el área y volúmen del cilindro
 *
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * 
 * */ 
public class Cilindro{
	/*
	 * Métodos principal que ejecuta las operaciones
	 * para calcular área y volumen
	 * @param args Los argumentos
	 * */
	public static void main(String[] args){
	/* Valores de tipo int: radio de la base, altura del cilindro 
	*  y la operación del radio al cuadrado
	* */	
	int radio,altura,radio_cuadrado;
	//Valores de tipo float: area y volumen del cilindro y area de la base
	float area,volumen,area_base;
	// Valor de pi
	float pi = 3.1416f;
	// Asiganción de valor del radio
	radio = 10;
	// Asiganción de valor de la altura
	altura = 20;
	// Operación que calcula el radio al cuadrado
	radio_cuadrado = radio*radio;
	//Operación que calcula el área de la base
	area_base = pi*radio_cuadrado;
	// Operación que calcula el volumen 
	volumen = area_base*altura;
	// Operación que calcula el área
       	area = 2*pi*radio*(radio+altura);
	// Imprimimos el volumen del ciolindro
	System.out.println("El volumen del cilindro es: "+ volumen +" cm cubicos");
	//Imprimimos el área del cilindro
	System.out.println("El area del cilindro es: "+ area +" cm cuadrados ");	

	}
}
