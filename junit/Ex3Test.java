package junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
public class Ex3Test {

    Ex3 ex3 = new Ex3();

	@Test
	public void ex3_1_1(){
		double expected = (2+3+5)/3.0;
		int [] test = {2, 3, 5};
		double actual = ex3.ex3_1(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex3_1_2(){
		double expected = (1001+2002+3007)/3.0;
		int [] test = {1001, 2002, 3007};
		double actual = ex3.ex3_1(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex3_1_3(){
		double expected = (1+2+3+4+5+6+7+8+9+10)/10.0;
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8,  9, 10};
		double actual = ex3.ex3_1(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex3_1_4(){
		double expected = (0+1+-2)/3.0;
		int [] test = {0, 1, -2};
		double actual = ex3.ex3_1(test);
		assertEquals(expected, actual, 0);
	}
	@Test
	public void ex3_1_5(){
		double expected = (-1+-2+-3+-4+-5+-6+-7+-8+-9+-10)/10.0;
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		double actual = ex3.ex3_1(test);
		assertEquals(expected, actual, 0);
	}

