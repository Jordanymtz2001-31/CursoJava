package Entidad;

import Interfaces.Entregable;

public class VideoJuegos implements Entregable {
	
	private String titulo;
	private String genero;
	private String compania;
	private int horasEstimadas;
	private boolean entregado;
	
	// Constructor por defecto
	public VideoJuegos() {
		this.titulo = "";
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = 10;
		this.entregado = false;
	}
	
	// Constructor con titulo y horas estimadas
	public VideoJuegos(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.genero = "";
		this.compania = "";
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}
	
	// Constructor con todos los atributos excepto entregado
	public VideoJuegos(String titulo, String genero, String compania, int horasEstimadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}
	
	// Getters (sin getter de entregado)
	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getCompania() {
		return compania;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	
	// Setters (sin setter de entregado)
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	// Métodos de la interfaz Entregable
	@Override
	public boolean entregar() {
		// Si entregado es false, lo cambia a true y devuelve true
		if (!this.entregado) {
			this.entregado = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean devolver() {
		// Si entregado es true, lo cambia a false y devuelve true
		if (this.entregado) {
			this.entregado = false;
			return true;
		}
		return false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		// Compara las horas estimadas de dos videojuegos
		// Usamos instanceof para verificar el tipo del objeto
		if (a instanceof VideoJuegos) {
			VideoJuegos otro = (VideoJuegos) a;
			return Integer.compare(this.horasEstimadas, otro.horasEstimadas);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "VideoJuegos [titulo=" + titulo + ", genero=" + genero + ", compania=" + compania + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + "]";
	}
}
