package Bai7;

import java.util.Scanner;

class HocSinh extends Nguoi {
    private String lop_146;
    private String khoaHoc_146;
    private String kyHoc_146;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop:: ");
        lop_146 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_146 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_146 = sc.nextLine();
    }

     public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop_146);
        System.out.println("Khoa hoc: " + khoaHoc_146);
        System.out.println("Ky hoc: " + kyHoc_146);
        System.out.println("----------------------");
    }

    public String getLop_146() {
        return lop_146;
    }
}
