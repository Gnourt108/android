package Bai10;

import java.util.Scanner;

class KhachHang {
    private String hoTenChuHo_146;
    private String soNha_146;
    private String maSoCongTo_146;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTenChuHo_146 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha_146 = sc.nextLine();
        System.out.print("Nhap ma so cong to: ");
        maSoCongTo_146 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten chu ho: " + hoTenChuHo_146);
        System.out.println("So nha: " + soNha_146);
        System.out.println("Ma so cong to: " + maSoCongTo_146);
    }
}
