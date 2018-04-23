package attic.book2.Chapter3.HM.First;

import java.io.IOException;

 class Main {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;
        System.out.println("Для остановки введите символ точку");
        do {
            ch = (char) System.in.read();
            if (ch==' ')spaces++;
        } while (ch != '.');
        System.out.println("Пробелов "+spaces);
    }
}
