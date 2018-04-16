package attic.book2.Chapter3.КbIn;

import java.io.IOException;

public class KbIn {
    public static void main(String[] args) throws IOException {
        System.out.println("Haжмитe нужную клавишу, а затем клавишу ENTER: ");
        char ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу "+ch);
    }
}
