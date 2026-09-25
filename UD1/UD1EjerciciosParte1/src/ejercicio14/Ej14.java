package ejercicio14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {

		Integer i1, i2, i3;
		
		System.out.println("Coloca la calificacion del primer, segundo y tercer trimestre:");
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		i3 = sc.nextInt();
		
		Double j1 = i1.doubleValue();
		Double j2 = i2.doubleValue();
		Double j3 = i3.doubleValue();
		
		Integer i4 = (i1 + i2 + i3) / 3;
		Double j4 = (j1 + j2 + j3) / 3;
		
		System.out.println("Boletin de clasificaciones: " + i4);
		System.out.println("Expediente academico: " + j4);
		
		sc.close();
	}

}
