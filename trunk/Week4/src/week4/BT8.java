package week4;

import java.util.Scanner;
import week4.BT1;
import week4.BT3;

public class BT8 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n (n>0): ");
        int n = input.nextInt();
        System.out.print("Nhập vào x : ");
        int x = input.nextInt();
        System.out.println("Kết quả S= " + Sum(x, n));
    }

    public static float Sum(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return Sum(x, n - 1) + week4.BT3.dqLuyThua(x, n) / (float) week4.BT1.dqTongN(n);
        }
    }
}
