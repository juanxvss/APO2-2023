import java.lang.Math;
public class puntoDosE {
double y = 1.1; // Se define un valor inicial para y
double x = 2.1; // Se define un valor inicial para x
double e = 0; // Se define un valor inicial para e

while (Math.abs(e - 1) > 0.0001) {
  double numerator = 1;
  double denominator1 = y - 1;
  double denominator2 = Math.pow(x - 2, 2);
  e = numerator / (denominator1 * denominator2); // Se calcula el valor de e
  double yDerivative = numerator / Math.pow(denominator1, 2) / denominator2; // Se calcula la derivada parcial de y
  double xDerivative = 2 * numerator / denominator1 / Math.pow(denominator2, 2) * (x - 2); // Se calcula la derivada parcial de x
  y -= 0.0001 * yDerivative; // Se actualiza el valor de y
  x -= 0.0001 * xDerivative; // Se actualiza el valor de x
}


System.out.println("El valor de y es: " + y);
System.out.println("El valor de x es: " + x);
System.out.println("El valor de e es: " + e);
}

}