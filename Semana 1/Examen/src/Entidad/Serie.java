package Entidad;

import Interfaces.Entregable;

public class Serie implements Entregable {
	
	private String titulo;
	private String genero;
	private String creador;
	private int numeroTemporadas;
	private boolean entregado;
	
	// Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
	}
	
	// Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.numeroTemporadas = 3;
		this.entregado = false;
	}
	
	// Constructor con todos los atributos excepto entregado
	public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = false;
	}
	
	// Getters (sin getter de entregado)
	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}
	
	// Setters (sin setter de entregado)
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	// Métodos de la interfaz Entregable
	@Override
	public boolean entregar() {
		//Si entregado es false, lo cambia a true y devuelve true
		if (!this.entregado) {
			this.entregado = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean devolver() {
		//Si entregado es true, lo cambia a false y devuelve true
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
		// Usamos instanceof para verificar que el objeto es de tipo Serie
		if (a instanceof Serie) {
			Serie otra = (Serie) a;
			return Integer.compare(this.numeroTemporadas, otra.numeroTemporadas);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", numeroTemporadas="
				+ numeroTemporadas + ", entregado=" + entregado + "]";
	}
}
