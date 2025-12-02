package Bebidas;


public class Bebidas {
	
	private String marca;
	private double precio;
	private String tipo;
	private String sabor;
	
	// Constructor
	public Bebidas() {
		
	}
	
	// Constructor parametrizado
	public Bebidas(String marca, double precio,  String tipo, String sabor) {
		this.marca = marca;
		this.precio = precio;
		this.tipo = tipo;
		this.sabor = sabor;
	}
	
	// Metodos get y set

	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Bebidas [ marca=" + marca + ", precio=" + precio 
				+ ", tipo=" + tipo + ", sabor=" + sabor + " ]";
	}

	// Metodo equals para comparar objetos de tipo Bebidas por su marca (ignorando mayusculas y minusculas)
	// El equals se usa para comparar objetos
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Bebidas bebida = (Bebidas) obj;
	    return marca.equalsIgnoreCase(bebida.marca);
	}
	    
	// Metodo hashCode para generar un codigo hash basado en la marca en minusculas
	@Override
	public int hashCode() {
	    return marca.toLowerCase().hashCode();
	}

}
