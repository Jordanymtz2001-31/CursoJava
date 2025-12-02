package com.mx.herencia;

//Usamos extends para heredar de la clase Padre
public class Hijo extends Padre{
	
	private String hobbie;
	private String complexion;
	private String color_ojos;
	
	// Contructor vacio
	public Hijo() {
	}
	
	// Contructor con parámetros
	public Hijo(String nombre, String apellido, int edad, double estatura, String nacionalidad,
			String hobbie, String complexion, String color_ojos) {
		//Usamos super para llamar al constructor de la clase Padre
		super(nombre, apellido, edad, estatura, nacionalidad);
		this.hobbie = hobbie;
		this.complexion = complexion;
		this.color_ojos = color_ojos;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getColorOjos() {
		return color_ojos;
	}

	public void setColorOjos(String color_ojos) {
		this.color_ojos = color_ojos;
	}
	
	// String para mostrar la información del hijo
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura
				+ ", nacionalidad=" + nacionalidad + ", hobbie=" + hobbie + ", complexion=" + complexion
				+ ", color_ojos=" + color_ojos + "]\n";
	}

}
