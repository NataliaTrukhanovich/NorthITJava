package Massives;

public class Task35 {
    public static void main(String[] args) {
        int[] array = {30, 42, 80, 42, 0, 1, 80, 30, 42, 81, 80, 1, 42};
        //Для примера массив с уникальными значениями
        //int[] array = {30, 42, -9, -2, 20, -1, 102, -3, -80, -8, -11, 90, 103};
        int currentCount = 0;
        int count = 0;
        int chislo = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    currentCount++;
            }
            if ((currentCount > 0) && (currentCount > count)) {
                count = currentCount;
                chislo = array[i];
            } else if ((currentCount == count) && (array[i] > chislo)) chislo = array[i];
            currentCount = 0;
        }
        if (count == 0) System.out.println("Повторяющихся чисел в массиве нет");
        else System.out.println("Наиболее часто встречающееся число " + chislo);
    }
}
