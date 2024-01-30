package Massives;

import java.util.Arrays;
import java.util.Random;

public class Task38 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        int sum = 0;
        int maxSum = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                array[i][j] = random.nextInt(10);
                sum += array[i][j];
            }
            if (sum > maxSum) maxSum = sum;
            sum = 0;
        }
        for (int[] a :
                array) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Наибольшая сумма элементов столбца:\n" + maxSum);
    }
}
