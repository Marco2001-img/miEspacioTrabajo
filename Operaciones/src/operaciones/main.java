package operaciones;

public class main {

	public static void main(String[] args) {
		 Operaciones op = new Operaciones();

	     int resultado1 = op.multiplicar(2, 5);
	     int resultado2 = op.multiplicar(2, 3, 4);

	     System.out.println("Multiplicación de 2 números: " + resultado1);
	     System.out.println("Multiplicación de 3 números: " + resultado2);
		
	}

}
