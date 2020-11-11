package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prac5_8Test {

	private final Prac5_8 inst = new Prac5_8();

	@Test
	void sortに１０から１を渡す() {
		int [] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = inst.sort(input);
		assertEquals(expected, actual);
	}
	@Test
	void sortにー１からー１０を渡す() {
		int [] input = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int [] expected = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
		int [] actual = inst.sort(input);
		assertEquals(expected, actual);
	}
	@Test
	void sortに全部１を渡す() {
		int [] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int [] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int [] actual = inst.sort(input);
		assertEquals(expected, actual);
	}@Test
	void sortに全部ー１を渡す() {
		int [] input = {-1, -1, -1, -1, -1, -1,-1, -1, -1, -1};
		int [] expected = {-1, -1, -1, -1, -1, -1,-1, -1, -1, -1};
		int [] actual = inst.sort(input);
		assertEquals(expected, actual);
	}

}
