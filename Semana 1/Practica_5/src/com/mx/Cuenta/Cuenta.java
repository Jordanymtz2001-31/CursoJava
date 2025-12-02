package com.mx.Cuenta;

public class Cuenta {
	private String titular;
	private double saldo;

	//Constructor vacio
	public Cuenta() {
	}
	
	//Constructor con parámetros
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		if (saldo < 0) {
			System.out.println("Error: El saldo no puede ser menor a 0. Saldo inicializado en 0");
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
	}
	
	// Getters y Setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Error: El saldo no puede ser menor a 0");
		} else {
			this.saldo = saldo;
		}
	}

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		} else {
			System.out.println("Error: La cantidad a depositar debe ser mayor a 0");
		}
	}

	/*
	 * public void retirar(double cantidad) { if (cantidad > 0 && (saldo - cantidad)
	 * >= 0) { saldo -= cantidad; } else if (cantidad <= 0) {
	 * System.out.println("Error: La cantidad a retirar debe ser mayor a 0"); } else
	 * {
	 * System.out.println("Error: No hay suficiente saldo para realizar el retiro");
	 * } }
	 */

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//Metodo para mostrarinfo
	public void mostrarInfo() {
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
	}


	
	
	
}
