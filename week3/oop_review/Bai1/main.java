package Bai1;

public class main {
    public static void main(String[] args) {
        PhanSo ps1_146 = new PhanSo(2, 3);
        PhanSo ps2_146 = new PhanSo(3, 4);

        PhanSo tong_146 = ps1_146.cong(ps2_146);
        PhanSo tru_146 = ps1_146.tru(ps2_146);
        PhanSo nhan_146 = ps1_146.nhan(ps2_146);
        PhanSo chia_146 = ps1_146.chia(ps2_146);

        System.out.println("Tổng hai phân số = "+tong_146);
        System.out.println("Hiệu hai phân số = "+tru_146);
        System.out.println("Tích hai phân số = "+nhan_146);
        System.out.println("Thương hai phân số = "+chia_146);

        PhanSo ps3_146 = new PhanSo(10, 15);
        System.out.println("Phân số "+ps3_146+(ps3_146.laToiGian() ? " là phân số tối giản" : "là phân số chưa tối giản"));
        System.out.println("Dạng tối giản của "+ps3_146+" là: "+ps3_146.toiGian());

    
    }
}
