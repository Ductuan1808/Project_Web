package Class;

import java.io.Serializable;
import java.util.Scanner;

public class BangDiem implements Serializable {
    private MonHoc monhoc;
    private float diem15Phut;
    private float diem1Tiet;
    private float diemCuoiKy;

    public BangDiem() {
    }

    public BangDiem(MonHoc monhoc, float diem15Phut, float diem1Tiet, float diemCuoiKy) {
        this.monhoc = monhoc;
        this.diem15Phut = diem15Phut;
        this.diem1Tiet = diem1Tiet;
        this.diemCuoiKy = diemCuoiKy;
    }

    public void nhapbangdiem(){
        MonHoc monHoc = new MonHoc();
        Scanner sc = new Scanner(System.in);
        monHoc.nhapmon();
        monhoc=monHoc;
        System.out.println("Nhập điểm 15 phút");
        diem15Phut=sc.nextFloat();
        System.out.println("Nhập điểm 1 tiết");
        diem1Tiet=sc.nextFloat();
        System.out.println("Nhập điểm cuối kỳ");
        diemCuoiKy=sc.nextFloat();


    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public float tinhDiemTrungBinh() {
        return (diem15Phut + 2 * diem1Tiet + 3 * diemCuoiKy) / 6;
    }







    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public float getDiem15Phut() {
        return diem15Phut;
    }

    public void setDiem15Phut(float diem15Phut) {
        this.diem15Phut = diem15Phut;
    }

    public float getDiem1Tiet() {
        return diem1Tiet;
    }

    public void setDiem1Tiet(float diem1Tiet) {
        this.diem1Tiet = diem1Tiet;
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }
}
