package week4;

import java.util.Scanner;

public class BT2 {

    public static void main(String arg[]) {
        System.out.print("Nhap n: ");
        int n = input();
        System.out.println("Giai thua (de qui): " + dqGiaiThua(n));
        System.out.println("Giai thua (khu de qui): " + kdqGiaiThua(n));
    }

    private static int input() {
        int n;
        Scanner a = new Scanner(System.in);
        n = Integer.parseInt(a.nextLine());
        return n;
    }

    // Đệ qui
    static int dqGiaiThua(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dqGiaiThua(n - 1);
        }
    }

    // Khử đệ qui
    static int kdqGiaiThua(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        return m;
    }
}
