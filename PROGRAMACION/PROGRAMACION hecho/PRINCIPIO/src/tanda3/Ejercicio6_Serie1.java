package tanda3;

import tanda2.Consola;

public class Ejercicio6_Serie1 {

	public static void main(String[] args) {
		System.out.println("Introduce un número de filas");
		int nFilas = Consola.leeInt();
		int contFilas = nFilas;
		int col = 1, sw = 1;
		while (contFilas > 0) {
			int aux = 0;
			while (aux < contFilas-1) {
				System.out.print("\t");
				aux++;
			}
			aux = 0;
			while (aux < col) {
				if (sw == 1) {
					System.out.print("X\t");
				} else {
					System.out.print("Y\t");
				}
				
				aux++;
			}
			sw = sw * -1;
			col = col +2;
			System.out.print("\n");
			contFilas--;
		}
	}

}
