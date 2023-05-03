package sem_1;

public class task_4 {
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        System.out.println(ex4(text));
    }
    static String ex4(String text){
        /*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         */
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length-1; i >= 0 ; i--) {
            res += temp[i] + " ";

        }
        return res;
    }
}
