package poo;
public class Circunferencia {
	String color;
	int radio;
	static int contCircun = 0;
	Circunferencia (int radio, String color
			){
		this.radio = radio;
		this.color = color;
		contCircun++;
	}
	void mostrar() {
		System.out.println("El radio es: "+radio+", y el color es: "+ color);
	}
	double area() {
		return 3.14159 * radio * radio;
	}
	void verPerim() {
		System.out.println("Perimetro: "+2 * 3.14159 * radio);
	}
	boolean esGrande(float tam) {
		if (area() > tam) {
			return true;
		} else {
			return false;
		}
	}
	boolean esIgual(Circunferencia C) {
		if (this.radio == C.radio && this.color == C.color) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Circunferencia C1 = new Circunferencia(2, "roja");
		Circunferencia C2 = new Circunferencia(10, "verde");
		C1.mostrar();
		C2.mostrar();
		if (C1.color == C2.color) {
			System.out.println("Son del mismo color");
		} else {
			System.out.println("No tienen el mismo color");
		}
		System.out.println("El área de C1 es: "+C1.area());
		System.out.println("El área de C2 es: "+C2.area());
		C1.verPerim();
		C2.verPerim();
		System.out.println(C1.esGrande(5));
		System.out.println(C2.esGrande(5));
		System.out.println(C1.esIgual(C2));
//		Circunferencia C3 = new Circunferencia();
		System.out.println(Circunferencia.contCircun);
	}
}
