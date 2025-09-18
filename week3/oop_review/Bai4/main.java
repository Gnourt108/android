package Bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ts_146 = new TuyenSinh();
        int choice;
        do {
            System.out.println("\n===== MENU TUYEN SINH =====");
            System.out.println("1. Nhao thi sinh moi");
            System.out.println("2. Hien thi tat ca thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

             switch (choice) {
                case 1:
                    System.out.print("Nhap so bao danh: ");
                    int sbd_146 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String hoten_146 = sc.nextLine();
                    System.out.print("Nhap dia chi: ");
                    String diachi_146 = sc.nextLine();
                    System.out.print("Nhap dien uu tien: ");
                    String uutien_146 = sc.nextLine();

                    System.out.print("Chon khoi thi (A/B/C): ");
                    String khoi_146 = sc.nextLine().toUpperCase();

                    ThiSinh tsinh_146 = null;
                    switch (khoi_146) {
                        case "A": case "a":
                            tsinh_146 = new KhoiA(sbd_146, hoten_146, diachi_146, uutien_146);
                            break;
                        case "B": case "b":
                             tsinh_146 = new KhoiB(sbd_146, hoten_146, diachi_146, uutien_146);
                            break;
                        case "C": case "c":
                            tsinh_146 = new KhoiC(sbd_146, hoten_146, diachi_146, uutien_146);
                            break;
                        default:
                            System.out.println("Khối không hợp lệ!");
                    }
                    if (tsinh_146 != null) 
                        ts_146.nhapThiSinh(tsinh_146);
                    break;

                case 2:
                    System.out.println("\n=== Danh sach thi sinh ===");
                    ts_146.hienThiTatCa();
                    break;

                case 3:
                    System.out.print("Nhap so bao danh can tim ");
                    int timSBD = sc.nextInt();
                    sc.nextLine();
                    ts_146.timKiemTheoSBD(timSBD);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
