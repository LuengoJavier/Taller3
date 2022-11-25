package Taller3;

public class Venta {
	private String codigoVenta;
	private Cliente cliente;
	private Vendedor vendedor;
	private Inmueble inmueble;
	public Venta(String codigoVenta, Cliente cliente, Vendedor vendedor, Inmueble inmueble){
		this.codigoVenta = codigoVenta;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.inmueble = inmueble;
	}

	public String getCodigoVenta() {
		return this.codigoVenta;
	}
}