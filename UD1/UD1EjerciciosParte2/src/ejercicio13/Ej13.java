package ejercicio13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		System.out.println("Coloca una cantidad de dinero junto con sus decimales: ");
		Scanner sc = new Scanner(System.in);
		Double i = sc.nextDouble();
		
		Integer j = (int) Math.floor(i);
		Integer m = (int) Math.round((i - j) * 100);
		
		System.out.println("Numero entero: " + j);
		System.out.println("Numero decimal: " + m);
		
		sc.close();
	}

}
