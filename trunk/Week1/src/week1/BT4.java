package week1;

import java.util.Scanner;

public class BT4 {

    public static void main(String arg[]) {
        System.out.print("Nhap so: ");
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        if (n == 1) {
            System.out.println("Tong bang: 1");
        } else {
            check(n);
        }
    }

    private static boolean isPrime(int temp) {
        int tem = 0;
        for (int i = 2; i <= temp / 2; i++) {
            if (temp % i == 0) {
                tem++;
            }
        }
        if (tem > 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void check(int temp) {
        int sum = 0;
        for (int i = 2; i <= temp; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Tong bang:" + sum);
    }
}