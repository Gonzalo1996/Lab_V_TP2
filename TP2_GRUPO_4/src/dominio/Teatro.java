package dominio;

public class Teatro extends Evento{
	
	private int id;
	private String nombreTeatro;
	private GeneroTeatro genero;
	private Actores actorA;
	private Actores actorB;
	private Actores actorC;
	private static int contId = 0;
	
/*<------------CONSTRUCTORES-------------------->*/	
	
	public Teatro() {
		super("Teatro");
		contId++;
		this.id = contId;
		this.nombreTeatro = "Sin nombre";
	}
	
	public Teatro(String nombre, GeneroTeatro genero, Actores actorA, Actores actorB, Actores actorC) {
		super("Teatro");
		contId++;
		this.id = contId;
		this.nombreTeatro = nombre;
		this.genero = genero;
		this.actorA = actorA;
		
		this.actorB = actorB != null ? actorB : new Actores();
		this.actorC = actorC != null ? actorC : new Actores();
	}
	
	
/*<------------GETTERS AND SETTERS-------------->*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreTeatro() {
		return nombreTeatro;
	}
	public void setNombreTeatro(String nombre) {
		this.nombreTeatro = nombre;
	}
	public GeneroTeatro getGenero() {
		return genero;
	}
	public void setGenero(GeneroTeatro genero) {
		this.genero = genero;
	}

	public Actores getActorA() {
		return actorA;
	}

	public void setActorA(Actores actorA) {
		this.actorA = actorA;
	}

	public Actores getActorB() {
		return actorB;
	}

	public void setActorB(Actores actorB) {
		this.actorB = actorB;
	}

	public Actores getActorC() {
		return actorC;
	}

	public void setActorC(Actores actorC) {
		this.actorC = actorC;
	}

	@Override
	public String toString() {
		return super.toString() + " ID teatro: " + id + ". Nombre: " + nombreTeatro + ". Genero: " + genero.getNombre() + ". Actor 1: " + actorA.getNombre()
		+ ". Actor 2: " + actorB.getNombre() + ". Actor 3: " + actorC.getNombre();
	}	
}
