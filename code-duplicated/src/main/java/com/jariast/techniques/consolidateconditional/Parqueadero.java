package com.jariast.techniques.consolidateconditional;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
	private List<Vehiculo> vehiculos;
	
	public Parqueadero() {
		vehiculos = new ArrayList<>();
	}
	
	public void ingresarVehiculo(Vehiculo vehiculo) {
		if(isVehiculoPermitido(vehiculo)) {
			vehiculos.add(vehiculo);
		}
	}

	private boolean isVehiculoPermitido(Vehiculo vehiculo) {
		return vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.MOTO) == 0 || vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.CARRO) == 0 || vehiculo.getTipoVehiculo().compareTo(TipoVehiculo.CAMIONETA) == 0;
	}
	
	public int obtenerOcupacion() {
		return vehiculos.size();
	}
}
