import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr=new String[]{"ef","asd","dfs"};
        List<String> list= Arrays.asList(arr);
        Collections.sort(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s-> System.out.println(s));
    }
}
