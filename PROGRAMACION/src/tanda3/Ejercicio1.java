package tanda3;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		int div = 2;
		int contDiv = 2;
		System.out.println("¿Cuántos números primos quieres?");
		int n = Consola.leeInt();
		System.out.println("Escribe un número");
		int num = Consola.leeInt();
		while (n > 0) {
			while (div <= num/2 && contDiv <= 2) {
				if (num % div == 0) {
					contDiv++;
				}
				div++;
			}
			if (contDiv == 2) {
				System.out.println(num+" es primo");
				n--;
			}
			contDiv = 2;
			div = 2;
			num++;
		}
	}

}
