package Class;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien extends Person implements Serializable {
    String maLop;
    String diemTb;
    String xepLoai;


    public SinhVien(String maLop, String diemTb, String xepLoai) {
        this.maLop = maLop;
        this.diemTb = diemTb;
        this.xepLoai = xepLoai;
    }

    public SinhVien(String hoTen,  String ngaySinh, String gioiTinh, String maLop, String diemTb, String xepLoai) {
        super(hoTen, ngaySinh, gioiTinh);
        this.maLop = maLop;
        this.diemTb = diemTb;
        this.xepLoai = xepLoai;
    }

    public void themsinhvien(){
        Scanner sd = new Scanner(System.in);
        nhap();
        System.out.println("Nhập Mã Lớp");
        maLop=sd.nextLine();
        System.out.println("Nhập Điểm Trung Bình");
        diemTb=sd.nextLine();
        System.out.println("Nhập Xếp Loại");
        xepLoai=sd.nextLine();
    }

    public SinhVien() {
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(String diemTb) {
        this.diemTb = diemTb;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
}
