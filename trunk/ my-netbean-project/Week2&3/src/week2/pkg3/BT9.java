package week2.pkg3;

import java.util.Scanner;

public class BT9 {

    public static void main(String[] args) {
        String chuoiX;
        String chuoiY;
        float J;

        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chuoi X: ");
        chuoiX = scan.nextLine();
        System.out.print("Nhap chuoi Y: ");
        chuoiY = scan.nextLine();

        String[] arrX = chuoiX.split(" ");
        String[] arrY = chuoiY.split(" ");

        for (int i = 0; i < arrX.length; i++) {
            for (int j = arrX.length; j > i; j--) {
                if (arrX[i].equals(arrY[j])) {
                }
            }
        }

    }
}
