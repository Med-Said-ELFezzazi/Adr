package paquete1;

public class Ejercicio11 {

	public static void main(String[] args) {
		int n;
		double resultado = 1;
		int sw = 1;
		int divisor = 3;
		System.out.println("¿Cuántos terminos quieres?");
		n = Consola.leeInt();
		while (n > 1) {
			if (sw == 1){
				resultado = resultado - (1.0/divisor);
				sw = 2;
			}
			else {
				resultado = resultado + (1.0/divisor);
				sw = 1;
			}
			divisor = divisor + 2;
		n--;
		}
		System.out.println(resultado);
	}
}