package Bai2;

import java.sql.Date;

public class CanBo {
    private String hoTen_146;
    private Date ngaySinh_146;
    private boolean gioiTinh_146;
    private String diaChi_146;
    
    public CanBo(String hoTen_146, Date ngaySinh_146, boolean gioiTinh_146, String diaChi_146) {
        this.hoTen_146 = hoTen_146;
        this.ngaySinh_146 = ngaySinh_146;
        this.gioiTinh_146 = gioiTinh_146;
        this.diaChi_146 = diaChi_146;
    }

    public CanBo() {
    }

    public String getHoTen_146() {
        return hoTen_146;
    }

    public void setHoTen_146(String hoTen_146) {
        this.hoTen_146 = hoTen_146;
    }

    public Date getNgaySinh_146() {
        return ngaySinh_146;
    }

    public void setNgaySinh_146(Date ngaySinh_146) {
        this.ngaySinh_146 = ngaySinh_146;
    }

    public boolean isGioiTinh_146() {
        return gioiTinh_146;
    }

    public void setGioiTinh_146(boolean gioiTinh_146) {
        this.gioiTinh_146 = gioiTinh_146;
    }

    public String getDiaChi_146() {
        return diaChi_146;
    }

    public void setDiaChi_146(String diaChi_146) {
        this.diaChi_146 = diaChi_146;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_146);
        System.out.println("Ngay sinh: " + ngaySinh_146);
        System.out.println("Gioi tinh: " + (gioiTinh_146 ? "Nam" : "Nu"));
        System.out.println("Dia chi: " + diaChi_146);
    }
}
