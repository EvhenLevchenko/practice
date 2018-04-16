package attic.book2.Chapter3.HelpMenu;

import java.io.IOException;

public class HelpMenu {
    public static void main(String[] args) throws IOException {
        char choise;

        System.out.println("Спрвка :");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Выберете: ");
        choise = (char) System.in.read();

        System.out.println("\n");

        switch (choise) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор");
                System.out.println("else оператор");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
