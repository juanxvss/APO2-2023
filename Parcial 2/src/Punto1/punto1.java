package Punto1;

import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingresa una frase:");
			String frase = sc.nextLine();
			char[] caracteres = frase.toCharArray();
			System.out.println("Los caracteres de la frase son:");
			for (char c : caracteres) {
			    System.out.print(c + " ");
			}
		}
    }
}
