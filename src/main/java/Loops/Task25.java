package Loops;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¬ведите строку");
        String str = scan.nextLine();
        int i = 0;
        if (str.length() != 0) {
            do {
                System.out.println(str.charAt(i));
                i++;
            } while (i < str.length());
        }
    }
}
