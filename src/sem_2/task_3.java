package sem_2;

public class task_3 {
    public static void main(String[] args) {
        String s = "потоп";
        System.out.println(ex0(s));

    }
    static boolean ex0(String s1){
        /*
        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
        (возвращает boolean значение).
        Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
         */
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length()-1-i)){
                return false;  // Ложь
            }
        }
        return true;  // Истина
    }
}


















