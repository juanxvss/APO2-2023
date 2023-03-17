import java.util.Scanner;

public class puntoCinco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la clasificación de tu instituto (1 para la más alta, 2 para la segunda más alta, o cualquier otro número para no cumplir este criterio): ");
        int instituteRanking = scanner.nextInt();
        
        System.out.print("Introduce tu nota media: ");
        double gpa = scanner.nextDouble();
        
        System.out.print("Introduce tu puntuación SAT: ");
        int satScore = scanner.nextInt();
        
        if (instituteRanking == 1 || instituteRanking == 2) {
            System.out.println("¡Cumples con el criterio de clasificación del instituto!");
        } else if (gpa >= 4.0 && satScore >= 1100) {
            System.out.println("¡Cumples con el criterio de nota media y puntuación SAT!");
        } else if (gpa >= 3.5 && satScore >= 1300) {
            System.out.println("¡Cumples con el criterio de nota media y puntuación SAT!");
        } else if (gpa >= 3.0 && satScore >= 1500) {
            System.out.println("¡Cumples con el criterio de nota media y puntuación SAT!");
        } else {
            System.out.println("Lo siento, no cumples con los requisitos de entrada.");
        }
        
        scanner.close();
    }

}
