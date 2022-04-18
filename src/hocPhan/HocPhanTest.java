package hocPhan;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class HocPhanTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private HocPhan createTestSubject() {
		return new HocPhan();
	}

	@Test
	public void testCheckMaHP() throws Exception {
		HocPhan testSubject;
		String mahp = "";
		Boolean result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.checkMaHP(mahp);
	}

	@Test
	public void testThemHP() throws Exception {
		HocPhan testSubject;
		String MaHP = "";
		String TenHP = "";
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.themHP(MaHP, TenHP);
	}

	@Test
	public void testTimMaHP() throws Exception {
		HocPhan testSubject;
		String MaHP = "";
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.timMaHP(MaHP);
	}

	@Test
	public void testXoaHP() throws Exception {
		HocPhan testSubject;
		String MaHP1 = "";
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.xoaHP(MaHP1);
	}
}