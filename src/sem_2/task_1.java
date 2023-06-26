package sem_2;

public class task_1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 9;
        System.out.println(ex0(c1, c2, n));
    }

    static String ex0(char c1, char c2, int n) {

        /*
        Дано четное число N (>0) и символы c1 и c2.
        Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        Ответ: c1c2c1…c2 (всего N символов)
         */
       if (n <= 0 || n % 2 == 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        return sb.toString();
    }
}




