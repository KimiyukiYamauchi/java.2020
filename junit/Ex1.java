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

		if (n > 0) {
			return "その値は正です";
		}else {
			return  "その値は０か負です";
		}

	}

	public int ex1_1(int n){
		if (n == 0) {
			return 0;
		}else {
			return 1;
		}

	}

	public String ex1_2(int a, int b){
		if (a % b == 0) {
			return b + "は" + a + "の約数です";
		}else {
			return b + "は" + a + "の約数ではありません";
		}
	}

	public String ex1_3(int a, int b){
		if (a > b) {
			return a + "の方が大きいです";
		}else if(a < b) {
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
		if (a % 3 == 0) {
			return "その値は3で割り切れます";
		}else if (a % 3 == 1) {
			return "その値を3で割った余りは1です";
		}else if (a % 3 == 2){
			return  "その値を3で割った余りは2です";
		}else {
			return "正でない整数値です";
		}
	}

	public String ex1_7(int a){
		if (0 <= a && 59 >= a) {
			return "不可";
		}else if (60 <= a && 69 >= a) {
			return "可";
		}else if (70 <= a && 79 >= a) {
			return "良";
		}else if (80 <= a && 100 >= a){
			return "優";
		}else {
			return "範囲(0～100)外の値です";
		}
	}

	public double ex1_8(double a, double b){
		if ( a > b) {
			return a;
		}else if (a < b) {
			return b;
		}else {
			return a;
		}

	}

	public int ex1_9(int a, int b){
		return a - b;
	}

	public String ex1_10(int a, int b){
		if (a - b >= 11) {
			return "それらの差は11以上です";
		}else {
			return "それらの差は10以下です";
		}
	}

	public int ex1_11(int a, int b, int c){
		int num = min(a, b, c);

		return num;
	}

		public static int min(int a, int b, int c) {
			int min = a;
			if(min > b) {
				min = b;
			}

			if(min > c) {
				min = c;
			}
			return min ;
		}


	public int ex1_12(int a, int b, int c){
		return (a + b + c) / 3;
	}

	public String ex1_13(int a){
		if (a >= 3 && a <= 5) {
			return "春";
		}else if (a >= 6 && a <= 8) {
			return "夏";
		}else if (a >= 9 && a <= 11) {
			return "秋";
		}else if (a == 12 || (a >= 1 && a <= 4)) {
			return "冬";
		}else {
			return "範囲(1～12)外の値です";
		}
	}
}

