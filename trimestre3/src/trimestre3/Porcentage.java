package trimestre3;

import java.util.Scanner;
public class Porcentage {

	public static void main(String[] args) {
		
	    Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el precio del producto");
		float price = leer.nextFloat();
		
		 final double PORCENTAJE = 0.15; 
		 System.out.println("Precio:  " + price);
		System.out.println("Descuento del : " + (PORCENTAJE * price )+ "%");

	}

}
