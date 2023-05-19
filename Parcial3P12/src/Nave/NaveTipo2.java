package Nave;

public class NaveTipo2 extends NaveEspacialAbstracta {
    private double capacidadCarga;
    private int velocidadMaxima;

    public NaveTipo2() {
        propulsorPrincipal = "Motor de Antimateria";
        capacidadCarga = 2000.0;
        velocidadMaxima = 500;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de Nave: Nave Tipo 2");
        System.out.println("Propulsor Principal: " + propulsorPrincipal);
        System.out.println("Capacidad de Carga: " + capacidadCarga);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }

 
}