package com.jariast.techniques.extractsuperclass;

public class EstudiantePosgrado extends Estudiante {
	
	private static final int MAXIMO_NUMERO_CREDITOS = 8;
	
	public EstudiantePosgrado() {
		super();
	}

	@Override
	protected int obtenerMaximoNumeroCreditos() {
		return MAXIMO_NUMERO_CREDITOS;
	}
}
