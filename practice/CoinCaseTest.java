package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoinCaseTest {

	@Test
	@DisplayName("CoinCaseを作成直後の状態。各コインの数")
	void test1() {
		CoinCase cc = new CoinCase();

		assertAll("cc",
                () -> assertEquals(0, cc.GetCount(1)),
                () -> assertEquals(0, cc.GetCount(5)),
                () -> assertEquals(0, cc.GetCount(10)),
                () -> assertEquals(0, cc.GetCount(50)),
                () -> assertEquals(0, cc.GetCount(100)),
                () -> assertEquals(0, cc.GetCount(500))
        );
	}

	@Test
	@DisplayName("CoinCaseを作成直後の状態。合計金額")
	void test2() {
		CoinCase cc = new CoinCase();

		int expected = 0;
		int actual = cc.GetAmount();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("100円を1枚追加")
	void test3() {
		CoinCase cc = new CoinCase();
		cc.AddCoins(100, 1);

		int expected = 100;
		int actual = cc.GetAmount();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("1円1枚、5円2枚、10円3枚、50円4枚、100円5枚、500円5枚追加")
	void test4() {
		CoinCase cc = new CoinCase();

		cc.AddCoins(1, 1);
		cc.AddCoins(5, 2);
		cc.AddCoins(10, 3);
		cc.AddCoins(50, 4);
		cc.AddCoins(100, 5);
		cc.AddCoins(500, 5);

		int expected = 3241;
		int actual = cc.GetAmount();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("不正なコインの追加")
	void test5() {
		CoinCase cc = new CoinCase();

		cc.AddCoins(2, 1);
		cc.AddCoins(6, 2);
		cc.AddCoins(11, 3);
		cc.AddCoins(51, 4);
		cc.AddCoins(101, 5);
		cc.AddCoins(501, 5);

		int expected = 0;
		int actual = cc.GetAmount();
		assertEquals(expected, actual);
	}



}
