package ejercicio6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String jugador1;
		String jugador2;
		Boolean esVictoria = false;
		
		System.out.println("¡Piedra, papel o tijeras!");
		
		do {
			System.out.println("Jugador uno: PIEDRA, PAPEL o TIJERAS");
			jugador1 = sc.nextLine();
			
			switch (jugador1) {
			case "PIEDRA": case "PAPEL": case "TIJERAS":
				break;
			}
			
		} while (esVictoria = true);
		
	}

}
