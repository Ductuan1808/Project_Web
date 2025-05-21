package Class;

import java.io.Serializable;
import java.util.Scanner;

public class MonHoc implements Serializable {
    private String maMon;
    private String tenMon;


    public MonHoc() {
    }

    public void nhapmon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên môn");
        tenMon=sc.nextLine();
        System.out.println("Nhập mã môn");
        maMon=sc.nextLine();
    }
    public MonHoc(String maMon, String tenMon) {
        this.maMon = maMon;
        this.tenMon = tenMon;

    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
}
