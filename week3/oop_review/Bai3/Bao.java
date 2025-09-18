package Bai3;

import java.util.Date;

public class Bao extends TaiLieu {
    public Date ngayPhatHanh_146;

    public Bao(int maTaiLieu_146, String nhaXuatBan_146, int soBanPhatHanh_146, Date ngayPhatHanh_146) {
        super(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146);
        this.ngayPhatHanh_146 = ngayPhatHanh_146;
    }

    public Date getNgayPhatHanh_146() {
        return ngayPhatHanh_146;
    }

    public void setNgayPhatHanh_146(Date ngayPhatHanh_146) {
        this.ngayPhatHanh_146 = ngayPhatHanh_146;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh_146);
    }
}
