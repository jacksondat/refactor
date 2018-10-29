package com.jariast.techniques.extractsuperclass;

import java.util.ArrayList;
import java.util.List;

public abstract class Estudiante {

	protected List<Asignatura> asignaturas;

	public Estudiante() {
		asignaturas = new ArrayList<>();
	}

	public void inscribirAsignatura(Asignatura asignatura) {
		int numeroCreditos = 0;
		for (Asignatura asignaturaIter : asignaturas) {
			numeroCreditos += asignaturaIter.getCreditos();
		}
		
		if(numeroCreditos + asignatura.getCreditos() > obtenerMaximoNumeroCreditos()) {
			throw new RuntimeException("No se puede inscribir la asignatura debido que el estudiante excede el numero maximo de creditos");
		} else {
			asignaturas.add(asignatura);
		}
	}

	protected abstract int obtenerMaximoNumeroCreditos();

}