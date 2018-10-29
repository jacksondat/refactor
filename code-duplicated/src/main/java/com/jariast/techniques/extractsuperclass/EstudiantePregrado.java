package com.jariast.techniques.extractsuperclass;

import java.util.Collections;
import java.util.List;

public class EstudiantePregrado {

	private static final int MAXIMO_NUMERO_CREDITOS = 10;
	private List<Asignatura> asignaturas;
	
	public EstudiantePregrado() {
		asignaturas = Collections.emptyList();
	}
	
	public void inscribirAsignatura(Asignatura asignatura) {
		int numeroCreditos = 0;
		for (Asignatura asignaturaIter : asignaturas) {
			numeroCreditos += asignaturaIter.getCreditos();
		}
		
		if(numeroCreditos + asignatura.getCreditos() > MAXIMO_NUMERO_CREDITOS) {
			throw new RuntimeException("No se puede inscribir la asignatura debido que el estudiante excede el numero maximo de creditos");
		} else {
			asignaturas.add(asignatura);
		}
	}
}
