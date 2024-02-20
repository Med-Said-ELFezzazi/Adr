package tanda3;

public class Pizarra {
	public static void main(String[] args) {
		/* 	10 9 7 4 0 4 7 9 10
			23 22 20 17 13 8 2 8 13 17 20 22 23 */
		System.out.println("Introduce un número");
		int numInicial = Consola.leeInt();
		int num = numInicial, diferencia = 1;
		System.out.print(num+" ");
		while (num-diferencia > 0) {
			num = num - diferencia;
			System.out.print(num+" ");
			diferencia++;
		}
		diferencia--;
		while (num < numInicial) {
			num = num + diferencia;
			System.out.print(num+" ");
			diferencia--;
		}
	}
}
