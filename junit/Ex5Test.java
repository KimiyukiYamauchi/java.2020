package junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Ex5Test {

	@Test
	public void ex5_1_1(){
		Ex5 ex5 = new Ex5();
		int a = 8;
		int b = -9;
		int expected = -9;
		int actual = ex5.ex5_1(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_2(){
		Ex5 ex5 = new Ex5();
		int a = -11;
		int b = 9;
		int expected = -11;
		int actual = ex5.ex5_1(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_3(){
		Ex5 ex5 = new Ex5();
		int a = 3;
		int b = 3;
		int expected = 3;
		int actual = ex5.ex5_1(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_4(){
		Ex5 ex5 = new Ex5();
		int a = 0;
		int b = 0;
		int expected = 0;
		int actual = ex5.ex5_1(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_5(){
		Ex5 ex5 = new Ex5();
		int a = -1;
		int b = -1;
		int expected = -1;
		int actual = ex5.ex5_1(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_6(){
		Ex5 ex5 = new Ex5();
		int a = 1;
		int b = 0;
		int c = -1;
		int expected = -1;
		int actual = ex5.ex5_1(a, b, c);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_7(){
		Ex5 ex5 = new Ex5();
		int a = -1;
		int b = -2;
		int c = -3;
		int expected = -3;
		int actual = ex5.ex5_1(a, b, c);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_8(){
		Ex5 ex5 = new Ex5();
		int a = 0;
		int b = 0;
		int c = 1;
		int expected = 0;
		int actual = ex5.ex5_1(a, b, c);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_9(){
		Ex5 ex5 = new Ex5();
		int a = -1;
		int b = -1;
		int c = 0;
		int expected = -1;
		int actual = ex5.ex5_1(a, b, c);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_10(){
		Ex5 ex5 = new Ex5();
		int a = 10000;
		int b = 10000;
		int c = 10001;
		int expected = 10000;
		int actual = ex5.ex5_1(a, b, c);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_11(){
		Ex5 ex5 = new Ex5();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int expected = 1;
		int actual = ex5.ex5_1(a);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_12(){
		Ex5 ex5 = new Ex5();
		int [] a = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int expected = -10;
		int actual = ex5.ex5_1(a);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_13(){
		Ex5 ex5 = new Ex5();
		int [] a = {-10, 1, -1, 10, -5, 3, 1, 2, -8, -5, -11};
		int expected = -11;
		int actual = ex5.ex5_1(a);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_14(){
		Ex5 ex5 = new Ex5();
		int [] a = {50, 70, 45, 22, 91, 82, 77, 14, 3, 1};
		int expected = 1;
		int actual = ex5.ex5_1(a);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_1_15(){
		Ex5 ex5 = new Ex5();
		int [] a = {-50, -70, -45, -22, -91, -82, -77, -14, -3, -1};
		int expected = -91;
		int actual = ex5.ex5_1(a);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_1(){
		Ex5 ex5 = new Ex5();
		int x = 1;
		int expected = 1;
		int actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_2(){
		Ex5 ex5 = new Ex5();
		int x = -1;
		int expected = 1;
		int actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_3(){
		Ex5 ex5 = new Ex5();
		int x = 0;
		int expected = 0;
		int actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_4(){
		Ex5 ex5 = new Ex5();
		long x = 1;
		long expected = 1;
		long actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_5(){
		Ex5 ex5 = new Ex5();
		long x = -1;
		long expected = 1;
		long actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_6(){
		Ex5 ex5 = new Ex5();
		long x = 0;
		long expected = 0;
		long actual = ex5.ex5_2(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_2_7(){
		Ex5 ex5 = new Ex5();
		float x = 1.1f;
		float expected = 1.1f;
		float actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_2_8(){
		Ex5 ex5 = new Ex5();
		float x = -1.1f;
		float expected = 1.1f;
		float actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_2_9(){
		Ex5 ex5 = new Ex5();
		float x = 0;
		float expected = 0;
		float actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_2_10(){
		Ex5 ex5 = new Ex5();
		double x = 1.1;
		double expected = 1.1;
		double actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_2_11(){
		Ex5 ex5 = new Ex5();
		double x = -1.1;
		double expected = 1.1;
		double actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_2_12(){
		Ex5 ex5 = new Ex5();
		double x = 0;
		double expected = 0;
		double actual = ex5.ex5_2(x);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex5_3_1(){
		Ex5 ex5 = new Ex5();
		byte x = 3;
		String expected = "00000011";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_2(){
		Ex5 ex5 = new Ex5();
		byte x = -3;
		String expected = "11111101";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_3(){
		Ex5 ex5 = new Ex5();
		byte x = 127;
		String expected = "01111111";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_4(){
		Ex5 ex5 = new Ex5();
		byte x = -128;
		String expected = "10000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_5(){
		Ex5 ex5 = new Ex5();
		byte x = 0;
		String expected = "00000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_6(){
		Ex5 ex5 = new Ex5();
		short x = 3;
		String expected = "0000000000000011";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_7(){
		Ex5 ex5 = new Ex5();
		short x = -3;
		String expected = "1111111111111101";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_8(){
		Ex5 ex5 = new Ex5();
		short x = 32767;
		String expected = "0111111111111111";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_9(){
		Ex5 ex5 = new Ex5();
		short x = -32768;
		String expected = "1000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_10(){
		Ex5 ex5 = new Ex5();
		short x = 0;
		String expected = "0000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_11(){
		Ex5 ex5 = new Ex5();
		int x = 3;
		String expected = "00000000000000000000000000000011";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_12(){
		Ex5 ex5 = new Ex5();
		int x = -3;
		String expected = "11111111111111111111111111111101";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_13(){
		Ex5 ex5 = new Ex5();
		int x = 2147483647;
		String expected = "01111111111111111111111111111111";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_14(){
		Ex5 ex5 = new Ex5();
		int x = -2147483648;
		String expected = "10000000000000000000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_15(){
		Ex5 ex5 = new Ex5();
		int x = 0;
		String expected = "00000000000000000000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_16(){
		Ex5 ex5 = new Ex5();
		long x = 3;
		String expected = "0000000000000000000000000000000000000000000000000000000000000011";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_17(){
		Ex5 ex5 = new Ex5();
		long x = -3;
		String expected = "1111111111111111111111111111111111111111111111111111111111111101";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_18(){
		Ex5 ex5 = new Ex5();
		long x = 9223372036854775807L;
		String expected = "0111111111111111111111111111111111111111111111111111111111111111";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_19(){
		Ex5 ex5 = new Ex5();
		long x = -9223372036854775808L;
		String expected = "1000000000000000000000000000000000000000000000000000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}
	@Test
	public void ex5_3_20(){
		Ex5 ex5 = new Ex5();
		long x = 0;
		String expected = "0000000000000000000000000000000000000000000000000000000000000000";
		String actual = ex5.ex5_3(x);
		assertEquals(expected, actual);
	}


}
