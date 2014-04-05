package week7;

import java.util.Scanner;

public class test {

    public static void main(String arg[]) {
        int n, k = 0;
        int s = 0;
        System.out.print("Nhap cap: ");
        n = input();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                s = s + j;
            }
        }
        System.out.print(s);
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
}
