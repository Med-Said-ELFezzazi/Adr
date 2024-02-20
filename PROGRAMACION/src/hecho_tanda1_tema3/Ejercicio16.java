package paquete1;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int num, numAnterior, cont = 10;
		boolean ordenado = true, ascendente = true, descendente = true;
		System.out.println("Escribe un número");
		num = Consola.leeInt();
		numAnterior = num;
		if (num > numAnterior) {
			descendente = false;
		}
		if (num < numAnterior) {
			ascendente = false;
		}
		while (cont > 1 && ordenado) {
			if (ascendente && ordenado) {
				if (num < numAnterior) {
					ordenado = false;
				}
			}
			if (num < numAnterior && ordenado) {
				if (num > numAnterior) {
					ordenado = true;
				}
			}
			System.out.println("Escribe un número");
			num = Consola.leeInt();
			cont--;
		}
		if (ordenado == false) {
			System.out.println("Los números estan desordenados");
		}
		else {
			if (ascendente) {
				System.out.println("Los números estan ordenados ascendentemente");
			}
			else {
				System.out.println("Los números estan ordenados descendentemente");
			}
		}
	}
}