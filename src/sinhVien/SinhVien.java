package sinhVien;

import java.util.Scanner;

import hocPhan.HocPhan;
import dangKyHP.DangKyHP;
public class SinhVien {
	// Access Modifier
	private String masv[], hten[];
	private HocPhan hp;
	private DangKyHP hpdk;
	private int sl;
	
	// Constructor
	public SinhVien() {
		sl = 3;
		masv = new String[100];
		hten = new String[100];
		hp = new HocPhan();
		hpdk = new DangKyHP();
		// Khởi tạo 1 số sinh viên

		masv[0] = new String("B1910295");
		hten[0] = new String("Ngô Trần Vĩnh Thái");

		masv[1] = new String("B1910322");
		hten[1] = new String("Đặng Thành Trung");

		masv[2] = new String("B1910354");
		hten[2] = new String("Trần Tuấn Duy");
		
		
	}

	// Cac phuong thuc khac
	public int getSL() {
		return sl;
	}

	// Thêm sinh viên mới;
	public void themSV() {
		if (sl < 100) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập mã số sinh viên: ");
			String mssv = sc.nextLine();

			System.out.println("Nhập tên sinh viên: ");
			String tensv = sc.nextLine();

			masv[sl] = mssv;
			hten[sl] = tensv;

			System.out.print("Thêm sinh viên thành công: ");
			this.in(sl);

			sl++;
		} else {
			System.out.println("Số lượng sinh viên vượt mứt cho phép!");
		}
	}

	// Hiển thị danh sách sinh viên;
	public void dsSinhVien() {
		System.out.print("|----------------------------------------|\n");
		System.out.format("|   %4s   |          %9s          |\n", "MSSV", "Họ và tên");
		System.out.print("|----------------------------------------|\n");
		for (int i = 0; i < sl; i++) {
			System.out.format("| %-8s | %-28s|\n", masv[i], hten[i]);
		}
		System.out.println("|----------------------------------------|\n");
	}

	// Hiển thị sinh viên thứ i;
	public void in(int i) {
		System.out.print("[" + masv[i] + "," + hten[i] + "]\n");
	}

	int loc = 100;

	public int vitriSV(String mssv) {
		for (int i = 0; i < sl; i++) {
			if (masv[i].equals(mssv)) {
				loc = i;
				break;
			}
		}
		return loc;
	}

	// Sửa thông tin sinh viên;
	public void suaSinhVien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số sinh viên cần sưả: ");
		String mssv = sc.nextLine();

		if (this.vitriSV(mssv) != 100) {
			int iloc = this.vitriSV(mssv);

			System.out.println("Nhập mã số sinh viên mới: ");
			String n_masv = sc.nextLine();

			System.out.println("Nhập tên mới: ");
			String n_ten = sc.nextLine();

			masv[iloc] = n_masv;
			hten[iloc] = n_ten;

			System.out.print("Sửa sinh viên thành công: ");
			this.in(iloc);
		} else {
			System.out.println("Không tìm thấy sinh viên với mã số trên!");
		}
	}

	// Xóa sinh viên;
	public void xoaSinhVien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã số sinh viên cần xóa: ");
		String d_mssv = sc.nextLine();

		if (this.vitriSV(d_mssv) != 100) {
			int iloc = this.vitriSV(d_mssv);
			System.out.println("Bạn có chắc muốn xóa sinh viên này?");
			System.out.println("Gõ \"yes\" để xác nhận!");
			this.in(iloc);

			String ver = sc.nextLine();
			if (ver.equals("yes")) {
				for (int i = 0; i < sl; i++) {
					masv[i] = masv[i + 1];
					hten[i] = hten[i + 1];
				}
				sl--;
				System.out.println("Xóa sinh viên thành công!");
			} else {
				System.out.println("Yêu cầu xóa sinh viên đã được hủy bỏ!");
			}
		} else {
			System.out.println("Không tìm thấy sinh viên với mã số trên!");
		}
	}

	public String toString() {
		return "0";
	}
	
	//	Tìm học phần
	public String timKiem() {
		hp.timMaHP();
		return "Yes";
	}

	// Đăng ký học phần
	public void dKy() {
		System.out.print("\nNhập mã học phần đăng ký học phần: ");
		Scanner sc = new Scanner(System.in);
//		hpdk.themhpdk(sc.nextLine());
		System.out.println(hpdk.themHPDK_String(sc.nextLine()));
//		System.out.println(hpdk.themHPDK_String("CT101"));
	}

	// Xóa học phần đã đăng ký
	public void xoa() {
		System.out.print("\nNhập mã học phần cần xoá học phần đăng ký: ");
		Scanner sc = new Scanner(System.in);
//		hpdk.xoahpdk(sc.nextLine());
		System.out.println(hpdk.xoaHPDK_String(sc.nextLine()));
	}
	//	In danh sách học phần sinh viên đã đăng ký
	public void inDSHPDK() {
		hpdk.inDSHPDK();
	}
//	    Lấy tên sinh viên
	public String layTen(int i) {
		String h = hten[i].trim();
		return h.substring(h.lastIndexOf("")+1);
	}
}