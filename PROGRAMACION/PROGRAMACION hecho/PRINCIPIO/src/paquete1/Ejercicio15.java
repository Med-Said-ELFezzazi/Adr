package paquete1;

public class Ejercicio15 {

	public static void main(String[] args) {
		int num, aux, contDigitos=0, suma=0;
		System.out.println("Escribe un número");
		num = Consola.leeInt();
		aux = num;
		while (num > 0) {
			suma = suma + (num%10);
			num = num/10;
			contDigitos++;
		}
		System.out.println("El número "+aux+ " tiene "+contDigitos+ " dígtos, la suma de estos es: "+suma);
	}
}