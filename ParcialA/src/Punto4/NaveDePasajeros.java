package Punto4;

public class NaveDePasajeros extends NaveEspacial {
    private int capacidadPasajeros;
    private int pasajerosActuales;
    private boolean propulsoresActivos;
    
    public NaveDePasajeros(String modelo, int capacidadPasajeros) {
        super(modelo);
        this.capacidadPasajeros = capacidadPasajeros;
        this.pasajerosActuales = 0;
        this.propulsoresActivos = false;
    }
    
    public void abordarPasajero() {
        // Implementación del abordaje de un pasajero
    }
    
    public void desembarcarPasajero() {
        // Implementación del desembarque de un pasajero
    }
    
    public int getPasajerosActuales() {
        return pasajerosActuales;
    }
    
    @Override
    public void activarPropulsores() {
        this.propulsoresActivos = true;
    }
    
    @Override
    public void desactivarPropulsores() {
        this.propulsoresActivos = false;
    }
}
