package com.jariast.techniques.consolidateconditional;

public class Vehiculo {
	private String placa;
	private String nombrePropietario;
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo(String placa, String nombrePropietario, TipoVehiculo tipoVehiculo) {
		this.placa = placa;
		this.nombrePropietario = nombrePropietario;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
