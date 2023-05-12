package Punto4;

public class NaveDeCombate extends NaveEspacial {
    private int nivelArmadura;
    private boolean armasActivas;
    private boolean propulsoresActivos;
    
    public NaveDeCombate(String modelo, int nivelArmadura) {
        super(modelo);
        this.nivelArmadura = nivelArmadura;
        this.armasActivas = false;
        this.propulsoresActivos = false;
    }
    
    public void activarArmas() {
        this.armasActivas = true;
    }
    
    public void desactivarArmas() {
        this.armasActivas = false;
    }
    
    public void repararArmadura() {
        // Implementación de la reparación de la nave
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
