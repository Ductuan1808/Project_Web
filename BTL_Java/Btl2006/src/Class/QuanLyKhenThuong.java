package Class;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhenThuong {
    ArrayList<KhenThuong> list = new ArrayList<>();

    public void themkhenthuonggv(KhenThuong k){
        k.themkhenthuonggiaovien();
        list.add(k);
    }
    public void themkhenthuonghs(KhenThuong k){
        k.themkhenthuonghocsinh();
        list.add(k);
    }
    public void xoakhenthuongbangten(String name){
        for(KhenThuong x: list){
            if((x.getHocSinh().hoTen.equals(name))||(x.getGiaoVien().hoTen.equals(name))){
                list.remove(x);
            }
        }
    }
    public void xuatdanhsachhsduockhenthuong(){
        for(KhenThuong x: list){
            if(x.getGiaoVien()==null){
                System.out.println("Tên Học Sinh:"+x.getHocSinh().getHoTen()+" Ngày Sinh:"+x.getHocSinh().getNgaySinh()+" giới tính:"+x.getHocSinh().getGioiTinh());
                System.out.println("Mã Lớp:"+x.getHocSinh().getMaLop()+" Điểm trung bình:"+x.getHocSinh().getDiemTb()+" Xếp loại:"+x.getHocSinh().getXepLoai());
                System.out.println("Mã khen thưởng:"+x.getMaKhenThuong()+" Thành tích:"+x.getThanhTich()+" Loại phần thưởng:"+x.getLoaiPhanThuong());
                System.out.println("---------------------------");

            }
        }
    }
    public void xuatdanhsachgvduockhenthuong(){
        for(KhenThuong x: list){
            if(x.getHocSinh()==null){
                System.out.println("Tên Giarng viên:"+x.getGiaoVien().getHoTen()+" Ngày Sinh:"+x.getGiaoVien().getNgaySinh()+" giới tính:"+x.getGiaoVien().getGioiTinh());
                System.out.println("Mã giảng viên:"+x.getGiaoVien().getMaGiangVien()+" Chuyên ngành:"+x.getGiaoVien().getChuyenNganh());
                System.out.println("Mã khen thưởng:"+x.getMaKhenThuong()+" Thành tích:"+x.getThanhTich()+" Loại phần thưởng:"+x.getLoaiPhanThuong());
                System.out.println("---------------------------");
            }
        }
    }

    public void sapxeptheomakhenthuong(){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getMaKhenThuong() < list.get(j + 1).getMaKhenThuong()) {
                    KhenThuong temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for(KhenThuong x: list){
            System.out.println(x.getMaKhenThuong());
        // cái này in tạm ra các mã khen thưởng thôi k cần in chi tiết ai cần khen thưởng nhé nếu thầy hỏi thì cứ trl như vậy

        }
    }

    public void ghifile(String ghikhenthuong) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ghikhenthuong))) {
            oos.writeObject(list);
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void docfile(String ghikhenthuong) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream( ghikhenthuong))) {
            list = (ArrayList<KhenThuong>) ois.readObject();
            System.out.println("Đọc được file");
            for (KhenThuong x : list) {
                if(x.getHocSinh()==null){
                    System.out.println("Tên Giarng viên:"+x.getGiaoVien().getHoTen()+" Ngày Sinh:"+x.getGiaoVien().getNgaySinh()+" giới tính:"+x.getGiaoVien().getGioiTinh());
                    System.out.println("Mã giảng viên:"+x.getGiaoVien().getMaGiangVien()+" Chuyên ngành:"+x.getGiaoVien().getChuyenNganh());
                    System.out.println("Mã khen thưởng:"+x.getMaKhenThuong()+" Thành tích:"+x.getThanhTich()+" Loại phần thưởng:"+x.getLoaiPhanThuong());
                }else {
                        System.out.println("Tên Học Sinh:"+x.getHocSinh().getHoTen()+" Ngày Sinh:"+x.getHocSinh().getNgaySinh()+" giới tính:"+x.getHocSinh().getGioiTinh());
                        System.out.println("Mã Lớp:"+x.getHocSinh().getMaLop()+" Điểm trung bình:"+x.getHocSinh().getDiemTb()+" Xếp loại:"+x.getHocSinh().getXepLoai());
                        System.out.println("Mã khen thưởng:"+x.getMaKhenThuong()+" Thành tích:"+x.getThanhTich()+" Loại phần thưởng:"+x.getLoaiPhanThuong());
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Đéo Được");
            e.printStackTrace();
        }
    }






}
