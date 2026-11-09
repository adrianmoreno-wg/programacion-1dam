package _test;

import java.util.List;

import oferta3x2.Oferta3x2;

public class Oferta3x2Test {

	public static void main(String[] args) {
//		Entradas y salidas:
//			40, 35, 30, 25, 20, 15, 10 --> 25
//		
//			50, 10, 30 ------------------> 10
//		
//			25, 20 ----------------------> 0
		
		List<Integer> precios1 = List.of(40, 35, 30, 25, 20, 15, 10);
		List<Integer> precios2 = List.of(50, 10, 30);
		List<Integer> precios3 = List.of(25, 20);
		
		System.out.println(Oferta3x2.oferta(precios1));
		System.out.println(Oferta3x2.oferta(precios2));
		System.out.println(Oferta3x2.oferta(precios3));
	}

}
