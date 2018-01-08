package module2.StringProcessing209.StringBuilder.example0;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A0");
        for (int i = 1; i < 13; i++) {
            stringBuilder.append("p");
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.toString());
        System.out.println("*****************append");
        System.out.println();

        StringBuilder stringBuilder1 = new StringBuilder(10);
        stringBuilder1.append("Hello...");
        char c = '!';
        stringBuilder1.append(c);
        stringBuilder1.insert(8, " Java");
        stringBuilder1.delete(5, 8);
        System.out.println(stringBuilder1);
    }
}
