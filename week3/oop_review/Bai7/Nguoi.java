package Bai7;

import java.util.Scanner;

class Nguoi {
    protected String hoTen_146;
    protected String ngaySinh_146; 
    protected String queQuan_146;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_146 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh_146 = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan_146 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_146);
        System.out.println("Ngay sinh: " + ngaySinh_146);
        System.out.println("Que quan: " + queQuan_146);
    }

    public int getNamSinh_146() {
        String[] parts = ngaySinh_146.split("/");
        return Integer.parseInt(parts[2]);
    }

    public String getQueQuan_146() {
        return queQuan_146;
    }
}
