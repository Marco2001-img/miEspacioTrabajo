package polimorfismo;

public class Deportivo extends Automovil{
	protected int noClindros;
	
	public String mostrarDaTOS() {
		return "Vehiculo \n"+"Marca "+ this.marca + "\nSubmarca "+this.submarca+"\nModelo: "+this.modelo 
				  + "numero de cilindros: " + this.noClindros;
				
	}
	
	public Deportivo() {
		
	}

	public Deportivo(String marca, String submarca, String modelo, int noClindros) {
		super(marca, submarca, modelo);
		this.noClindros = noClindros;
	}

	public int getNoClindros() {
		return noClindros;
	}

	public void setNoClindros(int noClindros) {
		this.noClindros = noClindros;
	}

	@Override
	public String toString() {
		return "Deportivo [marca=" + marca + ", submarca=" + submarca + ", modelo=" + modelo + ", noClindros="
				+ noClindros + "]";
	}
	
	

}
