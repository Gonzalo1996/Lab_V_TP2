package dominio;

public class EntradaRecital extends Entrada{
	
	private boolean vip;

	public EntradaRecital() {
		super();
	}

	public EntradaRecital(Recital recital, boolean vip) {
		super(recital);
		this.vip = vip;
	}
	
	@Override
	public double getPrecio() {
		if(this.vip) {
			return 1500;
		}
		else {
			return 800;
		}
	}
}
