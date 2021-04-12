package dominio;

public class EntradaTeatro extends Entrada{

	public EntradaTeatro() {
		super();
	}
	
	public EntradaTeatro(Teatro teatro) {
		super(teatro);
	}
	
	@Override
	public double getPrecio() {
		return 1350.50;
	}
	
}
