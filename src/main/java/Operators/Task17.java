package Operators;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ����o:");
        int i = scan.nextInt();
        if ((i % 2) == 0) System.out.println("����� " + i + " ������");
        else System.out.println("����� " + i + " ��������");

    }
}
