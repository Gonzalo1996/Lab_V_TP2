package dominio;

public class Recital extends Evento{
	
	private int id;
	private Banda banda;
	private Genero genero;
	private Banda bandaSoporte;
	private Banda bandaSoporte2;

	private static int contId = 0;
	
	public Recital() {
		super("Recital");
		contId ++;
		this.id = contId;
	}
	
	public Recital(Banda banda, Genero genero, Banda bandaSoporte, Banda bandaSoporte2) {
		super("Recital");
		contId ++;
		this.id = contId;
		this.banda = banda;
		this.genero = genero;

		this.bandaSoporte = bandaSoporte;
        this.bandaSoporte2 = bandaSoporte2;
	}

	public int getId() {
		return id;
	}
	
	public Banda getBanda() {
		return banda;
	}
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Banda getBandaSoporte() {
		return bandaSoporte;
	}

	public void setBandaSoporte(Banda bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}

	public Banda getBandaSoporte2() {
		return bandaSoporte2;
	}

	public void setBandaSoporte2(Banda bandaSoporte2) {
		this.bandaSoporte2 = bandaSoporte2;
	}

	@Override
	public String toString() {
		return super.toString() + " ID recital: " + id  + " Banda: " + banda.getNombre() + " Genero: " + genero.getNombre() +
								  " Banda Soporte: " + (bandaSoporte != null ? bandaSoporte.getNombre() : "Sin banda soporte 1") + 
								  " Banda Soporte 2 :" + (bandaSoporte2 != null ? bandaSoporte2.getNombre() : "Sin banda soporte 2");
	}
}
