package poo;

public class Rana {
	String nombre;
	int edad, calorias;
	static final int W = 5;
	static final int F = 10;
	static final int X = 200;
	static final int Y = 150;
	static int countYoungFrogs = 0;
	Rana(){
		edad = 0;
		calorias = 0;
		nombre = "placeholder";
		if (edad < 18) {
			countYoungFrogs++;
		}
	}
	Rana(String nombre, int edad, int calorias){
		this.nombre = nombre;
		this.edad = edad;
		this.calorias = calorias;
		if (edad < 18) {
			countYoungFrogs++;
		}
	}
	void display() {
		System.out.println("La rana "+nombre+" tiene "+edad+" años, y tiene "+calorias+ " calorias");
	}
	void birthday() {
		this.edad++;
		System.out.println("Happ Birthday "+nombre+", you're "+edad+" now" );
		if (edad == 18) {
			countYoungFrogs--;
		}
	}
	int feed(char tipo, int cantidad) {
		if (tipo == 'W' || tipo == 'w') {
			calorias = calorias + (W*cantidad);
			return calorias;
		} else {
			calorias = calorias + (F*cantidad);
			return calorias;
		}
	}
	boolean isFat() {
		if (edad >= 18) {
			if (calorias > X) {
				return true;
			} else {
				return false;
			}
		} else {
			if (calorias > Y) {
				return true;
			} else {
				return false;
			}
		}
	}
	void goToGym(int numHoras) {
		if (isFat()) {
			for (int aux = 1; aux <= numHoras && calorias-100>=0; aux++) {
				calorias = calorias-100;
				System.out.print(aux+",");
			}
			System.out.print("...hours\n");
		}
	}
	boolean compatibleCon(Rana r) {
		if (r.edad == this.edad && (r.calorias >= this.calorias-50 || r.calorias <= this.calorias+50)) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean tooManyYoungFrogs() {
		if (countYoungFrogs >= 10) {
			return true;
		} else {
			return false;
		}
	}
	static Rana ranaMasJovenDeDos(Rana r1, Rana r2) {
		if (r1.edad == r2.edad) {
			return null;
		} else {
			if (r1.edad > r2.edad) {
				return r2;
			} else {
				return r1;
			}
		}
	}	
	public static void main(String[] args) {
		Rana rana1 = new Rana("Alfred", 17, 800);
		Rana rana2 = new Rana("X", 17, 800);
		rana1.display();
		rana1.birthday();
		rana2.birthday();
		System.out.println(countYoungFrogs);
		if (ranaMasJovenDeDos(rana1, rana2) != null) {
			ranaMasJovenDeDos(rana1, rana2).display();
		} else {
			System.out.println("Las dos ranas tienen la misma edad");
		}
		/*
		rana1.display();
		rana1.birthday();
		System.out.println(rana1.isFat());
		rana1.feed('w', 0);
		rana1.goToGym(5);
		System.out.println(rana1.compatibleCon(rana2));
		rana1.display(); */
	}
}
