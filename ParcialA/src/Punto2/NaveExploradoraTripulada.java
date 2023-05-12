package Punto2;

public class NaveExploradoraTripulada extends NaveTripulada implements NaveExploradora {
private String[] instrumentos;

public NaveExploradoraTripulada(String nombre, int tripulacion, double capacidadCarga, double velocidadMaxima, int numPlazas, String[] instrumentos) {
    super(nombre, tripulacion, capacidadCarga, velocidadMaxima, numPlazas);
    this.setInstrumentos(instrumentos);
}

@Override
public void despegar() {
    // Implementación específica para una nave exploradora tripulada
}

@Override
public void aterrizar() {
    // Implementación específica para una nave exploradora tripulada
}

@Override
public void viajar() {
    // Implementación específica para una nave exploradora tripulada
}

@Override
public void explorar() {
    // Implementación específica para una nave exploradora tripulada
}

public String[] getInstrumentos() {
	return instrumentos;
}

public void setInstrumentos(String[] instrumentos) {
	this.instrumentos = instrumentos;
}

// Getter y setter para instrumentos
}