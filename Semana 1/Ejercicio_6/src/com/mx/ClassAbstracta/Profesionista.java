package com.mx.ClassAbstracta;

// Aqui colocamos una clase abstract que indica que es una clase abstracta
// Que no se puede instanciar directamente sino que debe ser heredada por otras clases
public abstract class Profesionista {
	
	// Se coloca protected para que las clases hijas puedan acceder a estos atributos
	protected String nombre;
	protected String apellido;
	protected String universidad;
	protected int edad;
	protected int cedula;
	protected int experiencia;
	
	// Constructor vacio
	public Profesionista() {
		
	}
	
	// Constructor con parametros
	public Profesionista(String nombre, String apellido, String universidad, int edad, int cedula,
			int experiencia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.universidad = universidad;
		this.edad = edad;
		this.cedula = cedula;
		this.experiencia = experiencia;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	
	
	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", apellido=" + apellido + ", universidad=" + universidad + ", edad="
				+ edad + ", cedula=" + cedula + ", experiencia=" + experiencia + "]";
	}

	// Metodo concreto que puede ser utilizado por las clases hijas, no es abstracto
	public void cobrar(String trabajo, double sueldo) {
		System.out.println("Trabajo como: " + trabajo + " y gano: " + sueldo);
	}
	
	//Metodo abstracto, significa que no tiene implementacion y debe ser implementado por las clases hijas
	public abstract void trabajar();
	

}
