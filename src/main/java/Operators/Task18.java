package Operators;

import java.util.Scanner;

public class Task18 {
    static String[] tovari = {"Хлеб", "Молоко", "Вода"};
    static double[] prices = {100.08, 123.90, 81.15};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Меню:");
        System.out.println("____________________");
        System.out.println(tovari[0] + "   " + prices[0] + " руб.");
        System.out.println(tovari[1] + "   " + prices[1] + " руб.");
        System.out.println(tovari[2] + "   " + prices[2] + " руб.");
        System.out.println("____________________");
        System.out.println("Введите название товара, который хотите купить");
        String tovar = scan.nextLine();

        switch (tovar.toLowerCase()) {
            case "хлеб": {
                magasin(0);
            }
            break;
            case "молоко": {
                magasin(1);
            }
            break;
            case "вода": {
                magasin(2);
            }
            break;
            default:
                System.out.println("Данного товара в магазине нет");
        }
    }

    public static void magasin(int indexTovara) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму денег");
        double money = scan.nextDouble();
        if (money == prices[indexTovara]) System.out.println("Спасибо за покупку!");
        else if (money < prices[indexTovara]) System.out.println("Денег не хватает!");
        else System.out.println("Ваша сдача: " + Math.round((money - prices[indexTovara]) * 100.0) / 100.0 + " руб.");
    }

}
