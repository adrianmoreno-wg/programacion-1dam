package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Integer var1, var2;
		
		System.out.println("Coloca el año actual:");
		
		Scanner sc = new Scanner(System.in);
		var1 = sc.nextInt();
		
		System.out.println("Ahora coloca la fecha en que naciste");
		var2 = sc.nextInt();
		
		System.out.print("Tienes ");
		System.out.println(var1 - var2);
		
		sc.close();
	}
}
