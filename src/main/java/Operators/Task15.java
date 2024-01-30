package Operators;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите три числа:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("—амое большое число = " + max);
    }
}
