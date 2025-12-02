package Entidades;

public class Usuarios {
	
	private String nombre; // Clave primaria
	private String aPaterno;
	private String aMaterno;
	private int edad;
	
	// Constructor vacío
	public Usuarios() {
	}
	
	// Contructor con parámetros
	public Usuarios(String nombre, String aPaterno, String aMaterno, int edad) {
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.edad = edad;
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// toString para mostrar la información del usuario
	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", edad=" + edad
				+ "]\n";
	}
	
	

}
