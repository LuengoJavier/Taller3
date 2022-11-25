package Taller3;

import java.util.ArrayList;

public class Inmobiliaria {
	private final ArrayList<Persona> personas = new ArrayList<>();
	private final ArrayList<Inmueble> inmuebles = new ArrayList<>();
	private ArrayList<Venta> ventas = new ArrayList<>();

	public boolean agregarCliente(String nombre, String rut, String direccion) {
		if(buscarCliente(rut) == null) {
			Cliente cliente = new Cliente(nombre, rut, direccion);
			this.personas.add(cliente);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean agregarVendedores(String nombre, String rut, String direccion, String tituloProfesional, String estadoCivil) {
		if(buscarVendedor(rut) == null) {
			Vendedor vendedor = new Vendedor(nombre, rut, direccion, tituloProfesional, estadoCivil);
			this.personas.add(vendedor);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean agregarInmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		if(buscarInmueble(tipoMaterial,ubicacion, precio) == null) {
			Inmueble inmueble = new Inmueble(tipoMaterial, ubicacion, precio);
			this.inmuebles.add(inmueble);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean eliminarInmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		for(Inmueble inmueble : this.inmuebles) {
			if (inmueble.getTipoMaterial().equals(tipoMaterial) && inmueble.getUbicacion().equals(ubicacion) && inmueble.getPrecio() == precio){
				this.inmuebles.remove(inmueble);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Inmueble> buscarInmueblesTipoMaterial(String tipoMaterial) {
		ArrayList<Inmueble> inmuebles = new ArrayList<>();
		for (Inmueble inmueble : this.inmuebles) {
			if(inmueble.getTipoMaterial().equals(tipoMaterial)){
				inmuebles.add(inmueble);
			}
		} return inmuebles;
	}
	public Inmueble buscarInmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		for (Inmueble inmueble : this.inmuebles) {
			if(inmueble.getTipoMaterial().equals(tipoMaterial) && inmueble.getUbicacion().equals(ubicacion) && inmueble.getPrecio() == precio){
				return inmueble;
			}

		} return null;
	}
	public ArrayList<Inmueble> buscarInmueblesPrecio(int precio) {
		ArrayList<Inmueble> inmuebles = new ArrayList<>();
		for (Inmueble inmueble : this.inmuebles) {
			if(inmueble.getPrecio() == precio){
				inmuebles.add(inmueble);
			}
		} return inmuebles;
	}

	public Persona buscarCliente(String rut) {
		for (Persona persona : this.personas) {
			if(persona.getTipo().equals("Cliente"))	{
				if(persona.getRut().equals(rut)){
					return persona;
				}
			}
		} return null;
	}

	public Persona buscarVendedor(String rut) {
		for (Persona persona : this.personas) {
			if(persona.getTipo().equals("Vendedor"))	{
				if(persona.getRut().equals(rut)){
					return persona;
				}
			}
		} return null;
	}

}