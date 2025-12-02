package Entidad;

public class Alumno {
	
	private int matricula;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private int edad;
	private String carrera;
	private String universidad;
	
	//Contructor vacio
	public Alumno() {
		
	}
	
	//Contructor con parametros
	public Alumno(int matricula, String nombre, String appaterno, String apmaterno, int edad, String carrera,
			String universidad) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.edad = edad;
		this.carrera = carrera;
		this.universidad = universidad;
	}

	//Getters y Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppaterno() {
		return appaterno;
	}

	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}

	public String getApmaterno() {
		return apmaterno;
	}

	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", appaterno=" + appaterno + ", apmaterno="
				+ apmaterno + ", edad=" + edad + ", carrera=" + carrera + ", universidad=" + universidad + "]";
	}
	

}
