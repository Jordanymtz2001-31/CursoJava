package Entidades;

public class Vidiojuego {
	
	private Long codigo; //Clave
	private String nombre;
	private String empresa;
	private double precio;
	private String genero;
	
	public Vidiojuego() {
	}
	
	public Vidiojuego(Long codigo, String nombre, String empresa, double precio, String genero) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.empresa = empresa;
		this.precio = precio;
		this.genero = genero;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Vidiojuego [codigo=" + codigo + ", nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio
				+ ", genero=" + genero + "]\n";
	}
	
	

}
