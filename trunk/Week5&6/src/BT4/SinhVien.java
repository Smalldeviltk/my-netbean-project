package BT4;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    //Khai bao bien

    private String tenTruongDaiHoc;
    private String khoa;

    //Ham khoi tao
    public SinhVien() {
        tenTruongDaiHoc = "";
        khoa = "";
    }

    public SinhVien(String _tenTruongDaiHoc, String _khoa, String _hoTen, String _ngaySinh, int _tuoi) {
        super(_hoTen, _ngaySinh, _tuoi);
        tenTruongDaiHoc = _tenTruongDaiHoc;
        khoa = _khoa;
    }

    //In thong tin
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Ten truong dai hoc: " + tenTruongDaiHoc);
        System.out.println(" khoa: " + khoa);
        System.out.println();
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap Ten truong dai hoc: ");
        tenTruongDaiHoc = scan.next();
        System.out.print("Nhap khoa: ");
        khoa = scan.next();
    }

    //Get - Set
    public String getTenTruongDaiHoc() {
        return tenTruongDaiHoc;
    }

    public void setTenTruongDaiHoc(String tenTruongDaiHoc) {
        this.tenTruongDaiHoc = tenTruongDaiHoc;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
}
