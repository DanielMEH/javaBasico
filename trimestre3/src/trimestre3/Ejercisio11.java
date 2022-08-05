package trimestre3;

import java.util.Scanner;

public class Ejercisio11 {

	public static void main(String[] args) {
		
		int num1 = 3;
		int suma = 1;
		int aumentoTotal = 0;	
		while(suma <= num1) {
			
			Scanner read= new Scanner(System.in);
			System.out.println("Ingrese el " + suma + " numero");
			int numero = read.nextInt();
			aumentoTotal  = aumentoTotal  + numero;
			suma++;
		}
		
		System.out.println("La suma de los numeros son de: "+ aumentoTotal*2);

	}

}
