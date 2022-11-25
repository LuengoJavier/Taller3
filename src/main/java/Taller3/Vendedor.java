package Taller3;

public class Vendedor extends Persona {
	private String tituloProfesional;
	private String estadoCivil;

	public Vendedor(String nombre, String rut, String direccion, String tituloProfesional, String estadoCivil) {
		super(nombre, rut, direccion);
		this.tituloProfesional = tituloProfesional;
		this.estadoCivil = estadoCivil;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTipo() {
		return "Vendedor";
	}
}