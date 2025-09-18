package Bai3;

public class TapChi extends TaiLieu {
    public int soPhatHanh_146;
    public int thangPhatHanh_146;

    public TapChi(int maTaiLieu_146, String nhaXuatBan_146, int soBanPhatHanh_146, int soPhatHanh_146, int thangPhatHanh_146) {
        super(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146);
        this.soPhatHanh_146 = soPhatHanh_146;
        this.thangPhatHanh_146 = thangPhatHanh_146;
    }

    public int getSoPhatHanh_146() {
        return soPhatHanh_146;
    }

    public void setSoPhatHanh_146(int soPhatHanh_146) {
        this.soPhatHanh_146 = soPhatHanh_146;
    }

    public int getThangPhatHanh_146() {
        return thangPhatHanh_146;
    }

    public void setThangPhatHanh_146(int thangPhatHanh_146) {
        this.thangPhatHanh_146 = thangPhatHanh_146;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("So phat hanh: " + soPhatHanh_146);
        System.out.println("Thang phat hanh: " + thangPhatHanh_146);
    }
}
