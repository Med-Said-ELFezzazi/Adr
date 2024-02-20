package tanda2;

public class Ejercicio3 {

	public static void main(String[] args) {
		final int HombreEuropa = 179;
		final int MujerEuropa = 167;
		final int HombreAmerica = 180;
		final int MujerAmerica = 165;
		char genero, otro = 's', continente;
		int edad, estatura, alturaMaxima = 29, mediaMujeresEuropeas = 0, contMediaMujeresEuropeas = 0;
		while (otro == 's' || otro == 'S') {
			System.out.println("Introduce el genero H/M:");
			genero = Consola.leeChar();
			while (genero != 'H' & genero != 'h' && genero != 'M' & genero != 'm') {
				System.out.println("El genero ("+genero+") no es valido, Introduce un genero valido H/M: ");
				genero = Consola.leeChar();
			}
			System.out.println("Intoducr la edad (+18): ");
			edad = Consola.leeInt();
			while (edad < 18) {
				System.out.println("El edad ("+edad+") no es valida, Introduce una edad valida (+18): ");
				edad = Consola.leeInt();
			}
			System.out.println("Introduce un continente E/A: ");
			continente = Consola.leeChar();
			while (continente != 'E' & continente != 'e' && continente != 'A' & continente != 'a') {
				System.out.println("El continente ("+continente+") no es valido, Introduce un continente valido E/A: ");
				continente = Consola.leeChar();
			}
			System.out.println("Introduce una estatura en centímetros: ");
			estatura = Consola.leeInt();
			while (estatura < 30 || estatura > 250) {
				System.out.println("La estatura ("+estatura+") no es valida, Introduce una estatura valida: ");
				continente = Consola.leeChar();
			}
			// Comprobación estatura Hombre Europeo
			if ((genero == 'h' || genero == 'H') && (continente == 'E' || continente == 'e')) {
				if (estatura > HombreEuropa) {
					System.out.println("Su estatura ("+estatura+") esta por encima de la media ("+HombreEuropa+")");
				}
				else if (estatura == HombreEuropa) {
					System.out.println("Su estatura ("+estatura+") es igual que la media ("+HombreEuropa+")");
				}
				else {
					System.out.println("Su estatura ("+estatura+") esta por debajo de la media ("+HombreEuropa+")");
				}
			}
			// Comprobación estatura Mujeres Europeas
			if ((genero == 'm' || genero == 'M') && (continente == 'E' || continente == 'e')) {
				if (estatura > MujerEuropa) {
					System.out.println("Su estatura ("+estatura+") esta por encima de la media ("+MujerEuropa+")");
				}
				else if (estatura == MujerEuropa) {
					System.out.println("Su estatura ("+estatura+") es igual que la media ("+MujerEuropa+")");
				}
				else {
					System.out.println("Su estatura ("+estatura+") esta por debajo de la media ("+MujerEuropa+")");
				}
				contMediaMujeresEuropeas++;
				mediaMujeresEuropeas = mediaMujeresEuropeas + estatura;
			}
			// Comprobación estatura Hombres Americanos/Africanos
			if ((genero == 'h' || genero == 'H') && (continente == 'A' || continente == 'a')) {
				if (estatura > HombreAmerica) {
					System.out.println("Su estatura ("+estatura+") esta por encima de la media ("+HombreAmerica+")");
				}
				else if (estatura == HombreAmerica) {
					System.out.println("Su estatura ("+estatura+") es igual que la media ("+HombreAmerica+")");
				}
				else {
					System.out.println("Su estatura ("+estatura+") esta por debajo de la media ("+HombreAmerica+")");
				}
				
				if (edad >= 20 && edad <= 30) {
					if (estatura > alturaMaxima) {
						alturaMaxima = estatura;
					}
				}
			}
			// Comprobación estatura Mujeres Americanas/Africanas
			if ((genero == 'm' || genero == 'M') && (continente == 'A' || continente == 'a')) {
				if (estatura > MujerAmerica) {
					System.out.println("Su estatura ("+estatura+") esta por encima de la media ("+MujerAmerica+")");
				}
				else if (estatura == MujerAmerica) {
					System.out.println("Su estatura ("+estatura+") es igual que la media ("+MujerAmerica+")");
				}
				else {
					System.out.println("Su estatura ("+estatura+") esta por debajo de la media ("+MujerAmerica+")");
				}
			}
			System.out.println("¿Desea introducir otra estatura? S/N");
			otro = Consola.leeChar(); 
		}
		System.out.println("La estatura máxima de los hombres Americanos con edades entre 20 y 30 es de: "+alturaMaxima+ "centímetros");
		if (contMediaMujeresEuropeas > 0) {
			mediaMujeresEuropeas = mediaMujeresEuropeas / contMediaMujeresEuropeas;
			System.out.println("La estatura media de las mujeres Europeas es de: "+ mediaMujeresEuropeas+ "centímetros");
		}
	}

}
