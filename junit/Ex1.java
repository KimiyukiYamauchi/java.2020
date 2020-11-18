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
		if(n > 0){
			return "その値は正です";
		}else {
			return "その値は0か負です";
		}
	}

	public int ex1_1(int n){

		if(n > 0){
			return n;
		}else {
			return n * -1;
		}
	}

	public String ex1_2(int a, int b){


		if (a % b==0 ) {
			return b + "は" + a + "の約数です";

		}else {
			return b + "は" + a + "の約数ではありません";
		}
	}

	public String ex1_3(int a, int b){

		if (a > b) {
			return a + "の方が大きいです";
		}else if (b > a) {
			return b + "の方が大きいです";
		}else {
			return "同じ値です";
		}

	}

	public String ex1_4(int a){
		if (a < 0) {
			return "正でない整数値です";
		}else if (a % 5 == 0) {
			return "その値は5で割り切れます";
		}else {
			return "その値は5で割り切れません";
		}

	}

	public String ex1_5(int a){
		if (a < 0) {
			return "正でない整数値です";
		}else if (a % 10 == 0) {
			return "その値は10の倍数です";
		}else {
			return "その値は10の倍数ではありません";
		}
	}

	public String ex1_6(int a){
		if (a < 0) {
			return "正でない整数値です";
		}else if (a % 3 == 0) {
			return "その値は3で割り切れます";
		}else if (a % 3 == 1) {
			return "その値を3で割った余りは1です";
		}else {
			return "その値を3で割った余りは2です";
		}
	}

	public String ex1_7(int a){
		if (a < 0 || a > 100) {
			return "範囲(0～100)外の値です";
		}else if (a <= 59) {
			return "不可";
		}else if (a <= 69) {
			return "可";
		}else if (a <= 79) {
			return "良";
		}else {
			return "優";
		}
			
	}

	public double ex1_8(double a, double b){
		if (a == b) {                       //a > b ? a : b
			return (int)a;
		}else if (a > b) {
			return a;
		}else {
			return b;
		}
	}

	public int ex1_9(int a, int b){
		int sa = a - b;
		if(sa < 0) {
			return sa * -1;
		}else {
			return sa;        //return Math.abs(a - b);
		}
	}

	public String ex1_10(int a, int b){
		int sa = Math.abs(a - b);
		if (sa <= 10) {
			return "それらの差は10以下です";
		}else {
			return "それらの差は11以上です";
		}
	}

	public int ex1_11(int a, int b, int c){
		if (a >= b) {
			if (b >= c) {
				return c;
			}else if (c >= a) {
				return b;
			}else {
				return b;
			}
		}else {  //a <= b
			if (c <= a) {
				return c;
			}else if (b <= c) {
				return a;
			}else { //a <= c <= b
				return a;
			}
		
		}
	}

	public int ex1_12(int a, int b, int c){
		if (a >= b) {
			if (b >= c) {
				return b;
			}else if (c >= a) {
				return a;
			}else {  //a >= c >=b
				return c;
			}
		}else {  //a <= b
			if (c <= a) {
				return a;
			}else if (b <= c) {
				return b;
			}else { //a <= c <= b
				return c;
			}
		
		}
	}

	public String ex1_13(int a){
		if (a >= 3 && a <= 5) {
			return "春";
		}else if (a >= 6 && a <= 8) {
			return "夏";
		}else if (a >= 9 && a <= 11) {
			return "秋";
		}else if (a <= 0) {
			return "範囲(1～12)外の値です";
		}else if (a > 12) {
			return "範囲(1～12)外の値です";
		}else {
			return "冬";
		}
	}
}

