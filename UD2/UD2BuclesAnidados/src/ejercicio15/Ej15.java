package ejercicio15;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j < N; j++) {
				if (j == i) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
