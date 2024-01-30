package Operators;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int polozhitelnie = 0;
        int otricatelnie = 0;
        if (a > 0) polozhitelnie++;
        else if (a < 0) otricatelnie++;
        if (b > 0) polozhitelnie++;
        else if (b < 0) otricatelnie++;
        if (c > 0) polozhitelnie++;
        else if (c < 0) otricatelnie++;
        if (d > 0) polozhitelnie++;
        else if (d < 0) otricatelnie++;
        System.out.println("Количество положительных чисел: " + polozhitelnie);
        System.out.println("Количество отрицательных чисел: " + otricatelnie);
    }
}
