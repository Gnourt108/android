package Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoDan {
    private int soNha_146;
    private List<Nguoi> thanhVien_146 = new ArrayList<>();

    public void nhapHoDan(Scanner sc){
        int soThanhVien;
        System.out.println("Nhap so nha: ");
        soNha_146 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so thanh vien: ");
        soThanhVien = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thanh vien thu "+(i+1)+" :");
            Nguoi nguoi = new Nguoi();
            nguoi.nhap(sc);
            thanhVien_146.add(nguoi);
        }
    }

    public void hienThiHoDan(){
        System.out.println("Ho so nha: " + soNha_146 + " co " + thanhVien_146.size() + " thanh vien");
        for (Nguoi nguoi : thanhVien_146) {
            nguoi.hienThi();
        }
    }

    public boolean is80Tuoi(int namHienTai){
        for (Nguoi nguoi : thanhVien_146) {
            if (nguoi.tinhTuoi(namHienTai) >= 80) {
                return true;
            }
        }
        return false;
    }

}
