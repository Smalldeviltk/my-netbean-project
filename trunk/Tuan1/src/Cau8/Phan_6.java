/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Small
 */
public class Phan_6 {

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
        int d = 0, m = 0, y = 0;
        while (!check(d, m, y)) {
            System.out.print("Nhap ngay: ");
            d = input();
            System.out.print("Nhap thang: ");
            m = input();
            System.out.print("Nhap nam: ");
            y = input();
            if (!check(d, m, y)) {
                System.out.println("Ngay " + d + " thang " + m + " nam " + y + " khong hop le.");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.set(y, m - 1, d);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        System.out.print("Ngay " + d + "/" + m + "/" + y + " la: ");
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("Chu Nhat");
                break;
            case 2:
                System.out.println("Thu Hai");
                break;
            case 3:
                System.out.println("Thu Ba");
                break;
            case 4:
                System.out.println("Thu Tu");
                break;
            case 5:
                System.out.println("Thu Nam");
                break;
            case 6:
                System.out.println("Thu Sau");
                break;
            case 7:
                System.out.println("Thu Bay");
                break;
        }
    }
}
