package Bai2;

import java.sql.Date;

public class KySu extends CanBo {
    private String nganhDaoTao_146;

    public KySu(String hoTen_146, Date ngaySinh_146, boolean gioiTinh_146, String diaChi_146, String nganhDaoTao_146) {
        super(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146);
        this.nganhDaoTao_146 = nganhDaoTao_146;
    }

    public KySu(String nganhDaoTao_146) {
        this.nganhDaoTao_146 = nganhDaoTao_146;
    }

    public String getNganhDaoTao_146() {
        return nganhDaoTao_146;
    }

    public void setNganhDaoTao_146(String nganhDaoTao_146) {
        this.nganhDaoTao_146 = nganhDaoTao_146;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Nganh dao tao: " + nganhDaoTao_146);
    }
}
