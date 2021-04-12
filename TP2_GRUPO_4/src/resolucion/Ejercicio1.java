package resolucion;

import java.util.Date;

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
		
		Date fecha = new Date();
		
		Venta vta = new Venta(fecha, cliente, 399.99, null);
		
		System.out.println(vta.toString());
	}

}
