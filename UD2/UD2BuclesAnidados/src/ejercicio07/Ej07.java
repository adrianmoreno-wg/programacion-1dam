package ejercicio07;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {

		System.out.println("Coloca la altura del triangulo: ");
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
		
		sc.close();
	}

}
