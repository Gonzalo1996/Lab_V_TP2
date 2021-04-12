package dominio;


public class EntradaInfantil extends Entrada{
	
	private int edad; 
	
	public EntradaInfantil() {
		super();
	}
	
	public EntradaInfantil(Infantil infantil, int edad) {
		super(infantil);
		this.edad = edad;
	}
	
	@Override
	public double getPrecio() {
		if(this.edad >= 8) {
			return 500;
		}
		else {
			return 250;
		}
	}

}
