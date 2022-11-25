package Taller3;

public enum TipoMaterial {
	MADERA("Madera"),
	CEMENTO("Cemento"),
	LADRILLO("Ladrillo");
	private String tipoMaterial;

	private TipoMaterial(String tipoMaterial) {
		tipoMaterial = tipoMaterial;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}
}