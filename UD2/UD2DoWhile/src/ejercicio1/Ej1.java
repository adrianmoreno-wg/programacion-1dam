package ejercicio1;

public class Ej1 {

	public static void main(String[] args) {

		Integer N_Inicio = 0;
		Integer N_Final = 20;
		
		do {
			System.out.println(++N_Inicio);
		} while (N_Inicio != N_Final);
	}

}
