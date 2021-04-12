package dominio;

import java.text.MessageFormat;

public abstract class Entrada{
	
	private int id;
	private Evento evento;

	private static int contId = 0;
	
	public Entrada() {
		this.id = ++contId;
	}

	public Entrada(Evento evento) {
		this.id = ++contId;
		this.evento = evento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public abstract double getPrecio();
	
	@Override
	public String toString() {
		return MessageFormat.format("ID Entrada: {0}. Evento: ({1}). Precio: {2,number,currency}.", id, evento, getPrecio());

	}
}
