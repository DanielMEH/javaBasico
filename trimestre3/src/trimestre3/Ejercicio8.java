package trimestre3;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		//Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido (área=(base*altura)/2).

		double num1 = 1;
		
		double acomulado= 0;
		for(int i = 0; i <num1; i++) {
			Scanner read= new Scanner(System.in);
			System.out.println("Ingrese la base: ");
			int base = read.nextInt();
			
			Scanner read2= new Scanner(System.in);
			System.out.println("Ingrese la altura: ");
			int altura = read.nextInt();
			
			acomulado = base*altura;
			
		}
		System.out.println("el area del triangulo es: "+  acomulado/2);
		
	}

}
