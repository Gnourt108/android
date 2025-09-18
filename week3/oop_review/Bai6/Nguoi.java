package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_146;
    private Date ngaySinh_146;
    private String cmnd_146;
    public Nguoi(String hoTen_146, Date ngaySinh_146, String cmnd_146) {
        this.hoTen_146 = hoTen_146;
        this.ngaySinh_146 = ngaySinh_146;
        this.cmnd_146 = cmnd_146;
    }

    public Nguoi() {
    }

 // Định dạng ngày (dd/MM/yyyy)
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void nhap(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        hoTen_146 = sc.nextLine();

        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String strNgaySinh = sc.nextLine();
        try {
            ngaySinh_146 = sdf.parse(strNgaySinh);
        } catch (ParseException e) {
            System.out.println("Ngày sinh không hợp lệ, mặc định 01/01/2000");
            try {
                ngaySinh_146 = sdf.parse("01/01/2000");
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }

        System.out.print("Nhập số CMND: ");
        cmnd_146 = sc.nextLine();
    }
    public String getHoTen_146() {
        return hoTen_146;
    }
    public void setHoTen_146(String hoTen_146) {
        this.hoTen_146 = hoTen_146;
    }
    public Date getNgaySinh_146() {
        return ngaySinh_146;
    }
    public void setNgaySinh_146(Date ngaySinh_146) {
        this.ngaySinh_146 = ngaySinh_146;
    }
    public String getCmnd_146() {
        return cmnd_146;
    }
    public void setCmnd_146(String cmnd_146) {
        this.cmnd_146 = cmnd_146;
    }

    public void hienThiCaNhan(){
        System.out.println("Ho ten: "+hoTen_146);
        System.out.println("Ngay sinh: "+ngaySinh_146);
        System.out.println("Chung minh nhan dan: "+cmnd_146);
        
    }
}
