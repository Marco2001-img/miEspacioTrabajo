package com.mx.Abstr;

public abstract class Profesionista {
	protected String nombre,apellido,universidad;
	protected int edad,cedula,experiencia;
	
	public abstract void trabajar();
	
	public void cobrar(String trabajo,Double sueldo) {
		System.out.println("trabajo como " + trabajo + " y me pagan " + sueldo);
	}
	
	public Profesionista() {
		
	}

	public Profesionista(String nombre, String apellido, String universidad, int edad, int cedula, int experiencia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.universidad = universidad;
		this.edad = edad;
		this.cedula = cedula;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", apellido=" + apellido + ", universidad=" + universidad + ", edad="
				+ edad + ", cedula=" + cedula + ", experiencia=" + experiencia + "]";
	}
	
	
	
	

}
