package sem_1;

public class task_5 {
    public static void main(String[] args) {
        int a = 2;
        int b = -2;
        double c = ex5(a, b);
        System.out.println(c);

    }
    static double ex5(int a, int b){
        /*
        Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
        Пример 1: а = 3, b = 2, ответ: 9
        Пример 2: а = 2, b = -2, ответ: 0.25
        Пример 3: а = 3, b = 0, ответ: 1
         */
        if (a == 0){
            return 1;
        }
        if (a == 0 || a == 1){
            return a;
        }
        double a1 = a;
        double b1 = b;
        if (b < 0){
            a1 = 1.0/a;
            b1 = -b;
        }
        double res = a1;
        for (int i = 0; i < b1 - 1; i++) {
            res *= a1;
        }
        return res;
    }
}



