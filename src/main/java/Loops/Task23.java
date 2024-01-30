package Loops;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ������ ����� ���������");
        int index = scan.nextInt();
        int prev1 = 0;
        int prev2 = 1;
        if (index > 0) {
            if (index == 1) System.out.println("����� ��������� ��� �������� " + index + " = 0");
            else if (index == 2) {
                System.out.println("����� ��������� ��� �������� " + index + " = 1");
            } else {
                int next = 0;
                System.out.print("������������������ ���������: " + prev1 + " " + prev2);
                for (int i = 3; i <= index; i++) {
                    next = prev1 + prev2;
                    prev1 = prev2;
                    prev2 = next;
                    System.out.print(" " + next);
                }
                System.out.println("\n����� ��������� ��� �������� " + index + " = " + next);
            }
        } else System.out.println("����� �������� ������");

    }
}
