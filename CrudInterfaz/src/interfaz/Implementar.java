package interfaz;

import java.util.ArrayList;
import java.util.List;



public class Implementar implements EstudianteService{
	List<Estudiante> estudiantes = new ArrayList<Estudiante>();

	@Override
	public void create(Estudiante estudiante) {
		estudiantes.add(estudiante);
		
	}

	@Override
	public void update(int indice, Estudiante estudiante) {
		estudiantes.set(indice, estudiante);
		
	}

	@Override
	public void mostrar() {
		System.out.println(estudiantes);
		
	}

	@Override
	public void delete(int indice) {
		estudiantes.remove(indice);
		
	}

	@Override
	public Estudiante found(int indice) {
		 return estudiantes.get(indice);
	}

}
