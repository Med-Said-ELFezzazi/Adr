package tanda2;

public class Ejercicio6 {

	public static void main(String[] args) {
		int num1, sumaDivisoresnum1 = 0, cont = 1, posibleNumeroAmigo = 1, sumaDivisoresPosibleNumeroAmigo = 0;
		System.out.println("Introduce un n�mero:");
		num1 = Consola.leeInt();
		while (cont <= num1/2) {
			if (num1 % cont == 0) {
				sumaDivisoresnum1 = sumaDivisoresnum1 + cont;
			}
			cont++;
		}
		while (posibleNumeroAmigo < num1) {
			cont = 1;
			while (cont <= posibleNumeroAmigo/2) {
				if (posibleNumeroAmigo % cont == 0) {
					sumaDivisoresPosibleNumeroAmigo = sumaDivisoresPosibleNumeroAmigo + cont;
				}
				cont++;
			}
			if (sumaDivisoresPosibleNumeroAmigo == num1 && sumaDivisoresnum1 == posibleNumeroAmigo){
				System.out.println(posibleNumeroAmigo);
			}
			sumaDivisoresPosibleNumeroAmigo = 0;
			posibleNumeroAmigo++;
		}
	}
}