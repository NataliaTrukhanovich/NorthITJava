package Operators;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ��� �����:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = ((a > b) && (a > c)) ? a : ((b > c) ? b : c);
        int min = ((a < b) && (a < c)) ? a : ((b < c) ? b : c);
        System.out.println("���������� �����: " + max + "\n���������� �����: " + min);
        System.out.println("����� ����������� � ����������� ����� = " + (max + min));

    }
}
