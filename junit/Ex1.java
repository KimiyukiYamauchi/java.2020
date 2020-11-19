package junit;

class Ex1{
	/**
	 *
	 * @param n
	 * @return
	 * 	n > 0 => "その値は正です"
	 * 	n <= 0 => "その値は０か負です"
	 */
	public String ex1_0(int n) {
		if (n > 0)
			return "その値は正です";
		else
			return "その値は０か負です";
	}

	public int ex1_1(int n){
		if (n < 0)
			return n * -1;
		else
			return n;

	}

	public String ex1_2(int a, int b){
		if (a % b == 0)
				return( b + "は" + a + "の約数です");
		else
			return (b + "は" + a + "の約数ではありません");
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
		if (a < 0) 
			return "正でない整数値です";
		else if(a % 5 == 0) 
			return "その値は5で割り切れます";
		else 
			return "その値は5で割り切れません";

	}

	public String ex1_5(int a){
		if (a < 0) 
			return "正でない整数値です";
		else if (a % 10 == 0) 
			return "その値は10の倍数です";
		else 
			return "その値は10の倍数ではありません";
	}

	public String ex1_6(int a){
		if(a < 0)
			return "正でない整数値です";
		if (a % 3 == 0) 
			return "その値は3で割り切れます";
		else if (a % 3 == 2) 
			return "その値を3で割った余りは2です";
		else
			return "その値を3で割った余りは1です";
	}

	public String ex1_7(int a) {
		if (a < 0 || a > 100) 
			return "範囲(0～100)外の値です";
		else if (a <= 59)
			return "不可";
		else if (a >= 60 && a <= 69)
			return "可";
		else if (a >= 70 && a <= 79)
			return "良";
		else
			return "優";
	}

	public double ex1_8(double a, double b){
		return a > b ? a : b;
	}

	public int ex1_9(int a, int b) {
		int sa = a - b;
		if(sa < 0)
			return sa * -1;
		else
			return sa;
	}

	public String ex1_10(int a, int b) {
		int sa = a - b;
		if (sa < 0)
			sa *= -1;
		
		if(sa <= 10)
			return "それらの差は10以下です";
		else
			return "それらの差は11以上です";
	}

	public int ex1_11(int a, int b, int c){
		if (a < b)
			if(a < c)
				return a;
			else
				return c;
		else if(b < c)
			return b;
		else
			return c;
	}

	public int ex1_12(int a, int b, int c){
		if (a < b) {
			if (a < c) {
				if (b < c)
					return b;
				else
					return c;
			} else {
				if (a < b)
					return a;
				else
					return b;
			}
		}else if (b < c) {
			if (c < a)
				return c;
			else {
				return a;
			}
		}else
			return b;
	}

	public String ex1_13(int a){
		String [] retStr = {"冬", "冬", "春", "春", "春", "夏", "夏", "夏", "秋", "秋", "秋", "冬"};
		if (a < 1 || a > 12)
			return "範囲(1～12)外の値です";
		else
			return retStr[a - 1];
	}
}

