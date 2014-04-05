package BT5;

import java.util.Scanner;

public class KhachHang {
    //Khai bao bien
    private double soTienKhachTra;
    private int soLuongHang;
    private double donGia;
    
    //Ham khoi tao
    public KhachHang()
    {
        soTienKhachTra = 0;
        soLuongHang = 0;
        donGia = 0;
    }
    
    public KhachHang(int _soLuong, int _donGia)
    {
        soTienKhachTra = 0;
        soLuongHang = _soLuong;
        donGia = _donGia;
    }
    
    //Phuong thuc
    public void Nhap()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("So luong hang: ");
        setSoLuongHang(scan.nextInt());
        System.out.println("Don gia: ");
        setDonGia(scan.nextDouble());
    }
    
    public void TinhTien()
    {
        soTienKhachTra =  soLuongHang* donGia + ThueVAT(soTienKhachTra);
    }
    
    public double ThueVAT(double _soTienKhachTra)
    {
        return 0.1*_soTienKhachTra;
    }  

    public double getSoTienKhachTra() {
        return soTienKhachTra;
    }

    public void setSoTienKhachTra(double soTienKhachTra) {
        this.soTienKhachTra = soTienKhachTra;
    }

    public int getSoLuongHang() {
        return soLuongHang;
    }

    public void setSoLuongHang(int soLuongHang) {
        this.soLuongHang = soLuongHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
