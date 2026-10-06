package ejercicio1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		System.out.println("Escribe la nota del 0 al 10:");
		Scanner sc = new Scanner(System.in);
		Integer i = sc.nextInt();
		
		switch (i) {
		case 0: case 1: case 2: case 3: case 4:
			System.out.println("Insuficiente");
			break;
			
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7: case 8:
			System.out.println("Notable");
			break;
		case 9: case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Numero incorrecto, vuelve a intentarlo");
		}
		
		sc.close();
	}

}
