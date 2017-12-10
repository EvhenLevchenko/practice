package labwork15.labwork156;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {
    private Map<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public  String translate(String en){
        return  dictionary.get(en);
    }
}
