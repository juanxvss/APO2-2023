import java.util.Scanner;

public class puntoCuatro {

    public static void main(String[] args) {

        final int CAPACIDAD_AUTOBUS = 45; // Capacidad del autobús
        int personasApuntadas; // Número de personas apuntadas para el viaje
        int autobusesNecesarios; // Número de autobuses necesarios
        int personasEnFurgonetas; // Número de personas que viajarán en furgonetas

        try (// Pedimos al usuario que ingrese el número de personas apuntadas
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el número de personas apuntadas para el viaje: ");
			personasApuntadas = scanner.nextInt();
		}
        // Calculamos el número de autobuses necesarios
        autobusesNecesarios = personasApuntadas / CAPACIDAD_AUTOBUS;
        if (personasApuntadas % CAPACIDAD_AUTOBUS != 0) {
            autobusesNecesarios++; // Si hay personas sobrantes, se necesita un autobús más
        }

        // Calculamos el número de personas que viajarán en furgonetas
        personasEnFurgonetas = personasApuntadas - (autobusesNecesarios * CAPACIDAD_AUTOBUS);

        // Mostramos los resultados
        System.out.println("El número necesario de autobuses es: " + autobusesNecesarios);
        System.out.println("El número total de personas que viajarán en furgonetas es: " + personasEnFurgonetas);
    }

}