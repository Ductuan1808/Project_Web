package Class;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class KhenThuong implements Serializable {
        private Integer maKhenThuong;
        private SinhVien HocSinh;
        private GiangVien giaoVien;
        private String ThanhTich;
        private String LoaiPhanThuong;



    public KhenThuong(SinhVien hocSinh, Integer maKhenThuong, String thanhTich, String loaiPhanThuong ) {
       this.HocSinh = hocSinh;
        this.maKhenThuong = maKhenThuong;
        this.ThanhTich = thanhTich;
        this.LoaiPhanThuong = loaiPhanThuong;
    }

    public void themkhenthuonggiaovien(){
        Scanner sb = new Scanner(System.in);
        Scanner sg = new Scanner(System.in);
        System.out.println("Nhập mã khen thưởng");
        maKhenThuong=sg.nextInt();
        System.out.println("Nhập giảng Vien");
        GiangVien gv = new GiangVien();
        gv.themgiaovien();
        giaoVien=gv;
        System.out.println("Nhập thành tích");
        ThanhTich=sb.nextLine();
        System.out.println("Nhập Loại phần thưởng");
        LoaiPhanThuong=sb.nextLine();
    }


    public void themkhenthuonghocsinh(){
        Scanner sb = new Scanner(System.in);
        Scanner sg = new Scanner(System.in);
        System.out.println("Nhập mã khen thưởng");
        maKhenThuong=sg.nextInt();
        System.out.println("Nhập Học Sinh");
        SinhVien sv = new SinhVien();
        sv.themsinhvien();
        HocSinh=sv;
        System.out.println("Nhập thành tích");
        ThanhTich=sb.nextLine();
        System.out.println("Nhập Loại phần thưởng");
        LoaiPhanThuong=sb.nextLine();
    }

    public KhenThuong() {
    }

    public KhenThuong(Integer maKhenThuong , GiangVien giaoVien, String thanhTich, String loaiPhanThuong, String lyDoKhenThuong, LocalDate ngayKhenThuong) {
        this.maKhenThuong = maKhenThuong;
        this.giaoVien = giaoVien;
        this.ThanhTich = thanhTich;
        this.LoaiPhanThuong = loaiPhanThuong;

    }

    public Integer getMaKhenThuong() {
        return maKhenThuong;
    }

    public void setMaKhenThuong(Integer maKhenThuong) {
        this.maKhenThuong = maKhenThuong;
    }

    public SinhVien getHocSinh() {
        return HocSinh;
    }

    public void setHocSinh(SinhVien hocSinh) {
        HocSinh = hocSinh;
    }

    public GiangVien getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(GiangVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public String getThanhTich() {
        return ThanhTich;
    }

    public void setThanhTich(String thanhTich) {
        ThanhTich = thanhTich;
    }

    public String getLoaiPhanThuong() {
        return LoaiPhanThuong;
    }

    public void setLoaiPhanThuong(String loaiPhanThuong) {
        LoaiPhanThuong = loaiPhanThuong;
    }


}
