/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Employee[] employee;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nhan vien: n = ");
        n = scanner.nextInt();

        employee = new Employee[n];

        InputEmployee(employee, n);
    }

    // Nhap vao mang cac nhan vien
    public static void InputEmployee(Employee[] a, int n) {
        int x;
        String name, birthday;
        int nWorkingDays, baseSalary, nProduct; // ngay lam viec, luong co ban, so san pham
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Chon loai nhan vien (San xuat (nhap 1) hoac Nhan phong(nhap 2)): ");
            x = scanner.nextInt();

            System.out.print("Ho ten: ");
            name = scanner.nextLine();
            System.out.print("Ngay sinh: ");
            birthday = scanner.nextLine();

            if (x == 1) {
                System.out.print("Luong co ban: ");
                baseSalary = scanner.nextInt();
                System.out.print("So san pham: ");
                nProduct = scanner.nextInt();

                a[i] = new ProductStaff(name, birthday, baseSalary, nProduct);
            } else {
                System.out.print("Ngay lam viec: ");
                nWorkingDays = scanner.nextInt();

                a[i] = new OfficeStaff(name, birthday, nWorkingDays);
            }
        }
    }

    public static void OutputEmployee(Employee[] a, int n) {
        for (int i = 0; i < 10; i++) {
        }
    }

    // Lop nhan vien
    public static abstract class Employee {

        protected String _name;
        protected String _birthday;
        protected int _salary;

        // Khoi tao
        public Employee(String name, String birthday) {
            this._name = name;
            this._birthday = birthday;
        }

        // Tinh luong
        public abstract int CaculateSalary();
    }

    // Nhan vien san xuat
    public static class ProductStaff extends Employee {

        private int _baseSalary;
        private int _nProduct; // So san pham

        public ProductStaff(String name, String birthday, int baseSalary, int Product) {
            super(name, birthday);
            this._baseSalary = baseSalary;
            this._nProduct = Product;
        }

        @Override
        public int CaculateSalary() {
            return (_salary = _baseSalary + _nProduct * 5000);
        }
    }

    // Nhan vien van phong
    public static class OfficeStaff extends Employee {

        private int _nWorkingDay;

        public OfficeStaff(String name, String birthday, int nWorkingDay) {
            super(name, birthday);
        }

        @Override
        public int CaculateSalary() {
            return (_salary = _nWorkingDay * 100000);
        }
    }
}
