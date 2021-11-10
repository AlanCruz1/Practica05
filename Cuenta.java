//NOMBRE: Cruz Cruz Alan Josue
//No.CUENTA: 319327133
import java.util.Scanner;
/*
 * Clase Cuenta que representa la cuenta de una persona
 * @author Cruz Cruz Alan Josue
 * @version 11.0.11
 * */
public class Cuenta{
	/*
	 * Atributos de la clase
	 * */
	//El nombre del usuario
	private String titular;
	//Su dinero disponible 
	private double	dineroDisponible;
	
	//Constructor por omisión en el cuál asigné valores predeterminados a
	//los atributos
	public Cuenta(){
		this.titular = "Alan";
		this.dineroDisponible= 10;
	}

	/*
	 * Constructor que recibe un valor de tipo string y uno de tipo 
	 * double que representa como el nombre y el dinero disponible
	 * respectivamente
	 * @param titular El parámetro que representa el nombre del usuario
	 * @param dineroDisponible El parámetro que representa su dinero disponible
	 * */
	public Cuenta(String titular, double dineroDisponible){
		this.titular= titular;
		this.dineroDisponible= dineroDisponible;
	}
	/* 
	 * Método que devuelve el titular
	 * @return titular Titular
	 * */
	public String getTitular(){
		return this.titular;
	}
	/* 
	 * Método que modifica el titular
	 * @param titular Titular
	 * */
	public void setTitular(String nombre){
		this.titular= titular;
	}
	
	/* 
	 * Método que devuelve el dinero disponible
	 * @return dineroDisponible 
	 * */

	public double getDineroDisponible(){
		return this.dineroDisponible;
	}
	/* 
	 * Método que modifica la cantidad de dinero disponible 
	 * @param dineroDisponible El dinero disponible
	 * */

	public void setDineroDisponible(double dineroDisponible){
		this.dineroDisponible=dineroDisponible;
	}

	/*
	 * Método toString que devuelve el titular y el dinero disponible
	 * @return titular
	 * @return dineroDisponible
	 * */
	public String toString(){
	return "Titular: "+this.titular+ "   Dinero Disponible:"+this.dineroDisponible;

	}
	
	
}
