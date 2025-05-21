package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh qly = new QuanLyHocSinh();
        Scanner sc = new Scanner(System.in);
        int luachon;
        do{
            System.out.println("---------------------------------------");
            System.out.println("Quản lý học tập của học sinh phổ thông");
            System.out.println("1 Thêm Học Sinh\n" +
                    "2 Xuất học sinh\n" +
                    "3 Xóa Học Sinh Theo Mã Học Sinh\n" +
                    "4 Tìm Kiếm Theo Tên\n" +
                    "5 Tính điểm trung bình của từng học sinh\n"+
                    "6 Tính Điểm Trung Bình Toàn Trường\n" +
                    "7 In ra học sinh có học lực giỏi\n"+
                    "8 Sắp xếp danh sách học sinh tăng dần theo điểm trung bình\n"+
                    "9 Ghi File\n" +
                    "10 Đọc File\n"+
                    "---------------------------------------------");
            luachon = sc.nextInt();
            if(luachon==1){
                HocSinh hs = new HocSinh();
                qly.themhocsinh(hs);
            }else if(luachon==2){
                qly.xuathocsinh();
            }else if(luachon==3){
                Scanner se = new Scanner(System.in);
                System.out.println("Nhập mã học sinh cần xóa");
                String ma =se.nextLine();
                qly.xoahocsinhtheoma(ma);
            }else if(luachon==4){
                Scanner sd = new Scanner(System.in);
                System.out.println("Nhập tên học sinh cần tìm");
                String ten =sd.nextLine();
                qly.timkiemtheoten(ten);
             } else if(luachon==6) {
                float diemtbtruong=qly.tinhdiemtrungbinhtoantruong();
                System.out.println("Điểm trung bình toàn trường là: "+diemtbtruong);
            } else if (luachon==5) {
                qly.tinhdiemtrungbinhtunghs();
            } else if (luachon==8) {
                qly.sapxeptheodiemtangdan();

            }else if (luachon==7) {
                qly.hscohoclucgioi();

            }else if (luachon==9) {
                qly.ghifile("danhsachhocsinh.dat");

            }else if (luachon==10) {
                qly.docfile("danhsachhocsinh.dat");

            }
        }while (luachon!=0);


    }
}