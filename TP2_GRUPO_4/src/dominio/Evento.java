package dominio;

import java.util.Date;
import java.text.MessageFormat;

public abstract class Evento {
	private String nombre;
	private String tipoEvento;
	private Date fechahora;
	private int duracion;
	
	public Evento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Evento(String tipoEvento, String nombre, Date fechahora, int duracion) {
		this.tipoEvento = tipoEvento;
		this.nombre = nombre;
		this.fechahora = fechahora;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return MessageFormat.format("Nombre: {0}. Tipo de evento: {1}. Fecha y hora: {2}. Duración: {3} min.", nombre, tipoEvento, fechahora, duracion);
	}
}
