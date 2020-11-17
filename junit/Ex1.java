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
		if (n > 0) {
			return "その値は正です";
		}
		return "その値は０か負です";

	}

	public int ex1_1(int n){
		if (n == 0) {
			return 0;
		}
		return 1;
	}

	public String ex1_2(int a, int b){
		if (a % b == 0) {
			return b + "は" + a + "の約数です";
		}
		return b + "は" + a + "の約数ではありません";
	}

	public String ex1_3(int a, int b){
		if (a > b) {
			return a + "の方が大きいです";
		} else if (a < b) {
			return b + "の方が大きいです";
		}
		return "同じ値です";

	}

	public String ex1_4(int a){
		if (a < 1) {
			return "正でない整数値です";
		}
		else if (a % 5 == 0) {
			return "その値は5で割り切れます";
		}
		return "その値は5で割り切れません";
	}

	public String ex1_5(int a){
		if (a < 0) {
			return "正でない整数値です";
		} else if (a % 10 == 0) {
			return "その値は10の倍数です";
		}
		return "その値は10の倍数ではありません";
	}

	public String ex1_6(int a){
		if (a < 0) {
			return "正でない整数値です";
		} else if (a % 3 == 0) {
			return "その値は3で割り切れます";
		} else if (a % 3 == 1) {
			return "その値を3で割った余りは1です";
		} else {
			return "その値を3で割った余りは2です";
		}
	}

	public String ex1_7(int a){
		if (a < 0 || 100 < a) {
			return "範囲(0～100)外の値です";
		}else if (0 <= a && a < 60) {
			return "不可";
		} else if (60 <= a && a < 70) {
			return "可";
		} else if (70 <= a && a < 80) {
			return "良";
		}
		return "優";
	}

	public double ex1_8(double a, double b){
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		}
		return 0;
	}

	public int ex1_9(int a, int b){
		return a - b;
	}

	public String ex1_10(int a, int b){
		int x;
		int n;
		if (a > b) {
			x = a;
			n = b;
		} else {
			x = b;
			n = a;
		}
		if (x - n >= 11) {
			return "それらの差は11以上です";
		}
		return "それらの差は10以下です";
	}

	public int ex1_11(int a, int b, int c){
		int[] arr = new int[]{a, b, c};
		int min = arr[0];
		for (int i = 0; i < 3; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public int ex1_12(int a, int b, int c){
		int[] arr = new int[]{a, b, c};
		Arrays.sort(arr);
		return arr[1];
	}

	public String ex1_13(int a){
		if (a < 1 || 12 < a) {
			return "範囲(1～12)外の値です";
		} else if (a <= 2 || a == 12) {
			return "冬";
		} else if (3 <= a && a <= 5) {
			return "春";
		} else if (6 <= a && a <= 8) {
			return "夏";
		}
		return "秋";
	}
}

