package herencia;

public class Estudiante extends Persona{
	protected String carrera;
	
	public Estudiante(int id, int edad, String nombre,String carrera) {
		super(id, edad, nombre);
		this.carrera = carrera;
	}
	
	
	@Override
	public void mostrarInformacion() {
		 System.out.println("ID: " + id);
	     System.out.println("Nombre: " + nombre);
	     System.out.println("Edad: " + edad);
	     System.out.println("Carrera: " + carrera);
	}

}
