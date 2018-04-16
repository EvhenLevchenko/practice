package attic.book2.Chapter3.ContDemo;

class ContDemo {
    public static void main(String args[]) {
        int i;
// Вывести четные числа в пределах от О до 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // завершить шаг итерации цикла
            System.out.println(i);
        }
    }
}