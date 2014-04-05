package BT4;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    //Khai bao bien

    private String tenTruongHoc;
    private String lop;

    //Ham khoi tao
    public HocSinh() {
        tenTruongHoc = "";
        lop = "";
    }

    public HocSinh(String _tenTruongHoc, String _lop, String _hoTen, String _ngaySinh, int _tuoi) {
        super(_hoTen, _ngaySinh, _tuoi);
        tenTruongHoc = _tenTruongHoc;
        lop = _lop;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap Ten truong hoc: ");
        tenTruongHoc = scan.next();
        System.out.print("Nhap lop: ");
        lop = scan.next();
    }

    //In thong tin
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Ten truong hoc: " + tenTruongHoc);
        System.out.println("Lop: " + lop);
        System.out.println();
    }

    //Get - Set
    public String getTenTruongHoc() {
        return tenTruongHoc;
    }

    public void setTenTruongHoc(String tenTruongHoc) {
        this.tenTruongHoc = tenTruongHoc;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
