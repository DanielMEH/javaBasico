package trimestre3;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

   System.out.println("Los productos disponibles son:  Arroz, Camisa, computador ");
	Scanner read = new Scanner(System.in);
	System.out.println("Nombre del producuto ");
	String nombre = read.next();
	
	Scanner read1 = new Scanner(System.in);
	System.out.println("La cantidad ");
	int cantidad = read1.nextInt();
	
	Scanner read2 = new Scanner(System.in);
	System.out.println("pagar: ");
	int pagar = read2.nextInt();
	
	int arroz = 3000;
	int camisa = 30000;
	int computador = 2000000;
	switch(nombre) {
	
	case("arroz"):
		
		int sumatoria =  cantidad * arroz;
	    if( pagar < sumatoria ) {
	    	System.out.println("No tienes suficiente dinero "+ pagar + " La cantidad es de: "+ sumatoria);
	    }else {
	    	
	    	double devuelta =   pagar -sumatoria;
	      	System.out.println("La compra ha sido exitosa: "+ nombre + " precio: "+ sumatoria + " devuelta de: " +  devuelta);
	    	
	    }
		
		
	break;
	case("camisa"):
		int sumatoria2 =  cantidad * camisa;
    if( pagar < sumatoria2) {
    	System.out.println("No tienes suficiente dinero "+ pagar + " La cantidad es de: "+ sumatoria2);
    }else {
    	
    	int devuelta1 =   pagar -sumatoria2;
      	System.out.println("La compra ha sido exitosa: "+ nombre + " precio: "+ sumatoria2 + " devuelta de: " +  devuelta1);
    	
    }
		break;
	case("computador"):
		int sumatoria3 =  cantidad * computador;
    if( pagar < sumatoria3) {
    	System.out.println("No tienes suficiente dinero "+ pagar + " La cantidad es de: "+ sumatoria3);
    }else {
    	
    	int devuelta3 =   pagar -sumatoria3;
      	System.out.println("La compra ha sido exitosa: "+ nombre + " precio: "+ sumatoria3 + " devuelta de: " +  devuelta3);
    	
    }
		break;
		
		default:
			System.out.println("El producto no existe");
			break;
	    	
	}
	

	}

}
