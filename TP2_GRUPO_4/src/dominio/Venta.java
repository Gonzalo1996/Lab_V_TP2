package dominio;

import java.util.Date;
import java.util.List;
import java.text.MessageFormat;

public class Venta {

	// Atributos
	private int id;
	private Date fecha;
	private Cliente cliente; 
	private double monto;
	private List<Entrada> listaEntradas;

	private static int contId = 0;
	
	
	// Constructores
	public Venta() {
		this.id = ++contId;
	}

	public Venta(Date fecha, Cliente cliente, double monto, List<Entrada> listaEntradas) {
		this.id = ++contId;
		this.fecha = fecha;
		this.cliente = cliente;
		this.monto = monto;
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

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public List<Entrada> getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(List<Entrada> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	@Override
	public String toString() {
		return "Datos de venta: id=" + id + ", fecha=" + fecha + "\n"+ "Datos " + cliente + "\n" + "Entrada/s compradas:" + "\n"
				+ listaEntradas + "\n" + "Monto total: $" + monto;
	}

	// toString
	/*
	 	@Override
	public String toString() {
		return MessageFormat.format("ID venta: {0}, Fecha: {1, date}, Cliente: ({2}), Monto: {3, number, currency}.", id, fecha, cliente, monto);
	}
	*/
}
