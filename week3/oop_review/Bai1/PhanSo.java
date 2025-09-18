package Bai1;
public class PhanSo{
    int tu_146, mau_146;

    PhanSo(int tu_146, int mau_146){
        this.tu_146 = tu_146;
        this.mau_146 = mau_146;
    }

    PhanSo(){
    }

    public int getTu() {
        return tu_146;
    }

    public void setTu(int tu_146) {
        this.tu_146 = tu_146;
    }

    public int getMau() {
        return mau_146;
    }

    public void setMau(int mau_146) {
        this.mau_146 = mau_146;
    }

    public static int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public boolean laToiGian(){
        return UCLN(tu_146, mau_146) == 1;
    }

    public PhanSo toiGian(){
        int ucln = UCLN(tu_146, mau_146);
        return new PhanSo(tu_146/ucln, mau_146/ucln);
    }

    public PhanSo cong(PhanSo ps){
        int tuMoi = this.tu_146 * ps.mau_146 + this.mau_146 * ps.tu_146;
        int mauMoi = this.mau_146 * this.tu_146;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }

    public PhanSo tru(PhanSo ps){
        int tuMoi = this.tu_146 * ps.mau_146 - this.mau_146 * ps.tu_146;
        int mauMoi = this.mau_146 * this.tu_146;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }

    public PhanSo nhan(PhanSo ps){
        int tuMoi = this.tu_146 * ps.tu_146;
        int mauMoi = this.mau_146 * ps.mau_146;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }

    public PhanSo chia(PhanSo ps){
        int tuMoi = this.tu_146 * ps.mau_146;
        int mauMoi = this.mau_146 * ps.tu_146;
        return new PhanSo(tuMoi, mauMoi).toiGian();
    }

    public String toString(){
        if(mau_146 == 1) return tu_146 + "";
        else return tu_146 + "/" + mau_146;
    }
}