import java.util.Scanner;

public class puntoSiete {
  public static void main(String[] args) {
    int numPruebas = 5;
    int[] resultados = new int[numPruebas];
    try (Scanner sc = new Scanner(System.in)) {
		// Pedir al usuario que ingrese los resultados de cada prueba
		for (int i = 0; i < numPruebas; i++) {
		  System.out.print("Ingrese el resultado de la prueba " + (i+1) + ": ");
		  resultados[i] = sc.nextInt();
		}
	}

    // Calcular el promedio de los resultados de las pruebas
    int sum = 0;
    for (int i = 0; i < numPruebas; i++) {
      sum += resultados[i];
    }
    double promedio = (double) sum / numPruebas;

    // Mostrar el promedio de los resultados de las pruebas
    System.out.println("El promedio de los resultados de las pruebas es: " + promedio);
  }
}
