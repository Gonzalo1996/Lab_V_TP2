package dominio;

public class Infantil extends Evento {

	/*<------------ATRIBUTOS-------------------->*/	
	
	private int id;
	private boolean sourvenir;
	private static int contId = 0;
	
	/*<------------CONSTRUCTORES-------------------->*/	
	
	public Infantil() {
		super("Infantil");
		contId++;
		this.id = contId;
		this.sourvenir = true;
	}
	
	public Infantil(boolean sour) {
		super("Infantil");
		contId++;
		this.id = contId;
		this.sourvenir = sour;
	}
	
	/*<------------GETTERS AND SETTERS-------------->*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSourvenir() {
		return sourvenir;
	}

	public void setSourvenir(boolean sourvenir) {
		this.sourvenir = sourvenir;
	}
	
	/*<------------TOSTRING()-------------->*/

	@Override
	public String toString() {
		if(this.sourvenir) {
			return super.toString() + " ID infantil: " + id  + " CON SOUVENIR";
		}
		else {
			return super.toString() + " ID infantil: " + id  + " SIN SOUVENIR";
		}
		
	}
}
