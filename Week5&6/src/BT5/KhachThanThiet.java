package BT5;
public class KhachThanThiet extends KhachHang{
    int soNamThanThiet;
    
    public KhachThanThiet()
    {
        super();
    }
    
    public KhachThanThiet(int _soNamThanThiet, int _soLuong, int _donGia)
    {
        super(_soLuong, _donGia);
        soNamThanThiet = _soNamThanThiet;
    }
    
    @Override
    public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap so nam than thiet: ");
    }
    
    @Override
    public void TinhTien()
    {
        setSoTienKhachTra(ThueVAT(getSoLuongHang()*getDonGia()*(1 - Min(soNamThanThiet*0.1, 0.5))) + getSoLuongHang()*getDonGia()*(1 - Min(soNamThanThiet*0.1, 0.5)));
    }
    
    public double Min(double a, double b)
    {
        if(a > b)
            return b;
        else
            return a;
    }
}
