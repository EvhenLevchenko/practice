package attic.book2.Chapter3.Gues;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.\nПопытайтесь ее угадать: ");
        char ch = (char) System.in.read();
        if (ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.print("Извинитe, нужная буква находится ");
            if (ch < answer)
                System.out.println("ближe к концу алфавита");
            else System.out.println("ближe к началу алфавита");
        }
    }
}
