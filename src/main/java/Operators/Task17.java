package Operators;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите числo:");
        int i = scan.nextInt();
        if ((i % 2) == 0) System.out.println("„исло " + i + " чЄтное");
        else System.out.println("„исло " + i + " нечЄтное");

    }
}
