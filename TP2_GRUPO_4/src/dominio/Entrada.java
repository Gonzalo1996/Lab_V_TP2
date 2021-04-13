package dominio;

import java.text.MessageFormat;

public abstract class Entrada implements Comparable<Entrada>{
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		return true;
	}

	@Override
	public int compareTo(Entrada o) {	
		if (o.id<this.id)
		{
			return 1;
		}		
		return 0;	
	}

	@Override
	public String toString() 
	{
		return MessageFormat.format("ID Entrada: {0}. Evento: ({1}). Precio: {2,number,currency}.", id, evento, getPrecio())+ "\n";
	}
}
