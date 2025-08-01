package com.mx.herencias;

public class Padre {
	protected String marca,modelo,color;
	protected int kilometraje,año;
	
	public Padre() {
		
	}

	public Padre(String marca, String modelo, String color, int kilometraje, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.kilometraje = kilometraje;
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Padre [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", kilometraje=" + kilometraje
				+ ", año=" + año + "]";
	}
	
	
	public void MarcaAutoFaV() {
		System.out.println("Mazda CX-5 2021 rojo");
	}
}
