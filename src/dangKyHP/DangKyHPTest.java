package dangKyHP;
//import hocPhan.HocPhan;
import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class DangKyHPTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testCheckHP() throws Exception {
		DangKyHP testSubject = new DangKyHP();
		String mahp = "CT101";
		Boolean result, result1;
		result = testSubject.checkHP(mahp);
		Assert.assertEquals(true, result);
		String mahp1 = "CT175";
		result1 = testSubject.checkHP(mahp1);
		Assert.assertEquals(false, result1);
	}
	
	@Test
	public void testViTriHP() throws Exception {
		DangKyHP testSubject = new DangKyHP();
		String mahp = "CT101";
		int result;
		result = testSubject.viTriHP(mahp);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testCheckHPDK() throws Exception {
		DangKyHP testSubject = new DangKyHP();
		String mahp = "CT101";
		Boolean result;
		result = testSubject.checkHPDK(mahp);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testThemHPDK() throws Exception {
		DangKyHP testSubject = new DangKyHP();
		String mahp = "CT101", mahp1;
		String result, result1;
		result = testSubject.themHPDK_String(mahp);
		String success = "Học phần đã được thêm";
		String fail = "Học phần không tồn tại";
		Assert.assertEquals(success, result);
		mahp1 = "CT1000";
		result1 = testSubject.themHPDK_String(mahp1);
		Assert.assertEquals(fail, result1);
	}
	
	@Test
	public void testXoaHPDK() throws Exception {
		DangKyHP testSubject = new DangKyHP();
		String mahp = "CT1000", mahp1;
		String result, result1;
		result = testSubject.xoaHPDK_String(mahp);
		String success = "Xoá học phần đã đăng ký thành công";
		String fail = "Học phần chưa được đăng ký học phần";
		Assert.assertEquals(fail, result);
		mahp1 = "CT101";
		result1 = testSubject.xoaHPDK_String(mahp1);
		Assert.assertEquals(success, result1);
	}
	
}