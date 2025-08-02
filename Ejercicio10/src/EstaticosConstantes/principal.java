package EstaticosConstantes;

public class principal {
	public static String frase1="miembro";
	public final String frase2="variable final";
	public static final String frase3="variable estatica";
	
	public static void main(String[]args) {
		System.out.println(frase1);
		System.out.println(frase3);
		
		
		float radio =5;
		double area =calcucarAreaCirculo(radio);
		System.out.println("area de circulo con radio "+area);
	}
	
	public static Double calcucarAreaCirculo(float radio) {
		return Math.PI *(radio*radio);
		
	}

}
