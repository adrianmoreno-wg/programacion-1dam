package ejercicio18;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 0; i < N * 2 - 1; i++) {
			for (Integer j = 0; j < 2 * N; j++) {
				if (i < N - 1) {
					if (j <= i - 1 || j > 2 * N - i - 2) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if (j < N * 2 - 2 - i || j >= i + 1) {
						System.out.print(" ");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
