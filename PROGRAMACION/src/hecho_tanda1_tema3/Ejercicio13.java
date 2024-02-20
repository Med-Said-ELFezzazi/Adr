package paquete1;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		int dividendo, divisor, cociente = 0;
		System.out.println("Escribe el dividendo");
		dividendo = Consola.leeInt();
		System.out.println("Escribe el divisor");
		divisor = Consola.leeInt();
		while ( dividendo >= divisor) {
			dividendo = dividendo - divisor;
			cociente++;
		}
		System.out.println("Resultado: "+cociente);
		
	}
	
}