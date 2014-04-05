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
public class Tuan2Bai2 {

    public static void main(String[] args) {

        MatrixSquare m = new MatrixSquare();
        m.inputMatrixSquare();
        m.printMatrixSquare();
        m.sumMatrixUp();
        m.sumMatrixDown();
        if(m.symmetricMatrix())
            System.out.println("Ma tran vuong nay doi xung qua duong cheo chinh.");
        else
            System.out.println("Ma tran nay khong doi xung qua duong cheo chinh.");
    }
}
class MatrixSquare {

    int n;
    int[][] matrix;

    public MatrixSquare() {
        n = 0;
    }

    /**
     * a. Nhap ma tran vuong
     */
    public void inputMatrixSquare() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so dong va cot cua ma tran vuong nay: ");
        n = sc.nextInt();
        System.out.println();

        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                matrix[i][j] = sc.nextInt();
                System.out.println();
            }
        }
    }

    /**
     * b. In ma tran vuong
     */
    public void printMatrixSquare() {

        System.out.println("So dong cua ma tran: " + n);
        System.out.println("So cot cua ma tran: " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]=" + matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * c. Tong ca phan tu thuoc tam giac tren
     */
    public void sumMatrixUp() {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Tong cua ma tran tam giac tren la: " + sum);
    }
    
    /**
     * d. Tổng các phần tử thuộc tam giác dưới
     */
    public void sumMatrixDown(){
        
        float sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                sum += matrix[i][j];
            }
        }
        
        System.out.println("Tong cua ma tran tam giac duoi la: " + sum);
    }
    
    /**
     * e. Kiem tra ma tran vuong co doi xung qua duong cheo chinh hay khong
     */
    public boolean symmetricMatrix(){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < i;j++)
                if(matrix[i][j] != matrix[j][i])
                    return false;
        return true;
    }
    
    /**
     * f. Tinh tong cua cac so nguyen to tren duong cheo chinh
     */
    public void sumPrimeMatrix(){
        
        int sum = 0;
        for(int i = 0; i < n; i++)
            if(checkPrima(matrix[i][i]))
                sum += matrix[i][i];
        System.out.println("Tong cua cac so nguyen to tren duong cheo chinh la: "
                + sum );
    }
    
    /**
     * Kiem tra so nguyen to
     * @return boolean
     */
    private boolean checkPrima(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
