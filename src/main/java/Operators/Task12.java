package Operators;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ��� �����:");
        int i = scan.nextInt();
        int y = scan.nextInt();
        if (i != y)
            if (i > y) System.out.println("������ ����� ������, ��� ������");
            else System.out.println("������ ����� ������, ��� ������");
        else System.out.println("����� �����");
    }
}
