package Tanda1;

public class Pelicula {
	private String nombre;
	private int duracion;
	private int a�o;
	
	Pelicula(String nombre, int duracion, int a�o){
		this.nombre=nombre;
		this.duracion=duracion;
		this.a�o=a�o;
	}

	@Override
	public String toString() {
		return "Ejercicio1 [nombre=" + nombre + ", duracion=" + duracion + ", a�o=" + a�o + "]";
	}
	boolean esIgual() {
		return false;
	}
	
}
