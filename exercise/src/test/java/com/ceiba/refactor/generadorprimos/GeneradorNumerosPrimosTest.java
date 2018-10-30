package com.ceiba.refactor.generadorprimos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GeneradorNumerosPrimosTest {

	GeneradorNumerosPrimos generador;
	
	@Before
	public void setUp() throws Exception {
		generador = new GeneradorNumerosPrimos();
	}

	@Test
	public void deberiaRetornarVacio() {
		int valorMaximo = 0;
		
		int[] arregloVacio = generador.generarNumerosPrimos(valorMaximo);
		
		assertEquals(arregloVacio.length, 0);
	}
	
	@Test
	public void deberiaRetornarNumeroPrimoDos() {
		int valorMaximo = 2;
		
		int[] arregloVacio = generador.generarNumerosPrimos(valorMaximo);
		
		assertEquals(arregloVacio.length, 1);
		assertEquals(arregloVacio[0], 2);
	}
	
	@Test
	public void deberiaRetornarNumerosPrimosDosyTres() {
		int valorMaximo = 3;
		
		int[] arregloVacio = generador.generarNumerosPrimos(valorMaximo);
		
		assertEquals(arregloVacio.length, 2);
		assertEquals(arregloVacio[0], 2);
		assertEquals(arregloVacio[1], 3);
	}
	
	@Test
	public void deberiaRetornarNumerosPrimosMenoresQue100() {
		int valorMaximo = 100;
		
		int[] arregloVacio = generador.generarNumerosPrimos(valorMaximo);
		
		assertEquals(arregloVacio.length, 25);
		assertEquals(arregloVacio[24], 97);
	}

}
