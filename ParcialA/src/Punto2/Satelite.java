package Punto2;

public class Satelite extends NaveEspacial {
    private String orbita;
    
    public Satelite(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, String orbita) {
        super(nombre, tripulacion, capacidadCarga, velocidadMaxima);
        this.orbita = orbita;
    }
    
    @Override
    public void despegar() {
        //
    }

    @Override
    public void aterrizar() {
        // Un satélite no aterriza
    }

    @Override
    public void viajar() {
        // Implementación específica para un satélite
    }

    // Getter y setter para orbita
    }

    public interface NaveExploradora {
    public void explorar();
    }

   