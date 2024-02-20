package paquete1;

public class Ejercicio8 {

	public static void main(String[] args) {
		final double Cateto1 = 3;
		final double Cateto2 = 4;
		double numero;
		double hipotenusa;
		System.out.println("Cateto1="+Cateto1+", Cateto2="+Cateto2+", introduce valor de la hipotenusa");
		numero = Consola.leeDouble();
		hipotenusa = Math.hypot(Cateto1, Cateto2);
		if ((numero >= hipotenusa - 0.2) && (numero <= hipotenusa + 0.2)){
			System.out.println("Has acertado");
		}
		else {
			System.out.println("Has fallado");
		}
	}

}
