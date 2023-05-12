package Punto2;

public class Cohete extends NaveEspacial {
    private double combustible;
    
    public Cohete(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, double combustible) {
        super(nombre, tripulacion, capacidadCarga, velocidadMaxima);
        this.setCombustible(combustible);
    }
    
    @Override
    public void despegar() {
        // Implementación específica para un cohete
    }
    
    @Override
    public void aterrizar() {
        // Implementación específica para un cohete
    }
    
    @Override
    public void viajar() {
        // Implementación específica para un cohete
    }

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
    
    // Getter y setter para combustible
}