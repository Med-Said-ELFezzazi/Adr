package tema4_1;

public class CuentaBancaria {
	String titular;
	double saldo;
	boolean numerosRojos;
	Persona p1;
//	CuentaBancaria(String titular){
	CuentaBancaria(Persona p1){
//		this.titular=titular;
		this.p1 = p1;
		saldo = 0;
		numerosRojos = false;
	}
//	CuentaBancaria(String titular, double saldo){
	CuentaBancaria(Persona p1, double saldo){
		this.saldo = saldo;
//		this.titular = titular;
		this.p1 = p1;
		if (saldo < 0) {
			numerosRojos = false;
		}
	}
	
	void ingresar(double aumento) {
		saldo+=aumento;
		if (saldo >= 0) {
			numerosRojos = false;
		}
	}
	void gastar(double gasto) {
		/*		
		if (saldo-gasto < 0) {
				System.out.println("Error, no puede quedarse en números rojos");
			} else {
				saldo-=gasto;
			}
	*/	
		saldo-=gasto;
		if (saldo < 0) {
			numerosRojos = true;
		}
	}
	void ver() {
		if (saldo > 1000000) {
			System.out.println("La cuenta de "+p1.mostrarNombre()+"tiene un saldo de "+saldo+"€, ademas es una cuenta VIP");
			//System.out.println("La cuenta de "+titular+" tiene un saldo de: "+saldo+"€, ademas es una cuenta VIP");
		} else {
			System.out.println("La cuenta de "+p1.mostrarNombre()+" tiene un saldo de: "+saldo+"€");
			//System.out.println("La cuenta de "+titular+" tiene un saldo de: "+saldo+"€");
		}
	}
}

	
