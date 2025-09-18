package Bai9;

import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon_146;
    private String ngayMuon_146;
    private String hanTra_146;
    private String soHieuSach_146;
    private String tenSach_146;
    private SinhVien sv_146;

    public void nhap(Scanner sc) {
        sv_146 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien");
        sv_146.nhap(sc);

        System.out.println("Nhap thong tin the muon");
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon_146 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/MM/yyyy): ");
        ngayMuon_146 = sc.nextLine();
        System.out.print("Nhap han tra (dd/MM/yyyy): ");
        hanTra_146 = sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach_146 = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach_146 = sc.nextLine();
    }

    public void hienThi() {
        sv_146.hienThi();
        System.out.println("So phieu muon: " + soPhieuMuon_146);
        System.out.println("Ngay muon: " + ngayMuon_146);
        System.out.println("Han tra: " + hanTra_146);
        System.out.println("So hieu sach: " + soHieuSach_146);
        System.out.println("Ten sach: " + tenSach_146);
        System.out.println("----------------------------");
    }

    public String getHanTra_146() {
        return hanTra_146;
    }

    public String getTenSach_146() {
        return tenSach_146;
    }

    public SinhVien getSinhVien_146() {
        return sv_146;
    }
}

