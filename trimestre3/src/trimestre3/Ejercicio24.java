package trimestre3;

import java.util.Scanner;
public class Ejercicio24 {
	
	public static void main(String[]  args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		int salario = read.nextInt();
		int porcentaje = 25;
		int suma = salario / porcentaje;
		int aumento = suma +salario ;
		System.out.println("Aumento en un: " +aumento);
		
		
		
	}

}
