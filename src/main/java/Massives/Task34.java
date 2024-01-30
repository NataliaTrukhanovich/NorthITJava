package Massives;

public class Task34 {
    public static void main(String[] args) {
        int[] array = {30, 42, -9, -2, 20, -1, 102, -3, 67, -9, -11, 90, 102};
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) max = array[i + 1];
        }
        System.out.println("Наибольший элемент массива = " + max);
    }
}
