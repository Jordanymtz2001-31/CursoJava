package Entidades;

public class Productos {
	
	private String nombre; //Clave
	private String categoria;
	private double precio;
	private int stock;
	
	// Contructor 
	public Productos() {
	}
	
	// Contructor con parámetros
	public Productos(String nombre, String categoria, double precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// String para mostrar la información del producto
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock
				+ "]\n";
	}
	
	
}
