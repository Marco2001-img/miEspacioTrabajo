package com.mx.empleado;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{
	List<Empleado> empleados = new ArrayList<Empleado>();
	

	@Override
	public void create(Empleado empleado) {
		 empleados.add(empleado);

	}

	@Override
	public void update(int indice, Empleado empleado) {
		  empleados.set(indice, empleado);

	}

	@Override
	public void mostrar() {
		System.out.println(empleados);

	}

	@Override
	public void delete(int indice) {
		empleados.remove(indice);

	}

	@Override
	public Empleado found(int indice) {
		  return empleados.get(indice);
	}
	
	

	public void Contar() {
		int cont=empleados.size();
		System.out.println("la lista contiene: "+cont);
	}

	public boolean existenDuplicados(Empleado empleado) {
		for(Empleado e : empleados) {
			if(e.getNombre().contentEquals(empleado.getNombre()) 
					&& e.getApellido().equalsIgnoreCase(empleado.getApellido())
					&& e.getEdad() == empleado.getEdad() && e.getContacto() == empleado.getContacto()
					&& e.getPuesto().contentEquals(empleado.getPuesto()) && e.getArea().equalsIgnoreCase(empleado.getArea())) {
				return true;
			}
			
		}
		return false;
	}
	
	public Empleado buscarPornombre(String nombre) {
		for(Empleado e: empleados) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				return e;
			}
			
		}
		return null;
	}
	
	public boolean eliminarEmpleadoPorNombres(String nombre) {
		for(int i =0; i<empleados.size(); i++) {
			if(empleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
				empleados.remove(i);
				return true;
			}
		}
		return false;
	}
	
}

