package paquete1;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num1, num2;
		char signo;
		System.out.println("Escribe un n�mero");
		num1 = Consola.leeInt();
		System.out.println("Escribe otro n�mero");
		num2 = Consola.leeInt();
		System.out.println("Escribe el signo de la operaci�n que quieras hacer (+, -, x, :)");
		signo = Consola.leeChar();
		while (signo != '+' && signo != '-' && signo != 'x' && signo != ':') {
			System.out.println("Simbolo no valido, introduce un simbolo valido (+, -, x, :):");
			signo = Consola.leeChar();
		}
		if (signo == '+') {
			System.out.println("La suma entre "+num1+" y "+num2+" es: "+ (num1+num2));
		}
		else {
			if(signo == '-') {
				System.out.println("La resta entre "+num1+" y "+num2+" es: " + (num1 - num2));
			}
			else {
				if (signo == 'x') {
					System.out.println("La multiplicaci�n entre "+num1+" y "+num2+" es: " + (num1 * num2));
				}
				else {
					while (num2==0) {
						System.out.println("El segundo n�mero introducido es 0, introduce un n�mero valido para esta operaci�n:");
						num2 = tanda2.Consola.leeInt();
					}
					System.out.println("La divisi�n entre "+num1+" y "+num2+" es: " + (num1 / num2));
				}
			}
		}
		
	}

}
