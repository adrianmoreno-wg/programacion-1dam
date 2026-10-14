package ejercicio09;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {

		System.out.println("Coloca la altura del rombo por la mitad: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (Integer j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (Integer j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (Integer i = 0; i < N - 1; i++) {
			for (Integer j = 0; j < i + 2; j++) {
				System.out.print(" ");
			}
			for (Integer j = 0; j < 2 * (N - (i + 1)) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
