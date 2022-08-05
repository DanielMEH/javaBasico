package trimestre3;

import java.util.Scanner;
public class Ejercicio25 {
	
	public static void main(String[]  args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese su salario: ");
		int salario = read.nextInt();
		
		Scanner read1 = new Scanner(System.in);
		System.out.println("Aumendo: ");
		int porcentaje = read1.nextInt();
		
		int suma = salario / porcentaje;
		int aumento = suma +salario ;
		System.out.println("Aumento en un: " +aumento);
		
		
		
	}

}

