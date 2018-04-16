package attic.book2.Chapter3.ContToLabel;

public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i <= 10; i++) {
            System.out.print("\nBнemний цикл: проход " + i +
                    ", внутренний цикл: ");
            for (int j = 1; j < 10; j++) {
                if (j == 2) continue outerloop;
                System.out.print(j);
            }
        }
    }
}
