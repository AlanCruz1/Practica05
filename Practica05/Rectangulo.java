//NOMBRE: Cruz Cruz Alan Josue
//No.CUENTA: 319327133
import java.util.Scanner;
/*
 * Clase Rectángulo que representa la base, altura, área y perímetro 
 * de un rectángulo  
 * @autor Cruz Cruz Alan Josue 
 * @version 11.0.11
 * */
public class Rectangulo{
	/* 
	 * Atributos de la clase
	 * */
	//Base del rectángulo
        private double base;
	//Altura del triáungulo
        private double altura;
	private double area, perimetro;
	//Constructor por omisión
	public Rectangulo(){
		this.base = 3;
		this.altura = 4;
	}
	/* 
	 * Constructor que recibe los valores reales 
	 * y los representa como la base y la altura
	 * de un rectángulo
	 *
	 * @param base El parámetro que representa la base
	 * @param altura El parámetro que representa la altura
	 * */
	public Rectangulo(double base,double altura){
		this.base=base;
		this.altura=altura;
	}

        /* 
	 * Metodo que devuelve la base 
	 * @return La base
	 * */
	        public double getBase(){
                return this.base;
        }
	/*
	 * Metodo que cambia el valor de la base
	 * @param base El nuevo valor de la base
	 * */
        public void setBase(double base){
                this.base=base;
        }
	/*
	 *  Metodo que regresa la altura
	 *  @return La altura
	 *  */
        public double getAltura(){
                return this.altura;
        }
	/*
	 * Metodo que cambia el valor de la altura
	 * @param altura El nuevo valor de la altura
	 * */
        public void setAltura(double altura){
                this.altura=altura;
        }
	
	/*
	 * Método que calcula el área del rectángulo
	 * @return altura*base 
	 * */
	public double getArea(){
		return this.altura*this.base;
	}
	/*
	 * Método que cambia el valor del área del rectángulo
	 * @param area Área del rectángulo	
	 * */
	public void setArea(double area){
		this.area=area;
	}

	/*
	 * Método que calcula el perímetro del rectángulo
	 * @return (2*altura)+(2*base) Perímetro del rectángulo 
	 * */

	public double getPerimetro(){
		return (2*this.altura)+(2*this.base);
	}
	/*
	 * Método que cambia el valor del perímetro del rectángulo
	 * @param perimetro Perímetro del rectángulo	
	 * */

	public void setPerimetro(double perimetro){
		this.perimetro=perimetro;
	}
	/*
	 * Metodo toString que imprime la base y altura predeterminados
	 * @return base 
	 * @return altura
	 * */
		public String toString(){
		return "Base= " +this.base+ " Altura= " +this.altura;
	}

}
