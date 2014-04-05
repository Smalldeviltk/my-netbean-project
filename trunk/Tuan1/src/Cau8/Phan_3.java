/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

import java.util.Scanner;

/**
 *
 * @author Small
 */
public class Phan_3 {

    public static int input() {
        System.out.print("Nhap n = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }

    public static boolean isPrime(int n) {
        boolean flag = false;
        if ((n == 0) || (n == 1) || (n == -1)) {
            flag = true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = true;
                }
            }
        }
        return !flag;
    }

    public static void main(String[] arg) {
        int n = input();
        System.out.print("Cac so nguyen to nho hon " + n + " la:");
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println("");
    }
}
