package dominio;

public class Provincia {

	// Atributos
	
	private int id;
	private String Provincia;
	
	// Constructor
	
	public Provincia(int ID, String prov) {
		this.id = ID;
		this.Provincia = prov;
	}

	// Gets y Sets
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	// toString()
	
	@Override
	public String toString() {
		return Provincia;
	}
	
}
