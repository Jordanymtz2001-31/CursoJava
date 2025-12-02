package com.mx.Polimorfismo;

// Hacemos la herencia de la clase Automovil
public class Turismo extends Automovil{
	
	private int numeroHacientos;
	
	//Constructor vacio
	public Turismo() {
	
	}
	
	//Constructor con parametros
	public Turismo(String marca, String modelo, int anio, int numeroHacientos) {
		super(marca, modelo, anio);
		this.numeroHacientos = numeroHacientos;
	}
	
	//Getters y Setters
	public int getNumeroHacientos() {
		return numeroHacientos;
	}
	
	public void setNumeroHacientos(int numeroHacientos) {
		this.numeroHacientos = numeroHacientos;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroHacientos="
				+ numeroHacientos + "]";
	}
	
	//Metodo personalizado para ver el comportamiento de polimorfismo
	public String mostrarInfo() {
		return "Marca: " + marca + ",\nModelo: " + modelo + ",\nAño: " + anio + ",\nNúmero de Hacientos: " + numeroHacientos;	
	}

}
