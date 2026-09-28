package ejercicio15;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		System.out.println("Escribe los numeros a, b y c:");
		Scanner sc = new Scanner(System.in);
		Double a = sc.nextDouble();
		Double b = sc.nextDouble();
		Double c = sc.nextDouble();
		
		Double x = a + b * c;
		Double y = (a + b) * c;
		
		System.out.println("a + b * c = " + x);
		System.out.println("(a + b) * c = " + y);
		
		sc.close();
	}

}
