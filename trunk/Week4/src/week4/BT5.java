package week4;

import java.util.Scanner;
import week4.BT2.*;
import week4.BT4.*;

public class BT5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n (n>0): ");
        int n = input.nextInt();
        System.out.println("Kết quả S = " + Sum(n));
    }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Sum(n - 1) + week4.BT2.dqGiaiThua(n);
        }
    }
}
