package ec.edu.ups.patron.creacional.builder.controller;

import ec.edu.ups.patron.creacional.builder.model.ActivoFijo;

public class ActivoFijoBuilder {

	private ActivoFijo activoFijo;

	public ActivoFijoBuilder() {
		this.activoFijo = new ActivoFijo();
	}

	public ActivoFijoBuilder addCodigo(int codigo) {
		this.activoFijo.setCodigo(codigo);
		return this;
	}

	public ActivoFijoBuilder addNombre(String nombre) {
		this.activoFijo.setNombre(nombre);
		return this;
	}

	public ActivoFijoBuilder addPrecio(Double precio) {
		this.activoFijo.setPrecio(precio);
		return this;
	}

	public ActivoFijoBuilder addProcesador(String procesador) {
		this.activoFijo.setProcesador(procesador);
		return this;
	}

	public ActivoFijoBuilder addMemoriaRam(String memoriaRam) {
		this.activoFijo.setMemoriaRam(memoriaRam);
		return this;
	}

	public ActivoFijoBuilder addPLaca(String placa) {
		this.activoFijo.setPlaca(placa);
		return this;
	}

	public ActivoFijoBuilder addNumeroChasis(String numeroChasis) {
		this.activoFijo.setNumeroChasis(numeroChasis);
		return this;
	}

	public ActivoFijoBuilder addNumeroCajones(int numeroCajones) {
		this.activoFijo.setNumeroCajones(numeroCajones);
		return this;
	}

	public ActivoFijoBuilder addNumeroPatas(int numeroPatas) {
		this.activoFijo.setNumeroPatas(numeroPatas);
		return this;
	}

	public ActivoFijo construir() {
		return this.activoFijo;
	}
}
