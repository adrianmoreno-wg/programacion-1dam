package ejercicio04;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {

		System.out.println("Coloca la altura del triangulo: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		Integer N2 = N;

		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N2; j++) {
				System.out.print("*");
			}
			N2--;
			System.out.println();
		}

		sc.close();
	}

}
