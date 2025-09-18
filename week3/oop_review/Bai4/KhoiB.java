package Bai4;

import java.util.Arrays;

public class KhoiB extends ThiSinh{
    private final String khoi = "B";
    private final String[] monThi = {"Toan", "Hoa", "Sinh"};
    
    public KhoiB(int soBaoDanh_146, String hoTen_146, String diaChi_146, String dienUuTien_146) {
        super(soBaoDanh_146, hoTen_146, diaChi_146, dienUuTien_146);
    }

    public KhoiB() {
    }

    @Override
    public void hienThiThongTin() {
             System.out.println("SBD: " + soBaoDanh_146 + " | Ho ten: " + hoTen_146
            + " | Dia chi: " + diaChi_146 + " | Uu tien: " + dienUuTien_146
            + " | Khoi: " + khoi + " | Mon: " + Arrays.toString(monThi));
    }
    
}
