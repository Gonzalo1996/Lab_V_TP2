package dominio;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private char genero;
	private Provincia provincia;
	private Localidad localidad;
	
	public Cliente() {}

	public Cliente(String nombre, String apellido, int dni, String direccion, char genero, Provincia provincia,
			Localidad localidad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.genero = genero;
		this.provincia = provincia;
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ", Direccion: " + direccion
				+ ", Genero: " + genero + ", Provincia: " + provincia + ", Localidad: " + localidad;
	}
}
