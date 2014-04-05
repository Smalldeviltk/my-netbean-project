package week1;

import java.util.Scanner;

public class BT3 {

    public static void main(String arg[]) {
        System.out.print("Nhap so can kiem tra: ");
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        if (n == 1) {
            System.out.println("1 khong phai la so nguyen to.");
        } else {
            check(n);
        }
    }

    private static void check(int temp) {
        int tem = 0;
        for (int i = 2; i <= temp / 2; i++) {
            if (temp % i == 0) {
                tem++;
            }
        }
        if (tem > 0) {
            System.out.println(temp + " khong phai la so nguyen to.");
        } else {
            System.out.println(temp + " la so nguyen to.");
        }
    }
}