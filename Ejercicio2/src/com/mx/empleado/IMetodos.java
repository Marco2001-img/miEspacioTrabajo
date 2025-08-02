package com.mx.empleado;

public interface IMetodos {
	public void create(Empleado empleado);
	public void update(int indice, Empleado empleado);
	public void mostrar();
	public void delete(int indice);
	public Empleado found(int indice);

}
