package week1;

import java.util.Scanner;

public class BT9 {

    public static int temp = 0;

    public static void main(String arg[]) {
        System.out.print("Nhap so: ");
        int n = 0;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        System.out.println("So can tim la: " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        int t1 = 1, t2 = 1;
        for (int i = 2; i <= n; i++) {
            t2 += t1;
            t1 = t2 - t1;
        }
        return t2;
    }
}