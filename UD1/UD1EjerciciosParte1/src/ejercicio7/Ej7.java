package ejercicio7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		String var1, var2, var3;
		
		System.out.println("Escriba su nombre:");
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextLine();
		
		System.out.println("Escriba su direccion:");
		var2 = sc.nextLine();
		
		System.out.println("Escriba su numero de telefono:");
		var3 = sc.nextLine();
		
		System.out.print("Nombre: ");
		System.out.println(var1);
		System.out.print("Direccion: ");
		System.out.println(var2);
		System.out.print("Telefono: ");
		System.out.print(var3);
		
		sc.close();
	}

}
