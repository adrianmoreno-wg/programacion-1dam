package ejercicio1;

import java.util.Scanner;

public class Ej1 {


	public static void main(String[] args) {

		System.out.println("Escriba un numero:");
		
		Scanner sc = new Scanner(System.in);
		Integer num;
		num = sc.nextInt();
		
		System.out.println(num);
		
		sc.close();
	}

}
