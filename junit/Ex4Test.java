package junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Ex4Test {

    private final Ex4 ex4 = new Ex4();

	@Test
	public void ex4_1_1(){
		int [] expected = {5, 4, 3, 2, 1};
		int [] actual = ex4.ex4_1();
		assertArrayEquals(actual, expected);
	}
	@Test
	public void ex4_2_1(){
		double [] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
		double [] actual = ex4.ex4_2();
		assertArrayEquals(expected, actual, 0);
	}
	@Test
	public void ex4_3_1(){
		int [] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int [] actual = ex4.ex4_3(10, 0);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_3_2(){
		int [] expected = {1000};
		int [] actual = ex4.ex4_3(1, 1000);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_3_3(){
		int [] expected = {1, 1, 1};
		int [] actual = ex4.ex4_3(3, 1);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_3_4(){
		int [] expected = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int [] actual = ex4.ex4_3(10, -1);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_3_5(){
		int [] expected = {2, 2};
		int [] actual = ex4.ex4_3(2, 2);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_4_1(){
		int [] expected = {55, 6, 10, 1};
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_4(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_4_2(){
		int [] expected = {-55, -5, -1, -10};
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int [] actual = ex4.ex4_4(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_4_3(){
		int [] expected = {-23, -2, 10, -11};
		int [] test = {-10, 1, -1, 10, -5, 3, 1, 2, -8, -5, -11};
		int [] actual = ex4.ex4_4(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_4_4(){
		int [] expected = {455, 46, 91, 1};
		int [] test = {50, 70, 45, 22, 91, 82, 77, 14, 3, 1};
		int [] actual = ex4.ex4_4(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_4_5(){
		int [] expected = {-455, -45, -1, -91};
		int [] test = {-50, -70, -45, -22, -91, -82, -77, -14, -3, -1};
		int [] actual = ex4.ex4_4(test);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_5_1(){
		int expected = 4;
		int [] test = {1, 2, 3, 4, 5, 5, 7, 8, 5, 5};
		int actual = ex4.ex4_5(test,5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_5_2(){
		int expected = 4;
		int [] test = {-1, -2, -3, -4, -5, -5, -7, -8, -5, -5};
		int actual = ex4.ex4_5(test,-5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_5_3(){
		int expected = 4;
		int [] test = {1, 2, 3, 4, -1, -2, -3, -3, -3, -1};
		int actual = ex4.ex4_5(test,-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_5_4(){
		int expected = -1;
		int [] test = {1, 2, 3, 4, 1, 2, 3, 3, 3, 1};
		int actual = ex4.ex4_5(test,5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_5_5(){
		int expected = 0;
		int [] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int actual = ex4.ex4_5(test,0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_6_1(){
		int expected = 9;
		int [] test = {1, 2, 3, 4, 5, 5, 7, 8, 5, 5};
		int actual = ex4.ex4_6(test,5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_6_2(){
		int expected = 9;
		int [] test = {-1, -2, -3, -4, -5, -5, -7, -8, -5, -5};
		int actual = ex4.ex4_6(test,-5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_6_3(){
		int expected = 9;
		int [] test = {1, 2, 3, 4, -1, -2, -3, -3, -3, -1};
		int actual = ex4.ex4_6(test,-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_6_4(){
		int expected = -1;
		int [] test = {1, 2, 3, 4, 1, 2, 3, 3, 3, 1};
		int actual = ex4.ex4_6(test,5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_6_5(){
		int expected = 9;
		int [] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int actual = ex4.ex4_6(test,0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex4_7_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int [] expected = {1, 3, 7, 9, 11};
		int [] actual = ex4.ex4_7(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_7_2(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int [] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_7(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_7_3(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int [] actual = ex4.ex4_7(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_7_4(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 1;
		int [] expected = {1, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_7(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_7_5(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 8;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 10};
		int [] actual = ex4.ex4_7(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_8_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 1;
		int n = 3;
		int [] expected = {1, 9, 11};
		int [] actual = ex4.ex4_8(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_8_2(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 2;
		int n = 5;
		int [] expected = {1, 2, 8, 9, 10};
		int [] actual = ex4.ex4_8(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_8_3(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int n = 9;
		int [] expected = {10};
		int [] actual = ex4.ex4_8(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_8_4(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int n = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_8(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_8_5(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int n = 0;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_8(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_9_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int x = 99;
		int [] expected = {1, 3, 99, 4, 7, 9, 11};
		int [] actual = ex4.ex4_9(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_9_2(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 2;
		int x = 5;
		int [] expected = {1, 2, 5, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_9(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_9_3(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int x = 0;
		int [] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_9(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_9_4(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int x = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
		int [] actual = ex4.ex4_9(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_9_5(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 5;
		int x = 100;
		int [] expected = {1, 2, 3, 4, 5, 100, 6, 7, 8, 9, 10};
		int [] actual = ex4.ex4_9(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_10_1(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {5, 4, 3, 2, 1};
		int [] expected_a = {5, 4, 3, 2, 1, 6, 7};
		int [] expected_b = {1, 2, 3, 4, 5};
		ex4.ex4_10(a, b);
		assertArrayEquals(expected_a, a);
		assertArrayEquals(expected_b, b);
	}
	@Test
	public void ex4_10_2(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {7, 6, 5, 4, 3, 2, 1};
		int [] expected_a = {7, 6, 5, 4, 3, 2, 1};
		int [] expected_b = {1, 2, 3, 4, 5, 6, 7};
		ex4.ex4_10(a, b);
		assertArrayEquals(expected_a, a);
		assertArrayEquals(expected_b, b);
	}
	@Test
	public void ex4_10_3(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {};
		int [] expected_a = {1, 2, 3, 4, 5, 6, 7};
		int [] expected_b = {};
		ex4.ex4_10(a, b);
		assertArrayEquals(expected_a, a);
		assertArrayEquals(expected_b, b);
	}
	@Test
	public void ex4_10_4(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {1000};
		int [] expected_a = {1000, 2, 3, 4, 5, 6, 7};
		int [] expected_b = {1};
		ex4.ex4_10(a, b);
		assertArrayEquals(expected_a, a);
		assertArrayEquals(expected_b, b);
	}
	@Test
	public void ex4_10_5(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] b = {-1, -2, -3, -4, -5, -6, -7, -8};
		int [] expected_a = {-1, -2, -3, -4, -5, -6, -7};
		int [] expected_b = {1, 2, 3, 4, 5, 6, 7, -8};
		ex4.ex4_10(a, b);
		assertArrayEquals(expected_a, a);
		assertArrayEquals(expected_b, b);
	}
	@Test
	public void ex4_11_1(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] expected = {1, 2, 3, 4, 5, 6, 7};
		int [] actual = ex4.ex4_11(a);
		a = null;
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_11_2(){
		int [] a = {-1, -2, -3, -4, -5, -6, -7};
		int [] expected = {-1, -2, -3, -4, -5, -6, -7};
		int [] actual = ex4.ex4_11(a);
		a = null;
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_11_3(){
		int [] a = {-3, -2, -1, 0, 1, 2, 3};
		int [] expected = {-3, -2, -1, 0, 1, 2, 3};
		int [] actual = ex4.ex4_11(a);
		a = null;
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_11_4(){
		int [] a = {0};
		int [] expected = {0};
		int [] actual = ex4.ex4_11(a);
		a = null;
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_11_5(){
		int [] a = {};
		int [] expected = {};
		int [] actual = ex4.ex4_11(a);
		a = null;
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_12_1(){
		int [] a = {1, 5, 4, 8, 5, 5, 7};
		int [] expected = {1, 4, 5};
		int x = 5;
		int [] actual = ex4.ex4_12(a, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_12_2(){
		int [] a = {5, 5, 5, 5, 5, 5, 5};
		int [] expected = {0, 1, 2, 3, 4, 5, 6};
		int x = 5;
		int [] actual = ex4.ex4_12(a, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_12_3(){
		int [] a = {0, 0, 0, 0, 0, 0, 0};
		int [] expected = {};
		int x = 5;
		int [] actual = ex4.ex4_12(a, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_12_4(){
		int [] a = {1, 2, 3, 4, 5, 6, 7};
		int [] expected = {6};
		int x = 7;
		int [] actual = ex4.ex4_12(a, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_12_5(){
		int [] a = {-1, -2, -3, -4, -5, -6, -7};
		int [] expected = {0};
		int x = -1;
		int [] actual = ex4.ex4_12(a, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_13_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int [] expected = {1, 3, 7, 9, 11};
		int [] actual = ex4.ex4_13(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_13_2(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = -1;
		int [] expected = {1, 3, 4, 7, 9, 11};
		int [] actual = ex4.ex4_13(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_13_3(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 6;
		int [] expected = {1, 3, 4, 7, 9, 11};
		int [] actual = ex4.ex4_13(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_13_4(){
		int [] a = {};
		int idx = 0;
		int [] expected = {};
		int [] actual = ex4.ex4_13(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_13_5(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 5;
		int [] expected = {1, 3, 4, 7, 9};
		int [] actual = ex4.ex4_13(a, idx);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_14_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 1;
		int n = 3;
		int [] expected = {1, 9, 11};
		int [] actual = ex4.ex4_14(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_14_2(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 0;
		int n = 6;
		int [] expected = {};
		int [] actual = ex4.ex4_14(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_14_3(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 0;
		int n = 7;
		int [] expected = {};
		int [] actual = ex4.ex4_14(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_14_4(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = -1;
		int n = -6;
		int [] expected = {1, 3, 4, 7, 9, 11};
		int [] actual = ex4.ex4_14(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_14_5(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 6;
		int n = 1;
		int [] expected = {1, 3, 4, 7, 9, 11};
		int [] actual = ex4.ex4_14(a, idx, n);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_15_1(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int x = 99;
		int [] expected = {1, 3, 99, 4, 7, 9, 11};
		int [] actual = ex4.ex4_15(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_15_2(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 0;
		int x = 99;
		int [] expected = {99, 1, 3, 4, 7, 9, 11};
		int [] actual = ex4.ex4_15(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_15_3(){
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 6;
		int x = 99;
		int [] expected = {1, 3, 4, 7, 9, 11, 99};
		int [] actual = ex4.ex4_15(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_15_4(){
		int [] a = {};
		int idx = 0;
		int x = 99;
		int [] expected = {99};
		int [] actual = ex4.ex4_15(a, idx, x);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void ex4_15_5(){
		int [] a = {};
		int idx = -1;
		int x = 99;
		int [] expected = {99};
		int [] actual = ex4.ex4_15(a, idx, x);
		assertArrayEquals(expected, actual);
	}
}