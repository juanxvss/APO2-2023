import java.util.Scanner;

public class puntoCuatro {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu peso en la Tierra (en libras): ");
        double weight = scanner.nextDouble();
        
        System.out.println("Selecciona uno de los siguientes planetas:");
        System.out.println("1. Mercurio\n2. Venus\n3. Marte\n4. Júpiter\n5. Saturno\n6. Urano\n7. Neptuno");
        System.out.print("Introduce el número del planeta: ");
        int planet = scanner.nextInt();
        
        double conversionFactor = 0.0;
        String planetName = "";
        
        switch(planet) {
            case 1:
                conversionFactor = 0.38;
                planetName = "Mercurio";
                break;
            case 2:
                conversionFactor = 0.91;
                planetName = "Venus";
                break;
            case 3:
                conversionFactor = 0.38;
                planetName = "Marte";
                break;
            case 4:
                conversionFactor = 2.36;
                planetName = "Júpiter";
                break;
            case 5:
                conversionFactor = 0.92;
                planetName = "Saturno";
                break;
            case 6:
                conversionFactor = 0.89;
                planetName = "Urano";
                break;
            case 7:
                conversionFactor = 1.13;
                planetName = "Neptuno";
                break;
            default:
                System.out.println("Número de planeta no válido.");
                System.exit(0);
        }
        
        double weightOnPlanet = weight * conversionFactor;
        System.out.printf("Tu peso en %s es %.2f libras.\n", planetName, weightOnPlanet);
        
        scanner.close();
    }

}
