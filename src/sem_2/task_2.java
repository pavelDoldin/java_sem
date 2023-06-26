package sem_2;

public class task_2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdda";
        System.out.println(ex0(s));
    }
    static String ex0(String s){
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.
        Результат: a4b3cd2
         */
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else {
                sb.append(s.charAt(i - 1));
                if (count != 1){
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        if (count != 1){
            sb.append(count);
        }
        return sb.toString();
    }
}





























