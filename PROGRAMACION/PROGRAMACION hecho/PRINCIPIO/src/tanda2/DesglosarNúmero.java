package tanda2;

public class DesglosarNúmero {

	public static void main(String[] args) {
		// num = 389172
		// num1 = 397
		// num2 = 812
		int sw = 1, peso = 1, numImpar = 0, numPar = 0, sumaNumImpares = 0, sumaNumPares = 0;
		System.out.println("Escribe un número");
		int num = Consola.leeInt();
		while (num > 0) {
			if (sw == 1) {
				numImpar = peso * (num%10); 
				sumaNumImpares = sumaNumImpares + numImpar;
				sw++;
			} else {
				numPar = peso * (num%10); 
				sumaNumPares = sumaNumPares + numPar;
				peso = peso*10;
				sw--;
			}
			num = num/10;
		}
		System.out.println("Num1: "+sumaNumImpares);
		System.out.println("Num2: "+sumaNumPares);
	}

}
