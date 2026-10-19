package ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer N_Inicio = 0;
		final Integer N_Final = 10;
		Integer N;
		Integer var = null;
		
		System.out.println("Escriba un numero:");
		N = sc.nextInt();
		
		do {
			var = ++N_Inicio * N;
			System.out.println(N + " * " + N_Inicio + " = " + var);
		} while (N_Inicio < N_Final);
		
		sc.close();
		
	}

}
