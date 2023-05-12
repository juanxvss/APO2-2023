package Punto2;

public class NaveCarga extends NaveEspacial {
    private double volumenCarga;
    
    public NaveCarga(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, double volumenCarga) {
        super(nombre, tripulacion, capacidadCarga, velocidadMaxima);
        this.volumenCarga = volumenCarga;
    }
    
    @Override
    public void despegar() {
        // Implementación específica para una nave de carga
    }
    
    @Override
    public void aterrizar() {
        // Implementación específica para una nave de carga
    }
    
    @Override
    public void viajar() {
        // Implementación específica para una nave de carga
    }
    
    // Getter y setter para volumenCarga
}
