package resolucion;

import java.util.Date;

import dominio.Cliente;
import dominio.Venta;

public class Ejercicio1 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Date fecha = new Date();
		
		Venta vta = new Venta(fecha, cliente, 399.99, null);
		
		System.out.println(vta.toString());
	}

}
