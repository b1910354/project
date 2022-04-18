package dangKyHP;
import hocPhan.HocPhan;
public class DangKyHP {
	private String MaHP[];
	private String TenHP[];
	private HocPhan hp;
	private int sl;
	
	public DangKyHP() {
		MaHP = new String[100];
		TenHP = new String[100];
		hp = new HocPhan();
		sl = 1;
		
		MaHP[0] = new String("CT101");
		TenHP[0] = new String("Lập trình căn bản A");
		
	}
//	Kiểm tra mã học phần có tồn tại trong danh sách học phần hay không
	public Boolean checkHPDK(String mahp) {
		if(hp.checkMaHP(mahp)) {
			return true;
		}
		else {
			return false;
		}
	}
//	Thêm học phần (không có giá trị trả về)
	public void themHPDK(String mahp) {
		if(checkHPDK(mahp)) {
			MaHP[sl] = new String (mahp);
			TenHP[sl] = new String(hp.getTenHp(mahp));
			sl++;
			
			System.out.println("Học phần đã được thêm");
		}
		else {
			System.out.println("Học phần không tồn tại");
		}
	}
	
//	Thêm học phần (có giá trị trả về String)
	public String themHPDK_String(String mahp) {
		String result = "";
		if(checkHPDK(mahp)) {
			MaHP[sl] = new String (mahp);
			TenHP[sl] = new String(hp.getTenHp(mahp));
			sl++;
			result="Học phần đã được thêm";
		}
		else {
			result="Học phần không tồn tại";
		}
		return result;
	}
	
//	Kiểm tra học phần cần xoá đã được đăng ký chưa
	public Boolean checkHP(String mahp) {
		for(int i=0;i<sl;i++) {
			if(MaHP[i].equals(mahp)) {
				return true;
			}
		}
		return false;
	}
	
//  Hàm trả về vị trí của một học phần
	public int viTriHP(String mahp) {
		int vitri=0;
		for(int i=0;i<sl;i++) {
			if(MaHP[i].equals(mahp)) {
				vitri = i;
				break;
			}
		}
		return vitri;
	}
	
//	Xoá học phần không có giá trị trả về
	public void xoaHPDK(String mahp) {
		int check = 0;
		if(checkHP(mahp)) {
			int i = viTriHP(mahp);
			for(int j=i;j<sl;j++) {
				MaHP[j] = MaHP[j+1];
				TenHP[j] =TenHP[j+1];
			}
			sl--;
			System.out.println("Xoá học phần đã đăng ký thành công");
			check = 1;
		}
		if(check == 0) {
			System.out.println("Học phần chưa được đăng ký học phần");
		}
	}
//	public void xoaHPDK(String mahp) {
//		int check = 0;
//		for(int i=0;i<sl;i++) {
//			if(MaHP[i].equals(mahp)) {
//				for(int j=i;j<sl;j++) {
//					MaHP[j] = MaHP[j+1];
//					TenHP[j] =TenHP[j+1];
//				}
//				sl--;
//				System.out.println("Xoá học phần đã đăng ký thành công");
//				break;
//			}
//			else {
//				check++;
//			}
//		}
//		if(check == sl) {
//			System.out.println("Học phần chưa được đăng ký học phần");
//		}
//	}
	
//	Xoá học phần có giá trị trả về String
//	public String xoaHPDK_String(String mahp) {
//		String result = "";
//		int check = 0;
//		for(int i=0;i<sl;i++) {
//			if(MaHP[i].equals(mahp)) {
//				for(int j=i;j<sl;j++) {
//					MaHP[j] = MaHP[j+1];
//					TenHP[j] =TenHP[j+1];
//				}
//				sl--;
//				result = "Xoá học phần đã đăng ký thành công";
//				check = 1;
//				break;
//			}
//		}
//		if(check == 0) {
//			result = "Học phần chưa được đăng ký học phần";
//		}
//		return result;
//	}
	
	public String xoaHPDK_String(String mahp) {
		int check = 0;
		String result = "";
		if(checkHP(mahp)) {
			int i = viTriHP(mahp);
			for(int j=i;j<sl;j++) {
				MaHP[j] = MaHP[j+1];
				TenHP[j] =TenHP[j+1];
			}
			sl--;
			result = "Xoá học phần đã đăng ký thành công";
			check = 1;
		}
		if(check == 0) {
			result = "Học phần chưa được đăng ký học phần";
		}
		return result;
	}
	
//	In học phần thứ i trong danh sách đăng ký học phần
	public void inHPDK(int i) {
		System.out.printf("%-6s%-30s%-3s\n", "|"+MaHP[i]+"|", TenHP[i], "|");
	}
	
//	In danh sách tất cả học phần đã được đăng ký học phần
	public void inDSHPDK() {
		int i;
		System.out.println("--------- Danh sách học phần đã đăng ký---------");
		for (i = 0; i < sl; i++)
			inHPDK(i);
	}
	
}
