package Loops;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ����� �����");
        int x = scan.nextInt();
        if (x >= 0) {
            System.out.println("׸���� ����� �� 0 �� " + x + ":");
            for (int i = 0; i < (x + 1); i++) {
                if ((i % 2) == 0) System.out.print(i + " ");
            }
        } else {
            System.out.println("׸���� ����� �� " + x + " �� 0:");
            for (int i = x; i <= 0; i++) {
                if ((i % 2) == 0) System.out.print(i + " ");
            }
        }
    }
}
