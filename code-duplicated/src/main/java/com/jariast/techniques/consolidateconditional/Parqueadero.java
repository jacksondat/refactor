package com.jariast.techniques.consolidateconditional;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
	private List<Vehiculo> vehiculos;
	
	public Parqueadero() {
		vehiculos = new ArrayList<>();
	}
	
	public void ingresarVehiculo(Vehiculo vehiculo) {
		if(vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.MOTO) == 0) {
			vehiculos.add(vehiculo);
		} 
		
		if(vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.CARRO) == 0) {
			vehiculos.add(vehiculo);
		} 
		
		if(vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.CAMIONETA) == 0) {
			vehiculos.add(vehiculo);
		}
	}
	
	public int obtenerOcupacion() {
		return vehiculos.size();
	}
}
