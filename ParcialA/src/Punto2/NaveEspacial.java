package Punto2;

public abstract class NaveEspacial {
    private String nombre;
    private int tripulacion;
    private double capacidadCarga;
    private double velocidadMaxima;
    
    public NaveEspacial(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima) {
        this.setNombre(nombre);
        this.setTripulacion(tripulacion);
        this.setCapacidadCarga(capacidadCarga);
        this.setVelocidadMaxima(velocidadMaxima);
    }
    
    public abstract void despegar();
    
    public abstract void aterrizar();
    
    public abstract void viajar();

	public int getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
    
    // Getters y setters
}