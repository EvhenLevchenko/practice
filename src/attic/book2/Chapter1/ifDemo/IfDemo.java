package attic.book2.Chapter1.ifDemo;

public class IfDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a - b;//c=-1

        if (a < b) System.out.println("a меньше b");
        if (a == b) System.out.println("b больше a");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c - отрицательное число");
    }
}
