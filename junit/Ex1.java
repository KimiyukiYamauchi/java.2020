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
		if(n >= 0)
			return "その値は正です";
		else
			return "その値は０か負です。";

	}

	public int ex1_1(int n){
		if(0 > n || 0 < n)
			return 1;
		else
			return 0;

	}

	public String ex1_2(int a, int b){
		if(a % b == 0)
			return b + "は" + a + "の約数です";
		else
			return b + "は" + a + "の約数ではありません";
	}

	public String ex1_3(int a, int b){
		if(a > b)
			return a + "のほうが大きい";
		if(b > a)
			return b + "のほうが大きい";
		else
			return "同じ値です";

	}

	public String ex1_4(int a){
		if(a >= 0)
			if(a % 5 == 0)
				return "その値は5で割り切れます";
			else
				return  "その値は5で割り切れません";
		else
			return "正でない整数値です";
	}

	public String ex1_5(int a){

		return "dummy";
	}

	public String ex1_6(int a){
		return "dummy";
	}

	public String ex1_7(int a){
		return "dummy";
	}

	public double ex1_8(double a, double b){
		return -1.0;
	}

	public int ex1_9(int a, int b){
		return 0;
	}

	public String ex1_10(int a, int b){
		return "dummy";
	}

	public int ex1_11(int a, int b, int c){
		return 1000;
	}

	public int ex1_12(int a, int b, int c){
		return 1000;
	}

	public String ex1_13(int a){
		return "dummy";
	}
}

