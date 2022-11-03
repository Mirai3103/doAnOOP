package Model;

import helper.Helper;

import java.io.Serial;
import java.util.ArrayList;

import helper.Helper;
import helper.Xuat.ITableRowData;

import java.util.ArrayList;

public abstract class NhanVien extends ConNguoi implements ITableRowData {
	@Serial
	private static final long serialVersionUID = 221223213L;
	protected String MaNV, ChucVu, MK;
	private int Luong;



	public NhanVien(String hoTen, String ngaySinh, String sDT, String cMND, DiaChi dC,String maNV, String chucVu, String mK, int luong) {
		super(hoTen,ngaySinh,sDT,cMND,dC);
		MaNV = maNV;
		ChucVu = chucVu;
		MK = mK;
		Luong = luong;
	}

	public NhanVien() {
		super();
		MaNV = "";
		ChucVu = "";
		MK = "";
		Luong = 0;
	}

	public String getMaNV() {
		return MaNV;
	}


	public String getChucVu() {
		return ChucVu;
	}
	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	public String getMK() {
		return MK;
	}
	public void setMK(String mK) {
		MK = mK;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập chức vụ: ");
		ChucVu = Helper.scanner.nextLine();
		System.out.println("Nhập mật khẩu: ");
		MK = Helper.scanner.nextLine();
		System.out.println("Nhập mức lương");
		Luong = Helper.nhapSoNguyen("phải là số nguyên!! yêu cầu nhập lại : ");
	}
	public void Nhap(String maNV) {
		MaNV = maNV;
		this.Nhap();

	}

	public void Xuat() {
		super.Xuat();
		System.out.printf("MÃ£ nhÃ¢n viÃªn: " + MaNV);
		System.out.printf("Chá»©c vá»¥: " + ChucVu);
		System.out.printf("Máº­t kháº©u: " + MK);
		System.out.printf("LÆ°Æ¡ng" + Luong);
	}

	@Override
	public String[] getRowData() {
		return new String[] {
				MaNV,
				getHoTen(),
				getNgaySinh(),
				getSDT(),
				getCMND(),
				getDC().toString(),
				ChucVu,
				MK,
				String.valueOf(Luong)
		};
	}

	@Override
	public String[] getHeader() {
		return new String[] {"Mã nhân viên", "Họ tên", "Ngày sinh", "Số điện thoại", "CMND", "Địa chỉ", "Chức vụ", "Mật khẩu", "Lương"};
	}
}
