package Operators;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ââåäèòå òğè ÷èñëà:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        int min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
        System.out.println("Íàèáîëüøåå ÷èñëî: " + max + "\nÍàèìåíüøåå ÷èñëî: " + min);
        System.out.println("Ñóììà íàèáîëüøåãî è íàèìåíüøåãî ÷èñåë = " + (max + min));

    }
}
