package trimestre3;
import java.util.Scanner;
public class PorcentajeUsuatrio {

	public static void main(String[] args) {
		
		Scanner  imprimir = new Scanner(System.in);
		System.out.println("Ingrese su salario");
		double salario = imprimir.nextDouble();
		
		double PORCENTAJE = 25;
		 double calcular = salario * PORCENTAJE / 100;
		 double suma = salario + calcular;
		System.out.println("Precio Antiguo. " + salario);
		System.out.println("Aumento. " + calcular);
		System.out.println("Salario total:  " + suma);
		
		if(suma > 1000000) {
			
			System.out.println("Has ganado muy bien");
		}else {
			
			System.out.println("Te estan pagando mal");
		}
	}

}
