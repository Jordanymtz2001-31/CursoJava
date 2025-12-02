package Interfaces;

@FunctionalInterface // Esto es un marcador o decorador que indica que la interfaz es funcional
					// Es decir que tiene un solo metodo abstracto
public interface Isaludo {

	public String saludar(String saludo, String despedida);

}
