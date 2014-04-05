package BT5;
public class KhachDacBiet extends KhachHang{
    public KhachDacBiet()
    {
        super();
    }
    
    public KhachDacBiet(int _soLuong, int _donGia)
    {
        super(_soLuong, _donGia);
    }
    
    @Override
    public void TinhTien()
    {
        setSoTienKhachTra(getSoLuongHang()* getDonGia()*0.5 + ThueVAT(getSoLuongHang()* getDonGia()*0.5));
    }
}
