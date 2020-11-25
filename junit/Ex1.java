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
		}else {
			return "その値は０か負です";
		}

	}

	public int ex1_1(int n){
		if(n > 0) {
			return 1;

		}else if(n < 0) {
			return 1;
		}else {
			return 0;
		}

	}

	public String ex1_2(int a, int b){
		if(a % b == 0) {
			return b + "は" + a + "の約数です";
		}else {

			return b + "は" + a + "の約数ではありません";
		}
	}

	public String ex1_3(int a, int b){
		if(a > b) {
			return a + "の方が大きいです";
		}else if (a < b) {
			return b + "の方が大きいです";
		}else  {
			return "同じ値です";
		}
	}

	public String ex1_4(int a){
		if(a < 0) {
			return "正でない整数値です";
		}else if(a % 5 > 0) {
			return "その値は5で割り切れません";
		}

		return "その値は5で割り切れます";

	}

	public String ex1_5(int a){
		if(a < 0) {
			return "正でない整数値です";
		}else if(a % 10 > 0) {
			return "その値は10の倍数ではありません";
		}else {
			return "その値は10の倍数です";
		}


	}

	public String ex1_6(int a){
		if(a < 0) {
			return "正でない整数値です";
		}else if (a % 3 == 0) {
			return "その値は3で割り切れます";
		}else if (a % 3 == 1) {
			return "その値を3で割った余りは1です";
		}else if (a % 3 == 2) {
			return "その値を3で割った余りは2です";
		}
		return "dummy";
	}

	public String ex1_7(int a){
		if (a < 0 || a > 100) {
			return "範囲(0～100)外の値です";
		}else if (a <= 59 ) {
			return "不可";
		}else if (a <= 69) {
			return "可";
		}else if (a <= 79) {
			return "良" ;
		}else if (a <= 100) {
			return "優";
		}else {
			return "";
		}



}


	public double ex1_8(double a, double b){
		return Math.max(a, b);

		}




	public int ex1_9(int a, int b){
		return a - b;
	}

	public String ex1_10(int a, int b){
		if ((a - b) <= 10) {
			return "それらの差は10以下です";
		}else {
			return "それらの差は11以上です";
		}

	}

	public int ex1_11(int a, int b, int c){
		int [] array = {a, b, c};
		int intMin = array[0];
		for(int i = 0; i< array.length; i++) {
			if(intMin > array[i]) {
				intMin = array[i];
			}else {
			}
		}
		return intMin;



	}

	public int ex1_12(int a, int b, int c){
		int [] array = { a,  b,  c};
		Arrays.sort(array);
		int m = array.length / 2;
		return array[m];
	}

	public String ex1_13(int a){
		if(a < 1 || a > 12) {
			return "範囲(1～12)外の値です";
		}else if (a < 3 || a == 12) {
			return "冬";
		}else if (a < 6) {
			return "春" ;
		}else if (a < 9) {
			return "夏";
		}else if (a < 12) {
			return "秋";
		}else {
			return "";
		}

	}
}

