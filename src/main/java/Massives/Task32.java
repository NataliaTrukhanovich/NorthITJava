package Massives;

public class Task32 {
    public static void main(String[] args) {
        int[] array = {1, 3, 45, -9, 2, -15, -1, 3, 67, 9, -11, 1, 7, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов с чётными индексами = " + sum);
    }
}
