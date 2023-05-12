package Punto2;

public class NaveExploradoraNoTripulada extends NaveCarga implements NaveExploradora {
private String[] instrumentos;
public NaveExploradoraNoTripulada(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, double volumenCarga, String[] instrumentos) {
    super(nombre, tripulacion, capacidadCarga, velocidadMaxima, volumenCarga);
    this.setInstrumentos(instrumentos);
}

@Override
public void despegar() {
    // Implementación específica para una nave exploradora no tripulada
}

@Override
public void aterrizar() {
    // Implementación específica para una nave exploradora no tripulada
}

@Override
public void viajar() {
    // Implementación específica para una nave exploradora no tripulada
}

@Override
public void explorar() {
    // Implementación específica para una nave exploradora no tripulada
}

public String[] getInstrumentos() {
	return instrumentos;
}

public void setInstrumentos(String[] instrumentos) {
	this.instrumentos = instrumentos;
}

// Getter y setter para instrumentos
}