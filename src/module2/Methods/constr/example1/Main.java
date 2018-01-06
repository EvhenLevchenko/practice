package module2.Methods.constr.example1;

public class Main {


    private int a;
    private int b;
    private int c;

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m);
    }

    public Main() {
        this(123);
    }

    public Main(int a) {
        this(a, 2);
    }

    public Main(int a, int b) {
        this(a, b, 2);
    }

    public Main(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Main{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
