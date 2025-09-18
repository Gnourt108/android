package Bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLyTaiLieu qltl_146 = new QuanLyTaiLieu();
        Scanner sc_146 = new Scanner(System.in);
        int choice_146;
        do {
            System.out.println("\n===== MENU QUAN LY TAI LIEU =====");
            System.out.println("1. Nhap thong tin tai lieu");
            System.out.println("2. Tim kiem tai lieu theo ten");
            System.out.println("3. Tim kiem tai lieu theo ma tai lieu");
            System.out.println("4. Hien thi toan bo danh sach tai lieu");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice_146 = sc_146.nextInt();
            sc_146.nextLine(); 

            switch (choice_146) {
                case 1:
                    qltl_146.nhapTaiLieu(sc_146);
                    break;
                case 2:
                    System.out.print("Nhap ten loai tai lieu: ");
                    String ten_146 = sc_146.nextLine();
                    qltl_146.timTaiLieuTheoLoai(ten_146);
                    break;
                case 3:
                    System.out.print("Nhap ma tai lieu: ");
                    int maTaiLieu_146 = sc_146.nextInt();
                    sc_146.nextLine();
                    TaiLieu tl_146 = qltl_146.timTaiLieuTheoMa(maTaiLieu_146);
                    if (tl_146 != null) {
                        System.out.println("Tai lieu ton tai");
                        tl_146.hienThi();
                    } else {
                        System.out.println("Tai lieu khong ton tai");
                    }
                    break;
                case 4:
                    qltl_146.hienThiTatCa();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice_146 != 0);
        sc_146.close();
    }
}
