package Bai5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen_146;
    private int namSinh_146;
    private String ngheNghiep_146;

    public void nhap(Scanner sc){
        System.out.println("Nhap ho ten: ");
        hoTen_146 = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh_146 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nghe nghiep: ");
        ngheNghiep_146 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("    Ho ten: " + hoTen_146 + " | Nam sinh: " + namSinh_146 + " | Nghe: " + ngheNghiep_146);
    }

    public int tinhTuoi(int namHienTai) {
        return namHienTai - namSinh_146;
    }
}
