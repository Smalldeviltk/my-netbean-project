/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

public class BT17 {

    public static void main(String args[]) {
        int A[];
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = input.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            A[i] = input.nextInt();
        }
        System.out.print("Nhap so can tim x: ");
        int x = input.nextInt();
        int kq = BinarySearch2(A, 0, A.length, x);
        if (kq == -1) {
            System.out.println("Khong tim thay " + x + " trong mang");
        } else {
            System.out.println(x + " xuat hien tai vi tri thu " + (kq + 1));
        }
    }

    public static int BinarySearch(int A[], int x) {
        int left = 0;
        int right = A.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A[mid] == x) {
                return mid;
            } else if (A[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int BinarySearch2(int A[], int left, int right, int x) {
        int mid = (left + right) / 2;
        if (left >= right) {
            return -1;
        }
        if (A[mid] == x) {
            return mid;
        } else if (A[mid] > x) {
            return BinarySearch2(A, left, mid - 1, x);
        } else {
            return BinarySearch2(A, mid + 1, right, x);
        }
    }
}
