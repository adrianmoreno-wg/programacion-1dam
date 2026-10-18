package ejercicio2;

public class Ej2 {

	public static void main(String[] args) {

		Integer N_Inicio = 1;
		Integer N_Final = 200;
		
		do {
			if (N_Inicio % 2 == 0) {
				System.out.println(N_Inicio);
			}
			++N_Inicio;
		} while (N_Inicio <= N_Final);
	}

}
