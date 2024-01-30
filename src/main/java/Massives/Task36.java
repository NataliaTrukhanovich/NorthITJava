package Massives;

import java.util.Arrays;
import java.util.Random;

public class Task36 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[10][10];
        int[] diagonal = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(100);
                if (i == j) diagonal[i] = array[i][j];
            }
        }
        for (int[] a :
                array) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Главная диагональ:");
        System.out.println(Arrays.toString(diagonal));
    }
}
