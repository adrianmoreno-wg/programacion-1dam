package ejercicio10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		System.out.println("Escribe en pantalla el año en el que quieras saber su siglo: ");
		Scanner sc = new Scanner(System.in);
		Integer anyo = sc.nextInt();
		
		Integer siglo = (anyo / 100);
		siglo = anyo % 100 == 0 ? siglo : ++siglo ;
		
		System.out.println("Ese año esta en el siglo " + siglo);
		
		sc.close();
	}

}
