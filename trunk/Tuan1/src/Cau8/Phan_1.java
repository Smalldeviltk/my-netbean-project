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
public class Phan_1 {

    public static void main(String[] arg) {
        int n = input();
        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
    }

    public static int input() {
        int n = -1;
        while (n < 0) {
            System.out.print("Nhap so can kiem tra: n = ");
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if (n < 0) {
                System.out.println("So nhap vao khong am.");
            }
        }

        return n;
    }

    public static boolean isPrime(int n) {
        boolean flag = false;
        if (n <= 1) {
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
}
