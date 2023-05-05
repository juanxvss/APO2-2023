package puntoCuatro;


public abstract class Punto4 {
    protected int num;

    public Punto4(int num) {
        this.num = num;
    }

    protected int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) {
                sb.append(" * ");
            }
        }
        sb.append(" = ").append(getFactorial());
        return sb.toString();
    }
}


