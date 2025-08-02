package com.mx.herencia;

public class Hijo extends Padre{
	private String colorOjos;
	private String complexion;
	
	public Hijo() {
		
	}

	public Hijo(String nombre, String apellido, String nacionalidad, int edad, double estatura, String colorOjos,
			String complexion) {
		super(nombre, apellido, nacionalidad, edad, estatura);
		this.colorOjos = colorOjos;
		this.complexion = complexion;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad
				+ ", estatura=" + estatura + ", colorOjos=" + colorOjos + ", complexion=" + complexion + "]";
	}
	
	
	

}
