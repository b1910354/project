package hocPhan;

import java.util.Scanner;

public class HocPhan {
	private String MaHP[];
	private String TenHP[]; //Bổ sung thêm
	private int sl; //Bổ sung thêm
	
	public HocPhan() {
		MaHP = new String[100];
		TenHP = new String[100];
		sl = 10;
		//Khởi tạo 1 số học phần
		int i;
		String chuoi = new String();
		//Khởi tạo một số học phần
		MaHP[0] = new String("CT101");
		TenHP[0] = new String("Lập trình căn bản A");
		
		MaHP[1] = new String("CT176");
		TenHP[1] = new String("Lập trình hướng đối tượng");
		
		MaHP[2] = new String("CT300");
		TenHP[2] = new String("Phát triển phần mềm");
		
		MaHP[3] = new String("CT112");
		TenHP[3] = new String("Mạng máy tính");
		
		MaHP[4] = new String("CT175");
		TenHP[4] = new String("Lý thuyết đồ thị");
		
		MaHP[5] = new String("CT172");
		TenHP[5] = new String("Toán rời rạc");
		
		MaHP[6] = new String("CT180");
		TenHP[6] = new String("Cơ sở dữ liệu");
		
		MaHP[7] = new String("CT190");
		TenHP[7] = new String("Nhập môn AI");
		
		MaHP[8] = new String("CT294");
		TenHP[8] = new String("Máy học ứng dụng");
		
		MaHP[9] = new String("CT178");
		TenHP[9] = new String("Nguyên lý hệ điều hành");
	}
	
	/*
	 * Tìm học phần
	 */
	//Tìm mã học phần có tồn tại hay không, nếu có trả về vị trí - 1, ngược lại trả về số lượng
	public int timMaHP(String MaHP) {
		int i;
		for (i = 0; i < sl; i++) {
			if (this.MaHP[i].equals(MaHP)) 
				return i;
		}
		return sl;
	}
	
	//Tìm tên học phần bằng mã học phần
	public void timHP(String MaHP1) {
		if (timMaHP(MaHP1) == sl) {
			System.out.println("Mã học phần không tồn tại");
			return;
		}
		else {
		System.out.println(MaHP1 + "- "+TenHP[timMaHP(MaHP1)]);
			return;
		}
	}
		
	public void timMaHP() {
		System.out.print("\nNhập mã học phần cần tỉm: ");
		Scanner sc = new Scanner(System.in);
		timHP(sc.nextLine());
	}
	/*
	 * Thêm học phần
	 */
	
	public int themHP(String MaHP, String TenHP) {
		if (timMaHP(MaHP) != sl) {
			this.MaHP[sl] = new String(MaHP);
			this.TenHP[sl] = new String(TenHP);
			sl++;
			return 1;
		}
		return -1;
	}
	
	public void themHP() {
		
		String MaHP_them = new String();
		String TenHP_them = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã học phần cần thêm"); 
		MaHP_them = sc.nextLine();
		
		if (timMaHP(MaHP_them) < sl) {
			System.out.println("Học phần đã tồn tại");
			return;
		}
		else {
			System.out.println("Nhập tên học phần: ");
			TenHP_them = sc.nextLine();
			themHP(MaHP_them, TenHP_them);
			System.out.println("Thêm học phần thành công\n");
			return;
		}
	}
	
	/*
	 * Sửa học phần
	 */	
	public void suaMaHP() {
		String MaHP_cu = new String();
		String MaHP_moi = new String();
		String TenHP_moi = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập mã học phần cần sửa!");
		MaHP_cu = sc.nextLine();
		
		int i = timMaHP(MaHP_cu);
		if (i == sl) {
			System.out.println("Học phần không tồn tại!");
			return;
		}
		else {
			MaHP[i] = MaHP_moi;
		}
		return;
	}
	
	/*
	 * Xóa học phần
	 */
	public int xoaHP(String MaHP1) {
		int i = timMaHP(MaHP1);
		if (i==sl) {
			System.out.println("Mã học phần "+MaHP1+" không tồn tại!");
			return -1;
		}
		else {
			MaHP[i] = MaHP[sl-1];
			TenHP[i] = TenHP[sl-1];
			sl--;
			return 1;
		}
	}
	
	public void xoaHP() {
		Scanner sc = new Scanner(System.in);
		String MaHP1 = new String();
		System.out.println("Nhập mã học phần cần xóa: ");
		MaHP1 = sc.nextLine();
		xoaHP(MaHP1);
	}
	
	/*
	 * In học phần và danh sách học phần
	 */
	
	public void inHP(int i) {
		System.out.printf("%-6s%-30s%-3s\n", "|"+MaHP[i]+"|", TenHP[i], "|");
		//System.out.println("|"+MaHP[i]+"\t|"+TenHP[i]+"|");
	}
	
	public void inDanhSachHP() {
		int i;
		System.out.println("--------- Danh sách học phần ---------");
		for (i = 0; i < sl; i++)
			inHP(i);
	}
	
//	kiểm tra học phần có tồn tại hay chưa
	public Boolean checkMaHP(String mahp) {
		int i;
		for (i = 0; i < sl; i++) {
			if (this.MaHP[i].equals(mahp)) 
				return true;
		}
		return false;
	}
	
//	Lấy tên học phần dựa trên mã học phần
	
	public String getTenHp(String mahp) {
		String tenhp = "";
		if (timMaHP(mahp) == sl) {
			System.out.println("Mã học phần không tồn tại");
		}
		else {
		}
		for(int i=0; i<sl ; i++) {
			if(this.MaHP[i].equals(mahp)) {
				tenhp = this.TenHP[i];
			}
		}
		return tenhp;
	}
}
