package punto1;

import taller.trabajadores;



import taller.Uso_Empleado;

public class Punto {
	public static void main(String[] args) {
		trabajadores trabajador1 = new trabajadores("Paco");
		trabajadores trabajador2 = new trabajadores("Ana");
		trabajadores trabajador3 = new trabajadores("Antonio");
		trabajadores trabajador4 = new trabajadores("Maria");
		
		trabajador1.cambiarSeccionn("RRHH");

		System.out.println(trabajador1.devolverDatos()+ "\n" + trabajador2.devolverDatos()+ "\n"+ trabajador3.devolverDatos()+ "\n"+ trabajador4.devolverDatos());
		
		System.out.println(trabajadores.IdSiguiente());
		
		
		Uso_Empleado usoEmpleados = new Uso_Empleado();
	}
}