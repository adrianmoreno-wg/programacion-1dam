package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer x = 0;
		Integer y = 0;
		String i = null;
		
		System.out.println("¿Cuanto has sacado en tu primera tirada?(Escribir en texto):");

		do {
			i = sc.nextLine();
			
			switch (i.toLowerCase()) {
			case "uno":
				x = 1;
				break;
			case "dos":
				x = 2;
				break;
			case "tres":
				x = 3;
				break;
			case "cuatro":
				x = 4;
				break;
			case "cinco":
				x = 5;
				break;
			case "seis":
				x = 6;
				break;
			default:
				System.out.println("Error: Valor invalido");
				break;
			}
			
		} while (x < 1 || x > 6);

		i = null;
		
		System.out.println("¿Cuanto has sacado en tu segunda tirada?:");
		
		do {
			i = sc.nextLine();

			switch (i.toLowerCase()) {
			case "uno":
				y = 1;
				break;
			case "dos":
				y = 2;
				break;
			case "tres":
				y = 3;
				break;
			case "cuatro":
				y = 4;
				break;
			case "cinco":
				y = 5;
				break;
			case "seis":
				y = 6;
				break;
			default:
				System.out.println("Error: Valor invalido");
				break;
			}
			
		} while (y < 1 || y > 6);

		
		Integer z = x + y;
		System.out.println(x + " + " + y + " = " + z);
		
		sc.close();
	}

}
