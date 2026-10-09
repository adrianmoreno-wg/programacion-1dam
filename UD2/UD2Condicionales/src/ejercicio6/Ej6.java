package ejercicio6;

import java.util.Scanner;

public class Ej6 {

//	Pedir al usuario el número de un mes y el año (comprobando si es o no bisiesto). Debe
//	imprimir por pantalla el número de días que tiene el mes.
	
	public static void main(String[] args) {

		Integer dd = null;
		Integer mm = null;
		Integer aa = null;
		
		System.out.println("Escribe el mes y el año: ");
		Scanner sc = new Scanner(System.in);
		mm = sc.nextInt();
		aa = sc.nextInt();
		
		if (mm < 1 || mm > 12) {
			System.out.println("Error: Mes incorrecto");
			System.exit(0);;
		} else if (mm == 2) {
			if ( aa % 400 == 0 || (aa % 4 == 0 && aa % 100 != 0)) {
				dd = 29;
			} else {
				dd = 28;
			}
		} else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			dd = 30;
		} else {
			dd = 31;
		}
		
		System.out.println("El mes " + mm + " del año " + aa + " tiene " + dd + " dias");
		
		sc.close();
	}

}
