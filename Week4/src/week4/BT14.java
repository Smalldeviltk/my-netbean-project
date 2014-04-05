package week4;

import java.util.Scanner;

public class BT14 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Số " + n + " có chữ số lớn nhất là: " + MaxDigit(n % 10, n));
        //System.out.println("Số " + n + " có chữ số lớn nhất là: " + MaxDigit2(n));
        //System.out.println("Số " + n + " có chữ số lớn nhất là: " + MaxDigit3(n));
    }

    public static int MaxDigit(int x, int n) {
        if (n / 10 == 0) {
            return x;
        } else {
            if (n % 10 > x) {
                return MaxDigit(n % 10, n / 10);
            } else {
                return MaxDigit(x, n / 10);
            }
        }
    }

    public static int MaxDigit2(int n) {
        int x = n % 10;
        while (n / 10 > 0) {
            n /= 10;
            if (n / 10 == 0) {
                return x;
            } else if (n % 10 > x) {
                x = n % 10;
            }
        }
        return x;
    }

    public static int MaxDigit3(int n) {
        int max = n % 10;
        if (n / 10 == 0) {
            return max;
        } else {
            if (max > MaxDigit3(n / 10)) {
                return max;
            } else {
                return MaxDigit3(n / 10);
            }
        }
    }
}
