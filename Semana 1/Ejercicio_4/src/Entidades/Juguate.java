package Entidades;

public class Juguate {
	
	private int Clave; //Clave
	private String Nombre;
	private String Fabrica;
	private double Precio;
	
	public Juguate() {
	}

	public Juguate(int clave, String nombre, String fabrica, double precio) {
		Clave = clave;
		Nombre = nombre;
		Fabrica = fabrica;
		Precio = precio;
	}

	public int getClave() {
		return Clave;
	}

	public void setClave(int clave) {
		Clave = clave;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFabrica() {
		return Fabrica;
	}

	public void setFabrica(String fabrica) {
		Fabrica = fabrica;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Juguate [Clave=" + Clave + ", Nombre=" + Nombre + ", Fabrica=" + Fabrica + ", Precio=" + Precio + "]\n";
	}
}
