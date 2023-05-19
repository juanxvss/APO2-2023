package Nave;

//NaveTipo3.java
public class NaveTipo3 extends NaveEspacialAbstracta {
 @Override
 public void despegar() {
     System.out.println("La nave tipo 3 se impulsa hacia el espacio utilizando motores de plasma.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave tipo 3 realiza un aterrizaje controlado en una pista de aterrizaje especializada.");
 }

 public void cambiarModoPropulsión() {
     System.out.println("La nave tipo 3 cambia al modo de propulsión de impulso warp para viajar a velocidades superlumínicas.");
 }
}
