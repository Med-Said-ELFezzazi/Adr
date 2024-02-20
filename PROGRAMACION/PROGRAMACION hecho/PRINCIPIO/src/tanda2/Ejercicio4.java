package tanda2;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println("¿Cuántas subastas desea introducir?");
		int numeroSubastas = Consola.leeInt();
		boolean pujaMayor1000 = false;
		char bienSubastado, ofertantePujaMasAlta = 'n';
		int contPujasInferioresA100 = 0, precioPartidaMedio = 0, contPrecioPartidaMedio = 0, contPujasDoblePrecioPartida = 0, PujasDoblePrecioPartida = 0, contPujas60 = 0;
		while (numeroSubastas > 0) {
			int pujaMasAlta = 0;
			System.out.println("Bien subastado (Con una letra mayúscula):");
			bienSubastado = Consola.leeChar();
			while ((int) bienSubastado < 65 || (int) bienSubastado > 90) {
				System.out.println("Carácter no valido, introduce una mayuscula:");
				bienSubastado = Consola.leeChar();
			}
			System.out.println("¿Cuál fue el precio de partida?");
			int precioPartida = Consola.leeInt();
			System.out.println("¿Cuántos días duro?");
			int numeroDias = Consola.leeInt();
			System.out.println("¿Cuántas pujas se hicieron?");
			int numeroPujas = Consola.leeInt();
			if (numeroPujas > 10) {
				contPrecioPartidaMedio++;
				precioPartidaMedio = precioPartidaMedio + precioPartida;
			}
			int auxNumeroPujas = numeroPujas;
			while (auxNumeroPujas > 0) {
				pujaMayor1000 = false;
				System.out.println("Letra del ofertante:");
				char ofertante = Consola.leeChar();
				System.out.println("Valor de la puja");
				int valorPuja = Consola.leeInt();
				if (numeroDias < 3) {
					if (pujaMasAlta < valorPuja) {
						pujaMasAlta = valorPuja;
						ofertantePujaMasAlta = ofertante;
					}
				}
				if (valorPuja > precioPartida*2) {
					contPujasDoblePrecioPartida++;
				}
				if (valorPuja > 1000) {
					pujaMayor1000 = true;
				}
				if (valorPuja < 100) {
					contPujasInferioresA100++;					
				}
				auxNumeroPujas--;
			}
			if (pujaMayor1000 == false && contPujasInferioresA100 >= 5) {
				System.out.println("Nombre de la puja con al menos 5 pujas inferiores a 100€ y ninguna superior a 1000€: "+bienSubastado);
			}
			if (contPujasDoblePrecioPartida > 0) {
				PujasDoblePrecioPartida = (contPujasDoblePrecioPartida * 100) / numeroPujas;
			}
			if (PujasDoblePrecioPartida > 60) {
				contPujas60++;
			}
			System.out.println("El ofertante con la puja más alta es: "+ofertantePujaMasAlta);
			if (numeroDias <3) {
				System.out.println("El valor de la puja más alta es de: "+pujaMasAlta);
			}
			numeroSubastas--;
		}
		System.out.println("Subastas con un 60% de sus pujar superior al doble del precio de partida: " +contPujas60);
		if (contPrecioPartidaMedio > 0) {
			precioPartidaMedio = precioPartidaMedio / contPrecioPartidaMedio;
			System.out.println("El precio de partida medio de las subastas con más de 10 pujas es de: "+precioPartidaMedio+" su ofertante fue: "+ofertantePujaMasAlta);
		}
		
	}
}
