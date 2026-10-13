package ejercicio03;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {

		System.out.println("Coloca la altura del triangulo: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
