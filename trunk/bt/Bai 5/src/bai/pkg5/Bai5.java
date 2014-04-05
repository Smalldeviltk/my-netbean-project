/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a;
        int n;
        
        System.out.print("Nhap so kich co ma tran vuong: n = ");
        n = scanner.nextInt();
        
        a = new int[n][n];
        
        InputMatrix(a, n);
        OutputMatrix(a, n);
        
        System.out.println("Tong cac phan tu tam giac tren: " + TotalNumberInTopTriangle(a, n));
        System.out.println("Tong cac phan tu tam giac duoi: " + TotalNumberInBottomTriangle(a, n));
        
        if (IsSymmetric(a, n))
        {
            System.out.print("Ma tran doi xung!");
        }
        else
        {
            System.out.print("Ma tran KHONG doi xung!");
        }
    }
    
    // Nhap ma tran vuong co n
    public static void InputMatrix(int[][] a, int n)
    {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap phan tu A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Xuat ra ma tran
    public static void OutputMatrix(int[][] a, int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Tong cac phan tu TAM GIAC TREN
    public static int TotalNumberInTopTriangle(int[][] a, int n)
    {
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i)
                {
                    s += a[i][j];
                }
            }
        }
        
        return s;
    }
    
    // Tong cac phan tu thuoc TAM GIAC DUOI
    public static int TotalNumberInBottomTriangle(int[][] a, int n)
    {
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i)
                {
                    s += a[i][j];
                }
            }
        }
        
        return s;
    }
    
    // Kiem tra ma tran co doi xung hay khong
    public static boolean IsSymmetric(int[][] a, int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i])
                {
                    return false;
                }
            }       
        }
        
        return true;
    }
}
