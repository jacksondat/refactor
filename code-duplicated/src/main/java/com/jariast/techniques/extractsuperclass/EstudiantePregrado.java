package com.jariast.techniques.extractsuperclass;

public class EstudiantePregrado extends Estudiante {

	private static final int MAXIMO_NUMERO_CREDITOS = 10;
	
	public EstudiantePregrado() {
		super();
	}

	@Override
	protected int obtenerMaximoNumeroCreditos() {
		return MAXIMO_NUMERO_CREDITOS;
	}
}
