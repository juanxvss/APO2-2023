package Nave;

//NaveTipo1.java
public class NaveTipo1 extends NaveEspacialAbstracta {
 @Override
 public void despegar() {
     System.out.println("La nave tipo 1 activa sus propulsores y despega hacia el espacio.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave tipo 1 realiza maniobras de descenso y aterriza suavemente en la superficie.");
 }

 public void activarPropulsores() {
     System.out.println("La nave tipo 1 enciende sus propulsores para aumentar la velocidad.");
 }
}