package dominio;

public class Localidad {
	
	// ATRIBUTOS
	
	private int id;
	private String Localidad;
	private int CP;
	
	// CONSTRUCTOR
	
	public Localidad (int ID, String loc, int cp) {
		this.id = ID;
		this.Localidad = loc;
		this.CP = cp;
	}

	// GETS Y SETS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	// toString()
	
	@Override
	public String toString() {
		return Localidad + ", CP: " + CP;
	}
}
