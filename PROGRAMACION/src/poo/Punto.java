package poo;

public class Punto {
	int x, y;
	Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
	int cuadrante(){
		if (this.x == 0 && this.y == 0) {
			return 0;
		}
		else {
			if (this.x > 0) {
				if (this.y > 0) {
					return 1;
				} else {
					return 4;
				}				
			} else {
				if (this.y > 0) {
					return 2;
				}
				else {
					return 3;
				}
			}
		}
	}
	void ver() {
		System.out.println("X: "+x+", Y: "+y+", Cuadrante: "+cuadrante());
	}
	public static void main(String[] args) {
		Punto p1 = new Punto(5, -9);
		p1.ver();
	}
}