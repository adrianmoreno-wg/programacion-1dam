package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		System.out.println("Juguemos piedra papel o tijera, escribe uno en mayusculas:");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		Random random = new Random();
		Integer j = random.nextInt(3);
		Integer n = null;
		
		switch (i) {
		case "PIEDRA":
			n = 0;
			break;
			
		case "PAPEL":
			n = 1;
			break;
			
		case "TIJERA":
			n = 2;
		
		default:
			System.out.println("Debes escribirlo bien, vuelve a intentarlo");
			System.exit(0);
		}
		
		if (n == j) {
			System.out.println("EMPATE");
		} else if (++n == j || (n == 2 && j == 0)) {
			System.out.println("DERROTA");
		} else {
			System.out.println("VICTORIA");
		}
		
		sc.close();
	}

}
