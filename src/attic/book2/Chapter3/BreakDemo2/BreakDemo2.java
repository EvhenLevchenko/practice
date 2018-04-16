package attic.book2.Chapter3.BreakDemo2;

import java.io.IOException;

public class BreakDemo2 {
    public static void main(String[] args) throws IOException {

        for(;;){
            char ch=(char)System.in.read();
            if (ch=='q')break;
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
