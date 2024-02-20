package tanda2;

import paquete1.Consola;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num, aux, multi = 1, deci = 0;
		boolean binario = true;
		System.out.println("Introduce un número para ver su valor en Decimal");
		num = Consola.leeInt();
		aux = num;
		while (aux > 0 && binario) {
			if (aux%10>1) {
				binario = false;
			}
			else {
				deci = deci+(aux%10*multi);
				multi = multi*2;
				aux/=10;
			}
		}
		if (binario == false) {
			System.out.println("El número introducido no es binario");
		}
		else {
			System.out.println("El valor decimal de "+num+" es "+ deci);
		}

	}

}
