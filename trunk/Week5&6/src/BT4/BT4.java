package BT4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BT4 {

    public static void main(String[] args) {
        //Khai bao bien
        List listSinhVien = new ArrayList<SinhVien>();
        List listHocSinh = new ArrayList<HocSinh>();
        List listCongNhan = new ArrayList<CongNhan>();
        List listCaSi = new ArrayList<CaSi>();

        Scanner scan = new Scanner(System.in);
        int temp;
        do {
            System.out.println("Nhap 1: Nhap Sinh vien");
            System.out.println("Nhap 2: Nhap Hoc sinh");
            System.out.println("Nhap 3: Nhap Cong nhan");
            System.out.println("Nhap 4: Nhap Ca si");
            System.out.println("Nhap 5: In thong tin");
            System.out.println("Nhap 0: Thoat");
            System.out.print("Nhap : ");

            temp = scan.nextInt();

            switch (temp) {
                case 1:
                    SinhVien sinhVien = new SinhVien();
                    sinhVien.Nhap();
                    listSinhVien.add(sinhVien);
                    break;
                case 2:
                    HocSinh hocSinh = new HocSinh();
                    hocSinh.Nhap();
                    listHocSinh.add(hocSinh);
                    break;
                case 3:
                    CongNhan congNhan = new CongNhan();
                    congNhan.Nhap();
                    listCongNhan.add(congNhan);
                    break;
                case 4:
                    CaSi caSi = new CaSi();
                    caSi.Nhap();
                    listCaSi.add(caSi);
                    break;
                case 5:
                    for (Iterator i = listSinhVien.iterator(); i.hasNext();) {
                        SinhVien sv = (SinhVien) i.next();
                        sv.InThongTin();
                    }
                    for (Iterator i = listHocSinh.iterator(); i.hasNext();) {
                        HocSinh hs = (HocSinh) i.next();
                        hs.InThongTin();
                    }
                    for (Iterator i = listCongNhan.iterator(); i.hasNext();) {
                        CongNhan cn = (CongNhan) i.next();
                        cn.InThongTin();
                    }
                    for (Iterator i = listCaSi.iterator(); i.hasNext();) {
                        CaSi cs = (CaSi) i.next();
                        cs.InThongTin();
                    }
                    break;
                default:
                    System.out.println("Nhap lai!");
                    break;
            }
        } while (temp != 0);
    }
}
