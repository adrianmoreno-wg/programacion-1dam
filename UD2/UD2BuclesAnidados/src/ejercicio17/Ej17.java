package ejercicio17;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {

		System.out.println("Coloca un numero: ");
		Scanner sc = new Scanner(System.in);
		Integer N = sc.nextInt();
		
		for (Integer i = 0; i < N; i++) {
			for (Integer j = 0; j <= i; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
