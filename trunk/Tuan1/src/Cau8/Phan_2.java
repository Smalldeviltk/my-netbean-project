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
public class Phan_2 {

    public static void main(String[] arg) {
        int n = input();
        System.out.println("Tong can tim la: " + sum(n));
    }

    public static int sum(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            if ((i % 2) == 0) {
                s += i;
            }
        }
        return s;
    }

    public static int input() {
        System.out.print("Nhap so can tinh: n = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }
}
