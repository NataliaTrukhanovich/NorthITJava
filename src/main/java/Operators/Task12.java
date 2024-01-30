package Operators;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите два числа:");
        int i = scan.nextInt();
        int y = scan.nextInt();
        if (i != y)
            if (i > y) System.out.println("ѕервое число больше, чем второе");
            else System.out.println("ѕервое число меньше, чем второе");
        else System.out.println("„исла равны");
    }
}
