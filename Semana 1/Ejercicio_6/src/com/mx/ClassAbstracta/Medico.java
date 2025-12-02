package com.mx.ClassAbstracta;

public class Medico extends Profesionista {
	
	private String especialidad;
	private String consultorio;
	private int costoConsulta;
	
	// Constructor vacio
	public Medico() {

	}
	
	// Constructor con parametros de la clase hija y de la clase padre
	public Medico(String nombre, String apellido, String universidad, int edad, int cedula, int experiencia,
			String especialidad, String consultorio, int costoConsulta) {
		super(nombre, apellido, universidad, edad, cedula, experiencia);
		this.especialidad = especialidad;
		this.consultorio = consultorio;
		this.costoConsulta = costoConsulta;
	}
	
	// Getters y Setters
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}

	public int getCostoConsulta() {
		return costoConsulta;
	}

	public void setCostoConsulta(int costoConsulta) {
		this.costoConsulta = costoConsulta;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", apellido=" + apellido + ", universidad=" + universidad + ", edad="
				+ edad + ", cedula=" + cedula + ", experiencia=" + experiencia + ", especialidad=" + especialidad
				+ ", consultorio=" + consultorio + ", costoConsulta=" + costoConsulta + "]";
	}

	//Metodo abstracto que se implementa en la clase hija
	@Override
	public void trabajar() {
		// Se le da una implementacion al metodo abstracto
		System.out.println("El medico trabaja de 8:00 am a 3:00 pm");
	}

}
