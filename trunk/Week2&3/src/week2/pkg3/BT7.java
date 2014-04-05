package week2.pkg3;

import java.util.Scanner;

public class BT7 {

    public static void main(String arg[]) {
        System.out.print("Nhap chuoi thu nhat: ");
        String s1 = input();
        System.out.print("Nhap chuoi thu hai: ");
        String s2 = input();
        System.out.println(checkStr(s1, s2));
    }

    private static String input() {
        String n = null;
        Scanner a = new Scanner(System.in);
        n = a.nextLine();
        return n;
    }

    private static String checkStr(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen == 0 || bLen == 0) {
            return "";
        } else if (a.charAt(aLen - 1) == b.charAt(bLen - 1)) {
            return checkStr(a.substring(0, aLen - 1), b.substring(0, bLen - 1))
                    + a.charAt(aLen - 1);
        } else {
            String x = checkStr(a, b.substring(0, bLen - 1));
            String y = checkStr(a.substring(0, aLen - 1), b);
            return (x.length() > y.length()) ? x : y;
        }
    }
}
