package Loops;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ������������� �����");
        int n = scan.nextInt();
        int factorial = 1;
        int i = 1;
        if (n == 0) System.out.println("��������� ����� 0 ����� 1");
        else if (n > 0) {
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("��������� ����� " + n + " ����� " + factorial);
        } else System.out.println("����� ������ ���� �������������");
    }
}
