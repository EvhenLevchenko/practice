package labwork15.labwork151;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        for (int i = 0; i <10; i++) {
            list.add("number_"+i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
