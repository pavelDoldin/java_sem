package sem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class dz_3 {
    public static void main(String[] args) {
        ex1();

    }

    static void ex0(){
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
        */
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0,10));
        }
        System.out.println(list); // рандом числа
        System.out.println("------------");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    static void ex1(){
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
        из этого списка. Collections.max()
        */
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            arr.add(rnd.nextInt(0,10));
        }

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        System.out.println(sum/arr.size() + " Среднее");


        int max = Collections.max(arr);
        System.out.println(max + " Максимальное !");

        int min = Collections.min(arr);
        System.out.println(min + " Минимальное !");

        System.out.println(arr + " Список");
    }
}



















