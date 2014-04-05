package week4;

import java.util.Scanner;

public class BT15 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Số " + n + " chuyển sang hệ nhị phân là: " + ToBinary(n));
    }

    public static String ToBinary(int n) {
        if (n / 2 == 0) {
            return String.valueOf(n % 2);
        } else {
            return ToBinary(n / 2) + String.valueOf(n % 2);
        }
    }

    public static String ToBinary2(int n) {
        if (n / 2 == 0) {
            return String.valueOf(n % 2);
        } else {
            return ToBinary(n / 2) + String.valueOf(n % 2);
        }
    }
}
