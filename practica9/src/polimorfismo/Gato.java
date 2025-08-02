package polimorfismo;

public class Gato extends SerVivo{
	protected int NumBigotes;
	
	public String mostrarDaTOS() {
		return "Gato \n"+"Nombre "+ this.nombre + "\nColor "+this.color+"\nNumero de patas: "+this.numeroPatas
				+"\nNumero de bigotes " + NumBigotes;
				
	}
	
	public Gato() {
		
	}

	public Gato(String nombre, String color, int numeroPatas, int numBigotes) {
		super(nombre, color, numeroPatas);
		NumBigotes = numBigotes;
	}

	public int getNumBigotes() {
		return NumBigotes;
	}

	public void setNumBigotes(int numBigotes) {
		NumBigotes = numBigotes;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", numeroPatas=" + numeroPatas + ", NumBigotes="
				+ NumBigotes + "]";
	}
	
	

}
