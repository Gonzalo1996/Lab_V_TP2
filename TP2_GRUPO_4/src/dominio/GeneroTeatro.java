package dominio;

public class GeneroTeatro {
	
	private int id;
	private String nombre;

/*<------------CONSTRUCTORES-------------------->*/	
	public GeneroTeatro() {
		this.id = 1;
		this.nombre = "sin genero";
	}
	
	public GeneroTeatro(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
/*<------------GETTERS AND SETTERS-------------->*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
/*<------------METODO ToString()-------------->*/
	
	@Override
	public String toString() {
		return "GeneroTeatro [id=" + id + ", nombre=" + nombre + "]";
	}
}
