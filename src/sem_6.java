import java.util.*;

public class sem_6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "Иван", "Рыжий");
        Cat cat2 = new Cat("Барсик", "Пётр", "Чёрный");
        Cat cat3 = new Cat("Киса", "Мария", "Белый");
        Cat cat4 = new Cat("Нюня", "Ольга", "Чёрный");
        // System.out.println(cat1.equals(cat2));
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        for (Cat cat: set){
            if (cat.getColor().equalsIgnoreCase("Чёрны")){
                System.out.println(cat);
            }
        }

        //System.out.println(set);

    }
    static void ex1(){
        //1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        //2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
        // уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        //Для вычисления процента используйте формулу:
        //процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        Integer[] arr = createArray(10,0,24);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqPercent(arr) + " %");
    }
    static double uniqPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double uniq = set.size() * 100.0 / arr.length;
        return uniq;
    }
    static Integer[] createArray(int count, int min, int max){
        Integer[] arr = new Integer[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }

    static void ex0() {

        // 1.Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        // Распечатайте содержимое данного множества.
        // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        // Распечатайте содержимое данного множества.
        // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
        // Распечатайте содержимое данного множества.

        Integer[] arr = new Integer[] {2, 3, 2, 4, 1, 5, 6, 3}; // Создали массив иттов
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));  //  отсартирует и распечатает
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr)); // как есть так и распечатает
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));  //  отсартирует и распечатает
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}



















