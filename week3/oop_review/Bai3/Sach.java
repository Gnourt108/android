package Bai3;

public class Sach extends TaiLieu {
    public String tacGia_146;
    public int soTrang_146;

    public Sach(int maTaiLieu_146, String nhaXuatBan_146, int soBanPhatHanh_146, String tacGia_146, int soTrang_146) {
        super(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146);
        this.tacGia_146 = tacGia_146;
        this.soTrang_146 = soTrang_146;
    }

    public String getTacGia_146() {
        return tacGia_146;
    }

    public void setTacGia_146(String tacGia_146) {
        this.tacGia_146 = tacGia_146;
    }

    public int getSoTrang_146() {
        return soTrang_146;
    }

    public void setSoTrang_146(int soTrang_146) {
        this.soTrang_146 = soTrang_146;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Tac gia: " + tacGia_146);
        System.out.println("So trang: " + soTrang_146);
    }
}
