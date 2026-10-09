package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		final Integer N = 5; 
		
		System.out.println("Coloca 5 notas: ");
		Scanner sc = new Scanner(System.in);
		
		for (Integer i = 0; i < N; i++) {
			Integer n = sc.nextInt();
			if (n < 0 || n > 10) {
				System.out.println("Error: Nota incorrecta");
				System.exit(0);
			} else if (n < 5) {
				System.out.println("Tienes suspensos");
				System.exit(0);
			}
		}
		
		System.out.println("No tienes nada suspendido");
		
		sc.close();
	}

}
