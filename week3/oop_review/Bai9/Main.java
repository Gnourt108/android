package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TheMuon> ds = new ArrayList<>();

        System.out.print("Nhap so luong the muon: ");
        int n_146 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n_146; i++) {
            System.out.println("Nhap the muon thu " + (i+1));
            TheMuon tm = new TheMuon();
            tm.nhap(sc);
            ds.add(tm);
        }

        System.out.println("\nDanh sach sinh vien can tra vao ngay cuoi thang");
        for (TheMuon tm : ds) {
            String hanTra = tm.getHanTra_146();
            if (hanTra.startsWith("30/") || hanTra.startsWith("31/")) {
                System.out.println("Sinh vien: " + tm.getSinhVien_146().getHoTen_146() +
                                   " | Ten sach: " + tm.getTenSach_146() +
                                   " | Han tra: " + hanTra);
            }
        }

        sc.close();
    }

}
