package Bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        QuanLyCanBo qlcb_146 = new QuanLyCanBo();
        Scanner sc_146 = new Scanner(System.in);
        int choice_146;
        do {
            System.out.println("\n===== MENU QUAN LY CAN BO =====");
            System.out.println("1. Nhap thong tin can bo moi");
            System.out.println("2. Tim kiem can bo theo ten");
            System.out.println("3. Hien thi toan bo danh sach can bo");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice_146 = sc_146.nextInt();
            sc_146.nextLine(); 

            switch (choice_146) {
                case 1:
                    qlcb_146.nhapCanBo_146(sc_146);
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim: ");
                    String ten_146 = sc_146.nextLine();
                    CanBo cb_146 = qlcb_146.timKiemCanBo_146(ten_146);
                    if(cb_146 != null){
                        System.out.println("Can bo " + ten_146 + " co ton tai");
                        cb_146.hienThi();
                    }else{
                        System.out.println("Khong ton tai can bo co ten: " + ten_146);
                    }
                    break;
                case 3:
                    qlcb_146.hienThiTatCa_146();
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
