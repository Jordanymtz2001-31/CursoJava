package com.mx.Polimorfismo;

// Hacemos la herencia de la clase Automovil
public class Camioneta extends Automovil{
	
	private int capacidadCarga;
	
	//Constructor vacio
	public Camioneta() {
		
	}
	
	//Constructor con parametros
	public Camioneta(String marca, String modelo, int anio, int capacidadCarga) {
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
	}
	
	//Getters y Setters
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Camioneta [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", capacidadCarga="
				+ capacidadCarga + "]";
	}
	
	//Metodo personalizado para ver el comportamiento de polimorfismo
	public String mostrarInfo() {
		return "Marca: " + marca + ",\nModelo: " + modelo + ",\nAño: " + anio + ",\nCapacidad de Carga: " + capacidadCarga + " kg";	
	}

}
