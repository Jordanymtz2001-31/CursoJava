package Flores;

public class Flores {


	// Declarar atributos:
	
	private String nombre;
	private boolean aroma;
	private double precio;
	private String color;
	
	// Metodos de la clase
	
	// Contructor 
	public Flores() {
		
	}
	
	// Contructor Parametrizado
	public Flores(String nombre, boolean aroma, double precio, String color) {
		this.nombre = nombre;
		this.aroma = aroma;
		this.precio = precio;
		this.color = color;
	}
	
	// metodos get y set
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String new_nombre) {
		this.nombre = new_nombre;
	}
	
	public boolean getAroma() {
		return this.aroma;
	}
	
	public void setAroma(boolean new_aroma) {
		this.aroma = new_aroma;
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
	
	// Convierte las cadenas en legibles para poder visualizar en cadenas
	@Override
	public String toString() {
		return "Flores [nombre=" + nombre + ", aroma=" + aroma + ", precio=" + precio + ", color=" + color + "]";
	}
	
	
	// Metodo equals para comparar objetos de tipo Flores por su nombre (ignorando mayusculas y minusculas)
	// El equals se usa para comparar objetos
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    
	    Flores flor = (Flores) obj;
	    return nombre.equalsIgnoreCase(flor.nombre);
	}
	
	// Metodo hashCode para generar un codigo hash basado en el nombre en minusculas
	@Override
	public int hashCode() {
	    return nombre.toLowerCase().hashCode();
	}


	
}
