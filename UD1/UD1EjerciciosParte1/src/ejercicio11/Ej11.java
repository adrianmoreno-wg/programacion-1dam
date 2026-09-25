package ejercicio11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		Double var1, var2;
		
		System.out.println("Escribe los euros(€) que quieres convertir en pesetas(pta):");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextDouble();
		
		var2 = var1 * 166;
		System.out.println("Tus " + var1 + " € ahora son " + var2 + " ptas");
		
		sc.close();
	}

}
