package com.mx.Cuenta;


// Ocupamos extends para heredar de la clase Cuenta
public class CuentaAhorrro extends Cuenta{
	
	private double tasaInteres;
	
	//constructor vacio
	public CuentaAhorrro() {
		
	}
	
	//constructor con parámetros
	public CuentaAhorrro(String titular, double saldo, double tasaInteres) {
		super(titular, saldo);
		this.tasaInteres = tasaInteres;
		
	}

	// Setter y Getter
	
	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [titular=" + getTitular() + ", saldo=" + getSaldo() + ", tasaInteres=" + tasaInteres + "]";
	}
	
	//Metodo para calcular intereses
	public double calcularIntereses() {
		return getSaldo() * (tasaInteres / 100);
	}

	
}
