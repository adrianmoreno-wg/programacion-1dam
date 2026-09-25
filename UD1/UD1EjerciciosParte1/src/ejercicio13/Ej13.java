package ejercicio13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		String var;
		
		System.out.println("¿Debes ir a la biblioteca?(s/n)");
		Scanner sc = new Scanner(System.in);
		var = sc.nextLine();
		
		if(var.equalsIgnoreCase("s")) {
			System.out.println("Ni te pregunto lo demas, vete a la calle");
		} else if(var.equalsIgnoreCase("n")) {
			System.out.println("Ok, ¿esta lloviendo?(s/n)");
			var = sc.nextLine();
			if (var.equalsIgnoreCase("s")) {
				System.out.println("Entonces te quedas en casa, crack");
			} else if(var.equalsIgnoreCase("n")) {
				System.out.println("¿Y has hecho los deberes?(s/n)");
				var = sc.nextLine();
				if (var.equalsIgnoreCase("s")) {
					System.out.println("Vete a la calle y no vuelvas");
				} else if (var.equalsIgnoreCase("n")) {
					System.out.println("Pues ponte a hacerlos y dejate de tonterias");
				} else {
					System.out.println("Error: Texto invalido");
				}
			} else {
				System.out.println("Error: Texto invalido");
			}
		} else {
			System.out.println("Error: Texto invalido");
		}
		sc.close();
	}

}
