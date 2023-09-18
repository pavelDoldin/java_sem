package sem_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        /*
        Рефлизовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (true){
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            if (text.equals("print")){
                System.out.println(list.remove(num));
            } else if (text.equals("exit")){
                System.out.println("До скорой встречи !");
                break;
            } else {
                list.add(num, text);
            }
        }
    }
}







