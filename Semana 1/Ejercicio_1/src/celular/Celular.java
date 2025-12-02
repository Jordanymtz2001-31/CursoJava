package celular;

public class Celular {
	// Declarar atributos:
	
	private String marca;
	private String modelo;
	private String procesador;
	private int capacidad;
	private double precio;
	private String color;
	
	// Metodos de la clase
	
	// Contructor 
	public Celular() {
		
	}
	
	// Contructor Parametrizado
	public Celular(String marca, String modelo, String procesador, int capacidad, double precio, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.capacidad = capacidad;
		this.precio = precio;
		this.color = color;
	}
	
	// metodos get y set
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String new_marca) {
		this.marca = new_marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String new_modelo) {
		this.modelo = new_modelo;
	}
	
	public String getProcesador(){
		return this.procesador;
	}
	
	public void setProcesador(String new_procesador) {
		this.procesador = new_procesador;
	}
	
	public int getCapacidad() {
		return this.capacidad;
	}
	
	public void setCapacidad(int new_capacidad) {
		this.capacidad = new_capacidad;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double new_precio) {
		this.precio = new_precio;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String new_color) {
		this.color = new_color;
	}
	
	// Convierete las cadenas en legibles para poder visualizar en cadenas

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", capacidad="
				+ capacidad + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
		
}
