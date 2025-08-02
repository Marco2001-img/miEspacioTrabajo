package com.mx.herencias;

public class Hijo extends Padre{
	protected String tipoCombustible,trasmision;
	
	public Hijo() {
		
	}
	
	public Hijo(String marca, String modelo, String color, int kilometraje, int año, String tipoCombustible,
			String trasmision) {
		super(marca, modelo, color, kilometraje, año);
		this.tipoCombustible = tipoCombustible;
		this.trasmision = trasmision;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getTrasmision() {
		return trasmision;
	}

	public void setTrasmision(String trasmision) {
		this.trasmision = trasmision;
	}

	@Override
	public String toString() {
		return "Hijo [tipoCombustible=" + tipoCombustible + ", trasmision=" + trasmision + ", marca=" + marca
				+ ", modelo=" + modelo + ", color=" + color + ", kilometraje=" + kilometraje + ", año=" + año + "]";
	}
	
	
	
	

}
