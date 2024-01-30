package Operators;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три строны треугольника:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (a == c)) System.out.println("Этот треугольник равносторонний");
            else if ((a == b) || (a == c) || (b == c)) System.out.println("Этот треугольник равнобедренный");
            else System.out.println("Этот треугольник разносторонний");
        } else System.out.println("Стороны треугольника не могут быть отрицательным числом или равняться 0");
    }
}
