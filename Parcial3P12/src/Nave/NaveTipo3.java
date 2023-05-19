package Nave;

public class NaveTipo3 extends NaveEspacialAbstracta {
    private int numeroPropulsores;
    private boolean tieneCamuflaje;

    public NaveTipo3() {
        propulsorPrincipal = "Motor de Impulso";
        numeroPropulsores = 4;
        tieneCamuflaje = true;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de Nave: Nave Tipo 3");
        System.out.println("Propulsor Principal: " + propulsorPrincipal);
        System.out.println("Número de Propulsores: " + numeroPropulsores);
        System.out.println("Tiene Camuflaje: " + (tieneCamuflaje ? "Sí" : "No"));
    }

    
}