package Class;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Person implements Serializable {
    String hoTen;
    String ngaySinh;
    String gioiTinh;

    public Person() {
    }

    public Person(String hoTen , String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ Tên");
        hoTen=sc.nextLine();
        System.out.println("Nhập Ngày Sinh");
        ngaySinh=sc.nextLine();
        System.out.println("Nhập Giới Tính");
        gioiTinh=sc.nextLine();

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
