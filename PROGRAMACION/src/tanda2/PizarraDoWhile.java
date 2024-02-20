package tanda2;

public class PizarraDoWhile {

	public static void main(String[] args) {
		char resp;
		int num;
		do {
			System.out.println("A: Divisores");
			System.out.println("B: Primo");
			System.out.println("C: Salir");
			resp = Consola.leeChar();
			if (resp != 'A' && resp != 'B' && resp != 'C' && resp != 'a' && resp != 'b' && resp != 'c') {
				System.out.println("Opción no valida");
			}
			else if (resp == 'A' || resp == 'a'){
				System.out.println("Escribe un número para ver sus divisores");
				num = Consola.leeInt();
				System.out.println("Los divisores de "+num+" son: ");
				for (int i = 1; i <=num/2; i++) {
					if (num%i == 0) {
						System.out.println(i);
					}
				}
				System.out.println(num);
			}
			else if (resp == 'B' || resp == 'b') {
				System.out.println("Introduce un número para ver si es primo");
				num = Consola.leeInt();
				boolean primo = true;
				int cont = 2;
//				for (cont = 2; cont<=num/2 && primo; cont++){}
				
				while (cont <= num/2 && primo) {
					if (num % cont == 0) {
						primo = false;
					}
					cont++;
				}
				if (primo){
					System.out.println("Es primo");
				}
				else {
					System.out.println("No es primo");
				}
			}
		} while (resp != 'c' && resp != 'C');
	}

}
