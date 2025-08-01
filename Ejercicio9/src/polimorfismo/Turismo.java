package polimorfismo;

public class Turismo extends Automovil{
	private int numAsientos;
	
	public String mostrarDaTOS() {
		return "Vehiculo \n"+"Marca "+ this.marca + "\nSubmarca "+this.submarca+"\nModelo: "+this.modelo 
				 + "numero de asientos: " +this.numAsientos;
				
	}
	
	public Turismo() {
		
	}

	public Turismo(String marca, String submarca, String modelo, int numAsientos) {
		super(marca, submarca, modelo);
		this.numAsientos = numAsientos;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + marca + ", submarca=" + submarca + ", modelo=" + modelo + ", numAsientos="
				+ numAsientos + "]";
	}
	
	
	

}
