package week2.pkg3;

import java.util.Scanner;

public class BT8 {

    public static void main(String arg[]) {
        System.out.print("Nhap chuoi: ");
        String s = input();
        countStr(s);
    }

    private static String input() {
        String s = null;
        Scanner a = new Scanner(System.in);
        s = a.nextLine();
        return s;
    }

    private static void countStr(String s) {
        String charMax = null;
        int numMax = 1;
        int temp = 1;
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        temp++;
                        if (temp > numMax) {
                            numMax = temp;
                            charMax = String.valueOf(s.charAt(i));
                        }
                    }
                }
                temp = 1;
            }
        } else {
            charMax = s;
        }
        System.out.println("Ki tu " + charMax + " duoc lap lai nhieu nhat voi " + numMax + " lan");
    }
}
