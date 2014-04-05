package week4;

import java.util.Scanner;

public class BT19 {

    public static void main(String[] args) {
        System.out.print("Nhap so dia can chuyen: ");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Chuyen(n, 1, 3);
    }

    public static void Chuyen(int n, int i, int j) {
        int k;

        if (n == 1) {
            System.out.println("Chuyen dia tu " + i + " sang " + j);
        } else {
            k = 6 - i - j;
            Chuyen(n - 1, i, k);
            Chuyen(1, i, j);
            Chuyen(n - 1, k, j);
        }
    }
}
