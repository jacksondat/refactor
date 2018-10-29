package com.jariast.techniques.extractsuperclass;

import org.junit.Assert;
import org.junit.Test;

public class EstudianteTest {

	@Test (expected = Test.None.class)
	public void deberiaInscribirAsignaturaMenorAMaximoCreditosPregrado() {
		EstudiantePregrado estudiante = new EstudiantePregrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura asignaturaCuatroCreditos = new Asignatura("asignaturaCuatroCreditos", 4);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(asignaturaCuatroCreditos);
	}
	
	@Test (expected = Test.None.class)
	public void deberiaInscribirAsignaturaIgualAMaximoCreditosPregrado() {
		EstudiantePregrado estudiante = new EstudiantePregrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura otraAsignaturaCincoCreditos = new Asignatura("otraAsignaturaCincoCreditos", 5);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(otraAsignaturaCincoCreditos);
	}
	
	@Test (expected = RuntimeException.class)
	public void deberiaInscribirAsignaturaMayorAMaximoCreditosPregrado() {
		EstudiantePregrado estudiante = new EstudiantePregrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura asignaturaSeisCreditos = new Asignatura("otraAsignaturaCincoCreditos", 6);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(asignaturaSeisCreditos);
		
		Assert.fail();
	}
	
	@Test (expected = Test.None.class)
	public void deberiaInscribirAsignaturaMenorAMaximoCreditosPosgrado() {
		Estudiante estudiante = new EstudiantePosgrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura asignaturaDosCreditos = new Asignatura("asignaturaDosCreditos", 2);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(asignaturaDosCreditos);
	}
	
	@Test (expected = Test.None.class)
	public void deberiaInscribirAsignaturaIgualAMaximoCreditosPosgrado() {
		Estudiante estudiante = new EstudiantePosgrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura asignaturaTresCreditos = new Asignatura("asignaturaTresCreditos", 3);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(asignaturaTresCreditos);
	}
	
	@Test (expected = RuntimeException.class)
	public void deberiaInscribirAsignaturaMayorAMaximoCreditosPosgrado() {
		Estudiante estudiante = new EstudiantePosgrado();
		
		Asignatura asignaturaCincoCreditos = new Asignatura("asignaturaCincoCreditos", 5);
		Asignatura asignaturaCuatroCreditos = new Asignatura("asignaturaCuatroCreditos", 4);
		
		estudiante.inscribirAsignatura(asignaturaCincoCreditos);
		estudiante.inscribirAsignatura(asignaturaCuatroCreditos);
		
		Assert.fail();
	}

}
