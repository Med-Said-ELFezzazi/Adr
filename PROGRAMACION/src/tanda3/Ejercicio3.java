package tanda3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Introduce un n�mero positivo");
		int a = Consola.leeInt();
		while (a <= 0) {
			System.out.println("N�mero no valido, introduce un n�mero positivo");
			a = Consola.leeInt();
		}
		System.out.println("Introduce otro n�mero positivo");
		int b = Consola.leeInt();
		while (b <= 0) {
			System.out.println("N�mero no valido, introduce un n�mero positivo");
			b = Consola.leeInt();
		}
		if (a%b == 0) {
			System.out.println("El m�ximo com�n divisor de "+a+" y "+b+" es: "+b);
		}
		else {
			int auxB = b;
			int r = a%b;
			while (r != 0) {
				if (b%r == 0) {
					System.out.println("El m�ximo com�n divisor de "+a+" y "+auxB+" es: "+r);
					r = 0;
				}
				else {
					r = b%r;
				}
			}
		}
		
	}

}
