package week4;

import java.util.Scanner;

public class BT13 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Chữ số đầu tiên của số " + n + " là " + FindFirstDigit2(n));
    }

    public static int FindFirstDigit(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return FindFirstDigit(n / 10);
        }
    }

    public static int FindFirstDigit2(int n) {
        while (n / 10 > 0) {
            n /= 10;
        }
        return n;
    }
}
