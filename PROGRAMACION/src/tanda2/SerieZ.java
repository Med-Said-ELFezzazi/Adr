package tanda2;

public class SerieZ {

	public static void main(String[] args) {
		int numFilas;
		System.out.println("Introduce el n�mero de filas que desea (Superior a 2)");
		numFilas = Consola.leeInt();
		while (numFilas <= 2) {
			System.out.println("El n�mero "+numFilas+ " no es un n�mero valido, introduce un n�mero superior a 2");
			numFilas = Consola.leeInt();
		}
		int contFilas = numFilas;
		int columna;
		while (contFilas >= 0) {
			if (contFilas == numFilas || contFilas == 0) {
				int zDibujadasPrimeraYUltimaFila = numFilas;
				while (zDibujadasPrimeraYUltimaFila > 0) {
					System.out.print("Z");
					zDibujadasPrimeraYUltimaFila--;
				}
				contFilas = contFilas - 1;
			}
			else {
				columna = contFilas;
				while (columna > 0) {
					System.out.print(" ");
					columna--;
				}
				System.out.print("Z");
			}
			contFilas--;
			System.out.println();
		}
	}

}
