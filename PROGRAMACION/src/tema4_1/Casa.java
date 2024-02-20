package tema4_1;

public class Casa {
	String direccion;
	double superficie;
	char tipo;
	static int numInstancias;
	Casa(String direccion, double superficie, char tipo){
		this.direccion = direccion;
		this.superficie = superficie;
		this.tipo = tipo;
		numInstancias++;
		System.out.println("Instanciada la casa: "+numInstancias);
	}
	
	void mostrar() {
		String tipoPiso;
		if (tipo == 'p') {
			tipoPiso = "Piso";
		} else {
			tipoPiso = "Unifamiliar";
		}
		System.out.println(tipoPiso+" en "+direccion+", Superficie: "+superficie+" m²");
	}
	double dameImpuesto() {
		if (superficie < 60) {
			return 0;
		} else {
			if (superficie < 80) {
				return 4.5 * superficie;
			} else {
				return 5.5 * superficie;
			}
		}
	}
	boolean esVendible(){
		if (tipo == 'u') {
			return true;
		} else {
			if (superficie > 100) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	boolean esSimilar(Casa c1) {
		if ((c1.tipo == this.tipo) && (c1.superficie - superficie <= 10 && c1.superficie - superficie >= -10)) {
			return true;
		} else
			return false;
	}
	
	
	public static void main(String[] args) {
/*		Casa casa1 = new Casa();
		casa1.tipo = 'p';
		casa1.superficie = 65;
		casa1.direccion = "C/Rioja, 18";
		
		Casa casa2 = new Casa();
		casa2.tipo = 'u';
		casa2.superficie = 150;
		casa2.direccion = "C/Alava, 5";
		
		Casa casa3 = new Casa();
		casa3.tipo = 'p';
		casa3.superficie = 105.5;
		casa3.direccion = "C/Gorbea, 23"; */
		Casa casa1 = new Casa("C/Rioja, 18",65,'p');
		Casa casa2 = new Casa("C/Alava, 5",150,'u');
		Casa casa3 = new Casa("C/Gorbea",105,'p');
		// Muestro las casas
		casa1.mostrar();
		casa2.mostrar();
		casa3.mostrar();
		
		//Reduce la superficie de casa2 en 5m²
		casa2.superficie-=5;
		
		// Muestro las casas
		System.out.println();
		casa1.mostrar();
		casa2.mostrar();
		casa3.mostrar();
		
		//Muestra el impuesto a pagar por cada una de las casas
		System.out.println(casa1.dameImpuesto());
		System.out.println(casa2.dameImpuesto());
		System.out.println(casa3.dameImpuesto());
		//Muestro las casas que si son vendibles
		if (casa1.esVendible()) {
			casa1.mostrar();
		}
		if (casa2.esVendible()) {
			casa2.mostrar();
		}
		if (casa3.esVendible()) {
			casa3.mostrar();
		}
		//Muestro similitudes entre casas
		System.out.println(casa2.esSimilar(casa3));
		System.out.println(casa1.esSimilar(casa3));
		//Incremento la superficie de la casa1 en 35m²
		casa1.superficie+=35;
		System.out.println(casa1.esSimilar(casa3));
	}
}
