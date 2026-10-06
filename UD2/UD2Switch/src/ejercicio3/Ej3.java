package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		System.out.println("Esribe dos numeros:");
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		Double z = null;
		System.out.println("A. SUMAR LOS NUMEROS");
		System.out.println("B. RESTAR LOS NUMEROS");
		System.out.println("C. MULTIPLICAR LOS NUMEROS");
		System.out.println("D. DIVIDIR LOS NUMEROS");
		String i = sc.nextLine();
		
		switch (i) {
		case "A":
			z = x + y;
			System.out.println(x + " + " + y + " = " + z);
			break;
		case "B":
			z = x - y;
			System.out.println(x + " - " + y + " = " + z);
			break;
		case "C":
			z = x * y;
			System.out.println(x + " * " + y + " = " + z);
			break;
		case "D":
			z = x / y;
			System.out.println(x + " / " + y + " = " + z);
			break;
		default:
			System.out.println("Error: Opcion invalida");
			break;
		}
		
		sc.close();
	}

}
