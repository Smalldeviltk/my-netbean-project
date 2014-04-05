package week4;

import java.util.Scanner;

public class BT10 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào b : ");
        int b = input.nextInt();
        System.out.println("USCLN của " + a + " và " + b + " là :" + (a > b ? USCLN(a, b) : USCLN(b, a)));
    }

    public static int USCLN(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return USCLN(b % a, a);
        }
    }
}
