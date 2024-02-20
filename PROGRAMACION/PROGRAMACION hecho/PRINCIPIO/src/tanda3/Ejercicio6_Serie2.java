package tanda3;

public class Ejercicio6_Serie2 {

	public static void main(String[] args) {
		System.out.println("Introduce un número de filas impar");
		int nFilas = Consola.leeInt();
		while (nFilas%2 == 0) {
			System.out.println("Error: Introduce un número de filas impar");
			nFilas = Consola.leeInt();
		}
		int contFilas = 1;
		int tab = 0;
		int resta = 1;
		while (contFilas <= nFilas/2) {
			for (int j = tab; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (int j = 1; j <= nFilas - resta; j++) {
				System.out.print(" ");
			}
			resta = resta + 2;
			System.out.print(" X");
			contFilas++;
			tab++;
			System.out.print("\n");
		}
		for (int j = tab; j > 0; j--) {
			System.out.print(" ");
		}
		System.out.print(" X");
		System.out.print("\n");
		contFilas++;
		tab--;
		resta = resta - 2;
		while (contFilas <= nFilas) {
			for (int j = tab; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (int j = 1; j <= nFilas - resta; j++) {
				System.out.print(" ");
			}
			resta = resta - 2;
			System.out.print(" X");
			contFilas++;
			tab--;
			System.out.print("\n");
		}
	}
}
