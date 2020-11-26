package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KimatsuTest {

    private final Kimatsu ex = new Kimatsu();

	@Test
	@DisplayName("mon01_1")
	public void mon01_1(){
		String expected = "その値は正です";
		String actual = ex.mon01(1);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon01_2")
	public void mon01_2(){
		String expected = "その値は０か負です";
		String actual = ex.mon01(0);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("mon02_1")
	public void mon02_1(){
		String expected = "不可";
		String actual = ex.mon02(0);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_2")
	public void mon02_2(){
		String expected = "不可";
		String actual = ex.mon02(59);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_3")
	public void mon02_3(){
		String expected = "可";
		String actual = ex.mon02(60);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_4")
	public void mon02_4(){
		String expected = "可";
		String actual = ex.mon02(69);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_5")
	public void mon02_5(){
		String expected = "良";
		String actual = ex.mon02(70);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_6")
	public void mon02_6(){
		String expected = "良";
		String actual = ex.mon02(79);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_7")
	public void mon02_7(){
		String expected = "優";
		String actual = ex.mon02(80);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon02_8")
	public void mon02_8(){
		String expected = "優";
		String actual = ex.mon02(100);
		assertEquals(expected, actual);
	}
	@Test@DisplayName("mon03_1")
	public void mon03_1(){
		int expected = 2;
		int actual = ex.mon03(1, 2, 3);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon03_2")
	public void mon03_2(){
		int expected = 0;
		int actual = ex.mon03(0, 0, -1);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon03_3")
	public void mon03_3(){
		int expected = -2;
		int actual = ex.mon03(-1, -2, -3);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon03_4")
	public void mon03_4(){
		int expected = 0;
		int actual = ex.mon03(0, 0, 0);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon03_5")
	public void mon03_5(){
		int expected = -1;
		int actual = ex.mon03(-1, -2, 0);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon04_1")
	public void mon04_1(){
		int[] expected = {-3, -2, -1, 0, 1, 2, 3};
		int[] test = {3, 2, 1, 0, -1, -2, -3};
		int[] actual = ex.mon04(test);
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("mon04_2")
	public void mon04_2(){
		int[] expected = {-6, -5, -4, -3, -2, -1, 0};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex.mon04(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	@DisplayName("mon04_3")
	public void mon04_3(){
		int[] expected = {0, 1, 2, 3, 4, 5, 6};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex.mon04(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	@DisplayName("mon04_4")
	public void mon04_4(){
		int[] expected = {-6, -6, -3, -3, -1, -1, 0};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex.mon04(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	@DisplayName("mon04_5")
	public void mon04_5(){
		int[] expected = {0, 2, 2, 4, 4, 5, 5};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex.mon04(test);
		assertArrayEquals(expected, actual);
	}

	@Test
	@DisplayName("mon05_1")
	public void mon05_1(){
		int expected = 4;
		int test = 1254;
		int actual = ex.mon05(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon05_2")
	public void mon05_2(){
		int expected = 6;
		int test = 111111;
		int actual = ex.mon05(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon05_3")
	public void mon05_3(){
		int expected = 1;
		int test = 4;
		int actual = ex.mon05(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon05_4")
	public void mon05_4(){
		int expected = 2;
		int test = 33;
		int actual = ex.mon05(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon05_5")
	public void mon05_5(){
		int expected = 10;
		int test = 1234567890;
		int actual = ex.mon05(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon06_1")
	public void mon06_1(){
		boolean expected = false;
		int test = 1;
		boolean actual = ex.mon06(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon06_2")
	public void mon06_2(){
		boolean expected = true;
		int test = 2;
		boolean actual = ex.mon06(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon06_3")
	public void mon06_3(){
		boolean expected = true;
		int test = 9999973;
		boolean actual = ex.mon06(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon06_4")
	public void mon06_4(){
		boolean expected = true;
		int test = 9999991;
		boolean actual = ex.mon06(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon06_5")
	public void mon06_5(){
		boolean expected = false;
		int test = 9999999;
		boolean actual = ex.mon06(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon07_1")
	public void mon07_1(){
		int expected = 6000;
		int [] test = {1000, 2000, 3000};
		int actual = ex.mon07(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon07_2")
	public void mon07_2(){
		int expected = 55;
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int actual = ex.mon07(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon07_3")
	public void mon07_3(){
		int expected = 0;
		int [] test = {-3, -2, -1, 0, 1, 2, 3};
		int actual = ex.mon07(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon07_4")
	public void mon07_4(){
		int expected = 1;
		int [] test = {1};
		int actual = ex.mon07(test);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon07_5")
	public void mon07_5(){
		int expected = -55;
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int actual = ex.mon07(test);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("mon08_1")
	public void mon08_1(){
		double expected = (2+3+5)/3.0;
		int [] test = {2, 3, 5};
		double actual = ex.mon08(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	@DisplayName("mon08_2")
	public void mon08_2(){
		double expected = (1001+2002+3007)/3.0;
		int [] test = {1001, 2002, 3007};
		double actual = ex.mon08(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	@DisplayName("mon08_3")
	public void mon08_3(){
		double expected = (1+2+3+4+5+6+7+8+9+10)/10.0;
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8,  9, 10};
		double actual = ex.mon08(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	@DisplayName("mon08_4")
	public void emon08_4(){
		double expected = (0+1+-2)/3.0;
		int [] test = {0, 1, -2};
		double actual = ex.mon08(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	@DisplayName("mon08_5")
	public void mon08_5(){
		double expected = (-1+-2+-3+-4+-5+-6+-7+-8+-9+-10)/10.0;
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		double actual = ex.mon08(test);
		assertEquals(expected, actual, 0);
	}

	@Test
	@DisplayName("mon09_1")
	public void mon09_1(){
		double [] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
		double [] actual = ex.mon09();
		assertArrayEquals(expected, actual, 0);
	}

	@Test
	@DisplayName("mon10_1")
	public void mon10_1(){
		int expected = 4;
		int [] test = {1, 2, 3, 4, 5, 5, 7, 8, 5, 5};
		int actual = ex.mon10(test,5);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon10_2")
	public void mon10_2(){
		int expected = 4;
		int [] test = {-1, -2, -3, -4, -5, -5, -7, -8, -5, -5};
		int actual = ex.mon10(test,-5);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon10_3")
	public void mon10_3(){
		int expected = 4;
		int [] test = {1, 2, 3, 4, -1, -2, -3, -3, -3, -1};
		int actual = ex.mon10(test,-1);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon10_4")
	public void mon10_4(){
		int expected = -1;
		int [] test = {1, 2, 3, 4, 1, 2, 3, 3, 3, 1};
		int actual = ex.mon10(test,5);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("mon10_5")
	public void mon10_5(){
		int expected = 0;
		int [] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int actual = ex.mon10(test,0);
		assertEquals(expected, actual);
	}


}
