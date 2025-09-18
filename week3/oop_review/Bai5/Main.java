package Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        KhuPho khuPho_146 = new KhuPho();
         do {
            System.out.println("\n===== MENU KHU PHO =====");
            System.out.println("1. Nhap thong tin ho dan");
            System.out.println("2. Hien thi toan bo ho dan");
            System.out.println("3. Hien thi nguoi tren 80 tuoi");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    khuPho_146.nhap(sc);
                    break;
                case 2:
                    khuPho_146.hienThiTatCa();
                    break;
                case 3:
                    System.out.print("Nhap nam hien tai: ");
                    int nam_146 = Integer.parseInt(sc.nextLine());
                    khuPho_146.hienThiNguoiTren80Tuoi(nam_146);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);

        sc.close();
    }
}
