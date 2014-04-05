/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

import week4.BT12;

public class BT16 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = input.nextInt();
        System.out.println("Số đảo ngược của " + n + " là: " + Reverse(n));
    }

    public static String Reverse(int n) {
        if (n / 10 == 0) {
            return String.valueOf(n);
        } else {
            return String.valueOf(n % 10) + Reverse(n / 10);
        }
    }

    public static int Reverse2(int n) {
        if (n / 10 == 0) {
            return Reverse2(n) + pow(n % 10, week4.BT12.SumCount(n));
        } else {
            return Reverse2(n) + pow(n % 10, week4.BT12.SumCount(n));
        }
    }

    private static int pow(int i, int SumCount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
