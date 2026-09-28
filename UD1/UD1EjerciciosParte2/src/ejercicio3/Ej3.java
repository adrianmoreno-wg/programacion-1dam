package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Double descuento = 15.;
		Double iva = 21.;
		
		System.out.println("Coloque el precio del producto:");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		
		Double j = i - (i * (descuento / 100));
		j = j + (j * (iva /100));
		j = Math.round(j * 100.) / 100.;
		
		
		System.out.println("El precio aplicando el descuento y el IVA es " + j);
		
		sc.close();
	}

}
