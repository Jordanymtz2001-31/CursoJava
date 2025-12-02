package com.mx.ClasAbstracta;

// Creamos una clase abstracta Empleado
public abstract class Empleado {
	
	// Usamos private para encapsular los atributos y poder usar getters y setters
	// A diferencia de protected que permite acceso directo a las clases hijas
	// Y el private obliga a usar los metodos de acceso
	private String nombre;
	private int edad;
	private double salario;
	
	// Constructor vacio
	public Empleado() {
	}
	
	//Constructor con parametros
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}

	// Metodo abstracto
	public abstract double calcularBonificacion();
}
