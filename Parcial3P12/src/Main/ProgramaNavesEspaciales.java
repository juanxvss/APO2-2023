package Main;

import java.util.Scanner;

import Nave.NaveEspacialAbstracta;
import Nave.NaveTipo1;
import Nave.NaveTipo2;
import Nave.NaveTipo3;
import Nave.NaveTipo4;

public class ProgramaNavesEspaciales {
    private static NaveEspacialAbstracta[] inventarioNaves = new NaveEspacialAbstracta[9];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;

        while (!terminar) {
            System.out.println("------ Menú ------");
            System.out.println("1. Crear una nave");
            System.out.println("2. Buscar una nave");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearNave();
                    break;
                case 2:
                    buscarNave();
                    break;
                case 3:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
    }

    private static void crearNave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Crear Nave ------");
        System.out.println("1. Nave Tipo 1");
        System.out.println("2. Nave Tipo 2");
        System.out.println("3. Nave Tipo 3");
        System.out.println("4. Nave Tipo 4");
        System.out.print("Ingrese el tipo de nave a crear: ");
        int tipoNave = scanner.nextInt();

        switch (tipoNave) {
            case 1:
                NaveTipo1 naveTipo1 = new NaveTipo1();
                agregarNaveAlInventario(naveTipo1);
                break;
            case 2:
                NaveTipo2 naveTipo2 = new NaveTipo2();
                agregarNaveAlInventario(naveTipo2);
                break;
            case 3:
                NaveTipo3 naveTipo3 = new NaveTipo3();
                agregarNaveAlInventario(naveTipo3);
                break;
            case 4:
                NaveTipo4 naveTipo4 = new NaveTipo4();
                agregarNaveAlInventario(naveTipo4);
                break;
            default:
                System.out.println("Tipo de nave inválido. No se pudo crear la nave.");
                break;
        }
    }

    private static void agregarNaveAlInventario(NaveEspacialAbstracta nave) {
        for (int i = 0; i < inventarioNaves.length; i++) {
            if (inventarioNaves[i] == null) {
                inventarioNaves[i] = nave;
                System.out.println("La nave ha sido agregada al inventario.");
                return;
            }
        }
        System.out.println("El inventario de naves está lleno. No se pudo agregar la nave.");
    }

    private static void buscarNave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de nave a buscar: ");
        int tipoNave = scanner.nextInt();

        for (NaveEspacialAbstracta nave : inventarioNaves) {
            if (nave != null && nave.getClass().getSimpleName().equals("NaveTipo" + tipoNave)) {
                System.out.println("Nave encontrada en el inventario: " + nave.getClass().getSimpleName());
                System.out.println("Características de la nave:");
                nave.mostrarCaracteristicas(); // Método para mostrar las características de la nave
                return;
            }
        }

        System.out.println("No se encontró ninguna nave del tipo " + tipoNave + " en el inventario.");
    }
}
