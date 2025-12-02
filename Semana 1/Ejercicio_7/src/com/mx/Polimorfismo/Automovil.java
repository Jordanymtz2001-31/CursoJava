package com.mx.Polimorfismo;

public class Automovil {
	
	protected String marca;
	protected String modelo;
	protected int anio;
	
	//Constructor vacio
	public Automovil() {
		
	}
	
	//Constructor con parametros
	public Automovil(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	//Getters y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}

	//Metodo personalizado para ver el comportamiento de polimorfismo
	public String mostrarInfo() {
		return "Marca: " + marca + ",\nModelo: " + modelo + ",\nAño: " + anio;	
	}

}
