package dominio;

public class Deportes extends Evento {

	private int id;
	private DeportesTipo dep;
	private boolean internacional;
	
	private static int contId=0;
	
	//Constructores
	public Deportes() {
		super("Deportes");
		contId++;
		this.id=contId;	
	}
	
	public Deportes(DeportesTipo dep) {
		super("Deportes");
		contId++;
		this.id=contId;
		this.dep=dep;
		this.internacional=false;
	}
	
	
	public Deportes(DeportesTipo dep, boolean internacional) {
		super("Deportes");
		contId++;
		this.id=contId;
		this.dep=dep;
		this.internacional=internacional;
	}

//Getters y Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public DeportesTipo getDep() {
		return dep;
	}


	public void setDep(DeportesTipo dep) {
		this.dep = dep;
	}


	public boolean isInternacional() {
		return internacional;
	}


	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}


	public static int getContId() {
		return contId;
	}


	public static void setContId(int contId) {
		Deportes.contId = contId;
	}

	//Metodo ToString
	@Override
	public String toString() {
		if(internacional==true) {
			return super.toString() + "ID de partido: " + id + ", Deporte: " + dep.getNombre() + ", Tipo de partido: " + "Internacional";
	}
		else {
			return super.toString() + "ID de partido: " + id + ", Deporte: " + dep.getNombre().toString() + ", Tipo de partido: " + "Local";
		}
	}	
	
	
	
	

	
}
