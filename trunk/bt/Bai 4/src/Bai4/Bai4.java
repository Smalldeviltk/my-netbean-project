/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a;
        int m, n;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao co ma tran m x n: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        
        a = new int[m][n];
        
        InputMatrix(a, m, n);
        OutputMatrix(a, m, n);
        
        System.out.println();
        System.out.println("Min = " + MinInMatrix(a, m, n));
        
        int maxOddNumber = MaxOddNumberInMatrix(a, m, n);
        if (maxOddNumber != Integer.MIN_VALUE)
        {
            System.out.println("Max cac so le: " + maxOddNumber);
        }
        else
        {
            System.out.println("Ma tran khong co phan tu nao la so le!");
        }
        
        OutputRowHasMaxTotalInMaTrix(a, m, n);
        
        System.out.println("Tong cac so khong la SNT trong ma tran: " + TotalNumberOfNotPrime(a, m, n));
    }
    
    // Nhap Ma tran mxn
    public static void InputMatrix(int[][] a, int m, int n)
    {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu A[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Xuat Ma tran
    public static void OutputMatrix(int[][] a, int m, int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Min trong Ma tran
    public static int MinInMatrix(int[][] a, int m, int n)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > a[i][j])
                {
                    min = a[i][j];
                }
            }
        }
        
        return min;
    }
    
    // Max so le trong Ma tran, neu k co tra ve gia tri Min trong INTEGER
    public static int MaxOddNumberInMatrix(int[][] a, int m, int n)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 1)
                {
                    if (max < a[i][j])
                    {
                        max = a[i][j];
                    }
                }
            }
        }
        
        return max; // neu co tra ve, neu khong co so le tra ve MIN INTEGER
    }
    
    // In ra cac hang co tong lon nhat trong Ma tran
    public static void OutputRowHasMaxTotalInMaTrix(int[][] a, int m, int n) 
    {
        int sMax, sCount; // su dung de tinh tong moi dong
        
        // Tim TONG MAX
        sMax = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            sCount = 0;
            for (int j = 0; j < n; j++) {
                sCount += a[i][j];
            }
            
            if (sMax < sCount)
            {
                sMax = sCount;
            }
        }
        
        // Tim dong co TONG MAX
        System.out.println("Cac dong co tong lon nhat: ");
        for (int i = 0; i < m; i++) {
            sCount = 0;
            for (int j = 0; j < n; j++) {
                sCount += a[i][j];
            }
            
            if (sCount == sMax)
            {
                System.out.println("Dong " + i);
            }
        }
    }
    
    // kiem tra 1 so co phai SNT hay k
    public static boolean IsPrime(int a)
    {
        if (a < 2)
        {
            return false;
        }
        
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    // Tinh tong cac so k phai so nguyen to
    public static int TotalNumberOfNotPrime(int[][] a, int m, int n)
    {
        int s = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!IsPrime(a[i][j]))
                {
                    s += a[i][j];
                }
            }
        }
        
        return s;
    }
}
