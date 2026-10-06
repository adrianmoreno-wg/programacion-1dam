package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		System.out.println("¿Cuanto has sacado en tu primera tirada?(Escribir en texto y mayusculas):");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		Integer x = null;
		Integer y = null;
		
		switch (i) {
		case "UNO":
			x = 1;
			break;
		case "DOS":
			x = 2;
			break;
		case "TRES":
			x = 3;
			break;
		case "CUATRO":
			x = 4;
			break;
		case "CINCO":
			x = 5;
			break;
		case "SEIS":
			x = 6;
			break;
		default:
			System.out.println("Error: Valor invalido");
			System.exit(0);
			break;
		}
		
		System.out.println("¿Cuanto has sacado en tu segunda tirada?:");
		i = sc.nextLine();
		
		switch (i) {
		case "UNO":
			y = 1;
			break;
		case "DOS":
			y = 2;
			break;
		case "TRES":
			y = 3;
			break;
		case "CUATRO":
			y = 4;
			break;
		case "CINCO":
			y = 5;
			break;
		case "SEIS":
			y = 6;
			break;
		default:
			System.out.println("Error: Valor invalido");
			System.exit(0);
			break;
		}
		
		Integer z = x + y;
		System.out.println(x + " + " + y + " = " + z);
		
		sc.close();
	}

}
