package Bai4;

abstract class ThiSinh {
    protected int soBaoDanh_146;
    protected String hoTen_146;
    protected String diaChi_146;
    protected String dienUuTien_146;
    public ThiSinh(int soBaoDanh_146, String hoTen_146, String diaChi_146, String dienUuTien_146) {
        this.soBaoDanh_146 = soBaoDanh_146;
        this.hoTen_146 = hoTen_146;
        this.diaChi_146 = diaChi_146;
        this.dienUuTien_146 = dienUuTien_146;
    }
    public ThiSinh() {
    }
    public int getSoBaoDanh_146() {
        return soBaoDanh_146;
    }
    public void setSoBaoDanh_146(int soBaoDanh_146) {
        this.soBaoDanh_146 = soBaoDanh_146;
    }
    public String getHoTen_146() {
        return hoTen_146;
    }
    public void setHoTen_146(String hoTen_146) {
        this.hoTen_146 = hoTen_146;
    }
    public String getDiaChi_146() {
        return diaChi_146;
    }
    public void setDiaChi_146(String diaChi_146) {
        this.diaChi_146 = diaChi_146;
    }
    public String getDienUuTien_146() {
        return dienUuTien_146;
    }
    public void setDienUuTien_146(String dienUuTien_146) {
        this.dienUuTien_146 = dienUuTien_146;
    }

    public abstract void hienThiThongTin();
    
}
