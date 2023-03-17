import java.util.Scanner;

public class puntoDos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introduce el operador (+, -, *, / o %): ");
        String operator = scanner.next();
        
        double result;
        switch(operator) {
            case "+":
                result = num1 + num2;
                System.out.println("El resultado de la suma es: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("El resultado de la resta es: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("El resultado de la división es: " + result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println("El resultado del módulo es: " + result);
                break;
            default:
                System.out.println("El operador introducido no es válido.");
                break;
        }
        
        scanner.close();
    }

}
