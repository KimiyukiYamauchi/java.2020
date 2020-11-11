package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prac4_1Test {

	private final Prac4_1 inst = new Prac4_1();

	@Test
	void avgに１から１０までを渡す() {
		int [] input = {1,2,3,4,5,6,7,8,9,10};
		int expected = 5;
		int actual = inst.avg(input);
		assertEquals(expected, actual);
	}
	@Test
	void avgにー１からー１０までを渡す() {
		int [] input = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		int expected = -5;
		int actual = inst.avg(input);
		assertEquals(expected, actual);
	}
	@Test
	void maxに１から１０までを渡す() {
		int [] input = {1,2,3,4,5,6,7,8,9,10};
		int expected = 10;
		int actual = inst.max(input);
		assertEquals(expected, actual);
	}
	@Test
	void maxにー１からー１０までを渡す() {
		int [] input = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		int expected = -1;
		int actual = inst.max(input);
		assertEquals(expected, actual);
	}
	@Test
	void minに１から１０までを渡す() {
		int [] input = {1,2,3,4,5,6,7,8,9,10};
		int expected = 1;
		int actual = inst.min(input);
		assertEquals(expected, actual);
	}
	@Test
	void minにー１からー１０までを渡す() {
		int [] input = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		int expected = -10;
		int actual = inst.min(input);
		assertEquals(expected, actual);
	}
}