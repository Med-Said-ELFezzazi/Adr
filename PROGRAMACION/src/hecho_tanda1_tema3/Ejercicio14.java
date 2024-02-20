package paquete1;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		char masNotas= 'S';
		int nota, media = 0, contNotaMasAlta = 1, notaMasAlta = 0, contSuspensos = 0, contNotasValidas = 0, sumaNotas = 0;
		boolean NotaMenorQueTres = false;
		
		
		while (masNotas != 'N') {
			System.out.println("Intdouce la nota: ");
			nota = Consola.leeInt();
			if (nota < 0 || nota > 10) {
				System.out.println("La nota no es valida");
			}
			else {
				sumaNotas = sumaNotas + nota;
				if (nota > notaMasAlta) {
					notaMasAlta = nota;
					contNotaMasAlta = 0;					
				}
					if (nota == notaMasAlta) {
					contNotaMasAlta++;
					}
				if (nota >= 0 && nota < 5) {
					contSuspensos++;
				}
				if (nota <  3) {
					NotaMenorQueTres = true;
				}				
				contNotasValidas++;
			}
			System.out.println("¿Más notas? S/N");
			masNotas = Consola.leeChar();
		}
		media = sumaNotas / contNotasValidas;
		System.out.println("La nota media es de: "+media);
		if (notaMasAlta == 0) {
			System.out.println("La nota más alta es 0 y se repite " +(contNotaMasAlta-1) +" veces");
		}
		else
		System.out.println("La nota más alta es: "+notaMasAlta+" y se repite "+contNotaMasAlta+" veces");
		if ((contSuspensos > (20*contNotasValidas)/100) || NotaMenorQueTres || (media <6)){
			System.out.println("El Alumno ha suspendido ");
		}
	}
}