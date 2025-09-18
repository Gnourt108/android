package Bai3;

public class TaiLieu {
    public int maTaiLieu_146;
    public String nhaXuatBan_146;
    public int soBanPhatHanh_146;

    public TaiLieu(int maTaiLieu_146, String nhaXuatBan_146, int soBanPhatHanh_146) {
        this.maTaiLieu_146 = maTaiLieu_146;
        this.nhaXuatBan_146 = nhaXuatBan_146;
        this.soBanPhatHanh_146 = soBanPhatHanh_146;
    }

    public int getMaTaiLieu_146() {
        return maTaiLieu_146;
    }

    public void setMaTaiLieu_146(int maTaiLieu_146) {
        this.maTaiLieu_146 = maTaiLieu_146;
    }

    public String getNhaXuatBan_146() {
        return nhaXuatBan_146;
    }

    public void setNhaXuatBan_146(String nhaXuatBan_146) {
        this.nhaXuatBan_146 = nhaXuatBan_146;
    }

    public int getSoBanPhatHanh_146() {
        return soBanPhatHanh_146;
    }

    public void setSoBanPhatHanh_146(int soBanPhatHanh_146) {
        this.soBanPhatHanh_146 = soBanPhatHanh_146;
    }

    public void hienThi() {
        System.out.println("Ma tai lieu: " + maTaiLieu_146);
        System.out.println("Nha xuat ban: " + nhaXuatBan_146);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_146);
    }
}
