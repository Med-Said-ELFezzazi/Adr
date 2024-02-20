package tanda3;

import tanda2.Consola;

public class Ejercicio6_Serie3 {

	public static void main(String[] args) {
		System.out.println("Introduce un número de filas impar");
		int nFilas = Consola.leeInt();
		while (nFilas%2 == 0) {
			System.out.println("Error: Introduce un número de filas impar");
			nFilas = Consola.leeInt();
		}
		int contFilas = nFilas;
		int col = 1, sw = 1;
		int filaEnLaQueEstoy = 1;
		while (contFilas > nFilas/2) {
			int aux = 0;
			while (aux < contFilas-(nFilas/2)-1) {
				System.out.print("\t");
				aux++;
			}
			aux = 0;
			while (aux < col) {
				if (sw == 1) {
					System.out.print("X\t");
					sw = 0;
				} else {
					System.out.print("Y\t");
					sw = 1;
				}
				
				aux++;
			}
			col = col +2;
			System.out.print("\n");
			contFilas--;
			filaEnLaQueEstoy++;
		}
		col = col - 4;
		
		while (contFilas < nFilas) {
			int aux = 1;
			while (aux < filaEnLaQueEstoy-(nFilas/2)) {
				System.out.print("\t");
				aux++;
			}
			aux = 0;
			while (aux < col) {
				if (sw == 1) {
					System.out.print("X\t");
					sw = 0;
				} else {
					System.out.print("Y\t");
					sw = 1;
				}
				aux++;
			}
			col = col - 2;
			filaEnLaQueEstoy++;
		System.out.print("\n");
		contFilas++;
		}
	}

}
