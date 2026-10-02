package ejercicio3;

public class Ej3 {

	public static void main(String[] args) {

		Integer aa = 2100;
		Integer mm = 2;
		Integer dd = null;
		
		if (mm == 2) {
			Boolean i = (aa % 4 == 0 && aa % 10 == 1) || aa % 400 == 0;
			if (i == true) {
				dd = 29;
			} else {
				dd = 28;
			}
		} else if(mm > 12 || mm < 1) {
			System.out.println("Escribe los meses bien");
			System.exit(0);
		} else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
			dd = 31;
		} else {
			dd = 30;
		}
		
		System.out.println("El mes " + mm + " del año " + aa + " tiene " + dd + " dias");
	}

}
