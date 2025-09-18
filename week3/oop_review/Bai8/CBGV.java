package Bai8;

import java.util.Scanner;

class CBGV extends Nguoi {
    private double luongCung_146;
    private double thuong_146;
    private double phat_146;
    private double luongThucLinh_146;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_146 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong_146 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat_146 = Double.parseDouble(sc.nextLine());

        tinhLuongThucLinh();
    }

    private void tinhLuongThucLinh() {
        luongThucLinh_146 = luongCung_146 + thuong_146 - phat_146;
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_146);
        System.out.println("Thuong: " + thuong_146);
        System.out.println("Phat: " + phat_146);
        System.out.println("Luong thuc linh: " + luongThucLinh_146);
        System.out.println("-----------------------");
    }

    public double getLuongThucLinh_146() {
        return luongThucLinh_146;
    }
}
