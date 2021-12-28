import java.util.Date;

public class SinhVienUTT extends SinhVien{
    private String donVi;
    private int luong;

    public SinhVienUTT(){

    }
    
    public SinhVienUTT(String maSV, String hoTen, Date ngaySinh, String gioiTinh, float diemTB, String donVi, int luong) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("donVi: " + donVi);
        System.out.println("luong: " + luong);
    }

    
}
