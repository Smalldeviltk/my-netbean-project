/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN2;

import java.util.Scanner;

/**
 *
 * @author Small
 */
public class Tuan2Bai4 {

    public static void main(String[] args) {
        ReadNumber rn = new ReadNumber();
        rn.inputNumber();
        rn.printNumber();
    }
}

class ReadNumber {

    private int number;

    /**
     * contractor
     */
    public ReadNumber() {
        number = 100;
    }

    /**
     * Nhap vao so co 3 chu so
     */
    public void inputNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so can doc: ");
            this.number = sc.nextInt();
        } while (this.number < 100 || this.number > 999);

    }

    /**
     * Doc so do thanh chu
     */
    public void printNumber() {
        byte pt = (byte) (number / 100);
        byte pc = (byte) ((number % 100) / 10);
        byte pdv = (byte) (number % 10);
        String str = "";
        str += readNumber(pt) + " tram ";
        if (pc == 0) {
            if (pdv == 0) {
                System.out.println(str);
                return;
            } else {
                str += " le";
            }
        } else {
            if (pc == 1) {
                str += " muoi";
            } else {
                str += readNumber(pc) + " muoi ";
            }
        }
        if (pdv == 0) {
            System.out.println(str);
        } else {
            str += readNumber(pdv);
            System.out.println(str);
        }
    }
    
    /**
     * Chuyển số thành chữ
     */
    public String readNumber(byte n){  
        switch(n){
            case 0:
                return "khong";
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
            default:
                return "";
        }
    }
}