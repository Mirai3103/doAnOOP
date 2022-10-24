package Model;


import helper.Helper;

import java.util.*;

public class NhaXuatBan {
    private static int idIncrement = 0;
    private final int id;
    private String tenNXB;
    private DiaChi diaChi;
    private String email;
    private ConNguoi nguoiDaiDien;
    public NhaXuatBan() {
        this.id = NhaXuatBan.idIncrement++;
    }
    public NhaXuatBan( String tenNXB, DiaChi diaChi, String email, ConNguoi nguoiDaiDien) {
        this.id = NhaXuatBan.idIncrement++;
        this.tenNXB = tenNXB;
        this.diaChi = diaChi;
        this.email = email;
        this.nguoiDaiDien = nguoiDaiDien;
    }
    public NhaXuatBan(int id, String tenNXB, DiaChi diaChi, String email, ConNguoi nguoiDaiDien) {
        this.id = id;
        this.tenNXB = tenNXB;
        this.diaChi = diaChi;
        this.email = email;
        this.nguoiDaiDien = nguoiDaiDien;
    }

    public int getId() {
        return id;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ConNguoi getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(ConNguoi nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }

    public List<Sach> getSachDaXuatBan() {
        return Helper.khoDuLieu.getKhoSach().getAll().stream().filter(s->s.getNhaXuatBanId()==this.id).toList();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nha xuat ban: ");
        this.tenNXB = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.diaChi = new DiaChi();
        this.diaChi.Nhap();
        System.out.println("Nhap email: ");
        this.email = sc.nextLine();
        System.out.println("Nhap nguoi dai dien: ");
        this.nguoiDaiDien = new ConNguoi();
        this.nguoiDaiDien.Nhap();
    }

}
