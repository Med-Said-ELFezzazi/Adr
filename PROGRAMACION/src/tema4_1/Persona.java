package tema4_1;

public class Persona {
	String nombre;
	int edad;
	char sexo;
	Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	String mostrarNombre() {
		return nombre;
	}
}

