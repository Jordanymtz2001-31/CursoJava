package com.mx.Polimorfismo;

// Hacemos la herencia de la clase Automovil
public class Deportivo extends Automovil{
	
	private int velocidadMaxima;
	
	//Constructor vacio
	public Deportivo() {
		super();
	}
	
	//Constructor con parametros
	public Deportivo(String marca, String modelo, int anio, int velocidadMaxima) {
		super(marca, modelo, anio);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Getters y Setters
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}
	
	//Metodo personalizado para ver el comportamiento de polimorfismo
	public String mostrarInfo() {
		return "Marca: " + marca + ",\nModelo: " + modelo + ",\nAño: " + anio + ",\nVelocidad Maxima: " + velocidadMaxima + " km/h";	
	}

	

}
