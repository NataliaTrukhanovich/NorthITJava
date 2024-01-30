package Massives;

public class Task33 {
    public static void main(String[] args) {
        int[] array = {3, 42, -9, 2, -20, -1, 3, 67, 9, -11, 0, 100};
        //Массив для примера с отсутствием чётных значений
        //int[] array = {1, 3, 5, 7};
        int sum = 0;
        int count = 0;
        for (int a : array
        ) {
            if ((a % 2) == 0) {
                sum += a;
                count++;
            }
        }
        if (count > 0)
            System.out.println("Сумма чётных значений элементов массива: " + sum);
        else System.out.println("Чётных значений элементов в массиве нет");
    }
}
