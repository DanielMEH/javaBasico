package trimestre3;

import java.util.Scanner;
public class TrabajoHoras {
	
	public static void main(String[]  args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese la horas trabajadas");
		int hours = read.nextInt();
		int price = 3000;
		int aumento = 0;
		int total = 0;
		for (int i = 0; i <= hours; i++) {
			aumento = i;
			total = aumento * price;
		}
		
		System.out.println("Horas trabajadas: " + hours);
		System.out.println("Tu pago es de: " + total);
	
		if(total < 25) {
			System.out.println("Ganaste muy poquito");
		}else {
			System.out.println("Ganaste muy bien ");
		}
	}

}
