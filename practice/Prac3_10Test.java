package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Prac3_10Test {

	private  final Prac3_10 ex = new Prac3_10();

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	public void checkDigit1に2と4を渡す(){
		String expected = "xはyより小さく、かつ、xとyは共に偶数である。";
		String actual = ex.checkDigit1(2, 4);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit1に2と5を渡す(){
		String expected = "";
		String actual = ex.checkDigit1(2, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit2にー2とー2を渡す(){
		String expected = "xとyは等しく、かつ、負の数である";
		String actual = ex.checkDigit2(-2, -2);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit2にー2とー3を渡す(){
		String expected = "";
		String actual = ex.checkDigit2(-2, -3);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit3に3と5を渡す(){
		String expected = "xはyより小さい、または、xは偶数である。";
		String actual = ex.checkDigit3(3, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit3に6と5を渡す(){
		String expected = "xはyより小さい、または、xは偶数である。";
		String actual = ex.checkDigit3(6, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit3に7と5を渡す(){
		String expected = "";
		String actual = ex.checkDigit3(7, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void checkDigit4に10と10を渡す(){
		String expected = "xは10以下または100以上で、かつ、yは10以上かつ100以下である。";
		String actual = ex.checkDigit4(10, 10);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit4に100と100を渡す(){
		String expected = "xは10以下または100以上で、かつ、yは10以上かつ100以下である。";
		String actual = ex.checkDigit4(100, 100);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit4に11と100を渡す(){
		String expected = "";
		String actual = ex.checkDigit4(11, 100);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit4に10と101を渡す(){
		String expected = "";
		String actual = ex.checkDigit4(10, 101);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit4に99と10を渡す(){
		String expected = "";
		String actual = ex.checkDigit4(99, 10);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit4に100と9を渡す(){
		String expected = "";
		String actual = ex.checkDigit4(100, 9);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit5に1と1を渡す(){
		String expected = "xもyも負の数である、ではない。";
		String actual = ex.checkDigit5(1, 1);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit5に1とー1を渡す(){
		String expected = "xもyも負の数である、ではない。";
		String actual = ex.checkDigit5(1, -1);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit5にー1と1を渡す(){
		String expected = "xもyも負の数である、ではない。";
		String actual = ex.checkDigit5(-1, 1);
		assertEquals(expected, actual);
	}
	@Test
	public void checkDigit5にー1とー1を渡す(){
		String expected = "";
		String actual = ex.checkDigit5(-1, 1);
		assertEquals(expected, actual);
	}

}
