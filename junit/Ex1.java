package junit;

class Ex1{
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String ex1_0(int n){
		if (n > 0)
			return "その値は正です";
		else
			return "その値は０か負です";

	}

	public int ex1_1(int n){
		if (n == 0)
			return 0;
		else
			return 1;

	}

	public String ex1_2(int a, int b){
		if (a % b == 0)
			return b + "は" + a + "の約数です";
		else
			return b + "は" + a + "の約数ではありません";
	}

	public String ex1_3(int a, int b){
		if (a > b)
			return a + "の方が大きいです";
		else if (a < b)
			return b + "の方が大きいです";
		else
			return "同じ値です";

	}

	public String ex1_4(int a){
		if (a > 0 && a % 5 == 0)
			return "その値は5で割り切れます";
		else if (a < 0)
			return "正でない整数値です";
		else
			return "その値は5で割り切れません";

	}

	public String ex1_5(int a){
		if (a > 0 && a % 10 == 0)
			return "その値は10の倍数です";
		else if (a < 0)
			return "正でない整数値です";
		else
			return "その値は10の倍数ではありません";
	}

	public String ex1_6(int a){
		if (a > 0 && a % 3 == 0)
			return "その値は3で割り切れます";
		else if (a > 0 && a % 3 == 1)
			return "その値を3で割った余りは1です";
		else if (a < 0)
			return "正でない整数値です";
		else
			return "その値を3で割った余りは2です";
	}

	public String ex1_7(int a){
		if (0 <= a && a <= 59)
			return "不可";
		else if (60 <= a && a <= 69)
			return "可";
		else if (70 <= a && a <= 79)
			return "良";
		else if (80 <= a && a <= 100)
			return "優";
		else
			return "範囲(0～100)外の値です";
	}

	public double ex1_8(double a, double b){
		if (a > b)
			return a;
		else
			return b;
	}

	public int ex1_9(int a, int b){
		return a - b;
	}

	public String ex1_10(int a, int b){
		if (a - b <= 10)
			return "それらの差は10以下です";
		else
			return "それらの差は11以上です";
	}

	public int ex1_11(int a, int b, int c){
		if (a < b)
			return Math.min(a, c);
		else
			return Math.min(b, c);
	}

	public int ex1_12(int a, int b, int c){
		if (a >= b)
			if (a <= c)
				return a;
			else if (b >= c)
				return b;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public String ex1_13(int a){
		if (a >= 3 && 5 >= a)
			return "春";
		else if (a >= 6 && a <= 8)
			return "夏";
		else if (a >= 9 && a <= 11)
			return "秋";
		else if (a <= 0 || a >= 13)
			return "範囲(1～12)外の値です";
		else
			return "冬";
	}
}
