package Bai3;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTaiLieu {
    public List<TaiLieu> danhSach_146;

    public QuanLyTaiLieu() {
        danhSach_146 = new ArrayList<TaiLieu>();
    }

    public void nhapTaiLieu(Scanner sc_146) {
        System.out.println("\n--- Nhap tai lieu moi ---");
        System.out.println("1. Sach");
        System.out.println("2. Tap chi");
        System.out.println("3. Bao");
        System.out.print("👉 Chon loai tai lieu: ");
        int choice_146 = sc_146.nextInt();
        sc_146.nextLine();

        System.out.println("Nhap ma tai lieu: ");
        int maTaiLieu_146 = sc_146.nextInt();
        sc_146.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        String nhaXuatBan_146 = sc_146.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        int soBanPhatHanh_146 = sc_146.nextInt();
        sc_146.nextLine();

        TaiLieu tl_146 = null;

        switch (choice_146) {
            case 1:
                System.out.println("Nhap tac gia: ");
                String tacGia_146 = sc_146.nextLine();
                System.out.println("So trang: ");
                int soTrang_146 = sc_146.nextInt();
                sc_146.nextLine();
                tl_146 = new Sach(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146, tacGia_146, soTrang_146);
                System.out.println("Them thanh cong sach");
                break;
            case 2:
                System.out.println("Nhap so phat hanh: ");
                int soPhatHanh_146 = sc_146.nextInt();
                sc_146.nextLine();
                System.out.println("Nhap thang phat hanh: ");
                int thangPhatHanh_146 = sc_146.nextInt();
                sc_146.nextLine();
                tl_146 = new TapChi(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146, soPhatHanh_146, thangPhatHanh_146);
                System.out.println("Them thanh cong tap chi");
                break;
            case 3:
                System.out.println("Nhap ngay phat hanh (YYYY-MM-DD): ");
                String ngayPhatHanhStr_146 = sc_146.nextLine();
                Date ngayPhatHanh_146 = Date.valueOf(ngayPhatHanhStr_146);
                tl_146 = new Bao(maTaiLieu_146, nhaXuatBan_146, soBanPhatHanh_146, ngayPhatHanh_146);
                System.out.println("Them thanh cong bao");
                break;
            default:
                System.out.println("❌ Loai tai lieu khong hop le!");
                return;
        }

        danhSach_146.add(tl_146);
        System.out.println("Them tai lieu thanh cong");
    }

    public TaiLieu timTaiLieuTheoMa(int maTaiLieu_146) {
        for (TaiLieu tl_146 : danhSach_146) {
            if (tl_146.getMaTaiLieu_146() == maTaiLieu_146) {
                return tl_146;
            }
        }
        return null;
    }

    public void timTaiLieuTheoLoai(String loai_146) {
        boolean found_146 = false;
        for (TaiLieu tl_146 : danhSach_146) {
            switch (loai_146.toLowerCase()) {
                case "sach":
                    if (tl_146 instanceof Sach) {
                        tl_146.hienThi();
                        found_146 = true;
                    }
                    break;
                case "tap chi":
                case "tapchi":
                    if (tl_146 instanceof TapChi) {
                        tl_146.hienThi();
                        found_146 = true;
                    }
                    break;
                case "bao":
                    if (tl_146 instanceof Bao) {
                        tl_146.hienThi();
                        found_146 = true;
                    }
                    break;
            }
        }
        if (!found_146) {
            System.out.println(" Khong tim thay tai lieu nao!");
        }
    }

    public void hienThiTatCa() {
        for (TaiLieu tl_146 : danhSach_146) {
            tl_146.hienThi();
            System.out.println("----------------------------------");
        }
    }
}
