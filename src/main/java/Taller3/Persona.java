package Taller3;

public abstract class Persona {
	private String nombre;
	private String rut;
	private String direccion;

	public Persona(String nombre, String rut, String direccion) {
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public abstract String getTipo();
}