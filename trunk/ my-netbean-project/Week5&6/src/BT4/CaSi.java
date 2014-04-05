package BT4;

import java.util.Scanner;

public class CaSi extends Nguoi {
    //Khai bao bien

    private String theLoai;
    private String[] cacAlbum;

    //Ham khoi tao
    public CaSi() {
        super();
        theLoai = "";
        cacAlbum = new String[0];
    }

    public CaSi(String _theLoai, String[] _CacAlbum, String _hoTen, String _ngaySinh, int _tuoi) {
        super(_hoTen, _ngaySinh, _tuoi);
        theLoai = _theLoai;
        cacAlbum = _CacAlbum;
    }

    //In thong tin
    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.print("Ten album: ");
        for (String cacAlbum1 : cacAlbum) {
            System.out.print(cacAlbum1 + " ");
        }
        System.out.println();
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap The loai: ");
        theLoai = scan.next();
        System.out.print("Nhap so luong album: ");
        int soLuong = scan.nextInt();
        cacAlbum = new String[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Ten album [" + (i + 1) + "]: ");
            cacAlbum[i] = scan.next();
        }
    }

    //Get - Set
    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String[] getCacAlbum() {
        return cacAlbum;
    }

    public void setCacAlbum(String[] cacAlbum) {
        this.cacAlbum = cacAlbum;
    }
}
