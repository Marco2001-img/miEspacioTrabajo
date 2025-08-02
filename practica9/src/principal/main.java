package principal;

import polimorfismo.Gato;
import polimorfismo.Perro;
import polimorfismo.SerVivo;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerVivo[]sv = new SerVivo[3];
		sv[0] = new SerVivo("Pez Dorado", "Naranja", 0);
		sv[1] = new Gato("Michi", "Blanco", 4, 24);
		sv[2] = new Perro("Firulais", "Café", 4, "Labrador");
		
		for(SerVivo v:sv) {
			System.out.println(v.mostrarDaTOS());
		
			System.out.println(v);
		}

	}

}
