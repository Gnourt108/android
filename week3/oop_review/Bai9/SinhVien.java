package Bai9;

import java.util.Scanner;

class SinhVien {
    private String hoTen_146;
    private String msv_146;
    private String ngaySinh_146;
    private String lop_146;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_146 = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        msv_146 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh_146 = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop_146 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_146);
        System.out.println("MSV: " + msv_146);
        System.out.println("Ngay sinh: " + ngaySinh_146);
        System.out.println("Lop: " + lop_146);
    }

    public String getHoTen_146() {
        return hoTen_146;
    }
}
