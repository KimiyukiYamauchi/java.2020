package junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Ex2Test {

    private final Ex2 ex2 = new Ex2();

	@Test
	public void ex2_1_1(){
		int[] expected = {-3, -2, -1, 0, 1, 2, 3};
		int[] test = {3, 2, 1, 0, -1, -2, -3};
		int[] actual = ex2.ex2_1(test);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void ex2_1_2(){
		int[] expected = {-6, -5, -4, -3, -2, -1, 0};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex2.ex2_1(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_1_3(){
		int[] expected = {0, 1, 2, 3, 4, 5, 6};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex2.ex2_1(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_1_4(){
		int[] expected = {-6, -6, -3, -3, -1, -1, 0};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex2.ex2_1(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_1_5(){
		int[] expected = {0, 2, 2, 4, 4, 5, 5};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex2.ex2_1(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_2_1(){
		int[] expected = {3, 2, 1, 0, -1, -2, -3};
		int[] test = {-3, -2, -1, 0, 1, 2, 3};
		int[] actual = ex2.ex2_2(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_2_2(){
		int[] expected = {0, -1, -2, -3, -4, -5, -6};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		int[] actual = ex2.ex2_2(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_2_3(){
		int[] expected = {6, 5, 4, 3, 2, 1, 0};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		int[] actual = ex2.ex2_2(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_2_4(){
		int[] expected = {0, -1, -1, -3, -3, -6, -6};
		int[] test = {0, -3, -1, -6, -3, -1, -6};
		int[] actual = ex2.ex2_2(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_2_5(){
		int[] expected = {5, 5, 4, 4, 2, 2, 0};
		int[] test = {0, 4, 2, 5, 5, 2, 4};
		int[] actual = ex2.ex2_2(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_3_1(){
		String[] expected = {"負", "負", "負", "零", "正", "正", "正"};
		int[] test = {-3, -2, -1, 0, 1, 2, 3};
		String[] actual = ex2.ex2_3(test);
		assertArrayEquals(actual, expected);
	}
	@Test
	public void ex2_3_2(){
		String[] expected = {"零", "負", "負", "負", "負", "負", "負"};
		int[] test = {0, -3, -1, -6, -5, -2, -4};
		String[] actual = ex2.ex2_3(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_3_3(){
		String[] expected = {"零", "正", "正", "正", "正", "正", "正"};
		int[] test = {0, 3, 1, 6, 5, 2, 4};
		String[] actual = ex2.ex2_3(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_3_4(){
		String[] expected = {"零", "負", "正", "負", "正", "負", "正"};
		int[] test = {0, -3, 1, -6, 5, -2, 4};
		String[] actual = ex2.ex2_3(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_3_5(){
		String[] expected = {"零", "正", "負", "正", "負", "正", "負"};
		int[] test = {0, 3, -1, 6, -5, 2, -4};
		String[] actual = ex2.ex2_3(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_4_1(){
		int expected = 4;
		int test = 1254;
		int actual = ex2.ex2_4(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_4_2(){
		int expected = 6;
		int test = 111111;
		int actual = ex2.ex2_4(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_4_3(){
		int expected = 1;
		int test = 4;
		int actual = ex2.ex2_4(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_4_4(){
		int expected = 2;
		int test = 33;
		int actual = ex2.ex2_4(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_4_5(){
		int expected = 10;
		int test = 1234567890;
		int actual = ex2.ex2_4(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_5_1(){
		int expected = 55;
		int test = 10;
		int actual = ex2.ex2_5(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_5_2(){
		int expected = 4950;
		int test = 99;
		int actual = ex2.ex2_5(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_5_3(){
		int expected = 50015001;
		int test = 10001;
		int actual = ex2.ex2_5(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_5_4(){
		int expected = 50025003;
		int test = 10002;
		int actual = ex2.ex2_5(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_5_5(){
		int expected = 49995000;
		int test = 9999;
		int actual = ex2.ex2_5(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_6_1(){
		int [] expected = {1, 2, 4};
		int test =4;
		int [] actual = ex2.ex2_6(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_6_2(){
		int [] expected = {1, 2, 4, 5, 10, 20, 25, 50, 100};
		int test =100;
		int [] actual = ex2.ex2_6(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_6_3(){
		int [] expected = {1, 2, 3, 6, 11, 22, 33, 66};
		int test =66;
		int [] actual = ex2.ex2_6(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_6_4(){
		int [] expected = {1};
		int test =1;
		int [] actual = ex2.ex2_6(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_6_5(){
		int [] expected = {1, 9999991};
		int test =9999991;
		int [] actual = ex2.ex2_6(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex2_7_1(){
		boolean expected = false;
		int test = 1;
		boolean actual = ex2.ex2_7(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_7_2(){
		boolean expected = true;
		int test = 2;
		boolean actual = ex2.ex2_7(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_7_3(){
		boolean expected = true;
		int test = 9999973;
		boolean actual = ex2.ex2_7(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_7_4(){
		boolean expected = true;
		int test = 9999991;
		boolean actual = ex2.ex2_7(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_7_5(){
		boolean expected = false;
		int test = 9999999;
		boolean actual = ex2.ex2_7(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_8_1(){
		int expected = 6000;
		int [] test = {1000, 2000, 3000};
		int actual = ex2.ex2_8(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_8_2(){
		int expected = 55;
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int actual = ex2.ex2_8(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_8_3(){
		int expected = 0;
		int [] test = {-3, -2, -1, 0, 1, 2, 3};
		int actual = ex2.ex2_8(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_8_4(){
		int expected = 1;
		int [] test = {1};
		int actual = ex2.ex2_8(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_8_5(){
		int expected = -55;
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int actual = ex2.ex2_8(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_9_1(){
		int expected = 6;
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int actual = ex2.ex2_9(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_9_2(){
		int expected = 2003;
		int [] test = {1001, 2002, 3007};
		int actual = ex2.ex2_9(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_9_3(){
		int expected = 1;
		int [] test = {-3, -2 , -1, 0, 2, 4, 6};
		int actual = ex2.ex2_9(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_9_4(){
		int expected = 0;
		int [] test = {0, 1, -2};
		int actual = ex2.ex2_9(test);
		assertEquals(expected, actual);
	}
	@Test
	public void ex2_9_5(){
		int expected = -5;
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int actual = ex2.ex2_9(test);
		assertEquals(expected, actual);
	}

}
