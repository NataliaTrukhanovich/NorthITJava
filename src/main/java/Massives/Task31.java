package Massives;

public class Task31 {
    public static void main(String[] args) {
        int[] array = {3, 45, -9, 2, -15, -1, 3, 67, 9, -11, 0, -100};
        int polozhitelnie = 0;
        int otricatelnie = 0;
        System.out.println("��� ������ ����� �����:");
        for (int a : array
        ) {
            System.out.print(a + " ");
            if (a > 0) polozhitelnie++;
            else if (a < 0) otricatelnie++;
        }
            System.out.println("\n������������� ����� � ������� " + polozhitelnie);
        System.out.println("������������� ����� � ������� " + otricatelnie);
    }
}
