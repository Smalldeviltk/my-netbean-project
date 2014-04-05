package week1;

import java.util.Scanner;

public class BT1 {

    public static void main(String arg[]) {
        System.out.print("Nhap so can kiem tra: ");
        Scanner number = new Scanner(System.in);
        int num;
        num = number.nextInt();
        check(num);
    }

    private static void check(int temp) {
        if (temp < 0) {
            System.out.println("So nhap phai duong");
        } else if (temp % 2 == 1) {
            System.out.println("So vua nhap la so le.");
        } else {
            System.out.println("So vua nhap la so chan.");
        }
    }
}
