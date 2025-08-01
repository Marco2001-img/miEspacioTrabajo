package com.mx.empleado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado emp1 = new Empleado("gerardo","lopez",25,15161313,"aux.contable","contabilidad");
		Empleado emp2 = new Empleado("Loreyn", "Allard", 18, 1234567890, "Developer", "Desarrollo");
		Empleado emp3 = new Empleado("Laura", "Ramírez", 30, 10293847, "Jefa de Recursos Humanos", "Recursos Humanos");
		Empleado emp4 = new Empleado("Saul", "Vega", 23, 2449876323L, "Recursos Humanos", "RRHH");


		Empleado emp = null;

		Implementacion imp = new Implementacion();

//		imp.create(emp1);
//		imp.create(emp2);
//		imp.create(emp3);
//		imp.create(emp4);
//
//		imp.mostrar();
//
//		emp = imp.found(1);
//		System.out.println(emp);
//
//
//		emp = imp.found(0);
//		emp.setArea("Finanzas");
//		emp.setContacto(4646461323L);
//		imp.update(0, emp);
//		imp.mostrar();
//
//
//		imp.delete(2);
//		imp.mostrar();
//
//		imp.Contar();
		
		Scanner datos  = new Scanner(System.in);
		int menuP=0,menuS=0,indice=0;
		String nombre,apellido,puesto,area;
		int edad;
		Long contacto;
		
		do {
			System.out.println("Menu");
			System.out.println("1.-Alta");
			System.out.println("2.-Buscar");
			System.out.println("3.-editar");
			System.out.println("4.-eliminar");
			System.out.println("5.-mostrar");
			System.out.println("6.-contar");
			System.out.println("7.-salir");
			System.out.println("elige una opcion");
			try {
				menuP=datos.nextInt();
				datos.nextLine();
				
				switch(menuP) {
				case 1:
					System.out.println("alta");
					System.out.println("llena los siguientes datos sobre el empleado");
					
					System.out.println("nombre: ");
					nombre=datos.nextLine();
					
					System.out.println("apellido");
					apellido=datos.nextLine();
					
					System.out.println("edad: ");
					edad = datos.nextInt();
					datos.nextLine();
					
					System.out.println("contacto");
					contacto=datos.nextLong();
					datos.nextLine();
					
					System.out.println("puesto: ");
					puesto = datos.nextLine();
					
					
					System.out.println("area: ");
					area = datos.nextLine();
					
					emp = new Empleado(nombre,apellido,edad,contacto,puesto,area);
					
					if(imp.existenDuplicados(emp)) {
						System.out.println("este registro, no se puede agregar");
					}else {
						imp.create(emp);
						System.out.println("guardado" + emp.getNombre());
					}

					break;
					
				case 2:
					System.out.println("buscar");
					System.out.println("como desea buscar: ");
					System.out.println("nombre");
					System.out.println("indice");
					menuS=datos.nextInt();
					datos.nextLine();
					if(menuS==1) {
						imprimirDatos(imp);
						if(imp.empleados.size()>0) {
							System.out.println("indica para mostrar informacion");
							indice = datos.nextInt();
							datos.nextLine();
							
							if(indice>=0 && indice<imp.empleados.size()) {
								emp = imp.found(indice);
								System.out.println("esta es la informacion del empleado " + emp);
							}else {
								System.out.println("no se encontro informacion");
							}
							
						}
					}else if(menuS ==2) {
						System.out.println("nombre de empleado: ");
						String nombreBusqueda = datos.nextLine();
						
						emp = imp.buscarPornombre(nombreBusqueda);
						if(emp!=null) {
							System.out.println(emp);
						}else {
							System.out.println("no se encntro empleado");
						}
					}else {
						System.out.println("opcion invalida");
					}
					
					
					break;
					
				case 3:
					imprimirDatos(imp);
					if(imp.empleados.size()>0) {
						System.out.println("indique el indice que desee editar");
						indice=datos.nextInt();
						datos.nextLine();
						
						if(indice >=0 && indice<imp.empleados.size()) {
							do {
								System.out.println("Sub menu");
								System.out.println("1.-nombre");
								System.out.println("2.-Apellido");
								System.out.println("3.-edad");
								System.out.println("4.-contacto");
								System.out.println("5.-puesto");
								System.out.println("6.-area");
								System.out.println("7.-regresar al menu principal");
								System.out.println("elige una opcion");
								menuS = datos.nextInt();
								datos.nextLine();
								emp = imp.found(indice);
								
								switch(menuS) {
								case 1:
									System.out.println("ingresa el nuevo nombre: ");
									nombre = datos.nextLine();
									emp.setNombre(nombre);
									break;
									
								case 2:
									System.out.println("ingrese el nuevo apellido");
									apellido = datos.nextLine();
									emp.setApellido(apellido);
									break;
									
								case 3:
									System.out.println("ingresa la nueva edad");
									edad = datos.nextInt();
									emp.setEdad(edad);
									break;
									
								case 4:
									System.out.println("ingresa el nuevo contacto: ");
									contacto = datos.nextLong();
									emp.setContacto(contacto);
									break;
									
								case 5:
									System.out.println("ingresa el nuevo puesto: ");
									puesto = datos.nextLine();
									emp.setPuesto(puesto);
									break;
									
								case 6:
									System.out.println("ingrese la nueva area ");
									area = datos.nextLine();
									emp.setArea(area);
									break;
									
								case 7:
									System.out.println("regresando al menu principal");
									break;
									
									default:
										System.out.println("indice no valido");
										break;
								}
								System.out.println("edicion exitosa");
							}while(menuS!=7);
						}else {
							System.out.println("este indice no existe");
						}
					}
					break;
					
				case 4:
					System.out.println("eliminar");
					System.out.println("como desea eliminar :");
					System.out.println("1.-indice");
					System.out.println("2.-nombre");
					menuS=datos.nextInt();
					datos.nextLine();
					
					if(menuS ==1) {
						imprimirDatos(imp);
						if(imp.empleados.size()>0) {
							System.out.println("indica el indice que deseas eliminar ");
							indice = datos.nextInt();
							if(indice >= 0 && indice<imp.empleados.size()) {
								imp.delete(indice);
								System.out.println("eliminado");
							}else {
								System.out.println("ese indice no existe");
							}
						}
					}else if(menuS ==2) {
						System.out.println("ingresa el nombre: ");
						String nombreEliminar = datos.nextLine();
						if(imp.eliminarEmpleadoPorNombres(nombreEliminar)) {
							System.out.println("empleado eliminado");
							
							
						}else {
							System.out.println("no se encontro el empleado");
						}
						
					}else {
						System.out.println("opcion invalida");
					}
					

					break;
					
				case 5:
					System.out.println("mostrar");
					if(imp.empleados.size() > 0) {
						imp.mostrar();
					}else {
						System.out.println("no hay datos");
					}
					break;
					
				case 6:
					System.out.println("contar");
					imp.Contar();
					break;
					
				case 7:
					System.out.println("saliendo, vuelva pronto");
					break;
				
					default:
						System.out.println("indice fuera de rango");
						break;
				}
			}catch(InputMismatchException e) {
				System.out.println("entrada invalda");
				datos.nextLine();
				
			}catch(Exception e ) {
				System.out.println("ocurrio un error " + e.getMessage());
			}
			
		}while(menuP!=7);

	}

	private static void imprimirDatos(Implementacion imp) {
		System.out.println("Empleados registrados");
		if(imp.empleados.size() > 0 ) {
			for(int i = 0; i<imp.empleados.size(); i++) {
				System.out.println("el empleado "+ i+ " " + imp.empleados.get(i).getNombre());
					
			}
		}else {
			System.out.println("no hay empleados registrados");
		}
		
	}
}