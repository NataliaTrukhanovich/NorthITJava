package Operators;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� �����:");
        int i = scan.nextInt();
        if (i != 10)
            if (i > 10) System.out.println("����� ������ ������");
            else System.out.println("����� ������ ������");
        else System.out.println("����� ����� ������");
    }
}

