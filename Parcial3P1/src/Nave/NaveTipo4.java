package Nave;

//NaveTipo4.java
public class NaveTipo4 extends NaveEspacialAbstracta {
 @Override
 public void despegar() {
     System.out.println("La nave tipo 4 se eleva utilizando cohetes de propulsión iónica y despega hacia el espacio.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave tipo 4 realiza maniobras de aproximación y aterriza en una base espacial flotante.");
 }

 public void activarSistemaAntigravedad() {
     System.out.println("La nave tipo 4 activa el sistema antigravedad para una mayor estabilidad durante el vuelo y el aterrizaje.");
 }
}