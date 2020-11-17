package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ex1Test {

    private final Ex1 ex1 = new Ex1();

	@Test
	public void ex1_0_正の整数(){
		String expected = "その値は正です";
		String actual = ex1.ex1_0(1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_0_正でない整数(){
		String expected = "その値は０か負です";
		String actual = ex1.ex1_0(0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_1_正の整数(){
		int expected = 1;
		int actual = ex1.ex1_1(1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_1_正でない整数(){
		int expected = -1;
		int actual = ex1.ex1_1(-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_1_０の場合(){
		int expected = 0;
		int actual = ex1.ex1_1(0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_2_約数(){
		String expected = "4は12の約数です";
		String actual = ex1.ex1_2(12, 4);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_2_約数でない(){
		String expected = "5は12の約数ではありません";
		String actual = ex1.ex1_2(12, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_3_ａが大きい(){
		String expected = "8の方が大きいです";
		String actual = ex1.ex1_3(8, -9);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_3_ｂが大きい(){
		String expected = "9の方が大きいです";
		String actual = ex1.ex1_3(-11, 9);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_3_ａとｂが同じ値(){
		String expected = "同じ値です";
		String actual = ex1.ex1_3(3, 3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_4_５で割り切れる(){
		String expected = "その値は5で割り切れます";
		String actual = ex1.ex1_4(15);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_4_５で割り切れない(){
		String expected = "その値は5で割り切れません";
		String actual = ex1.ex1_4(11);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_4_正でない(){
		String expected = "正でない整数値です";
		String actual = ex1.ex1_4(-5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_5_１０の倍数(){
		String expected = "その値は10の倍数です";
		String actual = ex1.ex1_5(1000);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_5_１０の倍数でない(){
		String expected = "その値は10の倍数ではありません";
		String actual = ex1.ex1_5(1001);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_5_正でない(){
		String expected = "正でない整数値です";
		String actual = ex1.ex1_5(-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_6_３で割り切れる(){
		String expected = "その値は3で割り切れます";
		String actual = ex1.ex1_6(3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_6_３で割ると余り１(){
		String expected = "その値を3で割った余りは1です";
		String actual = ex1.ex1_6(4);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_6_３で割ると余り２(){
		String expected = "その値を3で割った余りは2です";
		String actual = ex1.ex1_6(5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_6_正でない(){
		String expected = "正でない整数値です";
		String actual = ex1.ex1_6(-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_０から５９の範囲で０(){
		String expected = "不可";
		String actual = ex1.ex1_7(0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_０から５９の範囲で５９(){
		String expected = "不可";
		String actual = ex1.ex1_7(59);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_６０から６９の範囲で６０(){
		String expected = "可";
		String actual = ex1.ex1_7(60);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_６０から６９の範囲で６９(){
		String expected = "可";
		String actual = ex1.ex1_7(69);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_７０から７９の範囲で７０(){
		String expected = "良";
		String actual = ex1.ex1_7(70);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_７０から７９の範囲で７９(){
		String expected = "良";
		String actual = ex1.ex1_7(79);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_８０から１００の範囲で７９(){
		String expected = "優";
		String actual = ex1.ex1_7(80);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_８０から１００の範囲で１００(){
		String expected = "優";
		String actual = ex1.ex1_7(100);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_範囲外でマイナス１(){
		String expected = "範囲(0～100)外の値です";
		String actual = ex1.ex1_7(-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_7_範囲外で１０１(){
		String expected = "範囲(0～100)外の値です";
		String actual = ex1.ex1_7(101);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_8_1(){
		double expected = 0.5;
		double actual = ex1.ex1_8(-0.5,0.5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_8_2(){
		double expected = 0;
		double actual = ex1.ex1_8(-0.1,0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_8_3(){
		double expected = -0.1;
		double actual = ex1.ex1_8(-0.1,-0.2);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_8_4(){
		double expected = 1.2;
		double actual = ex1.ex1_8(1.1,1.2);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_8_5(){
		double expected = 0;
		double actual = ex1.ex1_8(0.0,0.0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_9_1(){
		int expected = 5;
		int actual = ex1.ex1_9(3,-2);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_9_2(){
		int expected = 1;
		int actual = ex1.ex1_9(-2,-3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_9_3(){
		int expected = 1;
		int actual = ex1.ex1_9(3,2);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_9_4(){
		int expected = 1;
		int actual = ex1.ex1_9(0,-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_9_5(){
		int expected = 1;
		int actual = ex1.ex1_9(1,0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_10_1(){
		String expected = "それらの差は10以下です";
		String actual = ex1.ex1_10(-1,9);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_10_2(){
		String expected = "それらの差は11以上です";
		String actual = ex1.ex1_10(10,-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_10_3(){
		String expected = "それらの差は10以下です";
		String actual = ex1.ex1_10(10,0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_10_4(){
		String expected = "それらの差は11以上です";
		String actual = ex1.ex1_10(0,-11);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_10_5(){
		String expected = "それらの差は10以下です";
		String actual = ex1.ex1_10(-1,-11);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_11_1(){
		int expected = -1;
		int actual = ex1.ex1_11(1, 0, -1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_11_2(){
		int expected = -3;
		int actual = ex1.ex1_11(-1, -2, -3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_11_3(){
		int expected = 0;
		int actual = ex1.ex1_11(0, 0, 1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_11_4(){
		int expected = -1;
		int actual = ex1.ex1_11(-1, -1, 0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_11_5(){
		int expected = 10000;
		int actual = ex1.ex1_11(10000, 100000, 10001);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_12_1(){
		int expected = 2;
		int actual = ex1.ex1_12(1, 2, 3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_12_2(){
		int expected = 0;
		int actual = ex1.ex1_12(0, 0, -1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_12_3(){
		int expected = -2;
		int actual = ex1.ex1_12(-1, -2, -3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_12_4(){
		int expected = 0;
		int actual = ex1.ex1_12(0, 0, 0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_12_5(){
		int expected = -1;
		int actual = ex1.ex1_12(-1, -2, 0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_1(){
		String expected = "冬";
		String actual = ex1.ex1_13(12);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_2(){
		String expected = "冬";
		String actual = ex1.ex1_13(2);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_3(){
		String expected = "春";
		String actual = ex1.ex1_13(3);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_4(){
		String expected = "春";
		String actual = ex1.ex1_13(5);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_5(){
		String expected = "夏";
		String actual = ex1.ex1_13(6);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_6(){
		String expected = "夏";
		String actual = ex1.ex1_13(8);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_7(){
		String expected = "秋";
		String actual = ex1.ex1_13(9);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_8(){
		String expected = "秋";
		String actual = ex1.ex1_13(11);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_9(){
		String expected = "範囲(1～12)外の値です";
		String actual = ex1.ex1_13(0);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_10(){
		String expected = "範囲(1～12)外の値です";
		String actual = ex1.ex1_13(-1);
		assertEquals(expected, actual);
	}
	@Test
	public void ex1_13_11(){
		String expected = "範囲(1～12)外の値です";
		String actual = ex1.ex1_13(13);
		assertEquals(expected, actual);
	}

}
