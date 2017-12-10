package labwork15.labwork156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("dog", "coбака");
        myTranslator.addNewWord("mouse","мышь");

        Scanner scanner=new Scanner(System.in);

        String[] strings=scanner.nextLine().split(" ");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(myTranslator.translate(strings[i]));
            System.out.print(" ");
        }
        System.out.println();
        scanner.close();
    }
}
