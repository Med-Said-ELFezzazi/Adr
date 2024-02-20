package tanda3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Introduce un número positivo");
		int a = Consola.leeInt();
		while (a <= 0) {
			System.out.println("Número no valido, introduce un número positivo");
			a = Consola.leeInt();
		}
		System.out.println("Introduce otro número positivo");
		int b = Consola.leeInt();
		while (b <= 0) {
			System.out.println("Número no valido, introduce un número positivo");
			b = Consola.leeInt();
		}
		if (a%b == 0) {
			System.out.println("El máximo común divisor de "+a+" y "+b+" es: "+b);
		}
		else {
			int auxB = b;
			int r = a%b;
			while (r != 0) {
				if (b%r == 0) {
					System.out.println("El máximo común divisor de "+a+" y "+auxB+" es: "+r);
					r = 0;
				}
				else {
					r = b%r;
				}
			}
		}
		
	}

}
