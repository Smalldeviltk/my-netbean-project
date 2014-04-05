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
public class Phan_5 {

    public static int input() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }

    public static boolean check(int d, int m, int y) {
        if ((m > 12) || (m < 1)) {
            return false;
        } else {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((d > 31) || (d < 1)) {
                        return false;
                    } else {
                        return true;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if ((d > 30) || (d < 1)) {
                        return false;
                    } else {
                        return true;
                    }
                case 2:
                    if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
                        if ((d > 29) || (d < 1)) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        if ((d > 28) || (d < 1)) {
                            return false;
                        } else {
                            return true;
                        }
                    }
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        int d, m, y;
        System.out.print("Nhap ngay: ");
        d = input();
        System.out.print("Nhap thang: ");
        m = input();
        System.out.print("Nhap nam: ");
        y = input();
        if (check(d, m, y)) {
            System.out.println("Ngay " + d + " thang " + m + " nam " + y + " hop le.");
        } else {
            System.out.println("Ngay " + d + " thang " + m + " nam " + y + " khong hop le.");
        }
    }
}
