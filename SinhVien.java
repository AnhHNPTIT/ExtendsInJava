import java.util.Date;

class SinhVien {
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private float diemTB;

    
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, Date ngaySinh, String gioiTinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
    
    public void hienThi(){
        System.out.println("Hien thi thong tin sinh vien");
        System.out.println("maSV: " + this.maSV );
        System.out.println("hoTen: " + this.hoTen );
        System.out.println("ngaySinh: " + this.ngaySinh );
        System.out.println("gioiTinh: " + this.gioiTinh );
        System.out.println("diemTB: " + this.diemTB );
    }
}