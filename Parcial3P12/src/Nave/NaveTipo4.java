package Nave;

public class NaveTipo4 extends NaveEspacialAbstracta {
    private int numeroArmas;
    private String tipoArmas;

    public NaveTipo4() {
        propulsorPrincipal = "Motor de Fusión";
        numeroArmas = 3;
        tipoArmas = "Láser";
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de Nave: Nave Tipo 4");
        System.out.println("Propulsor Principal: " + propulsorPrincipal);
        System.out.println("Número de Armas: " + numeroArmas);
        System.out.println("Tipo de Armas: " + tipoArmas);
    }

   
}