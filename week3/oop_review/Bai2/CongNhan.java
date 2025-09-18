package Bai2;

import java.sql.Date;

public class CongNhan extends CanBo {
    private String bac_146;

    public CongNhan(String hoTen_146, Date ngaySinh_146, boolean gioiTinh_146, String diaChi_146, String bac_146) {
        super(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146);
        this.bac_146 = bac_146;
    }

    public CongNhan(String bac_146) {
        this.bac_146 = bac_146;
    }

    public String getBac_146() {
        return bac_146;
    }

    public void setBac_146(String bac_146) {
        this.bac_146 = bac_146;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Bac cong nhan: " + bac_146);
    }
}
