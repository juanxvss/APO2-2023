package taller;

public class Uso_Empleado {
	public Uso_Empleado() {
		Trabajador[] misEmpleados = new Trabajador[4];

		misEmpleados[0] = new Trabajador("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Trabajador("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Trabajador("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Trabajador("Antonio Fernández");
		
		for(Trabajador e: misEmpleados) {
			e.subeSueldo(0);
		}
		
		for(Trabajador e: misEmpleados) {
			System.out.println("nombre: " + e.digiteNombre()
			+ " sueldo: " + e.digiteSueldo()
			+ " contrato: " + e.digiteFechaContrato());
		}
	}
}