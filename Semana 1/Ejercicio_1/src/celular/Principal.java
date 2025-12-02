package celular;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// intanciamos de los objetos, usaremos el costructor con parametros
		Celular cel_1 = new Celular("Samsung", "A3", "Snapdragon", 125, 2310, "Negro");

		Celular cel_2 = new Celular("Xiaomi", "Poco x7 pro", "MediaTek Dimensity", 128, 5310, "Negro");

		Celular cel_3 = new Celular("Huawei","Pura70","Kirin 9010",250,19420.20,"negro");
		
		Celular cel_4 = new Celular("Samsung", "s24 ultra", "Snapdragon", 256, 24500, "negro");
		
		Celular cel_5 = new Celular("Xiaomi", "Readmi 8", "Qualcomm snapdragon", 128, 5000, "azul");
		
		
		// Creacion de una lista para las instancia de los objetos
		
		List<Celular> celulares = new ArrayList<Celular>();
		
		//objeto auxiliar para que guarde 
		Celular auxCelu = null;
		
		celulares.add(cel_1);
		celulares.add(cel_2); 
		celulares.add(cel_3); 
		celulares.add(cel_4);
		celulares.add(cel_5);
		
		/*
		 * // Guardamos las intancias a la lista celulares.add(cel_1);
		 * celulares.add(cel_2); celulares.add(cel_3); celulares.add(cel_4);
		 * celulares.add(cel_5);
		 * 
		 * // Imprimir lista System.out.println(celulares);
		 * 
		 * //editar auxCelu = celulares.get(1); // Primero obtemenos a cual selular
		 * auxCelu.setColor("Verde"); // Cambiamos o editar auxCelu.setPrecio(5000);
		 * System.out.print("El Elemento es: " + auxCelu);
		 * 
		 * // Buscar un elemto especifico auxCelu = celulares.get(4);
		 * System.out.print(auxCelu);
		 * 
		 * // Eliminar celulares.remove(3); System.out.println("Lista actualizada\n" +
		 * celulares);
		 * 
		 * // Contar los elemtos de la lista System.out.println("Existen: " +
		 * celulares.size() + "Celulares registrados");
		 * 
		 * // Limipiar lo que contiene la lista celulares.clear();
		 * 
		 * // Validad si esta vacia if(celulares.isEmpty()) {
		 * System.out.println("No existen celulares registrados"); } else {
		 * System.out.println("Esta es la lista: " + celulares); }
		 */
		
		//CREAR UN MENU INTERACTIVO PARA MANIPULAR  LA LISTA
		
		Scanner scan = null; // Se utiliza para leer la entrada de usuario
		
		int menuPrincipal=0, menuSecuandario=0, indice=0;
		// los menus son variables que almacenan opcicones
		// El indice va a simular el indice de un objeto
		
		// Variables locales:
		String marca, modelo, procesador, color;
		double precio;
		int capacidad;
		
		//do-while: en java es una estructura que permite ejecutarse almenos una ves, hasta que cumple la condicion
		
		
		do {
			System.out.println("----MENU----");
			System.out.println("1.-AGREGAR");
			System.out.println("2.-MOSTRAR LISTA");
			System.out.println("3.-EDITAR");
			System.out.println("4.-BUSCAR UN ELEMENTO");
			System.out.println("5.-ELIMINAR");
			System.out.println("6.-CONTAR");
			System.out.println("7.-SALIR");
			System.out.println("ELIGUE UNA OPCION DEL MENU");
			
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			switch (menuPrincipal) {
			case 1:
				System.out.println("1.-AGREGAR UN NUEVO USUARIO\n");
				System.out.println("Escribe la marca del celular");
				scan = new Scanner(System.in);
				marca = scan.nextLine();
				
				System.out.println("Escribe el modelo del celular");
				modelo = scan.nextLine();
				
				System.out.println("Escribe el procesador del celular");
				procesador = scan.nextLine();
				
				System.out.println("Escribe la capacidad del celular");
				capacidad = scan.nextInt();
				scan.nextLine();
				
				
				System.out.println("Escribe el precio del celular");
				precio = scan.nextDouble();
				scan.nextLine();
				
				
				System.out.println("Escribe el color del celular");
				color = scan.nextLine();
				
				
				//intanciar
				auxCelu = new Celular(marca, modelo, procesador, capacidad, precio, color);
				
				//guardar
				celulares.add(auxCelu);
				System.out.println("El registro se a registrado con exito");
				break;
			
			case 2:
				System.out.println("LISTA DE CELULARES");
				System.out.println(celulares);
				break;
			
			case 3:
				System.out.println("EDITAR UN ELEMENTO");
				System.out.println("Escribe el indice del elemento a editar");
				scan = new Scanner(System.in);
				
				//Aqui se guarda el indice
				indice = scan.nextInt();
				scan.nextLine();
				
				//obtener el elemento
				auxCelu = celulares.get(indice);
				
				do {
					System.out.println("----SUBMENU EDITAR----");
					System.out.println("1.-MARCA");
					System.out.println("2.-MODELO");
					System.out.println("3.-PROCESADOR");
					System.out.println("4.-CAPACIDAD");
					System.out.println("5.-PRECIO");
					System.out.println("6.-COLOR");
					System.out.println("7.-SALIR");
					System.out.println("ELIGUE UNA OPCION DEL MENU");
					
					// El scan es para leer la entrada del usuario
					scan = new Scanner(System.in);
					
					// Aqui se guarda la opcion del submenu
					menuSecuandario = scan.nextInt();
					
					// El switch para las opciones del submenu
					switch(menuSecuandario) {
					case 1:
						System.out.println("Escribe la nueva marca");
						scan = new Scanner(System.in); // Guardar la nueva entrada
						marca = scan.nextLine(); // Se pasa a la variable marca
						auxCelu.setMarca(marca); // Se edita el atributo marca
						break;
					case 2:
						System.out.println("Escribe el nuevo modelo");
						scan = new Scanner(System.in); // Guardar la nueva entrada
						modelo = scan.nextLine(); // Se pasa a la variable modelo
						auxCelu.setModelo(modelo);
						break;
					case 3:
						System.out.println("Escribe el nuevo procesador");
						scan = new Scanner(System.in);
						procesador = scan.nextLine();
						auxCelu.setProcesador(procesador);
						break;
					case 4:
						System.out.println("Escribe la nueva capacidad");
						scan = new Scanner(System.in);
						capacidad = scan.nextInt();
						auxCelu.setCapacidad(capacidad);
						break;
					case 5:
						System.out.println("Escribe el nuevo precio");
						scan = new Scanner(System.in);
						precio = scan.nextDouble();
						auxCelu.setPrecio(precio);
						break;
					case 6:
						System.out.println("Escribe el nuevo color");
						scan = new Scanner(System.in);
						color = scan.nextLine();
						auxCelu.setColor(color);
						break;
					case 7:
						System.out.println("Saliendo del submenu editar");
						break;
					default:
						System.out.println("Opcion no valida, intenta de nuevo");
					}
					
				}while(menuSecuandario !=7);
				
				break;
				
			case 4:
				System.out.println("BUSCAR UN ELEMENTO");
				System.out.println("Escribe el indice del elemento a buscar");
				scan = new Scanner(System.in);
				
				//Aqui se guarda el indice
				indice = scan.nextInt();
				scan.nextLine();
				
				//obtener el elemento
				auxCelu = celulares.get(indice);
				System.out.println("El elemento es: " + auxCelu);
				break;
			
				case 5:
					System.out.println("ELIMINAR UN ELEMENTO");
					System.out.println("Escribe el indice del elemento a eliminar");
					scan = new Scanner(System.in);
					
					//Aqui se guarda el indice
					indice = scan.nextInt();
					scan.nextLine();
					
					//eliminar el elemento
					celulares.remove(indice);
					System.out.println("El elemento se ha eliminado con exito");
					break;
				
				case 6:
					System.out.println("CONTAR LOS ELEMENTOS");
					System.out.println("Existen: " + celulares.size() + " Celulares registrados");
					break;
					
				case 7:
					System.out.println("Saliendo del programa...");
					break;
					default: //El defaul es para opciones no validas
						System.out.println("Opcion no valida, intenta de nuevo");
			}
			
			
		}while(menuPrincipal !=7);
		
		
		
	}

}
