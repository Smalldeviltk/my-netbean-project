package week1;

import java.util.Scanner;

public class BT8 {

    public static void main(String arg[]) {
        System.out.print("Nhap so thu nhat: ");
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        System.out.print("Nhap so thu hai: ");
        int m = 0;
        while (m < 1) {
            Scanner num = new Scanner(System.in);
            m = num.nextInt();
            if (m < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        System.out.println("Uoc so chung lon nhat la: " + UCLN(n, m));
        System.out.println("Boi so chung nho nhat la: " + BCNN(n, m));
    }

    private static int UCLN(int n, int m) {
        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }
        return n;
    }

    private static int BCNN(int n, int m) {
        n = (n * m) / UCLN(n, m);
        return n;
    }
}