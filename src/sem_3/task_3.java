package sem_3;

import java.util.ArrayList;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0() {



        /*
        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        что на 0й позиции каждого внутреннего списка содержится название жанра,
        а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
         */
        List<List<String>> shop = new ArrayList<>();
        addBook(shop, "Роман", "Война и мир");
        addBook(shop, "Фантастика", "Гари Потер");
        addBook(shop, "Фантастика", "Властелин колец");
        addBook(shop, "Роман", "Муму");

        System.out.println(shop);

    }

    //                                    Магазин       жанр          имя кники
    static void addBook(List<List<String>> shop, String genre, String bookName) {
        for (List<String> item : shop) {
            if (item.get(0).equals(genre)) {
                item.add(bookName);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(bookName);
        shop.add(list);
    }
}






