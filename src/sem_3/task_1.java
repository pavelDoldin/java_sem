package sem_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import static java.util.Collections.sort;

public class task_1 {
    public static void main(String[] args) {
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        //double a = Math.random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(2,10));
        }
        System.out.println(arr);
        sort(arr);                            // сортировка от малого к большему
        System.out.println(arr);
        arr.sort(Comparator.reverseOrder()); // сортировка от большего к малому
        System.out.println(arr);
    }
}