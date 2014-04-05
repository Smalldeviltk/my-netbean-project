package week2.pkg3;

import java.util.Scanner;

public class BT5 {

    public static void main(String arg[]) {
        System.out.print("Nhap m: ");
        int m = input();
        System.out.print("Nhap n: ");
        int n = input();
        int sum = 0;
        int temp[] = new int[m * n];
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu thu a[" + (i + 1) + "][" + (j + 1) + "]: ");
                a[i][j] = input();
            }
        }

        // Tao mang 1 chieu luu lai ma tran
        int t = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[t] = a[i][j];
                t++;
            }
        }

        // Bubble sort
        boolean swapped = true;
        int jj = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            jj++;
            for (int i = 0; i < t - jj; i++) {
                if (temp[i] > temp[i + 1]) {
                    tmp = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

        int left = 0, right = n - 1, top = 0, bot = m - 1;
        int count = 0;
        while (count < t) {
            for (int i = left; i <= right; i++) {
                a[top][i] = temp[count];
                count++;

            }
            top++;
            for (int i = top; i <= bot; i++) {
                a[i][right] = temp[count];
                count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                a[bot][i] = temp[count];
                count++;
            }
            bot--;
            for (int i = bot; i >= top; i--) {
                a[i][left] = temp[count];
                count++;
            }
            left++;
        }



        // In ma tran moi
        System.out.println("Ma tran moi:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + a[i][j]);
                if (j == n - 1) {
                    System.out.println("");
                }
            }
        }
    }

    // Nhap
    private static int input() {
        int n = 0;
        while (n < 1) {
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            if (n < 1) {
                System.out.println("So nhap vao phai la so duong.");
            }
        }
        return n;
    }
}