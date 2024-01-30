package Operators;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scan.nextInt();
        if (i != 10)
            if (i > 10) System.out.println("Число больше десяти");
            else System.out.println("Число меньше десяти");
        else System.out.println("Число равно десяти");
    }
}

