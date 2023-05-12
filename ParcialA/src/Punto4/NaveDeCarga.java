package Punto4;

public class NaveDeCarga extends NaveEspacial {
    private int capacidadCarga;
    private boolean compPuertaAbierta;
    private boolean propulsoresActivos;
    
    public NaveDeCarga(String modelo, int capacidadCarga) {
        super(modelo);
        this.capacidadCarga = capacidadCarga;
        this.compPuertaAbierta = false;
        this.propulsoresActivos = false;
    }
    
    @Override
    public void abrirCompPuerta() {
        this.compPuertaAbierta = true;
    }
    
    @Override
    public void cerrarCompPuerta() {
        this.compPuertaAbierta = false;
    }
    
    public void cargar(int cantidad) {
        // Implementación de la carga de la nave
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
