package Operators;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ��� ������ ������������:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (a == c)) System.out.println("���� ����������� ��������������");
            else if ((a == b) || (a == c) || (b == c)) System.out.println("���� ����������� ��������������");
            else System.out.println("���� ����������� ��������������");
        } else System.out.println("������� ������������ �� ����� ���� ������������� ������ ��� ��������� 0");
    }
}
