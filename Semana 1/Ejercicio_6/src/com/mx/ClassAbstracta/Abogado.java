package com.mx.ClassAbstracta;

// Heredamos con la palabra extends de la clase Profesionista
public class Abogado extends Profesionista {
	
	private String tipo;
	private String despacho;
	private int honorarios;
	
	// Constructor vacio
	public Abogado() {

	}
	
	// Constructor con parametros de la clase hija y de la clase padre
	public Abogado(String nombre, String apellido, String universidad, int edad, int cedula, int experiencia,
			String tipo, String despacho, int honorarios) {
		super(nombre, apellido, universidad, edad, cedula, experiencia);
		this.tipo = tipo;
		this.despacho = despacho;
		this.honorarios = honorarios;
	}
	
	// Getters y Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public int getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(int honorarios) {
		this.honorarios = honorarios;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Abogado [nombre=" + nombre + ", apellido=" + apellido + ", universidad=" + universidad + ", edad="
				+ edad + ", cedula=" + cedula + ", experiencia=" + experiencia + ", tipo=" + tipo + ", despacho="
				+ despacho + ", honorarios=" + honorarios + "]";
	}

	//Metodo abstracto que se implementa en la clase hija
	@Override
	public void trabajar() {
		// Se le da una implementacion al metodo abstracto
		System.out.println("El abogado trabaja de 5:00 pm a 7:00 pm");
		
	}

}
