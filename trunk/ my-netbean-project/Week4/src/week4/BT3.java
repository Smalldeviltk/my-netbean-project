package week4;

import java.util.Scanner;

public class BT3 {

    public static void main(String arg[]) {
        System.out.print("Nhap co so: ");
        int a = input();
        System.out.print("Nhap so mu: ");
        int n = input();
        System.out.println("Luy thua (de qui): " + dqLuyThua(a, n));
        System.out.println("Luy thua (khu de qui): " + kdqLuyThua(a, n));
    }

    static int input() {
        int n;
        Scanner a = new Scanner(System.in);
        n = Integer.parseInt(a.nextLine());
        return n;
    }

    // Đệ qui
    static int dqLuyThua(int a, int n) {
        if (n == 0 && a == 0) {
            return Exception();
        } else if (n == 0) {
            return 1;
        } else {
            return a * dqLuyThua(a, n - 1);
        }
    }

    // Khử đệ qui
    static int kdqLuyThua(int a, int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= a;
        }
        return s;
    }

    private static int Exception() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
