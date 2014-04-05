package week1;

import java.util.Scanner;

public class BT2 {

    public static void main(String arg[]) {
        System.out.print("Nhap so: ");
        int n = 0;
        while (n <= 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n <= 1) {
                System.out.println("So nhap vao phai lon hon 1.");
            }
        }
        check(n);
    }

    private static void check(int temp) {
        int sum = 0;
        for (int i = 2; i <= temp; i++) {
            if ((i % 3 == 0 && i % 5 == 0) || (i % 3 == 2 && i % 5 == 3)) {
                sum += i;
            }
        }
        System.out.println("Tong can tim la: " + sum);
    }
}
