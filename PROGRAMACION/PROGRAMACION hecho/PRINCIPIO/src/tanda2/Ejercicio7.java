package tanda2;

public class Ejercicio7 {
	public static void main(String[] args) {
		System.out.println("Escribe un n�mero entero positivo");
		int num = Consola.leeInt();
		while (num < 0) {
			System.out.println("El n�mero "+num+" no es un n�mero valido, introduce un n�mero entero positivo");
			num = Consola.leeInt();
		}
		int div = 2, factorizacion = 1;
		System.out.print(num+" = ");
		while (num != 1) {
			if (num % div == 0) {
				factorizacion = factorizacion * div;
				System.out.print(div);
				num = num/div;
				if (num != 1) {
					System.out.print("*");
				}
			}
			else {
				div++;
			}
			
		}
	}
}
