package Bai2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    private List<CanBo> danhSach_146;

    public QuanLyCanBo() {
        danhSach_146 = new ArrayList<CanBo>();
    }

    // Nhập thông tin mới cho cán bộ
    public void nhapCanBo_146(Scanner sc) {
        System.out.println("\n--- Nhap can bo moi ---");
        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");
        System.out.print("👉 Chon loai can bo: ");
        int loai_146 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ho ten: ");
        String hoTen_146 = sc.nextLine();
        System.out.print("Ngay sinh (yyyy-mm-dd): ");
        String ns_146 = sc.nextLine();
        Date ngaySinh_146 = Date.valueOf(ns_146);
        System.out.print("Gioi tinh (nam/nu): ");
        String gioiTinhStr_146 = sc.nextLine();
        boolean gioiTinh_146 = gioiTinhStr_146.equalsIgnoreCase("nam");
        System.out.print("Dia chi: ");
        String diaChi_146 = sc.nextLine();

        CanBo cb_146 = null;

        switch (loai_146) {
            case 1:
                System.out.print("Nhap bac: ");
                String bac_146 = sc.nextLine();
                cb_146 = new CongNhan(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146, bac_146);
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao_146 = sc.nextLine();
                cb_146 = new KySu(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146, nganhDaoTao_146);
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec_146 = sc.nextLine();
                cb_146 = new NhanVien(hoTen_146, ngaySinh_146, gioiTinh_146, diaChi_146, congViec_146);
                break;
            default:
                System.out.println("❌ Loai can bo khong hop le!");
                return;
        }

        danhSach_146.add(cb_146);
        System.out.println("✅ Da them can bo thanh cong!");
    }

    // Tìm kiếm cán bộ theo tên
    public CanBo timKiemCanBo_146(String ten_146) {
        for (CanBo canBo_146 : danhSach_146) {
            if (canBo_146.getHoTen_146().equalsIgnoreCase(ten_146)) {
                return canBo_146;
            }
        }
        return null;
    }

    public void hienThiTatCa_146() {
        for (CanBo canBo_146 : danhSach_146) {
            canBo_146.hienThi();
            System.out.println("----------------------------------");
        }
    }
}
