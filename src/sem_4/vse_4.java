package sem_4;

import java.util.*;

public class vse_4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"123", "222", "111", "444"};
        ex3(arr);
    }
    static void ex0(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list2.add(0,i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
    static void ex1(){
        /*
        Реализовать консольное приложение которое,
        Принимает от пользователя строку вида text~num
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
                System.out.println(list.remove());
            } else if (text.equals("exit")) {
                System.out.println("До скорых встреч.");
                break;
            } else {
                list.add(num, text);
            }
        }
    }
    static void ex2(){
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти
         */
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print" :
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert" :
                    list.removeLast();
                    break;
                case "exit" :
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }
    }
    static void ex3(String[] arr){
        /*
      Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
      Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */
        printStack(arr);
    }
    static void printStack (String[] arr){
        LinkedList<String> linkedList = new LinkedList<>();
        for (String s : arr){
            linkedList.push(s);
        }

        while (!linkedList.isEmpty()){
            System.out.println(linkedList.pop());
        }
    }
}





























