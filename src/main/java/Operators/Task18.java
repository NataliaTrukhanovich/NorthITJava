package Operators;

import java.util.Scanner;

public class Task18 {
    static String[] tovari = {"����", "������", "����"};
    static double[] prices = {100.08, 123.90, 81.15};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("����:");
        System.out.println("____________________");
        System.out.println(tovari[0] + "   " + prices[0] + " ���.");
        System.out.println(tovari[1] + "   " + prices[1] + " ���.");
        System.out.println(tovari[2] + "   " + prices[2] + " ���.");
        System.out.println("____________________");
        System.out.println("������� �������� ������, ������� ������ ������");
        String tovar = scan.nextLine();

        switch (tovar.toLowerCase()) {
            case "����": {
                magasin(0);
            }
            break;
            case "������": {
                magasin(1);
            }
            break;
            case "����": {
                magasin(2);
            }
            break;
            default:
                System.out.println("������� ������ � �������� ���");
        }
    }

    public static void magasin(int indexTovara) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ����� �����");
        double money = scan.nextDouble();
        if (money == prices[indexTovara]) System.out.println("������� �� �������!");
        else if (money < prices[indexTovara]) System.out.println("����� �� �������!");
        else System.out.println("���� �����: " + Math.round((money - prices[indexTovara]) * 100.0) / 100.0 + " ���.");
    }

}
