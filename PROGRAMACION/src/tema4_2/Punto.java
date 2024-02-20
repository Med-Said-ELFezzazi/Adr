package tema4_2;

public class Punto {
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
	void ver() {
		System.out.println("X: "+x+", Y: "+y);
	}
}
