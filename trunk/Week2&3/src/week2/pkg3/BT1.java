package week2.pkg3;

import java.util.Scanner;

public class BT1 {

    public static void main(String arg[]) {
        int n, k;
        System.out.print("Nhap so luong phan tu cua mang: ");
        n = input();
        int a[] = new int[n];
        System.out.println("Nhap mang cac so nguyen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = input();
        }
        System.out.print("Nhap so nguyen k: ");
        k = input();
        System.out.print("Phan tu xuat hien " + k + " lan la:");
        check(k, a);
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

    private static void check(int k, int a[]) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (i > 0) {
                    for (int t = i - 1; t > 0; t--) {
                        if (a[i] != a[t]) {
                            if (a[i] == a[j]) {
                                count++;
                            }
                        }
                    }
                } else {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
            }
            if (count == k) {
                System.out.print(" " + a[i]);
            }
        }
    }
}
