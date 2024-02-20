package tema4_1;

public class SerieForma2 {
	int cont;
	SerieForma2(int cont){
		this.cont = cont;
	}
	static double sumatorio(int n) {
		double sumatorio=0;
		for (int aux = 1; aux <= n; aux++) {
			sumatorio+=aux;
		}
		return sumatorio;
	}
	
	static int factorial(int n) {
		int factorial=1;
		for (int aux = 1; aux <= n; aux++) {
			factorial*=aux;
		}
		return factorial;
	}
	
	static double serie(int cont) {
		double total = 0;
		int sw = 1;
		for (int j = 1, factorial = 1, sumatorio = 1; j<=cont; j++, factorial++, sumatorio+=2) {
			if (sw == 1) {
				total = total + (factorial(factorial)/sumatorio(sumatorio));
				System.out.println("Suma: "+total);	
				}		
			else {
				total = total - (factorial(factorial)/sumatorio(sumatorio));
				System.out.println("Resta: "+total);
				}
				sw*=-1;		
		}
		return total;
	}
	
	public static void main(String[] args) {
		SerieForma2 a = new SerieForma2(4);
		serie(a.cont);
		//System.out.println(serie(4));
		System.out.println(factorial(4));
		//System.out.println(sumatorio(7));
	}
}
