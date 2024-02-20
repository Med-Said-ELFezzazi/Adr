package tema4_1;

public class NumCapic {
	 long num;
	 NumCapic(){
		 
	 }
	 NumCapic(long num){
		 this.num = num;
	 }
	 
	 static int cantDigitos(long num) {
		 long aux = num;
		 int cantDigitos = 0;
		 while (aux > 0) {
			 aux/=10;
			 cantDigitos++;
		 }
		 return cantDigitos;
	 }
	 
	 static long digitoEnPosicionN(int n, long numero) {
		 for (; n>1; n--) {
			 numero/=10;
		 }
		 return numero%10;
	 }
	static boolean capicua(NumCapic a) {
		 long aux = a.num;
		 long cifra, inverso = 0;
		 while (aux!=0) {
			 cifra = aux%10;
			 inverso = inverso * 10 + cifra;
			 aux/=10;
		 }
		 System.out.println("Inverso: "+inverso);
		 for (int j=1; j<=cantDigitos(a.num); j++) {
			 if (digitoEnPosicionN(j,a.num) != digitoEnPosicionN(j,inverso)) {
				 return false;
			 }
		 }
		 return true;
	}
	 
	public static void main(String[] args) {
		NumCapic a = new NumCapic(4564);
		System.out.println(capicua(a));
		System.out.println(digitoEnPosicionN(2, 123));
	}
	
}

