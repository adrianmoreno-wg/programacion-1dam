package ejercicio7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String opcion = null;
		Integer x = null;
		Integer y = null;
		Integer total = null;
		
		do {		
			System.out.println("Escribe dos numeros:");
			x = sc.nextInt();
			y = sc.nextInt();
			sc.nextLine();
			
			System.out.println("==================================");
			System.out.println();
			System.out.println(		"A. SUMAR LOS NUMEROS");
			System.out.println(		"B. RESTAR LOS NUMEROS");
			System.out.println(		"C. MULTIPLICAR LOS NUMEROS");
			System.out.println(		"D. DIVIDIR LOS NUMEROS");
			System.out.println(		"E. SALIR");
			System.out.println();
			System.out.println("==================================");
			System.out.println();
			
			opcion = sc.nextLine();
			
			switch (opcion.toLowerCase()) {
			case "a":
				total = x + y;
				System.out.println(x + " + " + y + " = " + total);
				break;
			case "b":
				total = x - y;
				System.out.println(x + " - " + y + " = " + total);
				break;
			case "c":
				total = x * y;
				System.out.println(x + " * " + y + " = " + total);
				break;
			case "d":
				total = x / y;
				System.out.println(x + " + " + y + " = " + total);
				break;
			case "e":
				System.out.println("Finalizando ejecucion...");
				break;
			default:
				System.out.println("Error: Opcion invalida");
				break;
			}
		} while (!opcion.equalsIgnoreCase("e"));
		
		sc.close();
	}

}
