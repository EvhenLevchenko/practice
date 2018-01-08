package module2.StringProcessing209.example0;

public class Main {
    public static void main(String[] args) {
        char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
        String str = new String(helloArray);
        System.out.println(str);
        System.out.println("*************");
        System.out.println();

        String string = "Hello Brain!!";
        int len = string.length();// длинна строки
        System.out.println("String Lenght is : " + len);
        System.out.println("*************lenght");
        System.out.println();

        String string1 = "Hello ";
        String string2 = "Brain-Academy!!!";
        String concat = string1.concat(string2);// conacat and + . Обьеденяют две строки
        String string4 = string1 + string2;
        System.out.println(concat);
        System.out.println(string4);
        System.out.println("*************concat");
        System.out.println();


        char aChar0 = string1.charAt(0);// доступ по индексу к букве
        char aChar4 = string1.charAt(4);
        System.out.println(aChar0);
        System.out.println(aChar4);
        System.out.println("*************charAt");
        System.out.println();

        String substr1 = string2.substring(0);// доступ по индексу к подстроке
        String substr2 = string2.substring(6, 9);
        System.out.println(substr1);
        System.out.println(substr2);
        System.out.println("*************substring");
        System.out.println();

        char cgar = 'a';
        int i1 = string2.indexOf(cgar);// показывает на каком индексе буква
        int i2 = string2.lastIndexOf('a');
        int i3 = string2.indexOf('l');
        int i4 = string2.indexOf("Brain");// показывает с какого индекса начинается слово
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("*********************indexOf");
        System.out.println();

        String str1 = "cartoon";
        String str2 = "tomcat";
        System.out.println(metod(str1, str2));

    }

    public static String metod(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            if (str2.indexOf(character) == -1 && result.indexOf("" + character) == -1) {//если метод indexOf вернул нам -1 значит этого символа в строке нет
                result.append(character);// значит эго необходимо добавить в результат
            }
        }
        return result.toString();
    }
}
