package main;

import java.util.Scanner;

//import hocPhan.HocPhan;
import quanTri.QuanTri;
import sinhVien.SinhVien;
public class Main {

	public static void main(String[] args) {
		/*
		 * Chọn vai trò người dùng
		 * Quản trị: 1
		 * Sinh Viên: 2
		 */
		System.out.println("Quản trị: 1");
		System.out.println("Sinh viên: 2");
		System.out.println("Chọn vai trò: ");
		int quyen;
		Scanner sc = new Scanner(System.in);
		quyen = sc.nextInt();
		
		
		QuanTri qt = new QuanTri();
		SinhVien sv = new SinhVien();
		
		/*
		 * Chức năng quản trị
		 */
		if (quyen == 1) {
			
			int chucnang;
			do {	
				System.out.println("\nDanh sách chức năng quản trị:");
				
				System.out.println("1. Thêm sinh viên");
				System.out.println("2. Sửa sinh viên");
				System.out.println("3. Xóa sinh viên");
				
				System.out.println("4. Thêm HP");
				System.out.println("5. Sửa HP");
				System.out.println("6. Xóa HP");
				System.out.println("9. Tìm mã học phần");
				
				System.out.println("7. Hiển thị danh sách sinh viên");
				System.out.println("8. Hiển thị danh sách học phần");
//				System.out.println("Vui lòng chọn chức năng: ");
				System.out.print("Chọn chức năng: ");
				chucnang = sc.nextInt();
				if (chucnang==1) {
					qt.themSV();
//					qt.hienThiDanhSachSV();
				}
				if (chucnang==2) {
					qt.suaSV();
				}
				if (chucnang==3) {
					qt.xoaSV();
				}
				if (chucnang == 4) {
					qt.themHP();
				}
				if (chucnang == 5) {
					qt.suaHP();
				}
				if (chucnang == 6) {
					qt.xoaHP();
				}
				if (chucnang == 7) {
					qt.hienThiDanhSachSV();
				}
				if (chucnang == 8) {
					qt.hienThiDanhSachHP();
				}
				if (chucnang == 9)  {
					qt.timMaHP();
				}
				
			} while(true);
		}
		
		/*
		 * Chức năng sinh viên
		 */
		if (quyen == 2) {
			do {
				System.out.println("----------------------------------");
				System.out.println("\nDanh sách chức năng quản trị:");
				System.out.println("\nVui lòng chọn chức năng");
				System.out.println("\n1. Tìm kiếm HP");
				System.out.println("\n2. Thêm HP");
				System.out.println("\n3. Xoá học phần đã thêm");
				System.out.println("\n4. Danh sách học phần đăng ký");
				System.out.print("\nChọn chức năng: ");
				int chucnang = sc.nextInt();
				if (chucnang==1) {
					sv.timKiem();
					
				}
				if (chucnang==2) {
					sv.dKy();
				}
				if (chucnang==3) {
					sv.xoa();
				}
				if (chucnang==4) {
					sv.inDSHPDK();
				}
			}while(true);
		}
	}

}

