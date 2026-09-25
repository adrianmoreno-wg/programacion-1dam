package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Double var1, var2, var3;
		
		System.out.println("Coloca las dos notas que quieres calculas la media:");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextDouble();
		var2 = sc.nextDouble();
		var3 = (var1 + var2) / 2;
		
		System.out.print("La nota media es de: ");
		System.out.print(var3);
		
		sc.close();
	}

}
