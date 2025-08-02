package herencia;

public class Administrador extends Persona{
	protected String departamento;
	
	public Administrador(int id, int edad, String nombre,String departamento) {
		super(id, edad, nombre);
		this.departamento = departamento;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("ID " + id);
		System.out.println("Nombre " + nombre);
		System.out.println("Edad " + edad);
		System.out.println("Departamento " + departamento);
		
	}

}
