package week4;

import java.util.Scanner;

public class BT11 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Tổng ước của số " + n + " là : " + TongUoc(n, n));
    }

    public static int TongUoc(int x, int n) {
        if (n == 1) {
            return 1;
        } else {
            if (x % n == 0) {
                return TongUoc(x, n - 1) + n;
            } else {
                return TongUoc(x, n - 1);
            }
        }
    }
}
