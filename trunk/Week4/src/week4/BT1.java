package week4;

import java.util.Scanner;

public class BT1 {

    public static void main(String arg[]) {
        System.out.print("Nhap n: ");
        int n = input();
        System.out.println("Tong S (de qui): " + dqTongN(n));
        System.out.println("Tong S (khu de qui): " + kdqTongN(n));
    }

    static int input() {
        int n;
        Scanner a = new Scanner(System.in);
        n = Integer.parseInt(a.nextLine());
        return n;
    }

    // Đệ qui
    static int dqTongN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + dqTongN(n-1);
        }
    }

    // Khử đệ qui
    static int kdqTongN(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
