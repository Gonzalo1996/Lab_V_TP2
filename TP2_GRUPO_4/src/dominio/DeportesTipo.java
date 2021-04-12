package dominio;

public class DeportesTipo {
	
	private int id;
	private static int contId = 0;
	private String Nombre;
	
	//Constructores
	public DeportesTipo() {
		contId ++;
		this.id = contId;
		this.Nombre="Sin nombre";
	}
	
	public DeportesTipo(String nombre) {
		contId ++;
		this.id = contId;
		this.Nombre=nombre;
	}

	// Getter y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	// Metodo ToString
	@Override
	public String toString() {
		return "DeportesTipo [id=" + id + ", Nombre=" + Nombre;
	}

}
