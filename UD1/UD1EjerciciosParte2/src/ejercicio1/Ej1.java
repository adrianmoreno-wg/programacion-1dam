package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Double b, h, A, P;
		
		System.out.println("Coloque la base(b) y altura(h):");
		Scanner sc = new Scanner(System.in);
		b = sc.nextDouble();
		h = sc.nextDouble();
		
		A = b * h;
		P = 2 * (b + h);
		
		System.out.println("Area: " + A);
		System.out.println("Perimetro: " + P);
		
		sc.close();
	}

}
