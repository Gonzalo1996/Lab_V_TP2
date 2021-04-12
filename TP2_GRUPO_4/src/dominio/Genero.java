package dominio;

public class Genero {
	
	private int id;
	private String nombre;
	
	public Genero() {
		
	}
	
	public Genero(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getIdGenero() {
		return id;
	}

	public void setIdGenero(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Genero [id: " + id + ", nombre: " + nombre + "]";
	}
}
