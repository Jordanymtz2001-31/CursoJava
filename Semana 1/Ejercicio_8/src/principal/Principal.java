package principal;

import java.util.ArrayList;
import java.util.List;

import Entidad.Alumno;
import Interfaces.Isaludo;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos a alumno
		Alumno alumno1 = new Alumno(12345, "Juan", "Perez", "Lopez", 20, "Ingenieria en Sistemas", "UNAM");
		Alumno alumno2 = new Alumno(67890, "Maria", "Gomez", "Hernandez", 22, "Medicina", "IPN");
		Alumno alumno3 = new Alumno(250103, "Jose", "Gonzales", "Martinez", 25, "Lic. Medicina", "buap");
		Alumno alumno4 = new Alumno(240501, "Carlos", "Osorio", "Perez", 26, "Ing. Industrial", "Buap");
		Alumno alumno5 = new Alumno(250405, "Luis", "Reyes", "Gonzales", 20, "Quimica", "UPAEP");
		Alumno alumno6 = new Alumno(202006, "Victor", "Manuel", "Percino", 18, "Fisica", "Politecnico");
		Alumno alumno7 = new Alumno(340674, "Pedro", "Martinez", "Gonzales", 30, "Ing.Sistemas", "UNAM");
		Alumno alumno8 = new Alumno(456789, "Mario", "Benitez", "Trujillo", 36, "Lic.Letras", "UNAM");
		Alumno alumno9 = new Alumno(123456, "Ana", "Lopez", "Martinez", 28, "Derecho", "IPN");
		
		// Los almacenamos en una lista
		List<Alumno> listaAlumnos = new ArrayList<>();
		
		// Agregamos los alumnos a la lista
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		listaAlumnos.add(alumno9);
		
		// Sintaxis de lambda
		listaAlumnos.forEach(alumno -> {
			System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno());
			System.out.println("---------------------------");
		});
		
		//Imprimimos los detalles de los alumnos
		//Utilizando .stream() y filter() para filtrar los alumnos que estudian en la UNAM
		System.out.println("Detalles de los alumnos:");
		listaAlumnos.stream().filter(arg -> arg.getUniversidad().equalsIgnoreCase("UNAM")).forEach(alumno -> {
			System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno() + " estudia en la universidad: " + alumno.getUniversidad());
			System.out.println("---------------------------");
		});
		
		//Funcion lambda con interfaz funcional Isaludo
		Isaludo mensaje = (saludo, despedida) -> saludo + " y " + despedida;
		System.out.println(mensaje.saludar("Hola, bienvenidos a la universidad", "hasta luego"));
		System.out.println("---------------------------");
		
		System.out.println("\nALUMNOS MAYORES DE 22 AÑOS\n");
		listaAlumnos.stream().filter(arg -> arg.getEdad() > 22).forEach(alumno -> {
			System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno() + " Edad: " + alumno.getEdad());
			System.out.println("---------------------------");
		});
		
		System.out.println("\nALUMNOS QUE EMPIEZAN CON LA LETRA 'A'\n");
		// Usamos startsWith para filtrar los nombres que empiezan con A
		listaAlumnos.stream().filter(arg -> arg.getNombre().charAt(0) == 'A').forEach(alumno -> {
			System.out.println("Los nombres son: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno());
			System.out.println("---------------------------");
		});
		
		System.out.println("\nALUMNOS QUE DE LA A -- Z\n");
		// Usamos sorted para ordenar los nombres de A a Z
		// El arg1 y arg2 son los dos elementos que se comparan
		// El compareToIgnoreCase compara dos cadenas ignorando mayusculas y minusculas
		listaAlumnos.stream().sorted((a1, a2) -> a1.getNombre().compareToIgnoreCase(a2.getNombre())).forEach(alumno -> {
			System.out.println("Los nombres son: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno());
			System.out.println("---------------------------");
		});
		
		System.out.println("\nALUMNOS DE MEDICINA\n");
		// Usamos toLowerCase para convertir a minusculas y evitar errores de mayusculas
		// Usamos contains para filtrar los nombres que contienen la palabra medicina
		listaAlumnos.stream().filter(arg -> arg.getCarrera().toLowerCase().contains("medicina")).forEach(alumno -> {
			System.out.println("Los nombres son: " + alumno.getNombre() + " " + alumno.getAppaterno() + " " + alumno.getApmaterno() + " Carrera: " + alumno.getCarrera());
			System.out.println("---------------------------");
		});
		
		System.out.println("\nMAPEAR LOS NOMBRES DE ALUMNOS A MAYUSCULAS\n");
		// Usamos map para transformar los nombres a mayusculas
		// Y usamos toUpperCase para convertir a mayusculas
		listaAlumnos.stream().map(arg -> arg.getNombre().toUpperCase()).forEach(nombre -> {
			System.out.println("Nombres en mayusculas: " + nombre);
			System.out.println("---------------------------");
		});		
		
		System.out.println("PROMEDIO DE EDAD DE LOS ALUMNOS\n");
		// Usamos mapToInt para convertir la edad a int y luego usamos average para calcular el promedio
		// Y el ifPresent es para mostrar el resultado solo si hay valores presentes
		listaAlumnos.stream().mapToInt(Alumno::getEdad).average().ifPresent(promedio -> {
			System.out.println("El promedio de edad es: " + promedio);
		});
	}

}
