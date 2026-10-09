package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		Integer diferencia = null;
		Integer C = null;
		
		System.out.println("Coloca dos numeros enteros:");
		Scanner sc = new Scanner(System.in);
		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		
		if (B > A) {
			diferencia = B - A;
			C = A;
		} else {
			diferencia = A - B;
			C = B;
		}
		
		System.out.println("Diferencia entre A y B: " + diferencia + " numeros");
		System.out.print("Numeros: " + C + ", ");
		
		for (Integer i = 1; i < diferencia; i++) {
			if (B > A) {
				System.out.print(++C + ", ");
			} else {
				System.out.print(++C + ", ");
			}
		}
		
		if (B > A) {
			System.out.println(B);
		} else {
			System.out.println(A);
		}
		
		sc.close();
	}

}
