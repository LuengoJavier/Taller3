package Taller3;

import java.util.ArrayList;
import Taller3.Persona;
import Taller3.Inmueble;
import Taller3.Venta;

public class Inmobiliaria {
	private final ArrayList<Persona> personas = new ArrayList<>();
	private final ArrayList<Inmueble> inmuebles = new ArrayList<>();
	private ArrayList<Venta> ventas = new ArrayList<>();

	public boolean agregarCliente(String nombre, String rut, String direccion) {

	}

	public boolean agregarVendedores(String nombre, String rut, String direccion, String tituloProfesional, String estadoCivil) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarInmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarInmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		throw new UnsupportedOperationException();
	}

	public void buscarInmueble(String tipoMaterial, int precio) {
		throw new UnsupportedOperationException();
	}

	public void buscarCliente(String rut) {
		for (Persona persona : this.clientes) {
			if(persona.getRut().equals(rut)){
				return persona;
			}
		} return null;
	}

	public void buscarVendedor(String rut) {
		throw new UnsupportedOperationException();
	}
}