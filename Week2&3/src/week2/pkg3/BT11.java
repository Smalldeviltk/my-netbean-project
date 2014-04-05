package week2.pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BT11 {

    static final String fileName = "C:\\Users\\Small\\Desktop\\test.txt";
    //private static int i;
    private static String s = "";

    public static void main(String[] args) throws IOException {
        readFile(fileName);
        test(s);
    }

    private static void readFile(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            s += input.nextLine();
        }
        file.close();
        input.close();
    }

    private static void test(String content) {
        String a[] = content.split(" ");
        for (int i = 0; i < a.length; i++) {
            int temp = a[i].indexOf(".");
            if (temp > 0) {
                a[i] = a[i].substring(0, a[i].length() - 1);
            }
        }
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equalsIgnoreCase(a[0])) {
                count++;
            }
        }
        System.out.println(a[0] + " co so lan xuat hien: " + count);
        for (int i = 1; i < a.length; i++) {
            count = 1;
            if (!a[i].equalsIgnoreCase(a[0])) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i].equalsIgnoreCase(a[j])) {
                        count++;
                        a[j] = a[0];
                    }
                }
            }
            if (!a[i].equalsIgnoreCase(a[0])) {
                System.out.println(a[i] + " co so lan xuat hien: " + count);
            }
        }

    }
}