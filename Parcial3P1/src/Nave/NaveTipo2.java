package Nave;

//NaveTipo2.java
public class NaveTipo2 extends NaveEspacialAbstracta {
 @Override
 public void despegar() {
     System.out.println("La nave tipo 2 inicia la secuencia de despegue y se eleva verticalmente.");
 }

 @Override
 public void aterrizar() {
     System.out.println("La nave tipo 2 realiza un aterrizaje controlado en una plataforma designada.");
 }

 public void activarSistemaAterrizaje() {
     System.out.println("La nave tipo 2 activa el sistema de aterrizaje para un aterrizaje seguro.");
 }
}