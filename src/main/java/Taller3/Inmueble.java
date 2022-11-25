package Taller3;

public class Inmueble {
	private TipoMaterial tipoMaterial;
	private String ubicacion;
	private int precio;

	public Inmueble(TipoMaterial tipoMaterial, String ubicacion, int precio) {
		this.tipoMaterial = tipoMaterial;
		this.ubicacion = ubicacion;
		this.precio = precio;
	}

	public TipoMaterial getTipoMaterial() {
		return this.tipoMaterial;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public double getPrecio() {
		return this.precio;
	}
}