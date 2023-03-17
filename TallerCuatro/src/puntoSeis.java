import java.util.Scanner;

public class puntoSeis {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu media en clase (de 0 a 100): ");
        double media = scanner.nextDouble();
        
        System.out.print("Introduce el número de clases a las que has faltado: ");
        int faltas = scanner.nextInt();
        
        if ((media >= 90 && faltas <= 3) || (media >= 80 && faltas == 0))
            System.out.println("¡Quedas exento de hacer el examen final!");
        else
            System.out.println("Debes hacer el examen final.");
        
        scanner.close();
    }

}
