package com.mx.herencia;

public class Padre {
	protected String nombre,apellido,nacionalidad;
	protected int edad;
	protected double estatura;
	
	public Padre() {
		
	}

	public Padre(String nombre, String apellido, String nacionalidad, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.estatura = estatura;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + ", estatura=" + estatura + "]";
	}
	
	public void trabajar() {
		System.out.println("trabaja de 8am a 4pm");
	}

}
