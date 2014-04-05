package week2.pkg3;

import java.util.Scanner;

public class BT6 {

    public static void main(String arg[]) {
        String s = null;
        s = input();
        //System.out.print(s);

        for (int i = 0; i < s.length(); i++) {

            if (checkNumber(s.charAt(i))) {

                for (int j = 0; j < Integer.parseInt(String.valueOf(s.charAt(i))); j++) {
                    System.out.print(s.charAt(i + 1));
                }
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }

    // Nhap
    private static String input() {
        String n = null;

        Scanner a = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        n = a.nextLine();
        return n;
    }

    private static boolean checkNumber(char t) {
        switch (t) {
            case '1':
                return true;
            case '2':
                return true;
            case '3':
                return true;
            case '4':
                return true;
            case '5':
                return true;
            case '6':
                return true;
            case '7':
                return true;
            case '8':
                return true;
            case '9':
                return true;
            case '0':
                return true;
        }
        return false;
    }
}
