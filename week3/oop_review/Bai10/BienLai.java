package Bai10;

import java.util.Scanner;

class BienLai {
    private KhachHang kh_146;
    private int chiSoCu_146;
    private int chiSoMoi_146;
    private long soTienPhaiTra_146;

    public void nhap(Scanner sc) {
        kh_146 = new KhachHang();
        System.out.println("Nhap thong tin khach hang");
        kh_146.nhap(sc);

        System.out.print("Nhap chi so cu: ");
        chiSoCu_146 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_146 = Integer.parseInt(sc.nextLine());

        tinhTienDien();
    }

    private void tinhTienDien() {
        soTienPhaiTra_146 = (long)(chiSoMoi_146 - chiSoCu_146) * 750;
    }

    public void hienThi() {
        kh_146.hienThi();
        System.out.println("Chi so cu: " + chiSoCu_146);
        System.out.println("Chi so moi: " + chiSoMoi_146);
        System.out.println("So tien phai tra: " + soTienPhaiTra_146 + " VND");
        System.out.println("----------------------------");
    }
}
