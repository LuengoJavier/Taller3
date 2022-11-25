package Taller3;

public class Cliente extends Persona {

	public Cliente(String nombre, String rut, String direccion) {
		super(nombre, rut, direccion);
	}
	public String getTipo() {
		return "Cliente";
	}
}