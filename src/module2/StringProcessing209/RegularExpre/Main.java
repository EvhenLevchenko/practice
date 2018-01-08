package module2.StringProcessing209.RegularExpre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    //    String str="http://google.com";//строка для проверки
       // Pattern p=Pattern.compile(".*http://.*");//обявляем наш патерн
        String str="BPjlh;lfb";
        Pattern p=Pattern.compile("^(B(W|H)).*");
        Matcher m=p.matcher(str);//
        System.out.println(m.matches());//
    }
}
