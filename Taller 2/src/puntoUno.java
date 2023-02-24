import java.util.Scanner;

public class puntoUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = 0.5 * base * altura;

        System.out.println("La superficie del triángulo es: " + area);

        sc.close();
    }
}