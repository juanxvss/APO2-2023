package puntoCuatro;


public class Factorial extends Punto4 {
    public Factorial(int num) {
        super(num);
    }

    public static void main(String[] args) {
        Factorial factorialDemo = new Factorial(10);
        System.out.println(factorialDemo);
    }
}
