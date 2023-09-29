package sem_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task_3 {
    public static void main(String[] args) {
    ex("Мороз и солнце день чудесный \n" +
            "Еще ты дремлешь друг прелестный \n" +
            "Пора красавица проснись");
    }
    static void ex(String s){
                /*
        Взять набор строк, например,

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.

        Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны “потеряться”.
         */
        s = s.replace("\n","");
        Map<Integer, List<String>> map = new TreeMap<>();
        String[] arr = s.split(" ");
        for (String s1: arr){
            int len = s1.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(s1);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s1);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }

}
