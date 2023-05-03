package sem_1;

import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 3};
        int val = 3;
        ex3(arr, val);
    }
    static void ex3(int[] arr , int val){
        /*
        Дан мфссив nums = [3, 2, 5, 3] и число val = 3 и тог: [2, 5, 3, 3]
        Если в массиве есть числа, равные заданном, нужно перенести эти элементы в конец массива.
        Таким образзом, первые несколько (или все) элементов массива должны быть отличны от задонного,
        а остальные - равны ему.
         */
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0;  i < res.length ; i++) {
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
















