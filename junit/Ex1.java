package junit;

import java.util.Arrays;

class Ex1{
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String ex1_0(int n){

		return (n > 0) ? "その値は正です" : "その値は０か負です";
	}

	public int ex1_1(int n){

		return (n > 0) ? 1 : (n < 0) ? -1 : 0;
	}

	public String ex1_2(int a, int b){

		return (a % b == 0) ? String.format("%dは%dの約数です", b, a) :
			String.format("%dは%dの約数ではありません", b, a);
	}

	public String ex1_3(int a, int b){

		return (a > b) ? String.format("%dの方が大きいです", a) :
			(a < b) ? String.format("%dの方が大きいです", b) : "同じ値です";
	}

	public String ex1_4(int a){

		return (a < 0) ? "正でない整数値です" :
			(a % 5 != 0) ? "その値は5で割り切れません" : "その値は5で割り切れます";
	}

	public String ex1_5(int a){

		return (a < 0) ? "正でない整数値です" :
			(a % 10 != 0) ? "その値は10の倍数ではありません" : "その値は10の倍数です";
	}

	public String ex1_6(int a){

		return (a % 3 == 0) ? "その値は3で割り切れます" :
			(a % 3 == 1) ? "その値を3で割った余りは1です" :
			(a % 3 == 2) ? "その値を3で割った余りは2です" : "正でない整数値です";
	}

	public String ex1_7(int a){

		return (0 <= a && a <= 59) ? "不可" :
			(60 <= a && a <= 69) ? "可" :
			(70 <= a && a <= 79) ? "良" :
			(80 <= a && a <= 100) ? "優" : "範囲(0～100)外の値です";
	}

	public double ex1_8(double a, double b){
		return Math.max(a, b);
	}

	public int ex1_9(int a, int b){
		return a - b;
	}

	public String ex1_10(int a, int b){

		return (a - b <= 10) ? "それらの差は10以下です" : "それらの差は11以上です";
	}

	public int ex1_11(int a, int b, int c){
		return Math.min(Math.min(a, b), c);
	}

	public int ex1_12(int a, int b, int c){
		return (a + b + c) / 3;
	}

	public String ex1_13(int a){

		return (Arrays.asList(3, 4, 5).contains(a)) ? "春" :
			(Arrays.asList(6, 7, 8).contains(a)) ? "夏" :
			(Arrays.asList(9, 10, 11).contains(a)) ? "秋" :
			(Arrays.asList(12, 1, 2).contains(a)) ? "冬" : "範囲(1～12)外の値です";
	}
}