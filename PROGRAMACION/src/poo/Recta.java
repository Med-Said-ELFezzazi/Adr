package poo;
public class Recta {
	int grosor;
	Punto p1, p2;
	Recta (int grosor, Punto p1, Punto p2){
		this.grosor = grosor;
		this.p1 = p1;
		this.p2 = p2;
	}
	Recta (int grosor, int x, int y, int x2, int y2){
		this.grosor = grosor;
		p1 = new Punto(x, y);
		p2 = new Punto(x2, y2);
	}
	boolean esHorizontal() {
		if (p1.y == p2.y) {
			return true;
		} else {
			return false;
		}
	}
	boolean esVertical() {
		if (p1.x == p2.x) {
			return true;
		} else {
			return false;
		}
	}
	Punto puntoMasAlto() {
		if (p1.y == p2.y) {
			return null;
		} else {
			if (p1.y > p2.y) {
				return p1;
			} else {
				return p2;
			}
		}
	}
	void ver() {
		System.out.println("La recta tiene un grosor de: "+grosor+", la recta va del punto: "+p1.x+","+p1.y+" al punto: "+p2.x+","+p2.y);
	}
	double longitud() {
		return Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)));
	}
	Recta cualEsMasLarga(Recta r) {
		if (this.longitud() == r.longitud()) {
			return null;
		} else {
			if (this.longitud()> r.longitud()) {
				return this;
			} else {
				return r;
			}
		}
	}
	public static void main(String[] args) {
		Recta r1 = new Recta(2, 6, 9, 2, 6);
		r1.ver();
		System.out.println(r1.longitud());
		Punto p1 = new Punto(3, 9);
		Punto p2 = new Punto(1, 9);
		Recta r2 = new Recta(5, p1, p2);
		if (r2.puntoMasAlto()==null) {
			System.out.println("Ambos puntos están a la misma altura");
		} else
		r2.puntoMasAlto().ver();
		if (r2.cualEsMasLarga(r1)==null) {
			System.out.println("Ambas lineas son tienen la mismo longitud");
		} else {
			r2.cualEsMasLarga(r1).ver();
		}
	}
}
