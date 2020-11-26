package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PreTest {

    private final Pre ex1 = new Pre();

	@Test
	@DisplayName("引数で正の整数を渡した場合")
	public void ex1_0_1(){
		String expected = "その値は正です";
		String actual = ex1.ex1_0(1);
		assertEquals(expected, actual);
	}
	@Test
	@DisplayName("引数で正でない整数を渡した場合")
	public void ex1_0_2(){
		String expected = "その値は０か負です";
		String actual = ex1.ex1_0(0);
		assertEquals(expected, actual);
	}
}
