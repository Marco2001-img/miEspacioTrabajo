package Entidades;

public class Motos {
    private String marca;
    private String modelo;
    private int año;
    private int cilindraje;

	public Motos() {
		
	}
	
	public Motos(int año) {
		this.año=año;
		
	}

	public Motos(String marca, String modelo, int año, int cilindraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.cilindraje = cilindraje;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Motos [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", cilindraje=" + cilindraje + "]";
	}
	
	

}
