package ejercicio6;

// Corregir switch -> Solo pilla valores en mayusculas
// No deja finalizar S/N

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jugador1;
		Integer j1 = null;
		String jugador2;
		Integer j2 = null;
		String repetir = "Null";
		Boolean finEjecucion = false;

		// Obtener valores del usuario hasta conseguir una de las tres opciones.

		System.out.println("¡Piedra, papel o tijeras!");

		do {
			System.out.println("Jugador 1: PIEDRA, PAPEL o TIJERAS");
			jugador1 = sc.nextLine();

			while (!jugador1.equalsIgnoreCase("PIEDRA") && !jugador1.equalsIgnoreCase("PAPEL") && !jugador1.equalsIgnoreCase("TIJERAS")) {
				System.out.println("Jugador 1: PIEDRA, PAPEL o TIJERAS");
				jugador1 = sc.nextLine();
			}
			System.out.println("Jugador 2: PIEDRA, PAPEL o TIJERAS");
			jugador2 = sc.nextLine();

			while (!jugador2.equalsIgnoreCase("PIEDRA") && !jugador2.equalsIgnoreCase("PAPEL") && !jugador2.equalsIgnoreCase("TIJERAS")) {
				System.out.println("Jugador 2: PIEDRA, PAPEL o TIJERAS");
				jugador2 = sc.nextLine();
			}

			// Pasar valores String a Integer para compararlos facilmente.

			switch (jugador1) {
			case "PIEDRA":
				j1 = 0;
				break;
			case "PAPEL":
				j1 = 1;
				break;
			case "TIJERAS":
				j1 = 2;
				break;
			}

			switch (jugador2) {
			case "PIEDRA":
				j2 = 0;
				break;
			case "PAPEL":
				j2 = 1;
				break;
			case "TIJERAS":
				j2 = 2;
				break;
			}

			// Mostrar resultados + Opcion de repetir el bucle

			if ((j1 == 0 && j2 == 2) || j1 > j2) {
				System.out.println("¡Jugador 1 ha ganado!");
				System.out.println("¿Quieres volver a jugar?(S/N)");

				while (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N")) {
					repetir = sc.nextLine();

					switch (repetir) {
					case "S":
						break;

					case "N":
						finEjecucion = true;
						break;

					default:
						System.out.println("Error: Opcion Invalida");
						break;
					}
				}
			} else if (j1 == j2) {
				System.out.println("¡Empate! Volved a jugar");
			} else {
				System.out.println("¡Jugador 2 ha ganado!");
				System.out.println("¿Quieres volver a jugar?(S/N)");

				while (!repetir.equalsIgnoreCase("S") && !repetir.equalsIgnoreCase("N")) {
					repetir = sc.nextLine();

					switch (repetir) {
					case "S":
						break;

					case "N":
						finEjecucion = true;
						break;

					default:
						System.out.println("Error: Opcion Invalida");
						break;
					}
				}
			}
		} while (finEjecucion == false);

		sc.close();
	}

}
