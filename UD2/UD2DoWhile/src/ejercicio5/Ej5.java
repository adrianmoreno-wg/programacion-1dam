package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		System.out.println("Voy a adivinar el numero que pienses. Ire proponiendo numeros y");
		System.out.println("deberas colocar si tu numero en comparacion es mayor(>), menor(<) o si es ese(=).");
		System.out.println("Cualquier otro valor acabara el programa antes de tiempo."); 
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		Boolean esIgual = false;
		String valor = null;
		Integer N = null;
		Integer N_Inicio = 0;
		Integer N_Final = 100;
		
		
		do {
			N = rd.nextInt(N_Inicio, N_Final) + 1;
			System.out.println("¿Es este tu numero?: " + N);
			valor = sc.nextLine();
			
			switch (valor) {
			case ">":
				// X Persona > N Maquina
				System.out.println("Recalculando...");
				N_Inicio = N;
				break;
				
			case "<":
				// N Maquina > X Persona
				System.out.println("Recalculando...");
				N_Final = N;
				break;
				
			case "=":
				// X Persona == N Maquina
				System.out.println("¡A la primera! Finalizando programa.");
				esIgual = true;
				break;
				
			default:
				System.out.println("Finalizando programa...");
				System.exit(0);
				break;
			}
		} while (esIgual == false);
		
		sc.close();
	}

}
