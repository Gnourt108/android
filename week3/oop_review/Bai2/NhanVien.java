package Bai2;

import java.sql.Date;

public class NhanVien extends CanBo {
    private String congViec_146;

    public NhanVien(String hoTen_146, Date ngaySinh_146, boolean gioiTinh_146, String diaChi_146, String congViec_146) {
        super(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146);
        this.congViec_146 = congViec_146;
    }

    public NhanVien(String congViec_146) {
        this.congViec_146 = congViec_146;
    }

    public String getCongViec_146() {
        return congViec_146;
    }

    public void setCongViec_146(String congViec_146) {
        this.congViec_146 = congViec_146;
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Cong viec: " + congViec_146);
    }
}
