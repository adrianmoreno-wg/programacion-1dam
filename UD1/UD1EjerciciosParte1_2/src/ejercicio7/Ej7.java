package ejercicio7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		System.out.println("¿Cuantas entradas infantiles(15,50€) va a comprar?:");
		Scanner sc = new Scanner(System.in);
		Integer infantil = sc.nextInt();
		System.out.println("¿Cuantas entradas de adulto(20€) va a comprar?: ");
		Integer adulto = sc.nextInt();
		
		Double total = infantil * 15.5 + adulto * 20;
		
		total = total >= 100 ? total - total * 0.05 : total;
		
		System.out.println("Precio total: " + total + "€");
		
		sc.close();
	}
}
