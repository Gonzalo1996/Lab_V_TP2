package resolucion;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

import dominio.Actores;
import dominio.Banda;
import dominio.Cliente;
import dominio.Deportes;
import dominio.DeportesTipo;
import dominio.Entrada;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Genero;
import dominio.GeneroTeatro;
import dominio.Infantil;
import dominio.Localidad;
import dominio.Provincia;
import dominio.Recital;
import dominio.Teatro;
import dominio.Venta;

public class Ejercicio2 {

	public static void main(String[] args) 
	{
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
			
			//TREESET DE ENTRADAS
		TreeSet<Entrada> listaEntradas = new TreeSet<Entrada>();
		listaEntradas.add(entrada);
		listaEntradas.add(entrada2);
		listaEntradas.add(entrada3);
		listaEntradas.add(entrada4);
		listaEntradas.add(entrada5);
		
		Iterator<Entrada> it = listaEntradas.iterator();
		System.out.println("Punto 2: Treeset");
		while(it.hasNext())
		{
			Entrada e = it.next();
			System.out.println(e.toString());
		}
		
		System.out.println("-------------------");
		System.out.println("Punto 3: Equals");
		
		//Comparación de objetos entradas.
		
		if(entrada2.equals(entrada5))
		{
			System.out.println("Entradas iguales");
		}
		else {
			System.out.println("Entradas distintas");
		}
	}
}
