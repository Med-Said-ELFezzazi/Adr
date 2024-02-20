package paquete1;

public class Ejercicio9 {

	public static void main(String[] args) {
		final double Cateto1 = 3;
		final double Cateto2 = 4;
		final int N = 2;
		int intento = 1;
		double numero;
		double hipotenusa;
		boolean acertado = false;
		System.out.println("Cateto1="+Cateto1+", Cateto2="+Cateto2+", introduce valor de la hipotenusa");
		numero = Consola.leeDouble();
		while (intento < N || (acertado = false)) {
			hipotenusa = Math.hypot(Cateto1, Cateto2);
			if ((numero >= hipotenusa - 0.2) && (numero <= hipotenusa + 0.2)){
				acertado = true;
			}
			else {
				System.out.println("Has fallado, intentalo de nuevo.");
				numero = Consola.leeDouble();
			}
			intento++;
		}
		if (acertado = true) {
			System.out.println("Has acertado");
		}
		else {
			System.out.println("No lo has logrado");
		}
	}

}
