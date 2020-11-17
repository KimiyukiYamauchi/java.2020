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
		if(n > 0) {
			return "その値は正です";
		}
		return "その値は０か負です";

	}

	public int ex1_1(int n){
		if(n > 0) {
			return 1;
		}else if(n < 0) {
			return 1;
		}
		return 0;

	}

	public String ex1_2(int a, int b){
		if(a % b == 0) {
			return "4は12の約数です";
		}

		return "5は12の約数ではありません";
	}

	public String ex1_3(int a, int b){
		if(a > b) {
			return "8の方が大きいです";
		}else if(a == b) {
			return "同じ値です";
		}
		return "9の方が大きいです";

	}

	public String ex1_4(int a){
		if(a < 0) {
			return "正でない整数値です";
		} else if(a % 5 == 0) {
			return "その値は5で割り切れます";
		}
		
		return "その値は5で割り切れません";

	}

	public String ex1_5(int a){
		if(a < 0) {
			return "正でない整数値です";
		} else if(a % 10 == 0) {
			return  "その値は10の倍数です";
		}
		
		return "その値は10の倍数ではありません";
	}

	public String ex1_6(int a){
		if(a < 0) {
			return "正でない整数値です";
		}else if(a % 3 == 0) {
			return  "その値は3で割り切れます";
		} else {
			if(a % 3 == 1) {
				return "その値を3で割った余りは1です";
			}
			return "その値を3で割った余りは2です";
		}
	}

	public String ex1_7(int a){
		if(a <= 100 && a >= 0) {
			if(a >= 80) {
				return "優";
			}else if(a >= 70) {
				return "良";
			}else if(a >= 60) {
				return "可";
			}
			return "不可";
		}
		return "範囲(0～100)外の値です";
	}

	public double ex1_8(double a, double b){
		double max_num = Math.max(a, b);
		return max_num;
	}

	public int ex1_9(int a, int b){
		int b1 = -1 * b;
		return a + b1;
	}

	public String ex1_10(int a, int b){
		if (a - b <= 10) {
			return "それらの差は10以下です";
		}
		return "それらの差は11以上です";
	}

	public int ex1_11(int a, int b, int c){
		int s = Math.min(a, b);
		int min = Math.min(s, c);
		return min;
	}

	public int ex1_12(int a, int b, int c){
		int s = a + b + c;
		return s / 3;
	}

	public String ex1_13(int a){
		if (3 <= a && a <= 5) {
            return "春";
		}else if (6 <= a && a <= 8) {
            return "夏";
		}else if (9 <= a && a <= 11) {
            return "秋";
		} else if (a == 1 || a == 2 || a == 12) {
            return "冬";
		}
		return  "範囲(1～12)外の値です";
	}
}

