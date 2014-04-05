package BT4;

import java.util.Scanner;

public class Nguoi {

    //Khai bao bien
    private String hoTen;
    private String ngaySinh;
    private int tuoi;

    //Ham khoi tao
    public Nguoi() {
        hoTen = "";
        ngaySinh = "";
        tuoi = 0;
    }

    public Nguoi(String _hoTen, String _ngaySinh, int _tuoi) {
        hoTen = _hoTen;
        ngaySinh = _ngaySinh;
        tuoi = _tuoi;
    }

    //Phuong thuc
    public void Nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scan.next();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scan.next();
        System.out.print("Nhap tuoi: ");
        tuoi = scan.nextInt();
    }

    public void InThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Tuoi: " + tuoi);
    }

    //Get - Set
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
