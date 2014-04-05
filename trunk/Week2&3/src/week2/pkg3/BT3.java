package week2.pkg3;

import java.util.Scanner;

public class BT3 {

    public static void main(String arg[]) {
        System.out.print("Nhap m: ");
        int m = input();
        System.out.print("Nhap n: ");
        int n = input();
        int sum = 0;
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu thu a[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = input();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check(a[i][j])) {
                    sum += a[i][j];
                }
            }
        }
        if (sum == 0) {
            System.out.println("Khong co so nguyen to trong ma tran.");
        } else {
            System.out.println("Tong cac so nguyen to trong ma tran la: " + sum);
        }
    }

    private static int input() {
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        return n;
    }

    private static boolean check(int temp) {
        int tem = 0;
        if (temp == 1) {
            return false;
        }
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
}
