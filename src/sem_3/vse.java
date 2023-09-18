package sem_3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class vse {
    public static void main(String[] args) {
        ex3();
    }
    static void ex0(){
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.
         */
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(2,10));
        }
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

    }
    static void ex1(){
        /*
        Создать список типа ArrayList
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
         */
        List<Object> list1 = new ArrayList<>();
        list1.add("Stroca");
        list1.add(1);
        list1.add("Stroca");
        list1.add(4);
        list1.add("Stroca");
        list1.add(6.1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)instanceof Integer){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
    }
    static void ex2(){
        /*
        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
         Напишите метод для заполнения данной структуры.
         */
        List<List<String >> shop = new ArrayList<>();
        addBook(shop,"Роман", "Война и мир");
        addBook(shop, "Фантастика", "Гари Поттер");
        addBook(shop, "Фантастика", "Властелин колец");
        addBook(shop, "Роман", "Муму");

        System.out.println(shop);
    }
    static void addBook(List<List<String >> shop,String genre, String bookName){
        for (List<String> item: shop){
            if (item.get(0).equals(genre)){
                item.add(bookName);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(bookName);
        shop.add(list);
    }
    static void ex3(){
        List<String> planets = List.of("Марс", "Венера", "Земля", "Юпитер", "Уран",
                "Нептун", "Плутон", "Меркурий", "Сатурн");
        List<String> listPlanets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listPlanets.add(planets.get((int)(Math.random()* planets.size())));
        }
        System.out.println(listPlanets);
        for (String planet: planets){
            int count = 0;
            for (String item: listPlanets){
                if (planet.equals(item)){
                    count++;
                }
            }
            System.out.println(planet + ": " + count);
        }
    }
}




























