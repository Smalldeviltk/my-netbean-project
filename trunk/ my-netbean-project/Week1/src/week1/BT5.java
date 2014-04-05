package week1;

import java.util.Scanner;

public class BT5 {

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
        n = n + sum(n);
        System.out.println("Tong can tim la: " + n);
    }

    private static int sum(int n) {
        int temp = 0;
        while (n > 0) {
            temp = temp * 10;
            temp += n % 10;
            n /= 10;
        }
        return temp;
    }
}