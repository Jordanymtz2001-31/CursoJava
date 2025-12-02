package com.mx.herencia;

public class Padre {
	
	//Colocamos protected para que sean protegidos
	// Y solo se puede acceder a la clase que hereda de Padre con extends
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double estatura;
	protected String nacionalidad;
	
	// Contructor vacio
	public Padre(){
		
	}
	
	public Padre(String nombre, String apellido, int edad, double estatura, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estatura = estatura;
		this.nacionalidad = nacionalidad;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	public void trabajar() {
		System.out.println("Trabajo de 7:00 am a 7:00 pm.");
	}
	
	
	
	

}
