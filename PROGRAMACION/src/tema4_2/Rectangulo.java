package tema4_2;

public class Rectangulo {
	Punto p1;
	int ancho;
	int alto;
	
	Rectangulo(Punto p1, int ancho, int alto) {
		this.p1 = p1;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	Rectangulo(int ancho, int alto){
		this.ancho = ancho;
		this.alto = alto;
		p1.x = 0;
		p1.y = 0;
	}
	
	Rectangulo(int ancho, int alto, int x, int y){
		this.ancho = ancho;
		this.alto = alto;
		p1.x = x;
		p1.y = y;
	}
	
	int area(Rectangulo rectangulo) {
		return rectangulo.alto * rectangulo.ancho;
	}
	
	boolean esCuadrado(Rectangulo rectangulo) {
		if (rectangulo.alto == rectangulo.ancho) {
			return true;
		} else {
			return false;
		}
	}
	static void ver(Rectangulo rectangulo) {
		if (esCuadrado(rectangulo))
			System.out.println("Ubicación: "+rectangulo.x+":"+p1.y+", área del rectangulo: "+area(rectangulo)+", es un cuadrado");
		else
			System.out.println("Ubicación: "+p1.x+":"+p1.y+", área del rectangulo: "+area(rectangulo)+", no es un cuadrado");
	}
}
