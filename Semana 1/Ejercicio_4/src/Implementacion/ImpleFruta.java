package Implementacion;

//Aqui creamos la clase ImpleFruta que hereda de ImplemtGeneral
// Podemos usar los metodos de la clase padre
public class ImpleFruta extends ImplemtGeneral {

	// Y aqui ya solo podemos agregar metodos especificos para la clase Fruta o personalizados
	
	// Metodo contar
	public void contarFrutas() {
		System.out.println("Total de frutas: " + hasMap.size());
	}
}
