package com.jariast.techniques.consolidateconditional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParqueaderoTest {

	Parqueadero parqueadero;
	Vehiculo vehiculo;
	
	@Before
	public void setUp() throws Exception {
		parqueadero = new Parqueadero();
		
		vehiculo = new Vehiculo("JKM789", "John Doe", TipoVehiculo.MOTO);
	}

	@Test
	public void deberiaPermitirIngresoAMotos() {
		TipoVehiculo moto = TipoVehiculo.MOTO;
		vehiculo.setTipoVehiculo(moto);
		
		parqueadero.ingresarVehiculo(vehiculo);
		
		int ocupacion = parqueadero.obtenerOcupacion();
		
		assertEquals(1, ocupacion);
	}
	
	@Test
	public void deberiaPermitirIngresoACarros() {
		TipoVehiculo carro = TipoVehiculo.CARRO;
		vehiculo.setTipoVehiculo(carro);
		
		parqueadero.ingresarVehiculo(vehiculo);
		
		int ocupacion = parqueadero.obtenerOcupacion();
		
		assertEquals(1, ocupacion);
	}
	
	@Test
	public void deberiaPermitirIngresoACamionetas() {
		TipoVehiculo camioneta = TipoVehiculo.CAMIONETA;
		vehiculo.setTipoVehiculo(camioneta);
		
		parqueadero.ingresarVehiculo(vehiculo);
		
		int ocupacion = parqueadero.obtenerOcupacion();
		
		assertEquals(1, ocupacion);
	}
	
	@Test
	public void noDeberiaPermitirIngresoACamiones() {
		TipoVehiculo camion = TipoVehiculo.CAMION;
		vehiculo.setTipoVehiculo(camion);
		
		parqueadero.ingresarVehiculo(vehiculo);
		
		int ocupacion = parqueadero.obtenerOcupacion();
		
		assertEquals(0, ocupacion);
	}

}
