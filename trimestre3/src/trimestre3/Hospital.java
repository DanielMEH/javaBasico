package trimestre3;
import java.util.Scanner;

public class Hospital {
	
	public static void main(String[]  args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese los dias que estubo en el hospital");
		int hours = read.nextInt();
		
		int items = 0;
		int tratamiento = 2000000;
		int calcular=0;
		//Do while
		 do {
			int day = 100000;
			int medicamentos = 28000;
			calcular += day +medicamentos ;
			items++;
			
		}while(items < hours);
		
		
		calcular = calcular+ tratamiento;
		System.out.println("Total a pagar: " + calcular);
	}
	
	

}
