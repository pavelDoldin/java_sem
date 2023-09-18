package sem_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task_1 {
    /*
    Замерте время, за которое в ArrayList добавиться 10_000_000 элементов.
    Замерте время, за которое в LinkedList добавиться 10_000_000 элементов.
    Сравнить оба.
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();  // ArrayList добовляет от 0 - N примерно как и LinkedList по времени
        List<Integer> list2 = new LinkedList<>(); // LinkedList добовляет в начало списка быстрей чем ArrayList

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}







