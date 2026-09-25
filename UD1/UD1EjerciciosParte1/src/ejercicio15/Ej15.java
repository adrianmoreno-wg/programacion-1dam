package ejercicio15;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		Double num, total;
		Double iva = 21.;
		
		System.out.println("Coloque el precio de un articulo:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextDouble();
		
		total = num + (num * (iva / 100));
		System.out.println("El valor del producto con IVA es de " + total + "€");
		
		sc.close();
	}

}
