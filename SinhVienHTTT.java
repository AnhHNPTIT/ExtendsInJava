import java.util.Date;

public class SinhVienHTTT extends SinhVien{
    private int hocPhi;
    
    public SinhVienHTTT(){

    }
    
    public SinhVienHTTT(String maSV, String hoTen, Date ngaySinh, String gioiTinh, float diemTB, int hocPhi) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.hocPhi = hocPhi;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("hocPhi: " + hocPhi);
    }

    
}
