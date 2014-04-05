package week4;

import java.util.Scanner;

import week4.BT1;

public class BT6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n (n>0): ");
        int n = input.nextInt();
        System.out.println("Kết quả S= " + Sum(n));
    }

    public static float Sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Sum(n - 1) + 1.0f / week4.BT1.dqTongN(n);
        }
    }
}
