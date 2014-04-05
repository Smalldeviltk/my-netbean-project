package week4;

import java.util.Scanner;
import week4.BT4;

public class BT9 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.print("Nhập vào x: ");
        int x = input.nextInt();
        System.out.println("Kết quả S = " + Sum(x, n));
    }

    public static double Sum(int x, int n) {
        double numerator = Math.pow(x, 2 * n);
        double denominator = week4.BT2.kdqGiaiThua(2 * n);
        if (n == 0) {
            return 1;
        } else {
            return numerator / denominator + Sum(x, n - 1);
        }
    }
}
