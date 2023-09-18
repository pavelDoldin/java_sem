package sem_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class task_2 {
    public static void main(String[] args) {
        /*
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        List<Object> list = new ArrayList<>();
        list.add("str");
        list.add(1);
        list.add("str");
        list.add(4);
        list.add("str");
        list.add(6.1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){   // В место Integer написать Number. Удалит все цифры// instanceof для сравнения типов как if
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}







