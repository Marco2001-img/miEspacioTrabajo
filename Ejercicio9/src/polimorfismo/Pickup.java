package polimorfismo;

public class Pickup extends Automovil {
	
	protected int capacidadCarga;
	
	public String mostrarDaTOS() {
		return "Vehiculo \n"+"Marca "+ this.marca + "\nSubmarca "+this.submarca+"\nModelo: "+this.modelo 
				  + "Capacidad de carga: " + this.capacidadCarga;
				
	}
	
	public Pickup() {
		
	}

	public Pickup(String marca, String submarca, String modelo, int capacidadCarga) {
		super(marca, submarca, modelo);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return "Pickup [marca=" + marca + ", submarca=" + submarca + ", modelo=" + modelo + ", capacidadCarga="
				+ capacidadCarga + "]";
	}

}
