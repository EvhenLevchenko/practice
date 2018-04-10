package attic.book2.Chapter1.ExarnpleЗDataTypes;

public class Example3 {
    public static void main(String[] args) {
        int var = 10;
        float a = 10.1f;
        double x = 8.1d;

        System.out.println("Haчaльнoe значение переменной var: " + var);
        System.out.println("Haчaльнoe значение переменной a: " + a);
        System.out.println("Haчaльнoe значение переменной х: " + x);
        System.out.println(); //вывести пуст строку

        var = var / 4;
        a = a / 4;
        x = x / 4;

        System.out.println("Знaчeниe переменной var после деления: " + var);
        System.out.println("Знaчeниe переменной a после деления: " + a);
        System.out.println("Знaчeниe переменной х после деления: " + x);
    }
}
