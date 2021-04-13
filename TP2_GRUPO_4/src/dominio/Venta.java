package dominio;

import java.util.Date;
import java.util.List;
import java.text.MessageFormat;

public class Venta {

	// Atributos
	private int id;
	private Date fecha;
	private Cliente cliente;
	private List<Entrada> listaEntradas;

	private static int contId = 0;
	
	
	// Constructores
	public Venta() {
		this.id = ++contId;
	}

	public Venta(Date fecha, Cliente cliente, List<Entrada> listaEntradas) {
		this.id = ++contId;
		this.fecha = fecha;
		this.cliente = cliente;
		this.listaEntradas = listaEntradas;
	}

	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(List<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	public double getMonto() {
		// Esta linea devuelve la suma del atributo Precio de cada objeto Entrada.
		return listaEntradas.stream().mapToDouble(x -> x.getPrecio()).sum();
	}

	
	// Metodo toString()
 	@Override
	public String toString() {
		return MessageFormat.format("ID venta: {0}, Fecha: {1, date}, \n"
				+ "Cliente: ({2}), \n"
				+ "Entradas: {4}, \n"
				+ "Monto: {3, number, currency}.",
				id, fecha, cliente, getMonto(), listaEntradas);
	}
	
}
