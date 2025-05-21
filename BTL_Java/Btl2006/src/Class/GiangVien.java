package Class;

import java.io.Serializable;
import java.util.Scanner;

public class GiangVien extends Person implements Serializable {
    String maGiangVien;
    String chuyenNganh;


    public GiangVien(String maGiangVien, String chuyenNganh) {
        this.maGiangVien = maGiangVien;
        this.chuyenNganh = chuyenNganh;
    }

    public GiangVien() {
    }

    public GiangVien(String hoTen, String ngaySinh, String gioiTinh, String maGiangVien, String chuyenNganh) {
        super(hoTen, ngaySinh, gioiTinh);
        this.maGiangVien = maGiangVien;
        this.chuyenNganh = chuyenNganh;
    }
    public void themgiaovien(){
        Scanner sd = new Scanner(System.in);
        nhap();
        System.out.println("Nhập Mã Giảng Viên");
        maGiangVien=sd.nextLine();
        System.out.println("Nhập Chuyên Ngành");
        chuyenNganh=sd.nextLine();
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
