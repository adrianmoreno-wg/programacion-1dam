package ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer N_Inicio = 1;
		final Integer N_Final;
		Integer total = 0;

		System.out.println("Escribe un numero: ");
		N_Final = sc.nextInt();

		do {
			if (N_Inicio < N_Final) {
				System.out.print(N_Inicio + " + ");
			} else {
				System.out.print(N_Inicio + " = ");
			}
			total += N_Inicio++;
		} while (N_Inicio <= N_Final);

		System.out.print(total);
		
		sc.close();
	}

}
