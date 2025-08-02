package com.mx.herencia;

public class Principal {

	public static void main(String[] args) {
		Hijo h1 = new Hijo("Daniel","Mendez","mexicana",20,1.40,"negro","Delgada");
		System.out.println(h1);
		
		h1.setEdad(21);
		h1.setEstatura(1.60);
		System.out.println(h1);
		
		h1.trabajar();
		
	}

}
