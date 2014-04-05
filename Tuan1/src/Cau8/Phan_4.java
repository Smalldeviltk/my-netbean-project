/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau8;

import java.util.Scanner;

/**
 *
 * @author Small
 */
public class Phan_4 {

    public static char input() {
        System.out.print("Nhap ki tu = ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char c = line.charAt(0);
        return c;
    }

    public static void check(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                System.out.println(c + " la nguyen am.");
                break;
            default:
                System.out.print(c + " la phu am.");
                break;
        }
    }

    public static void main(String[] arg) {
        char c=input();
        check(c);
    }
}
