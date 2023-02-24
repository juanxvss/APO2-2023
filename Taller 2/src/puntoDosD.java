import java.lang.Math;

public class puntoDosD {
    public static void main(String[] args) {
        double x = 2.0; // Definimos el valor de x
        double y = 3.0; // Definimos el valor de y
        double d = Math.pow(x, 4) - Math.sqrt(6*x) - Math.pow(y, 3); // Calculamos el valor de d
        System.out.println("El valor de d es: " + d); // Mostramos el resultado por consola
    }
}