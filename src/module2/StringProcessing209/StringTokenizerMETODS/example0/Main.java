package module2.StringProcessing209.StringTokenizerMETODS.example0;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String s = "Hello world";

        System.out.println(s.length());
        System.out.println(s.equals("Hello world"));// анонимная строка существует только в данном контексте
        System.out.println(s.equalsIgnoreCase("hello world"));// этот метод игнорирует регистр
        System.out.println("           kjgh khjgkf         ".trim());// удаляет проебелы по бокам
        System.out.println("hgf    dghdfh".replaceAll(" ", ""));//заменяет строку на другую строку
        System.out.println("hello".contains("ell"));//проверяет если текущяя строка в составе проверяемой
        System.out.println("JjPJIOmlmMKL".toLowerCase());
        System.out.println("jhnjnHJI".toUpperCase());
        System.out.println("strrrr".startsWith("str"));//проверяет начинается ли строка с str
        System.out.println("strRrR".toLowerCase().endsWith("r"));// проверяет кончается ли строка на r
        System.out.println("gfjhkdg".isEmpty());//проверяет пустая-ли строка или нет
        System.out.println("****************");

        StringBuilder stringBuilder = new StringBuilder("Hello world");
        System.out.println(stringBuilder.insert(3, "qwer"));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.append("аппенд"));
        System.out.println(stringBuilder.delete(0, 3));
        System.out.println("*************************");

        String longStr = "mbsk, jgjigsofjb   jigjbiogsf, gkojbof";
        StringTokenizer stringTokenizer = new StringTokenizer(longStr, ",");
        System.out.println(stringTokenizer.countTokens());//количество разделенных предложений
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println("*******************************");

        String mStr = "    jfjdj    bkfjdbjdfb gfjdng,     ,    ghkflhk rKLKblvb     ";
        System.out.println(doString(mStr));
        String mStr1 = "  ,,   jfjdj  GIJDIOKJ  bkf,jdb,j,d,fb gfjdng,     ,    ghkflhk rKLKblvb     ";
        System.out.println(doString2(mStr1));
    }

    public static String doString(String input) {// принимает строку
        String temp = input.replaceAll(",", "").trim().toUpperCase();// запятые удаляем убираем пробелы по-бокам и делаем строку большим буквами
        StringBuilder result = new StringBuilder();// хранится наш результат
        StringTokenizer st = new StringTokenizer(temp);// получаем масив строк
        while (st.hasMoreElements()) {
            result.append(st.nextElement()).append(" ");
        }
        return result.toString().trim();//один пробел в конце потому-что это стринг билдер переводим в строку и обрезаем пробелы
    }

    public static String doString2(String input){
        String temp=input.replaceAll(",","").trim().toLowerCase();
        StringBuilder result=new StringBuilder();
        StringTokenizer stringTokenizer=new StringTokenizer(temp);
        while(stringTokenizer.hasMoreElements()){
            result.append(stringTokenizer.nextElement()).append(" ");
        }
        return  result.toString().trim();
    }
}
