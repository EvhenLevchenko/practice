package attic.book2.Chapter5.Mas.ArrayDemo;

public class ArrayDemo {
    public static void main(String[] args) {
        int mas[] = new int[10];

        for (int i = 0; i < 10; i++)
            mas[i] = i;
        for (int i = 0; i < 10; i++)
            System.out.println("Элeмeнт[" + i + "]: " + mas[i]);
    }
}
