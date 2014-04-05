package week1;

import java.util.Scanner;

public class BT10 {

    public static void main(String arg[]) {
        System.out.print("Nhap n: ");
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        System.out.println("Tong dau tien la: " + sum(n));
        System.out.println("Tong thu hai la: " + sum1(n));
    }

    private static int muti(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * muti(n - 1);
        }
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return muti(n) + sum(n - 1);
        }
    }

    private static float sum1(int n) {
        if (n == 1) {
            return 1 / 2;
        } else {
            return 1 / (exp(n, n) * muti(n)) + sum1(n - 1);
        }
    }

    private static int exp(int n, int t) {
        if (t == 1) {
            return n;
        } else {
            return n * exp(n, t - 1);
        }
    }
}