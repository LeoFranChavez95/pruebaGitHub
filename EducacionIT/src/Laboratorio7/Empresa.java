package Laboratorio7;
/*
Armar una clase Empresa, donde el método main deberá tener la siguiente secuencia de actividades:
a. instanciar N (al menos 6) empleados con sus nombres, dni y edad
b. agregar los N empleados a una ArrayList llamado losEmpleados
c. recorrer el ArrayList losEmpleados e imprimir en pantalla los datos (nombre / dni / edad) de cada empleado
d. imprimir en pantalla la cantidad de empleados que tiene la empresa
e. recorrer el ArrayList losEmpleados e imprimir en pantalla los datos (nombre / dni / edad) de cada empleado menor de 30 años
f. para realizar el punto c. armar un método con la siguiente firma:
public static void informarDatosDeEmpleados (ArrayList losEmpleados)
g. para realizar el punto e. armar un método con la siguiente firma:
public static ArrayList
obtenerDatosDeEmpleadosMenosDe30(ArrayList losEmpleados)
De ser posible reutilizar el método informarDatosDeEmpleados()
*/

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Empresa {
  
	ArrayList <Empleado> losEmpleados = new ArrayList(); 
	
	public void agregarEmpleados(Empleado unEmpleado) {
		
		losEmpleados.add(unEmpleado);
		
	}
	
	public static void informarDatosEmpleados(ArrayList <Empleado>listaEmpleados) {
		
		listaEmpleados.stream().forEach(empleado->System.out.println(empleado));
		
	}
	
	public int cantidadDeEmpleados() {
		
		return this.losEmpleados.size();
		
	}
	
	public static ArrayList<Empleado> obtenerDatosDeEmpleadosMenosDe30(ArrayList<Empleado> listaEmpleados){
		
		return (ArrayList<Empleado>) listaEmpleados.stream().filter(empleado->(empleado.getEdad())<30).
				collect(Collectors.toList());
		
	}

	public ArrayList<Empleado> getLosEmpleados() {
		return losEmpleados;
	}

	public void setLosEmpleados(ArrayList<Empleado> losEmpleados) {
		this.losEmpleados = losEmpleados;
	}
	
	
}
