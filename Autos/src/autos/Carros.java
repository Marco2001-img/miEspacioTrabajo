package autos;

public class Carros {
	private String marca;
	private String color;
	private int año;
	private String modelo;
	
	
	public Carros() {
		
	}


	public Carros(String marca, String color, int año, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.año = año;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Carros [marca=" + marca + ", color=" + color + ", año=" + año + ", modelo=" + modelo + "]";
	}
}
