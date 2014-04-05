package week1;

import java.util.Scanner;

public class BT6 {

    public static int temp = 0;

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
        System.out.println("Tong can tim la: " + sum(n));
    }

    private static int sum(int n) {
        if (n < 10) {
            return n;
        } else {
            temp = n % 10 + sum(n / 10);
            return temp;
        }
    }
}