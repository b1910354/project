package quanTri;
import hocPhan.HocPhan;
import sinhVien.SinhVien;

public class QuanTri {
	private String MaCB;
	
	public QuanTri() {
		MaCB = "001";
	}
	/*
	 * Chức năng quản lý sinh viên
	 */
	SinhVien sv = new SinhVien();
	HocPhan hp = new HocPhan();
	
	//Thêm sinh viên mới
	public void themSV() {
		  sv.themSV();
		  sv.dsSinhVien();
	  }
	
	//Sửa sinh viên
	//Sửa sinh viên
	  public void suaSV() {
		  sv.suaSinhVien();
		  sv.dsSinhVien();
	  }
	
	//Xóa sinh viên
	  public void xoaSV() {
		  sv.xoaSinhVien();
		  sv.dsSinhVien();
	  }
	
	/*
	 * Chức năng quản lý học phần
	 */
	//Thêm học phần
	public void themHP() {
		hp.themHP();
	}
	
	//Sửa học phần
	public void suaHP() {
		hp.suaMaHP();
	}
	
	//Xóa học phần
	public void xoaHP() {
		hp.xoaHP();
	}
	
	//Tìm học phần
	public void timMaHP() {
		hp.timMaHP();
	}
	
	
	
	public void hienThiDanhSachSV() {
	    sv.dsSinhVien();
	  }
	
	public void hienThiDanhSachHP() {
		hp.inDanhSachHP();
	}
	
}
