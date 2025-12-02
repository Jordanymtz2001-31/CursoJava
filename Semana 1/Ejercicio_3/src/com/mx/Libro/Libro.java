package com.mx.Libro;

public class Libro {
	
	private int clave;
	private String nombre;
	private String autor;
	private String editorial;
	private double precio;
	
	// Constructor de la clase
	public Libro() {
		
	}
	
	// Constructor con parametros
	public Libro(int clave, String nombre, String autor, String editorial, double precio) {
		this.clave = clave;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.precio = precio;
	}
	
	// Constructor para buscar por clave
	public Libro(int clave) {
		this.clave = clave;
	}
	
	// Getters y Setters


	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Libro [clave=" + clave + ", nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial
				+ ", precio=" + precio + "]\n";
	}
	
	
	

}
