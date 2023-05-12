package Punto4;

public class NaveDeExploracion extends NaveEspacial {
    private boolean antenaDesplegada;
    private boolean propulsoresActivos;
    
    public NaveDeExploracion(String modelo) {
        super(modelo);
        this.antenaDesplegada = false;
        this.propulsoresActivos = false;
    }
    
    public void desplegarAntena() {
        this.antenaDesplegada = true;
    }
    
    public void recogerAntena() {
        this.antenaDesplegada = false;
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
