package BT5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CongTy {
    //
    private double tongTien;
    List khachThuong;
    List khachThanThiet;
    List khachDacBiet;
    
    public CongTy()
    {
        tongTien = 0;
        khachThuong = new ArrayList<KhachThuong>();
        khachThanThiet = new ArrayList<KhachThanThiet>();
        khachDacBiet = new ArrayList<KhachDacBiet>();
    }
    
    public void Nhap()
    {
        Scanner scan = new Scanner(System.in);
        int temp;
        do
        {
            System.out.println("Nhap 1: Nhap Khach Hang Thuong");
            System.out.println("Nhap 2: Nhap Khach Hang Than Thiet");
            System.out.println("Nhap 3: Nhap Khach Hang Dac Biet");
            System.out.println("Nhap 0: Thoat");
            System.out.print("Nhap : ");
            
            temp = scan.nextInt();
            
            switch(temp)
            {
                case 1:
                    KhachThuong khThuong = new KhachThuong();
                    khThuong.Nhap();
                    khachThuong.add(khThuong);
                    break;
                case 2:
                    KhachThanThiet khThanThiet = new KhachThanThiet();
                    khThanThiet.Nhap();
                    khachThanThiet.add(khThanThiet);
                    break;
                case 3:
                    KhachDacBiet khDacBiet = new KhachDacBiet();
                    khDacBiet.Nhap();
                    khachDacBiet.add(khDacBiet);
                    break;                
                default:
                    System.out.println("Nhap lai!");
                    break;
            }
        }while(temp != 0);
    }
    
    public void TinhTien()
    {
        for (Iterator i = khachThuong.iterator(); i.hasNext(); ) {
            KhachThuong kt = (KhachThuong) i.next(); 
            kt.TinhTien();
        }
        for (Iterator i = khachThanThiet.iterator(); i.hasNext(); ) {
            KhachThanThiet ktt = (KhachThanThiet) i.next(); 
            ktt.TinhTien();
        }
        for (Iterator i = khachDacBiet.iterator(); i.hasNext(); ) {
            KhachDacBiet kdb = (KhachDacBiet) i.next(); 
            kdb.TinhTien();
        }
    }
    
    public double TinhTong()
    {
        tongTien = 0;
        for (Iterator i = khachThuong.iterator(); i.hasNext(); ) {
            KhachThuong kt = (KhachThuong) i.next(); 
            tongTien += kt.getSoTienKhachTra();
        }
        for (Iterator i = khachThanThiet.iterator(); i.hasNext(); ) {
            KhachThanThiet ktt = (KhachThanThiet) i.next(); 
            tongTien += ktt.getSoTienKhachTra();
        }
        for (Iterator i = khachDacBiet.iterator(); i.hasNext(); ) {
            KhachDacBiet kdb = (KhachDacBiet) i.next(); 
            tongTien += kdb.getSoTienKhachTra();
        }
        return tongTien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
