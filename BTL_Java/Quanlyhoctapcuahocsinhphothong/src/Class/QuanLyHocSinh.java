package Class;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuanLyHocSinh {
    ArrayList<HocSinh> list = new ArrayList<>();


    public void hscohoclucgioi(){
        for(HocSinh x : list){
            if(x.tinhdiemTB()>=8){
                System.out.println("Học Sinh Có Học Lực Giỏi Là");
                x.hienthithongtin();
            }
        }
    }
    public void themhocsinh(HocSinh hs){
        hs.nhaphocsinh();
        list.add(hs);
    }


    public void xuathocsinh(){
        for (int i = 1; i <= list.size(); i++) {
            System.out.println("Học Sinh "+i);
            list.get(i-1).hienthithongtin();
        }
    }

    public void xoahocsinhtheoma(String mahs){
        boolean ktra = false;
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng không thể tìm");
        }else {
            for(HocSinh hocsinh : list){
                if(hocsinh.getMaHS().equals(mahs)){
                    list.remove(hocsinh);
                    ktra = true;
                }
            }
        }
        if(ktra){
            System.out.println("Đã xóa học sinh");
        }else {
            System.out.println("Không tìm được học sinh có mã học sinh là:"+mahs);
        }
    }
    public void timkiemtheoten(String hoten){
        boolean ktra = true;
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng không thể tìm");
        }else {
            for(HocSinh hocsinh : list){
                if(hocsinh.getHoTen().equals(hoten)){
                    hocsinh.hienthithongtin();
                    ktra = false;
                }
            }
        }if(ktra){
            System.out.println("Không tìm thấy học sinh tên:"+hoten);
        }

    }
    public float tinhdiemtrungbinhtoantruong(){
        float dtbtoantruong =0;
        for(HocSinh hs : list){
            dtbtoantruong+= hs.tinhdiemTB();
        }

        return dtbtoantruong/list.size();
    }
    public void tinhdiemtrungbinhtunghs(){
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng không thể tìm");
        }else{
            for (HocSinh hs :list){
                System.out.println("Học Sinh :"+hs.getHoTen()+" Có điểm trung bình là:"+hs.tinhdiemTB()+"\n");
             }
        }
    }
    public void sapxeptheodiemtangdan() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).tinhdiemTB() > list.get(j + 1).tinhdiemTB()) {
                    HocSinh temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

    }

    public void ghifile(String hocsinhh) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(hocsinhh))) {
            oos.writeObject(list);
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void docfile(String hocsinhh) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(hocsinhh))) {
            list = (ArrayList<HocSinh>) ois.readObject();
            System.out.println("Đọc được file");
            for (HocSinh hs : list) {
                hs.hienthithongtin();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Đéo Được");
            e.printStackTrace();
        }
    }




    public void sapxeptheodiemgiamdan() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).tinhdiemTB() < list.get(j + 1).tinhdiemTB()) {
                    HocSinh temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}
