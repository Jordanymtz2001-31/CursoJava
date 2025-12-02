package Empleados;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instancia de la clase Implemantacion
		Empleados emp1 = new Empleados("Juan", "Perez", "Lopez", 30, 5551234567L);
		Empleados emp2 = new Empleados("Jesus", "Jimenez", "Martinez", 21, 5282365121L);
		Empleados emp3 = new Empleados("Ricardo", "Rodriguez", "Fernandez", 25, 7598423150L);
		Empleados emp4 = new Empleados("Miguel", "Perez", "Reyes", 29, 2221348260L);
		
		// Crear un auxiliar
		Empleados new_empleado = null;
		
		// Se implementan los metodos
		Implemantacion imple = new Implemantacion();

		// Agregar empleados a la lista
		imple.agregar(emp1);
		imple.agregar(emp2);
		imple.agregar(emp3);
		imple.agregar(emp4);

		/*
		 * // Mostrar empleados imple.mostrar();
		 * 
		 * // Buscar empleado auxiliar = imple.empleados.get(2);
		 * System.out.println("Empleado encontrado: " + auxiliar + "\n");
		 * 
		 * // Editar empleado Empleados empEditado = new Empleados("Dany", "Perez",
		 * "Lopez", 31, 5551234567L); imple.editar(0, empEditado);
		 * System.out.println("Empleado editado: " + imple.empleados.get(0) + "\n");
		 * 
		 * // Eliminar empleado imple.eliminar(1, emp2);
		 * System.out.println("Empleado eliminado. Lista actualizada:" + imple.empleados
		 * + "\n");
		 */
		
		// Creamos el CRUD para manejar la lista de empleados
		
		// Creamos el Scanner para la entrada de datos
		Scanner scan = new Scanner(System.in);
		
		int menuPrincipal = 0, menuSecundario = 0, indice = 0;
		
		// Variables locales
		String nombre, apellidoP, apellidoM;
		int edad;
		long telefono;
		
		do {
			
			System.out.println("\n----MENU PRINCIPAL----");
			System.out.println("1.-AGREGAR EMPLEADO");
			System.out.println("2.-MOSTRAR LISTA DE EMPLEADOS");
			System.out.println("3.-EDITAR EMPLEADO POR INDICE");
			System.out.println("4.-ELIMINAR EMPLEADO POR INDICE");
			System.out.println("5.-CONTAR EMPLEADOS");
			System.out.println("6.-SALIR");
			
			System.out.print("Seleccione una opcion: ");
			
			// Declaramos una ecepcion para evitar errores de entrada con try-catch
			// Que solo acepte numeros enteros
			
			try {
				// Capturamos la opcion del menu
				menuPrincipal = scan.nextInt();
				scan.nextLine(); // Limpiar el buffer
				
				//Inicio el switch
				switch(menuPrincipal) {
				
				case 1:
					// AGREGAR EMPLEADO
					System.out.print("Ingrese el nombre del empleado: ");
					nombre = scan.nextLine();
					
					System.out.print("Ingrese el apellido paterno del empleado: ");
					apellidoP = scan.nextLine();
					
					System.out.print("Ingrese el apellido materno del empleado: ");
					apellidoM = scan.nextLine();
					
					System.out.print("Ingrese la edad del empleado: ");
					edad = scan.nextInt();
					
					System.out.print("Ingrese el telefono del empleado: ");
					telefono = scan.nextLong();
					scan.nextLine(); // Limpiar el buffer 
					
					// Crear nueva instancia de Empleado
					new_empleado = new Empleados(nombre, apellidoP, apellidoM, edad, telefono);
					
					// Validar si el empleado ya existe
					if(imple.empleadoExiste(new_empleado)) {
						System.out.println("El empleado ya existe en la lista. No se puede agregar.");
					} else {
						// Agregamos el empleado a la lista
						imple.agregar(new_empleado);
						System.out.println("Empleado agregado exitosamente.");
					}
					break;
					
				case 2:
					// MOSTRAR LISTA DE EMPLEADOS
					System.out.println("\n----LISTA DE EMPLEADOS----");
					imple.mostrar();
					break;
					
				case 3:
					System.out.print("\n---EDITAR EMPLEADO---");
					imprimirDatos(imple);
					// Verificar si hay empleados en la lista
					if(imple.empleados.size() > 0) {
						System.out.print("Ingrese el indice del empleado a editar: ");
						indice = scan.nextInt();
						scan.nextLine(); // Limpiar el buffer
						
						if(indice >= 0 && indice < imple.empleados.size()) {
							// Obtener referencia del empleado a editar
							new_empleado = imple.empleados.get(indice);
							
							do {
								System.out.println("--MENU DE EDICION--");
								System.out.println("1.-NOMBRE");
								System.out.println("2.-APELLIDO PATERNO");
								System.out.println("3.-APELLIDO MATERNO");
								System.out.println("4.-EDAD");
								System.out.println("5.-TELEFONO");
								System.out.println("6.-SALIR");
								System.out.print("Seleccione el campo a editar: ");
								
								menuSecundario = scan.nextInt();
								scan.nextLine(); // Limpiar el buffer
								
								switch(menuSecundario) {
								case 1:
									System.out.print("Ingrese el nuevo nombre: ");
									nombre = scan.nextLine();
									new_empleado.setNombre(nombre);
									System.out.println("Nombre actualizado.");
									break;
									
								case 2:
									System.out.print("Ingrese el nuevo apellido paterno: ");
									apellidoP = scan.nextLine();
									new_empleado.setaPaterno(apellidoP);
									System.out.println("Apellido paterno actualizado.");
									break;
									
								case 3:
									System.out.print("Ingrese el nuevo apellido materno: ");
									apellidoM = scan.nextLine();
									new_empleado.setaMaterno(apellidoM);
									System.out.println("Apellido materno actualizado.");
									break;
									
								case 4:
									System.out.print("Ingrese la nueva edad: ");
									edad = scan.nextInt();
									new_empleado.setEdad(edad);
									System.out.println("Edad actualizada.");
									break;
								
								case 5:
									System.out.print("Ingrese el nuevo telefono: ");
									telefono = scan.nextLong();
									new_empleado.setTelefono(telefono);
									System.out.println("Telefono actualizado.");
									break;
								
								case 6:
									System.out.println("Saliendo del menu de edicion.");
									break;
								}
							} while (menuSecundario != 6);
							// Salir del menu de edicion
							break;
						}
						else {
							System.out.println("Indice invalido, No se encontro el empleado.");
						}
					}
					else {
						System.out.println("No hay empleados en la lista para editar.");
					}
					break;
				case 4:
					// ELIMINAR EMPLEADO
					System.out.print("\n---ELIMINAR EMPLEADO---");
					imprimirDatos(imple);
					// Verificar si hay empleados en la lista
					if(imple.empleados.size() > 0) {
						System.out.print("Ingrese el indice del empleado a eliminar: ");
						indice = scan.nextInt();
						scan.nextLine(); // Limpiar el buffer
						
						if(indice >= 0 && indice < imple.empleados.size()) {
							// Obtener el empleado a eliminar
							new_empleado = imple.empleados.get(indice);
							imple.eliminar(indice);
							System.out.println("Empleado eliminado exitosamente.");
						}
						else {
							System.out.println("Indice invalido, No se encontro el empleado.");
						}
					}
					else {
						System.out.println("No hay empleados en la lista para eliminar.");
					}
					break;
					
				case 5:
					// CONTAR EMPLEADOS
					System.out.println("Total de empleados: " + imple.empleados.size());
					break;
					
				case 6:
					System.out.println("Saliendo del programa...");
					break;
					
				default:
					System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
				}
				
			} catch (Exception e) {
				System.out.println("Error: Entrada invalida. Por favor, ingrese un numero entero.");
				scan.nextLine(); // Limpiar el buffer
				continue; // Volver al inicio del bucle
			}
			
		}while(menuPrincipal != 6);
	}
	
	// Metodo asociado a la clase sin necesidad de crear un objeto o instancia
	private static void imprimirDatos(Implemantacion imple) {
		// Mostrar todos los empleados
		System.out.println("Lista de empleados:");
		// Si la lista no esta vacia, es decir si hay mas de 0 empleados
		if (imple.empleados.size() > 0) {
			// Por cada empleado en la lista, imprimimos su nombre con su indice
			// El empleado empieza en 0 hasta el tamaño de la lista
			for (int Empleado = 0; Empleado < imple.empleados.size(); Empleado++) {
				// Imprimimos el empleado de imple.empleados en la posicion Empleado
				System.out.println("El nombre [" + Empleado + "] es: " + imple.empleados.get(Empleado).getNombre());
			}
		} else {
			System.out.println("No hay empleados en la lista.");
		}
	}

}
