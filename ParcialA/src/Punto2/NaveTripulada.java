package Punto2;

public class NaveTripulada extends NaveEspacial {
    private int numPlazas;
    
    public NaveTripulada(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, int numPlazas) {
        super(nombre, tripulacion, capacidadCarga, velocidadMaxima);
        this.numPlazas = numPlazas;
    }
    
    @Override
    public void despegar() {
        // Implementación específica para una nave tripulada
    }
    
    @Override
    public void aterrizar() {
        // Implementación específica para una nave tripulada
    }
    
    @Override
    public void viajar() {
        // Implementación específica para una nave tripulada
    }
    
    // Getter y setter para numPlazas
}
