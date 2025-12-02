package Empleados;

public class Empleados {
	
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private int edad;
	private long telefono;
	
	// Constructor
	public Empleados() {
		
	}
	
	// Constructor parametrizado
	public Empleados(String nombre, String aPaterno, String aMaterno, int edad, long telefono) {
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	// Metodos get y set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getaPaterno() {
		return aPaterno;
	}

	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getaMaterno() {
		return aMaterno;
	}

	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", aPaterno=" + aPaterno
				+ ", aMaterno=" + aMaterno + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
	
	

}
