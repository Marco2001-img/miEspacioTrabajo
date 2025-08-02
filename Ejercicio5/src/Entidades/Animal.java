package Entidades;

public class Animal {
	private String especie;
	private String color;
	private Double peso;
	private int numeroPatas;
	
	public Animal() {
		
	}

	public Animal(String especie, String color, Double peso, int numeroPatas) {
		super();
		this.especie = especie;
		this.color = color;
		this.peso = peso;
		this.numeroPatas = numeroPatas;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", color=" + color + ", peso=" + peso + ", numeroPatas=" + numeroPatas
				+ "]";
	}
	
	

}
