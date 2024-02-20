package tanda3;

import tanda2.Consola;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("Introduce el número de lineas:");
		int nFilas = Consola.leeInt();
		int contFila = 1;
		int num = 1, suma = 1, resta=0, restaInicial = 0;
		int cantNum = 1;
		while (contFila <= nFilas) {
			//Tabulaciones
			for (int j=1; j <= nFilas - contFila; j++) {
				System.out.print("\t");
			}
			// Numeros izq/medio
			for (int j=1 ; j<= cantNum/2+1; j++, suma++){
				System.out.print(num+"\t");
				num = num + suma;
			}
			// Numeros dcha
			num = num-suma+1;		
						
			for (int j=1 ; j< cantNum-contFila+1; j++, resta--){
				num = num - resta;
				System.out.print(num+"\t");
			}
			restaInicial = restaInicial + 2;
			resta = restaInicial;
			cantNum = cantNum + 2;
			System.out.println();
			contFila++;
			suma = contFila;
			num = num * contFila;
		}
	}
}