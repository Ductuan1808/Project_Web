package Class;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public abstract class Nguoi implements Serializable {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;

    public Nguoi() {
    }


    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    public void nhapnguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        hoTen=sc.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaySinh=sc.nextLine();
        System.out.println("Nhập giới tính");
        gioiTinh=sc.nextLine();
    }

    public String xuatnguoi(){
       return "Họ và tên:"+hoTen+",Ngày sinh:"+ngaySinh+",Giới tính:"+gioiTinh+" ";

    }
    public abstract void hienthithongtin();

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
