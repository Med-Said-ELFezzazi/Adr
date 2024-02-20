package Tanda1;

public class Pelicula {
	private String nombre;
	private int duracion;
	private int año;
	
	Pelicula(String nombre, int duracion, int año){
		this.nombre=nombre;
		this.duracion=duracion;
		this.año=año;
	}

	@Override
	public String toString() {
		return "Ejercicio1 [nombre=" + nombre + ", duracion=" + duracion + ", año=" + año + "]";
	}
	boolean esIgual() {
		return false;
	}
	
}
