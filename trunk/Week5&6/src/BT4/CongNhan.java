package BT4;

import java.util.Scanner;

public class CongNhan extends Nguoi {
    //Khai bao bien

    private String tenCongTy;
    private String trinhDo;

    //Ham khoi tao
    public CongNhan() {
        tenCongTy = "";
        trinhDo = "";
    }

    public CongNhan(String _tenCongTy, String _trinhDo, String _hoTen, String _ngaySinh, int _tuoi) {
        super(_hoTen, _ngaySinh, _tuoi);
        tenCongTy = _tenCongTy;
        trinhDo = _trinhDo;
    }

    //In thong tin
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Ten cong ty: " + tenCongTy);
        System.out.println("Trinh do: " + trinhDo);
        System.out.println();
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap Ten cong ty: ");
        tenCongTy = scan.next();
        System.out.print("Nhap trinh do: ");
        trinhDo = scan.next();
    }

    //Get - Set
    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
}
