package Nave;

public class NaveTipo1 extends NaveEspacialAbstracta {
    private int capacidadPasajeros;
    private double cargaMaxima;

    public NaveTipo1() {
        propulsorPrincipal = "Impulsor de Plasma";
        capacidadPasajeros = 50;
        cargaMaxima = 1000.0;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de Nave: Nave Tipo 1");
        System.out.println("Propulsor Principal: " + propulsorPrincipal);
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
        System.out.println("Carga Máxima: " + cargaMaxima);
    }
}