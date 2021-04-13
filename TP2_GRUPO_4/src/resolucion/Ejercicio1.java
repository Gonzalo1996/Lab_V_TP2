package resolucion;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

import dominio.Deportes;
import dominio.DeportesTipo;
import dominio.Entrada;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Infantil;
import dominio.Banda;
import dominio.Genero;
import dominio.Recital;
import dominio.Actores;
import dominio.GeneroTeatro;
import dominio.Teatro;
import dominio.Cliente;
import dominio.Localidad;
import dominio.Provincia;
import dominio.Venta;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Provincia prov = new Provincia(1, "Buenos Aires");
		Localidad loc = new Localidad(1, "La Boca", 1161);
		
		Cliente cliente = new Cliente();
			cliente.setNombre("Juan Román");
			cliente.setApellido("Riquelme");
			cliente.setDni(27123456);
			cliente.setDireccion("Brandsen 805");
			cliente.setGenero('M');
			cliente.setProvincia(prov);
			cliente.setLocalidad(loc);
		
		//CREACIÓN DE ENTRADAS
		//INFANTIL
		Infantil infantil = new Infantil(true);

		//TEATRO
		GeneroTeatro generoA = new GeneroTeatro(1, "terror");
		Actores actorA = new Actores(1, "Facundo Arana");		
		Teatro teatroA = new Teatro("Gran Rex", generoA, actorA, null, null);

		//RECITAL
		Banda b = new Banda(1,"Los piojos");
		Genero g = new Genero(1, "Rock");
		Banda s1 = new Banda(2, "La 25");
		Recital recital = new Recital(b,g, s1, null);
		
		//DEPORTES
		DeportesTipo[] vecTipo = new DeportesTipo[3];
		vecTipo[0] = new DeportesTipo("Futbol");
		vecTipo[1] = new DeportesTipo("Rugby");
		vecTipo[2] = new DeportesTipo ("Hockey");

		Deportes depo1 = new Deportes(vecTipo[2], false);
		
			//SETEO FECHAS Y MINUTOS
        Date fecha = new Date(121, 3,6, 20, 30);		
		infantil.setFechahora(fecha);
		infantil.setDuracion(100);	
		depo1.setFechahora(fecha);
		depo1.setDuracion(90);
		recital.setFechahora(fecha);
		recital.setDuracion(30);
		teatroA.setFechahora(fecha);
		teatroA.setDuracion(45);
		
			//SETEO NOMBRE DE EVENTOS
		infantil.setNombre("Panam y sus niños");
		recital.setNombre("Los piojos en vivo hoy");
		depo1.setNombre("Superclasico");
		teatroA.setNombre("Casados con hijos en vivo");
			
			//SETEO EVENTOS
		Entrada entrada = new EntradaRecital(recital, true);
		Entrada entrada2 = new EntradaTeatro(teatroA);
		Entrada entrada3 = new EntradaInfantil(infantil, 7);
		Entrada entrada4 = new EntradaDeporte(depo1);
		Entrada entrada5 = new EntradaTeatro(teatroA);
			
			//PUNTO 1) ARRAYLIST DE ENTRADAS
		System.out.println("Punto 1: Arraylist de entradas:" + "\n");
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>();
		listaEntradas.add(entrada);
		listaEntradas.add(entrada2);
		listaEntradas.add(entrada3);
		listaEntradas.add(entrada4);
		listaEntradas.add(entrada5);
		
		ListIterator<Entrada> it = listaEntradas.listIterator();
		while(it.hasNext())
		{
			Entrada e = it.next();
			System.out.println(e.toString());
		}
		
		ArrayList<Entrada> listaEntradas2 = new ArrayList<Entrada>();
		listaEntradas2.add(entrada);
		listaEntradas2.add(entrada2);
		
		//PUNTO 4)CREACION OBJETOS VENTAS.
		Date fechaVta = new Date();
		Venta vta = new Venta(fechaVta, cliente, listaEntradas);	
		Venta vta2 = new Venta(fechaVta, cliente, listaEntradas2);
		
		System.out.println("---------------------");
		System.out.println("Punto 4: Ventas" + "\n");
		System.out.println(vta.toString() + "\n");
		System.out.println(vta2.toString());
	}

}
