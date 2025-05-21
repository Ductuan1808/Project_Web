package Class;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi implements Serializable {
    private String maHS;
    private String lop;
    private ArrayList<BangDiem> dsBangDiem = new ArrayList<>();

    public HocSinh(String hoTen, String ngaySinh, String gioiTinh, String maHS, String lop, ArrayList<BangDiem> dsBangDiem ) {
        super(hoTen, ngaySinh, gioiTinh);
        this.maHS = maHS;
        this.lop = lop;
        this.dsBangDiem = dsBangDiem;
    }

    public HocSinh() {
    }

    public float tinhdiemTB(){
        float diemtb=0;
        if(dsBangDiem==null&&dsBangDiem.isEmpty()){
            System.out.println("Học Sinh K Có Điểm");
        }else{
            for(BangDiem x : dsBangDiem){
                diemtb +=x.tinhDiemTrungBinh();
            }
        }
        return diemtb/dsBangDiem.size();
    }


    public void nhaphocsinh(){
        Scanner sc = new Scanner(System.in);
        super.nhapnguoi();
        System.out.println("Nhập mã học sinh");
        maHS=sc.nextLine();
        System.out.println("Nhập lớp");
        lop=sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập bảng điểm");
        System.out.println("Nhập số lượng môn học");
        int soluong = sc.nextInt();
        for (int i = 0; i < soluong; i++) {
            BangDiem bangdiem = new BangDiem();
            bangdiem.nhapbangdiem();
            dsBangDiem.add(bangdiem);
        }

    }

    @Override
    public void hienthithongtin() {
        String tt = xuatnguoi();
        tt +=",Mã học sinh:"+ maHS+",Lớp:"+lop+" \n";
        System.out.println(tt);
        for (int i = 0; i < dsBangDiem.size(); i++) {
            System.out.println("Tên Môn:"+dsBangDiem.get(i).getMonhoc().getTenMon());
            System.out.println("Điểm 15 phút:"+dsBangDiem.get(i).getDiem15Phut());
            System.out.println("Điểm 1 tiết:"+dsBangDiem.get(i).getDiem1Tiet());
            System.out.println("Điểm Cuối Kỳ:"+dsBangDiem.get(i).getDiemCuoiKy());
            System.out.println("----------------------");
        }
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public ArrayList<BangDiem> getDsBangDiem() {
        return dsBangDiem;
    }

    public void setDsBangDiem(ArrayList<BangDiem> dsBangDiem) {
        this.dsBangDiem = dsBangDiem;
    }

}
