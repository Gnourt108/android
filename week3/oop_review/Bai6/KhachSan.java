package Bai6;

import java.util.Scanner;

public class KhachSan {
    private Nguoi nguoi_146;
    private int soNgayTro_146;
    private String loaiPhong_146;
    private double giaPhong_146;

    public void nhap(Scanner sc){
        nguoi_146 = new Nguoi();
        nguoi_146.nhap(sc);

        System.out.println("Nhap so ngay tro: ");
        soNgayTro_146 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap loai phong: ");
        loaiPhong_146 = sc.nextLine();
        
        System.out.println("Nhp gia phong\ngay: ");
        giaPhong_146 = sc.nextDouble();
    }

    public void hienThi(){
        nguoi_146.hienThiCaNhan();
        System.out.println("So ngya tro: "+soNgayTro_146);
        System.out.println("Loai phong: "+loaiPhong_146);
        System.out.println("Gia phong: "+giaPhong_146);
    }

    public double tinhTien(){
        return soNgayTro_146 * giaPhong_146;
    }

    public String getSoCMND(){
        return nguoi_146.getCmnd_146();
    }
}
