package sem_5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> map = new HashMap<>();

    void add (String passport, String name){
        map.put(passport, name);
    }

    void getByName(String name){
        for (Map.Entry<String, String> entry: map.entrySet()){
            if (entry.getValue().equals(name)){
                System.out.println(entry);
            }
        }
    }
}
