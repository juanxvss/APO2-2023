import java.util.Scanner;

public class puntoSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la altura de la habitación en metros: ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese la longitud de la habitación en metros: ");
        double longitud = sc.nextDouble();

        System.out.print("Ingrese el ancho de la habitación en metros: ");
        double ancho = sc.nextDouble();

        double areaParedes = 2 * altura * (longitud + ancho);
        double areaTecho = longitud * ancho;
        double areaTotal = areaParedes + areaTecho;

        double botes5L = Math.ceil(areaTotal / 1500);
        double botes1L = Math.ceil(areaTotal / 300);

        System.out.println("Número de botes de 5 litros necesarios: " + botes5L);
        System.out.println("Número de botes de 1 litro necesarios: " + botes1L);

        double costo5L = botes5L * 15;
        double costo1L = botes1L * 4;

        if (costo5L < costo1L) {
            System.out.println("Compre " + botes5L + " botes de 5 litros por un costo de " + costo5L + " dólares.");
        } else {
            System.out.println("Compre " + botes1L + " botes de 1 litro por un costo de " + costo1L + " dólares.");
        }
    }
}
