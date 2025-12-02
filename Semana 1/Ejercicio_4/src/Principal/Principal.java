package Principal;

// Importamos las clases necesarias
import Entidades.Fruta;
import Implementacion.ImpleFruta;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciamos la clase fruta
		Fruta fruta1 = new Fruta("Manzana", "Otoño", "Rojo", 1.5, 0.3);
		Fruta fruta2 = new Fruta("Plátano", "Todo el año", "Amarillo", 0.8, 0.25);
		Fruta fruta3 = new Fruta("Cereza", "Verano", "Rojo oscuro", 2.0, 0.05);
		Fruta fruta4 = new Fruta("Naranja", "Invierno", "Naranja", 1.2, 0.4);
		Fruta fruta5 = new Fruta("Kiwi", "Otoño", "Marrón", 1.8, 0.2);
		
		//Auxiliar para la clase fruta
		Fruta fruta = new Fruta();
		
		// Implementacion de los metodos
		ImpleFruta metoFrut = new ImpleFruta();
		
		// Agregar frutas
		metoFrut.agregar(fruta1.getNombre(), fruta1);
		metoFrut.agregar(fruta2.getNombre(), fruta2);
		metoFrut.agregar(fruta3.getNombre(), fruta3);
		metoFrut.agregar(fruta4.getNombre(), fruta4);
		metoFrut.agregar(fruta5.getNombre(), fruta5);
		
		//Mostrar 
		metoFrut.mostrar();
		
		//Mostrar
		fruta = (Fruta) metoFrut.buscarPorClave("Cereza");
		System.out.println("Fruta encontrada: " + fruta.getNombre());
		
		//Eliminar asi o metoFrut.eliminar(fruta3.getNombre());
		metoFrut.eliminar("Plátano");
		metoFrut.mostrar();
		
		//Contar
		metoFrut.contarFrutas();

	}

}
