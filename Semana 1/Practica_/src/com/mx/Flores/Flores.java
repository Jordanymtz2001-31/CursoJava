package com.mx.Flores;

public class Flores {
	
	// Declarar atributos:
	
		private int clave;
		private String nombre;
		private boolean aroma;
		private double precio;
		private String color;
		
		// Metodos de la clase
		
		// Contructor 
		public Flores() {
			
		}
		
		// Contructor Parametrizado
		public Flores(int clave, String nombre, boolean aroma, double precio, String color) {
			this.clave = clave;
			this.nombre = nombre;
			this.aroma = aroma;
			this.precio = precio;
			this.color = color;
		}
		
		// Contructor para buscar por clave, asi solo recibe el parametro clave sin estar colocando los demas
		public Flores(int clave) {
			this.clave = clave;
		}

		// metodos get y set
		public int getClave() {
			return this.clave;
		}
		
		public void setClave(int new_clave) {
			this.clave = new_clave;
		}
		
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
			return "Flores [nombre=" + nombre + ", aroma=" + aroma +", precio=" + precio + ", color=" + color + "]\n";
		}
		

}
