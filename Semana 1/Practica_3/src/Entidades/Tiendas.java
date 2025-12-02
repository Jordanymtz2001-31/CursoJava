package Entidades;

public class Tiendas {
	
	private String nombre; //Clave
	private String estado;
	private String ciudad;
	
	// Contructor vacío
	public Tiendas() {
	}
	
	// Contructor con parámetros
	public Tiendas(String nombre, String estado, String ciudad) {
		this.nombre = nombre;
		this.estado = estado;
		this.ciudad = ciudad;
	}
	
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	// toString para mostrar la información de la tienda
	@Override
	public String toString() {
		return "Tiendas [nombre=" + nombre + ", estado=" + estado + ", ciudad=" + ciudad + "]\n";
	}
	
	
	
	

}
