package Class;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            QuanLyKhenThuong qly = new QuanLyKhenThuong();
            Scanner sc = new Scanner(System.in);
            int luachon=0;
            do{
                  System.out.println("---------------------------------------");
                  System.out.println("Quản lý khen thưởng");
                  System.out.println("1 Thêm khen thưởng cho giáo viên\n" +
                          "2 Thêm khen thưởng cho học sinh\n" +
                          "3 Xuất danh sách học sinh được khen thưởng\n" +
                          "4 Xuất danh sách giáo viên được khen thưởng\n"+
                          "5 Sắp xếp theo mã khen thưởng\n" +
                          "6 Ghi file\n"+
                          "7 Đọc file\n"+
                          "---------------------------------------------");
                  luachon = sc.nextInt();
                  if(luachon==1){
                        KhenThuong gv = new KhenThuong();
                        qly.themkhenthuonggv(gv);
                  }else if(luachon==2){
                        KhenThuong gv = new KhenThuong();
                        qly.themkhenthuonghs(gv);
                  }else if(luachon==3){
                        qly.xuatdanhsachhsduockhenthuong();
                  }else if(luachon==4){
                        qly.xuatdanhsachgvduockhenthuong();
                  } else if(luachon==5) {
                        qly.sapxeptheomakhenthuong();
                  } else if (luachon==6) {
                        qly.ghifile("Quanly.dat");
                  } else if (luachon==7) {
                        qly.docfile("Quanly.dat");
                  }
            }while (luachon!=0);
      }
}