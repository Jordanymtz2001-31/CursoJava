package com.mx.ClassAbstracta;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciamos un objeto de la clase Abogado
		Abogado abogado = new Abogado("Juan", "Perez", "UNAM", 35, 123456, 10, "Penal", "Despacho Perez", 5000);
		System.out.println(abogado);
		
		// Acedemos a los metodos de la clase Abogado
		abogado.trabajar();
		
		// Accedemos a los metodos de la clase padre Profesionista
		// Y le mandamos los parametros necesarios
		abogado.cobrar(abogado.getTipo(), abogado.getHonorarios());
		
		//Instanciamos un objeto de la clase Medico
		Medico medico = new Medico("Maria", "Lopez", "IPN", 30, 654321, 5, "Cardiologia", "Consultorio Lopez", 800);
		System.out.println(medico);
		
		// Acedemos a los metodos de la clase Medico
		medico.trabajar();
		
		// Accedemos a los metodos de la clase padre Profesionista
		// Y le mandamos los parametros necesarios
		medico.cobrar(medico.getEspecialidad(), medico.getCostoConsulta());
	}

}
