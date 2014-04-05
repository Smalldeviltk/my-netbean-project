/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN2;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Small
 */
public class Tuan2Bai1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row_delete;

        CMatrix matrix = new CMatrix();
        matrix.inputMatrix();
        matrix.printMatrix();
        matrix.minMatrix();
        matrix.maxOddMatrix();
        matrix.sumRowMatrixMax();
        matrix.sumNoPrimaMatrix();
        do {
            System.out.print("Nhap vao dong can xoa: ");
            row_delete = sc.nextInt();
        } while (row_delete <= 0);
        CMatrix temp1 = matrix.copyMatrix();
        temp1.deleteLinekMatrix(row_delete).printMatrix();
        matrix.printMatrix();
        System.out.println("Xoa dong va cot chua phan tu lon nhat");
        CMatrix temp2 = matrix.copyMatrix();
        temp2.deleteRowColMatrix().printMatrix();
    }
}

 //Lớp ma trận
class CMatrix {

    int[][] m_matrix;
    int m_line;
    int m_col;

    public CMatrix() {
        m_line = 0;
        m_col = 0;
    }

    //Hàm nhập vào các thông số ma trận
    public void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so dong cua ma tran: ");
            m_line = sc.nextInt();
        } while (m_line <= 0);
        System.out.println();
        do {
            System.out.print("Nhap vao so cot cua ma tran: ");
            m_col = sc.nextInt();
        } while (m_col <= 0);
        System.out.println();

        m_matrix = new int[m_line][m_col];
        for (int i = 0; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                m_matrix[i][j] = sc.nextInt();
                System.out.println();
            }
        }
    }

    //Hàm in ra thông số về ma trận này
    public void printMatrix() {

        System.out.println("So dong cua ma tran: " + m_line);
        System.out.println("So cot cua ma tran: " + m_col);
        for (int i = 0; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                System.out.print("A[" + i + "][" + j + "]=" + m_matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Tìm phần tử nhỏ nhất của ma trận
    public void minMatrix() {

        int min = m_matrix[0][0];

        for (int i = 0; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                if (m_matrix[i][j] < min) {
                    min = m_matrix[i][j];
                }
            }
        }

        System.out.println("Phan tu nho nhat cua ma tran nay: " + min);
    }

    //Tìm phần tử lẻ lớn nhất của ma trận
    public void maxOddMatrix() {
        int max = m_matrix[0][0];
        for (int i = 0; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                if (m_matrix[i][j] > max && m_matrix[i][j] % 2 != 0) {
                    max = m_matrix[i][j];
                }
            }
        }
        if (max % 2 == 0) {
            System.out.println("Khong co phan tu le trong ma tran nay.");
        } else {
            System.out.println("Phan tu le lon nhat cua ma tran nay: " + max);
        }
    }

    //Tìm dòng có tổng lớn nhất
    public void sumRowMatrixMax() {
        int sum_max = 0, position_row = 0;
        for (int j = 0; j < m_col; j++) {
            sum_max += m_matrix[0][j];
        }
        int sum = 0;
        for (int i = 1; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                sum += m_matrix[i][j];
            }
            if (sum > sum_max) {
                sum_max = sum;
                position_row = i;
            }
        }

        System.out.println("Dong co tong lon nhat la " + (position_row + 1) + " voi gia tri la: " + sum_max);
    }

    //Tính tổng tất cả các số không phải là nguyên tố
    public void sumNoPrimaMatrix() {
        int sum = 0;
        for (int i = 0; i < m_line; i++) {
            sum = 0;
            for (int j = 0; j < m_col; j++) {
                if (!checkPrima(m_matrix[i][j])) {
                    sum += m_matrix[i][j];
                }
            }
        }
        System.out.println("Tong cua cac so khong phai la so nguyen to trong ma tran: "
                + sum);

    }

    //Xóa dòng thứ k trong ma trận
    public CMatrix deleteLinekMatrix(int k) {
        if (m_line == 1) {
            m_line = 0;
            m_col = 0;
        } else if (k > m_line) {
            System.out.println("Khong co dong can xoa.");
        } else {
            this.m_line -= 1;
            for (int i = k - 1; i < this.m_line; i++) {
                System.arraycopy(this.m_matrix[i + 1], 0, this.m_matrix[i], 0, this.m_col);
            }
        }
        return this;
    }

    //Xóa dòng cột chứa số lớn nhất trong ma trận
    public CMatrix deleteRowColMatrix() {
        Vector<Integer> v = this.positionMaxMatrix();
        int line = v.get(0).intValue() / this.m_col + 1;
        int col = v.get(0).intValue() % this.m_col + 1;
        this.deleteLinekMatrix(line);
        this.deleteColkMatrix(col);
        return this;
    }

    /**
     * Trả về ma trận khi xóa cột thứ k
     *
     * @param k
     * @return CMatrix
     */
    private CMatrix deleteColkMatrix(int k) {

        if (m_col == 1) {
            m_line = 0;
            m_col = 0;
        } else if (k > m_col) {
            System.out.println("Khong co cot can xoa.");
        } else {
            this.m_col -= 1;
            for (int j = k - 1; j < this.m_col; j++) {
                for (int i = 0; i < this.m_line; i++) {
                    this.m_matrix[i][j] = this.m_matrix[i][j + 1];
                }
            }
        }
        return this;
    }

    private Vector<Integer> positionMaxMatrix() {
        Vector<Integer> v = new Vector<Integer>();
        int max = m_matrix[0][0];
        for (int i = 0; i < m_line; i++) {
            for (int j = 0; j < m_col; j++) {
                if (m_matrix[i][j] > max) {
                    max = m_matrix[i][j];
                    v.clear();
                    v.add(i * this.m_col + j);
                }
                if (m_matrix[i][j] == max) {
                    v.add(i * this.m_col + j);
                }
            }
        }
        return v;
    }

    /**
     * Sao chép ma trận
     */
    public CMatrix copyMatrix() {
        CMatrix temp = new CMatrix();
        temp.m_line = this.m_line;
        temp.m_col = this.m_col;
        temp.m_matrix = new int[this.m_line][this.m_col];
        for (int i = 0; i < this.m_line; i++) {
            System.arraycopy(this.m_matrix[i], 0, temp.m_matrix[i], 0, this.m_col);
        }
        return temp;
    }

    /**
     * @Description Kiem tra so nguyen to
     * @param int n
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
