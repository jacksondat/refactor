package com.jariast.techniques.extractsuperclass;

public class Asignatura {
	private String nombre;
	private int creditos;
	
	public Asignatura(String nombre, int creditos) {
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getCreditos() {
		return creditos;
	}
}
