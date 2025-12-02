package Entidades;

public class Fruta {
	
	private String nombre; //Clave
	private String Temporada;
	private String color;
	private double precio;
	private double peso;
	
	public Fruta() {
	}
	
	public Fruta(String nombre, String temporada, String color, double precio, double peso) {
		this.nombre = nombre;
		Temporada = temporada;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTemporada() {
		return Temporada;
	}

	public void setTemporada(String temporada) {
		Temporada = temporada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", Temporada=" + Temporada + ", color=" + color + ", precio=" + precio
				+ ", peso=" + peso + "]\n";
	}
	
	
	
	

}
