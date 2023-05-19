package Nave;

//NaveEspacialAbstracta.java
public abstract class NaveEspacialAbstracta implements NaveEspacial {
 // Implementación básica de los métodos de la interfaz NaveEspacial
 @Override
 public void despegar() {
     System.out.println("La nave espacial despega.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave espacial aterriza.");
 }

public abstract void mostrarCaracteristicas();

protected String propulsorPrincipal;
protected String capacidadPasajeros;
protected String capacidadCarga;
protected String propulsoresLaterales;
protected String velocidadMaxima;
protected String sistemasDefensa;

}

