package week4;

import java.util.Scanner;

public class BT12 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Số " + n + " có  " + SumCount(n) + " chữ số");
    }

    public static int SumCount(int n) {
        if (n / 10 == 0) {
            return 1;
        } else {
            return 1 + SumCount(n / 10);
        }
    }
}
