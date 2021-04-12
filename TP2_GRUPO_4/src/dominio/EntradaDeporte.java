package dominio;

public class EntradaDeporte extends Entrada{
	
	public EntradaDeporte() {
		super();
	}
	
	public EntradaDeporte(Deportes deporte) {
		super(deporte);
	}
	
	@Override
	public double getPrecio() {
		double precio = 0;
		
		switch(((Deportes)this.getEvento()).getDep().getNombre())
		{
		case "Futbol":
			precio = 300;
			break;
		case "Rugby":
			precio = 450;
			break;
		case "Hockey":
			precio = 380;
			break;
		}
		
		if (((Deportes)this.getEvento()).isInternacional()) {
			precio *= 1.3;
		}
		
		return precio;
	}
}
